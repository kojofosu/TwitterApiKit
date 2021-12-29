package com.mcdev.twitterapikit.`object`

import com.google.gson.annotations.SerializedName


data class Place(@SerializedName(value = "full_name") var fullName: String? = null, @SerializedName(value = "id") var id: String? = null){
    @SerializedName(value = "contained_within")
    var containedWithin: Array<String>? = null

    @SerializedName(value = "country")
    var country: String? = null

    @SerializedName(value = "country_code")
    var countryCode: String? = null

    @SerializedName(value = "geo")
    var geo: Geo? = null

    @SerializedName(value = "name")
    var name: String? = null

    @SerializedName(value = "place_type")
    var placeType: String? = null

    class Geo {
        @SerializedName(value = "type")
        var type: String? = null

        @SerializedName(value = "bbox")
        var bbox: Array<Double>? = null

        @SerializedName(value = "properties")
        var properties: String? = null
    }
}
