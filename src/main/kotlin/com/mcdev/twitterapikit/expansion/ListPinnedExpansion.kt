package com.mcdev.twitterapikit.expansion

/**
 * Expansions enable requests to expand an ID into a full object in the includes response object.
 * */
enum class ListPinnedExpansion(val value: String) {
    OWNER_ID("owner_id"),

    /**All expansion fields*/
    ALL(OWNER_ID.value)
}