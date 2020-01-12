package com.example.yukamalcoba.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yukamalcoba.R
import com.example.yukamalcoba.adapter.HomeAdapter
import com.example.yukamalcoba.viewmodel.HomeViewModels
import kotlinx.android.synthetic.main.activity_informasi.*

class InformasiActivity : AppCompatActivity() {

    lateinit var viewModel: HomeViewModels
    private val homeAdapter = HomeAdapter(ArrayList())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi)

        viewModel = ViewModelProvider(this).get(HomeViewModels::class.java)
        viewModel.refresh()

        rv_masjid.apply{
            layoutManager = LinearLayoutManager(context)
            adapter = homeAdapter
        }

        swipeRefresh.setOnRefreshListener{
            swipeRefresh.isRefreshing = false
            viewModel.refresh()
        }

        observeViewModel()
    }

    private fun observeViewModel(){
        viewModel.masjid.observe(this, Observer{ mosque ->
            mosque?.let {
                rv_masjid.visibility = View.VISIBLE
                homeAdapter.updateHome(it)
            }
        })

        viewModel.masjidLoadError.observe(this, Observer { isError->
            isError?.let { tv_error.visibility = if(it) View.VISIBLE else View.GONE}
        })

        viewModel.loading.observe(this, Observer { isLoading->
            isLoading?.let {
                progresBar.visibility = if (it) View.VISIBLE else View.GONE
                if (it) {
                    tv_error.visibility = View.GONE
                    rv_masjid.visibility = View.GONE
                }
            }
        })
    }


}