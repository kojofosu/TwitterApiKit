package com.mcdev.twitterapikit.model

import com.google.gson.annotations.SerializedName

data class Domain(@SerializedName(value = "id") var id: String? = null,
                  @SerializedName(value = "name") var name: String? = null,
                  @SerializedName(value = "description") var description: String? = null)
