package com.mcdev.twitterapikit.field

/**
 * Comma-separated list of fields from the Space Topics object you want to return from your request.*/
enum class TopicField(val value: String) {
    /*Allowed values*/
    ID("id"),
    NAME("name"),
    DESCRIPTION("description")
}