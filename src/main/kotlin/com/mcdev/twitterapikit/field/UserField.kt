package com.mcdev.twitterapikit.field

/**
 * List of fields from the Space object you want to return from your request.*/
enum class UserField(val value: String) {
    /*Default Values*/
    ID("id"),
    NAME("name"),
    USERNAME("username"),

    /*Allowed Values*/
    CREATED_AT("created_at"),
    DESCRIPTION("description"),
    ENTITIES("entities"),
    LOCATION("location"),
    PINNED_TWEET_ID("pinned_tweet_id"),
    PROFILE_IMAGE_URL("profile_image_url"),
    PROTECTED("protected"),
    PUBLIC_METRICS("public_metrics"),
    URL("url"),
    VERIFIED("verified"),
    WITHHELD("withheld"),

    /**All default fields*/
    DEFAULT("${ID.value},${NAME.value},${USERNAME.value}"),

    /**All fields*/
    ALL(
        "${ID.value}," +
                "${NAME.value}," +
                "${USERNAME.value}," +
                "${CREATED_AT}," +
                "${DESCRIPTION.value}," +
                "${ENTITIES.value}," +
                "${LOCATION.value}," +
                "${PINNED_TWEET_ID.value}," +
                "${PROFILE_IMAGE_URL.value}," +
                "${PROTECTED.value}," +
                "${PUBLIC_METRICS.value}," +
                "${URL.value}," +
                "${VERIFIED.value}," +
                WITHHELD.value
    )
}