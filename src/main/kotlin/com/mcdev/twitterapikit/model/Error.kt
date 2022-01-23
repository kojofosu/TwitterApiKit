package com.mcdev.twitterapikit.model

data class Error(
    val detail: String?,
    val errors: List<Errors>?,
    val title: String?,
    val type: String?
)