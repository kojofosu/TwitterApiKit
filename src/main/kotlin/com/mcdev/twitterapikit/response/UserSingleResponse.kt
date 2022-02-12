package com.mcdev.twitterapikit.response

import com.google.gson.annotations.SerializedName
import com.mcdev.twitterapikit.`object`.User
import com.mcdev.twitterapikit.model.Error
import com.mcdev.twitterapikit.model.Includes
import com.mcdev.twitterapikit.model.Meta

/**
 * Returns a single user response*/
data class UserSingleResponse(
    @SerializedName(value = "data")
    var `data`: User?,

    @SerializedName(value = "includes")
    var includes: Includes?,

    @SerializedName(value = "meta")
    var meta: Meta?,
):Error()
