package com.example.yukamalcoba.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.yukamalcoba.R
import com.example.yukamalcoba.model.Masjid

class HomeAdapter(var items: MutableList<Masjid>) :
    RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {


    var mContext: Context? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        mContext = parent.context
        val layoutInflater = LayoutInflater.from(mContext).inflate(R.layout.row, parent, false)
        return HomeViewHolder(layoutInflater)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) = holder.let {
        it.clear()
        it.onBind(position)
    }

    fun updateHome(updateList: List<Masjid>) {
        this.items.clear()
        this.items.addAll(updateList)
        notifyDataSetChanged()
    }

    inner class HomeViewHolder internal constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView) {


        fun clear() {
        }

        fun onBind(position: Int) {
            val (id,
                type,
                code,
                name,
                identity,
                surface_area,
                building_area,
                los,
                since,
                bank_id,
                rek,
                address,
                latitude,
                longitude,
                province_id,
                estimate,
                estimate_date,
                city_id,
                kec_id,
                kel_id,
                pic,
                description) = items[position]

            inflateData(
                id,
                type,
                code,
                name,
                identity,
                surface_area,
                building_area,
                los,
                since,
                bank_id,
                rek,
                address,
                latitude,
                longitude,
                province_id,
                estimate,
                estimate_date,
                city_id,
                kec_id,
                kel_id,
                pic,
                description
            )
        }

        private fun inflateData(
            id: Int?,
            type: Int?,
            code: String?,
            name: String?,
            identity: String?,
            surface_area: Double?,
            building_area: Double?,
            los: String?,
            since: Int?,
            bank_id: Int?,
            rek: Int?,
            address: String?,
            latitude: Double?,
            longitude: Double?,
            province_id: Int?,
            estimate: Int?,
            estimate_date: String?,
            city_id: Int?,
            kec_id: Int?,
            kel_id: Int?,
            pic: String?,
            description: String?
        ) {
            println(name)
            println(address)
        }

    }

}