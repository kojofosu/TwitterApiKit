package com.mcdev.twitterapikit.response

import com.google.gson.annotations.SerializedName
import com.mcdev.twitterapikit.`object`.Space
import com.mcdev.twitterapikit.model.Errors
import com.mcdev.twitterapikit.model.Includes
import com.mcdev.twitterapikit.model.Meta

data class SpaceListResponse (
    @SerializedName(value = "data")
    var `data`: ArrayList<Space>?,

    @SerializedName(value = "includes")
    var includes: Includes?,

    @SerializedName(value = "meta")
    var meta: Meta?,

    /*Error*/
    @SerializedName(value = "errors")
    var errors: ArrayList<Errors>?,

    @SerializedName(value = "detail")
    var detail: String?,

    @SerializedName(value = "title")
    var title: String?,

    @SerializedName(value = "type")
    var type: String?,

    @SerializedName(value = "status")
    var status: Int?
)