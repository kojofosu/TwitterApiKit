package com.mcdev.twitterapikit.expansion

/**
 * Expansions enable requests to expand an ID into a full object in the includes response object.
 * */
enum class SpacesExpansion(val value: String) {
    INVITED_USER_IDS("invited_user_ids"),
    SPEAKER_IDS("speaker_ids"),
    CREATOR_ID("creator_id"),
    HOST_IDS("host_ids")
}