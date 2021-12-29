package com.mcdev.model

import com.google.gson.annotations.SerializedName

data class Mentions(@SerializedName(value = "id")var id: String,
                    @SerializedName(value = "start") var start: Int? = 0,
                    @SerializedName(value = "end") var end: Int? = 0,
                    @SerializedName(value = "tag") var tag: String? = null,
                    @SerializedName(value = "username") var userName: String? = null)
