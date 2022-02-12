package com.mcdev.twitterapikit.response

import com.google.gson.annotations.SerializedName
import com.mcdev.twitterapikit.`object`.User
import com.mcdev.twitterapikit.model.Error
import com.mcdev.twitterapikit.model.Includes
import com.mcdev.twitterapikit.model.Meta

/**
 * Returns a list of users*/
data class UserListResponse(
    @SerializedName(value = "data")
    var `data`: ArrayList<User>?,

    @SerializedName(value = "includes")
    var includes: Includes?,

    @SerializedName(value = "meta")
    var meta: Meta?,
): Error()
