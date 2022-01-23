package com.mcdev.twitterapikit.model

import com.google.gson.annotations.SerializedName

data class Topic(
    @SerializedName(value = "description")
    var description: String?,

    @SerializedName(value = "id")
    var id: String?,

    @SerializedName(value = "name")
    var name: String?
)
