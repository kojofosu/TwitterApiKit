package com.mcdev.twitterapikit.model

import com.google.gson.annotations.SerializedName

data class Annotations(@SerializedName(value = "start") var start: Int = 0,
                       @SerializedName(value = "end") var end: Int = 0,
                       @SerializedName(value = "probability") var probability: Double = 0.0,
                       @SerializedName(value = "type") var type: String? = null,
                       @SerializedName(value = "normalized_text") var normalizedText: String? = null)
