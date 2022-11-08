package com.mirtneg.data.models

import com.google.gson.annotations.SerializedName

data class Bpi(
    @SerializedName("USD") val usd: Usd,
    @SerializedName("GBP") val gbp: Gbp,
    @SerializedName("EUR") val eur: Eur,
)

