package com.mcdev.twitterapikit.expansion

/**
 * Expansions enable requests to expand an ID into a full object in the includes response object.
 * */
enum class ListsExpansion(val value: String) {
    OWNER_ID("owner_id")
}