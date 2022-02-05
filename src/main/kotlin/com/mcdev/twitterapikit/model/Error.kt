package com.mcdev.twitterapikit.model

import com.google.gson.annotations.SerializedName

open class Error {
    @SerializedName(value = "errors")
    var errors: ArrayList<Errors>? = null

    @SerializedName(value = "detail")
    var detail: String? = null

    @SerializedName(value = "title")
    var title: String? = null

    @SerializedName(value = "type")
    var type: String? = null

    @SerializedName(value = "status")
    var status: Int? = null

    @SerializedName(value = "reason")
    val reason: String? = null

    @SerializedName(value = "client_id")
    val clientId: String? = null

    @SerializedName(value = "registration_url")
    val registrationUrl: String? = null

    @SerializedName(value = "required_enrollment")
    val requiredEnrollment: String? = null
}