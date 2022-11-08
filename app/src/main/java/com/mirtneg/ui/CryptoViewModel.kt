package com.mirtneg.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mirtneg.data.models.Crypto
import com.mirtneg.data.models.CryptoElements
import com.mirtneg.repository.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CryptoViewModel : ViewModel() {
    val cryptoList: MutableLiveData<List<CryptoElements>> = MutableLiveData<List<CryptoElements>>()
    val repository = Repository()

    fun getCryptoElements() {
        repository.apiService.getCryptoElements()
            .enqueue(
                object : Callback<Crypto> {
                    override fun onResponse(call: Call<Crypto>, response: Response<Crypto>) {
                        cryptoList.value = response.body()?.results
                    }

                    override fun onFailure(call: Call<Crypto>, t: Throwable) {
                        t.printStackTrace()
                    }
                }
            )
    }
}