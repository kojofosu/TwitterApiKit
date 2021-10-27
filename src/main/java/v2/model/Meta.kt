package com.mcdev.model

import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("result_count")
    var resultCount: Int = 0)
