package com.mcdev.twitterapikit.`object`

import com.google.gson.annotations.SerializedName

/**
 * Media refers to any image, GIF, or video attached to a Tweet.
 * The media object is not a primary object on any endpoint, but can be found and expanded in the Tweet object.
 * The object is available for expansion with ?expansions=attachments.media_keys to get the condensed object with only default fields.
 * Use the expansion with the field parameter: media.fields when requesting additional fields to complete the object.*/
data class Media(
    /**
     * Unique identifier of the expanded media content.
     *
     * e.g.
     * ```json
     * "media_key": "13_1263145212760805376"
     * ```
     *
     * Can be used to programmatically retrieve media*/
    @SerializedName(value = "media_key") var mediaKey: String? = null,

    /**
     * Type of content (animated_gif, photo, video).
     *
     * e.g.
     * ```json
     * "type": "video"
     * ```
     *
     * Classify the media as a photo, GIF, or video*/
    @SerializedName(value = "type") var type: String? = null
){
    /**
     * Available when type is video. Duration in milliseconds of the video.
     *
     * e.g.
     * ```json
     * "duration_ms": 46947
     * ```*/
    @SerializedName(value = "duration_ms")
    var durationMs: Int? = 0

    /**
     * Height of this content in pixels.
     *
     * e.g.
     * ```json
     * "height": 1080
     * ```*/
    @SerializedName(value = "height")
    var height: Int? = 0

    /**
     * Non-public engagement metrics for the media content at the time of the request.
     *
     * *Requires user context authentication.*
     *
     * e.g.
     * ```json
     * "non_public_metrics":
     *  {
     *   "playback_0_count":1561,
     *   "playback_100_count":116,
     *   "playback_25_count":559,
     *   "playback_50_count":305,
     *   "playback_75_count":183
     *  }
     * ```
     *
     * Determine video engagement: how many users played through to each quarter of the video.*/
    @SerializedName(value = "non_public_metrics")
    var nonPublicMetrics: NonPublicMetrics? = null

    /**
     * Engagement metrics for the media content, tracked in an organic context, at the time of the request.
     *
     * *Requires user context authentication.*
     *
     * e.g.
     * ```json
     * "organic_metrics":
     *  {
     *   "playback_0_count":1561,
     *   "playback_100_count":116,
     *   "playback_25_count":559,
     *   "playback_50_count":305,
     *   "playback_75_count":183,
     *   "view_count":629
     *  }
     * ```
     *
     * Determine organic media engagement.*/
    @SerializedName(value = "organic_metrics")
    var organicMetrics: OrganicMetrics? = null

    /**
     * URL to the static placeholder preview of this content.
     *
     * e.g.
     * ```json
     * "preview_image_url": "https://pbs.twimg.com/media/EYeX7akWsAIP1_1.jpg"
     * ```*/
    @SerializedName(value = "preview_image_url")
    var previewImageUrl: String? = null

    /**
     * Engagement metrics for the media content, tracked in a promoted context, at the time of the request.
     *
     * *Requires user context authentication.*
     *
     * e.g.
     * ```json
     * "promoted_metrics":
     *  {
     *   "playback_0_count":259,
     *   "playback_100_count":15,
     *   "playback_25_count":113,
     *   "playback_50_count":57,
     *   "playback_75_count":25,
     *   "view_count":124
     *  }
     * ```
     *
     * Determine media engagement when the Tweet was promoted.*/
    @SerializedName(value = "promoted_metrics")
    var promotedMetrics: PromotedMetrics? = null

    /**
     *Public engagement metrics for the media content at the time of the request.
     *
     * e.g.
     * ```json
     * "public_metrics": {
     *  "view_count": 6865141
     * }
     *```
     *
     * Determine total number of views for the video attached to the Tweet.*/
    @SerializedName(value = "public_metrics")
    var publicMetrics: PublicMetrics? = null

    /**
     * Width of this content in pixels.
     *
     * e.g.
     * ```json
     * "width": 1920
     * ```*/
    @SerializedName(value = "width")
    var width: Int = 0

    /**
     * A description of an image to enable and support accessibility. Can be up to 1000 characters long.
     * Alt text can only be added to images at the moment.
     *
     * e.g.
     * ```json
     * "alt_text": “Rugged hills along the Na Pali coast on the island of Kauai”
     * ```
     *
     * Can be used to provide a written description of an image in case a user is visually impaired.*/
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

    data class PublicMetrics(
        @SerializedName(value = "view_count")
        var viewCount: Int = 0
    )
}

