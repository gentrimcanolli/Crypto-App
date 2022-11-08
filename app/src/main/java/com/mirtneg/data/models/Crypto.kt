package com.mirtneg.data.models

import android.hardware.usb.UsbDevice
import com.google.gson.annotations.SerializedName

data class Crypto(
    @SerializedName("time") val time: Time,
    @SerializedName("disclaimer") val disclaimer: String,
    @SerializedName("chartName") val chartName: String,
    @SerializedName("bpi") val bpi: Bpi,


)
