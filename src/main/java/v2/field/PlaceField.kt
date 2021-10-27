package v2.field

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
}