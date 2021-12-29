package com.mcdev.twitterapikit.`object`

import com.google.gson.annotations.SerializedName

data class Media(
    @SerializedName(value = "media_key") var mediaKey: String? = null,
    @SerializedName(value = "type") var type: String? = null
){
    @SerializedName(value = "duration_ms")
    var duration: Int = 0

    @SerializedName(value = "height")
    var height: Int = 0

    @SerializedName(value = "non_public_metrics")
    var nonPublicMetrics: com.mcdev.twitterapikit.`object`.Media.NonPublicMetrics? = null

    @SerializedName(value = "organic_metrics")
    var organicMetrics: com.mcdev.twitterapikit.`object`.Media.OrganicMetrics? = null

    @SerializedName(value = "preview_image_url")
    var previewImageUrl: String? = null

    @SerializedName(value = "promoted_metrics")
    var promotedMetrics: com.mcdev.twitterapikit.`object`.Media.PromotedMetrics? = null

    @SerializedName(value = "public_metrics")
    var publicMetrics: com.mcdev.twitterapikit.`object`.Media.PublicMetrics? = null

    @SerializedName(value = "width")
    var width: Int = 0

    @SerializedName(value = "alt_text")
    var altText: String? = null


    class NonPublicMetrics {
        @SerializedName("playback_0_count")
        var playback0Count: Int? = 0

        @SerializedName("playback_100_count")
        var playback100Count: Int = 0

        @SerializedName("playback_25_count")
        var playback25Count: Int = 0

        @SerializedName("playback_50_count")
        var playback50Count: Int = 0

        @SerializedName("playback_75_count")
        var playback75Count: Int = 0
    }

    class OrganicMetrics {
        @SerializedName("playback_0_count")
        var playback0Count: Int? = 0

        @SerializedName("playback_100_count")
        var playback100Count: Int = 0

        @SerializedName("playback_25_count")
        var playback25Count: Int = 0

        @SerializedName("playback_50_count")
        var playback50Count: Int = 0

        @SerializedName("playback_75_count")
        var playback75Count: Int = 0

        @SerializedName(value = "view_count")
        var viewCount: Int = 0

    }


    class PromotedMetrics {
        @SerializedName("playback_0_count")
        var playback0Count: Int? = 0

        @SerializedName("playback_100_count")
        var playback100Count: Int = 0

        @SerializedName("playback_25_count")
        var playback25Count: Int = 0

        @SerializedName("playback_50_count")
        var playback50Count: Int = 0

        @SerializedName("playback_75_count")
        var playback75Count: Int = 0

        @SerializedName(value = "view_count")
        var viewCount: Int = 0
    }

    class PublicMetrics{
        @SerializedName(value = "view_count")
        var viewCount: Int = 0
    }
}

