package v2.field

/**
 * List of fields for the media object.
 * Expansion required.*/
enum class MediaField(val value: String) {
        /*Default Values*/
        MEDIA_KEY("media_key"),
        TYPE("type"),

        /*Allowed Values*/
        DURATION("duration_ms"),
        HEIGHT("height"),
        PREVIEW_IMAGE_URL("preview_image_url"),
        PROMOTED_METRICS("promoted_metrics"),
        URL("url"),
        WIDTH("width"),

        /*OAuth1.0a User Context authorization required if any of the following fields are included in the request:*/
        NON_PUBLIC_METRICS("non_public_metrics"),
        ORGANIC_METRICS("organic_metrics"),
        PUBLIC_METRICS("public_metrics")
}