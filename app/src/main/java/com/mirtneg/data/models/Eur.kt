package com.mirtneg.data.models

import com.google.gson.annotations.SerializedName

data class Eur(
    @SerializedName("code") val code: String,
    @SerializedName("symbol") val symbol: String,
    @SerializedName("rate") val rate: String,
    @SerializedName("description") val description: String,
    @SerializedName("rate_float") val rate_float: String,
)
