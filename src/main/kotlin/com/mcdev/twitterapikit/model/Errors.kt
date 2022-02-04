package com.mcdev.twitterapikit.model

import com.google.gson.annotations.SerializedName

data class Errors(
    @SerializedName(value = "message")
    val message: String?,

    @SerializedName(value = "parameters")
    val parameters: Parameters?,

    @SerializedName(value = "detail")
    var detail: String?,

    @SerializedName(value = "resource_type")

    var resourceType: String?,

    @SerializedName(value = "parameter")
    var parameter: String?,

    @SerializedName(value = "value")
    var value: String?,

    @SerializedName(value = "type")
    var type: String?,

    @SerializedName(value = "field")
    var field: String?,

    @SerializedName(value = "resource_id")
    var resourceId: String?,

    @SerializedName(value = "section")
    var section: String?
)