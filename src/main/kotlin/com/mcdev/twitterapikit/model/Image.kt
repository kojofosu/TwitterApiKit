package com.mcdev.twitterapikit.model

import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName(value = "url")
    var url: String?,

    @SerializedName(value = "width")
    var width: Int? = 0,

    @SerializedName(value = "height")
    var height: Int? = 0
)
