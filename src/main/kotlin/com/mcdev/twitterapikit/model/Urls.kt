package com.mcdev.twitterapikit.model

import com.google.gson.annotations.SerializedName

data class Urls(@SerializedName(value = "url") var url: String? = null,
                @SerializedName(value = "start") var start: Int? = null,
                @SerializedName(value = "end") var end: Int? = null,
                @SerializedName(value = "expanded_url") var expandedUrl: String? = null,
                @SerializedName(value = "display_url") var displayUrl: String? = null,
                @SerializedName(value = "status") var status: String? = null,
                @SerializedName(value = "title") var title: String? = null,
                @SerializedName(value = "description") var description: String? = null,
                @SerializedName(value = "unwound_url") var unwoundUrl: String? = null)