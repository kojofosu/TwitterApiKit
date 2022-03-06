package com.mcdev.twitterapikit.field

/**
 * List of fields for the media object.
 * Expansion required.*/
enum class MediaField(val value: String) {
        /*Default Values*/
        MEDIA_KEY("media_key"),
        TYPE("type"),

        /*Allowed Values*/
        DURATION_MS("duration_ms"),
        HEIGHT("height"),
        PREVIEW_IMAGE_URL("preview_image_url"),
        PUBLIC_METRICS("public_metrics"),
        URL("url"),
        WIDTH("width"),
        ALT_TEXT("alt_text"),

        /*OAuth1.0a User Context authorization required if any of the following fields are included in the request:*/
        NON_PUBLIC_METRICS("non_public_metrics"),
        ORGANIC_METRICS("organic_metrics"),
        PROMOTED_METRICS("promoted_metrics"),

        /**All default fields*/
        DEFAULT("${MEDIA_KEY.value},${TYPE.value}"),

        /**All non-premium fields*/
        ALL_DEFAULT("${MEDIA_KEY.value}," +
                "${TYPE.value}," +
                "${DURATION_MS.value}," +
                "${HEIGHT.value}," +
                "${PREVIEW_IMAGE_URL.value}," +
                "${PUBLIC_METRICS.value}," +
                "${URL.value}," +
                "${WIDTH.value}," +
                ALT_TEXT.value
        ),

        /**
         * All Fields including premium fields.
         *
         * OAuth1.0a User Context authorization required if this is  included in the request*/
        ALL("${MEDIA_KEY.value}," +
                "${TYPE.value}," +
                "${DURATION_MS.value}," +
                "${HEIGHT.value}," +
                "${PREVIEW_IMAGE_URL.value}," +
                "${PUBLIC_METRICS.value}," +
                "${URL.value}," +
                "${WIDTH.value}," +
                "${ALT_TEXT.value}," +
                "${NON_PUBLIC_METRICS.value}," +
                "${ORGANIC_METRICS.value}," +
                PROMOTED_METRICS.value
        )
}