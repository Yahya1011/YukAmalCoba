package com.example.yukamalcoba.network

import com.example.yukamalcoba.model.Masjid
import com.example.yukamalcoba.network.ApiEndPoint.MOSQUE
import io.reactivex.Observable
import retrofit2.http.GET

interface MosqueApi {
    @GET (MOSQUE)
    fun getMosque() : Observable<List<Masjid>>
}
