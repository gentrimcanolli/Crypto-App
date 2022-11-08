package com.mirtneg.data.service

import com.mirtneg.data.models.Crypto
import com.mirtneg.data.models.CryptoElements
import retrofit2.http.GET
import retrofit2.Call


interface ApiService {
    @GET("/api/v3/ticker/24hr")
    fun getCryptoElements(): Call<Crypto>
}