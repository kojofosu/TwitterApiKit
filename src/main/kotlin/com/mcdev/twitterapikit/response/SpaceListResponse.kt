package com.mcdev.twitterapikit.response

import com.google.gson.annotations.SerializedName
import com.mcdev.twitterapikit.`object`.Space
import com.mcdev.twitterapikit.model.Error
import com.mcdev.twitterapikit.model.Errors
import com.mcdev.twitterapikit.model.Includes
import com.mcdev.twitterapikit.model.Meta

/**
 * Returns a list of spaces*/
data class SpaceListResponse (
    @SerializedName(value = "data")
    var `data`: ArrayList<Space>?,

    @SerializedName(value = "includes")
    var includes: Includes?,

    @SerializedName(value = "meta")
    var meta: Meta?,
): Error()