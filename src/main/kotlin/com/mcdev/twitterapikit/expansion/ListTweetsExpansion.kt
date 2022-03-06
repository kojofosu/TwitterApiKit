package com.mcdev.twitterapikit.expansion

/**
 * Expansions enable requests to expand an ID into a full object in the includes response object.
 * */
enum class ListTweetsExpansion(val value: String) {
    AUTHOR_ID("author_id"),

    /**All expansion fields*/
    ALL(AUTHOR_ID.value)
}