package com.mirtneg.data.models

import com.google.gson.annotations.SerializedName

data class CryptoElements(
    @SerializedName("symbol") val symbol: String,
    @SerializedName("priceChange") val priceChange: String,
    @SerializedName("priceChangePercent") val priceChangePercent: String,
    @SerializedName("lastPrice") val lastPrice: String,
    @SerializedName("volume") val volume: String,
    @SerializedName("count") val count: String

)