package v2.field

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
    POSSIBLY_SENSITIVE(""),
    PROMOTED_METRICS("promoted_metrics"),
}