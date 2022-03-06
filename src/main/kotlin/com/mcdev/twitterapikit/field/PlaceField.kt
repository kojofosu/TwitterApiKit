package com.mcdev.twitterapikit.field

/**
 * List of fields for the place object.
 * Expansion required.*/
enum class PlaceField(val value: String) {
    /*Default Values*/
    ID("id"),
    FULL_NAME("full_name"),

    /*Allowed Values*/
    CONTAINED_WITHIN("contained_within"),
    COUNTRY("country"),
    COUNTRY_CODE("country_code"),
    GEO("geo"),
    NAME("name"),
    PLACE_TYPE("place_type"),

    DEFAULT("${ID.value},${FULL_NAME.value}"),

    ALL(
        "${ID.value}," +
                "${FULL_NAME.value}," +
                "${CONTAINED_WITHIN.value}," +
                "${COUNTRY.value}," +
                "${COUNTRY_CODE.value}," +
                "${GEO.value}," +
                "${NAME.value}," +
                PLACE_TYPE.value
    )
}