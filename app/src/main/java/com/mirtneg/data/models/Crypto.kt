package com.mirtneg.data.models

import com.google.gson.annotations.SerializedName

data class Crypto(
    @SerializedName("") val results: List<CryptoElements>
)
