package com.mcdev.twitterapikit.field

/**
 * List of fields for the Tweet object.*/
enum class TweetField(val value: String) {
    /*defaults values*/
    ID("id"),
    TEXT("text"),

    /*allowed values*/
    ATTACHMENTS("attachments"),
    AUTHOR_ID("author_id"),
    CONTEXT_ANNOTATIONS("context_annotations"),
    CONVERSATION_ID("conversation_id"),
    CREATED_AT("created_at"),
    ENTITIES("entities"),
    GEO("geo"),
    IN_REPLY_TO_USER_ID("in_reply_to_user_id"),
    LANG("lang"),
    PUBLIC_METRICS("public_metrics"),
    REFERENCED_TWEETS("referenced_tweets"),
    REPLY_SETTINGS("reply_settings"),
    SOURCE("source"),
    WITHHELD("withheld"),

    /*OAuth1.0a User Context authorization required if any of the following fields are included in the request*/
    NON_PUBLIC_METRICS("non_public_metrics"),
    ORGANIC_METRICS("organic_metrics"),
    POSSIBLY_SENSITIVE("possibly_sensitive"),
    PROMOTED_METRICS("promoted_metrics"),

    /**All default fields*/
    DEFAULT("${ID.value},${TEXT.value}"),

    /**All non premium fields*/
    ALL_DEFAULT("${ID.value}," +
            "${TEXT.value}," +
            "${ATTACHMENTS.value}," +
            "${AUTHOR_ID.value}," +
            "${CONTEXT_ANNOTATIONS.value}," +
            "${CONVERSATION_ID.value}," +
            "${CREATED_AT.value}," +
            "${ENTITIES.value}," +
            "${GEO.value}," +
            "${IN_REPLY_TO_USER_ID.value}," +
            "${LANG.value}," +
            "${PUBLIC_METRICS.value}," +
            "${REFERENCED_TWEETS.value}," +
            "${REPLY_SETTINGS.value}," +
            "${SOURCE.value}," +
            WITHHELD.value
    ),

    /**
     * All Fields including premium fields.
     *
     * OAuth1.0a User Context authorization required if this is  included in the request*/
    ALL("${ID.value}," +
            "${TEXT.value}," +
            "${ATTACHMENTS.value}," +
            "${AUTHOR_ID.value}," +
            "${CONTEXT_ANNOTATIONS.value}," +
            "${CONVERSATION_ID.value}," +
            "${CREATED_AT.value}," +
            "${ENTITIES.value}," +
            "${GEO.value}," +
            "${IN_REPLY_TO_USER_ID.value}," +
            "${LANG.value}," +
            "${PUBLIC_METRICS.value}," +
            "${REFERENCED_TWEETS.value}," +
            "${REPLY_SETTINGS.value}," +
            "${SOURCE.value}," +
            "${WITHHELD.value}," +
            "${NON_PUBLIC_METRICS.value}," +
            "${ORGANIC_METRICS.value}," +
            "${POSSIBLY_SENSITIVE.value}," +
            PROMOTED_METRICS.value
    )
}