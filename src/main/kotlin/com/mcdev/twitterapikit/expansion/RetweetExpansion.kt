package com.mcdev.twitterapikit.expansion

/**
 * Expansions enable requests to expand an ID into a full object in the includes response object.
 * */
enum class RetweetExpansion(val value: String) {
    PINNED_TWEET_ID("pinned_tweet_id"),

    /**All expansion fields*/
    ALL(PINNED_TWEET_ID.value)
}