package com.example.yukamalcoba.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.yukamalcoba.model.Masjid
import com.example.yukamalcoba.network.Services
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

class HomeViewModels : ViewModel(){

    private val mServices = Services()
    private val disposable = CompositeDisposable()

    val masjid = MutableLiveData<List<Masjid>>()

    val masjidLoadError = MutableLiveData<Boolean>()

    val loading = MutableLiveData<Boolean>()

    fun refresh(){
        fecthMasjid()
    }

    private fun fecthMasjid() {
        loading.value = true

        disposable.add(mServices.getMosque()
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableObserver<List<Masjid>>(){

                override fun onNext(t: List<Masjid>) {
                    masjid.value = t
                    masjidLoadError.value = false
                    loading.value = false
                }

                override fun onError(e: Throwable) {
                    masjidLoadError.value = true
                    loading.value = false
                }

                override fun onComplete() {
                    loading.value = false
                }



            }))

    }
}