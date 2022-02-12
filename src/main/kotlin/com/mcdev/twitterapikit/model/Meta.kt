package com.mcdev.twitterapikit.model

import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName(value = "result_count")
    var resultCount: Int = 0,

    @SerializedName(value = "newest_id")
    var newestId: String?,

    @SerializedName(value = "oldest_id")
    var oldestId: String?,

    @SerializedName(value = "next_token")
    var nextToken: String?,

    @SerializedName(value = "previous_token")
    var previousToken: String?

)
