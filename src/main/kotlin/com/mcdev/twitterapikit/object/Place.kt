package com.mcdev.twitterapikit.`object`

import com.google.gson.annotations.SerializedName

/**
 * The place tagged in a Tweet is not a primary object on any endpoint, but can be found and expanded in the Tweet resource.
 * The object is available for expansion with ?expansions=geo.place_id to get the condensed object with only default fields.
 * Use the expansion with the field parameter: place.fields when requesting additional fields to complete the object.*/
data class Place(
    /**
     *A longer-form detailed place name.
     *
     * e.g.
     * ```json
     * "full_name": "Manhattan, NY"
     * ```
     *
     * Classify a Tweet by a specific place name*/
    @SerializedName(value = "full_name")
    var fullName: String? = null,

    /**
     * The unique identifier of the expanded place, if this is a point of interest tagged in the Tweet.
     *
     * e.g.
     * ```json
     * "id": "01a9a39529b27f36"
     * ```
     *
     * Use this to programmatically retrieve a place*/
    @SerializedName(value = "id")
    var id: String? = null)
{
    /**
     * Returns the identifiers of known places that contain the referenced place.*/
    @SerializedName(value = "contained_within")
    var containedWithin: ArrayList<String>? = null

    /**
     * The full-length name of the country this place belongs to.
     *
     * e.g.
     * ```json
     * "country": "United States"
     * ```
     *
     * Classify a Tweet by country name*/
    @SerializedName(value = "country")
    var country: String? = null

    /**
     * The ISO Alpha-2 country code this place belongs to.
     *
     * e.g.
     * ```json
     * "country_code": "US"
     * ```
     *
     * Classify a Tweet by country code*/
    @SerializedName(value = "country_code")
    var countryCode: String? = null

    /**
     * Contains place details in GeoJSON format.
     *
     * e.g.
     * ```json
     * "geo":
     *  {
     *   "type":"Feature",
     *   "bbox":[-74.026675,40.683935,-73.910408,40.877483],
     *   "properties":{}
     *  }
     * ```*/
    @SerializedName(value = "geo")
    var geo: Geo? = null

    /**
     * The short name of this place.
     *
     * e.g.
     * ```json
     * "name": "Manhattan"
     * ```
     *
     * Classify a Tweet by a specific place name*/
    @SerializedName(value = "name")
    var name: String? = null

    /**
     * Specified the particular type of information represented by this place information, such as a city name, or a point of interest.
     *
     * e.g.
     * ```json
     * "place_type": "city"
     * ```
     *
     * Classify a Tweet by a specific type of place*/
    @SerializedName(value = "place_type")
    var placeType: String? = null

    class Geo {
        @SerializedName(value = "type")
        var type: String? = null

        @SerializedName(value = "bbox")
        var bbox: ArrayList<Double>? = null

        @SerializedName(value = "properties")
        var properties: String? = null
    }
}
