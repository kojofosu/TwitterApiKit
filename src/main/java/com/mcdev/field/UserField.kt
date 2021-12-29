package com.mcdev.field

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
    WITHHELD("withheld")
}