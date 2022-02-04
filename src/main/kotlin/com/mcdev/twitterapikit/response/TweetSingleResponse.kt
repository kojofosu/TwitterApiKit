package com.mcdev.twitterapikit.response

import com.google.gson.annotations.SerializedName
import com.mcdev.twitterapikit.`object`.Tweet
import com.mcdev.twitterapikit.model.Error
import com.mcdev.twitterapikit.model.Errors
import com.mcdev.twitterapikit.model.Includes
import com.mcdev.twitterapikit.model.Meta

data class TweetSingleResponse
    (
    @SerializedName(value = "data")
    var `data`: Tweet?,

    @SerializedName(value = "includes")
    var includes: Includes?,

    @SerializedName(value = "meta")
    var meta: Meta?,

    ): Error()
