package com.mirtneg.data.service

import com.mirtneg.data.models.Crypto
import retrofit2.http.GET
import retrofit2.Call


interface ApiService {
    @GET("/v1/bpi/currentprice.json")
    fun getCrypto(): Call<Crypto>
}