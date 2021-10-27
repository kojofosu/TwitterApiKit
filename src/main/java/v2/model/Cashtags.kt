package com.mcdev.model

import com.google.gson.annotations.SerializedName

data class Cashtags(@SerializedName(value = "start") var start: Int = 0,
                    @SerializedName(value = "end") var end: Int = 0,
                    @SerializedName(value = "tag") var tag: String? = null)
