package com.mcdev.twitterapikit.expansion

/**
 * Expansions enable requests to expand an ID into a full object in the includes response object.
 * */
enum class ListFollowExpansion(val value: String) {
    OWNER_ID("owner_id")
}