package com.mcdev.twitterapikit.expansion

/**
 * Expansions enable requests to expand an ID into a full object in the includes response object.
 * */
enum class TimelinesExpansion(val value: String) {
    ATTACHMENTS_POLL_ID("attachments.poll_ids"),
    ATTACHMENTS_MEDIA_KEYS("attachments.media_keys"),
    AUTHOR_ID("author_id"),
    GEO_PLACE_ID("geo.place_id"),
    IN_REPLY_TO_USER_ID("in_reply_to_user_id"),
    REFERENCED_TWEETS_ID("referenced_tweets.id"),
    ENTITIES_MENTIONS_USERNAME("entities.mentions.username"),
    REFERENCED_TWEETS_ID_AUTHOR_ID("referenced_tweets.id.author_id")
}