package com.mirtneg.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mirtneg.data.models.Crypto
import com.mirtneg.repository.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CryptoViewModel : ViewModel() {
    val cryptoResponse = MutableLiveData<Crypto>()
    private val repository = Repository()

    fun getCrypto(){
        repository.apiService.getCrypto()
            .enqueue(object : Callback<Crypto>{
                override fun onResponse(call: Call<Crypto>, response: Response<Crypto>) {
                    cryptoResponse.postValue(response.body())
                }

                override fun onFailure(call: Call<Crypto>, t: Throwable) {
                    t.printStackTrace()
                }

            })
    }
}