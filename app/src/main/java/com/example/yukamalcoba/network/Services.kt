package com.example.yukamalcoba.network

import com.example.yukamalcoba.BuildConfig
import com.example.yukamalcoba.model.Masjid
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class Services {


    private val api: MosqueApi = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(MosqueApi::class.java)


    fun getMosque(): Observable<List<Masjid>> {
        return api.getMosque()
    }

}