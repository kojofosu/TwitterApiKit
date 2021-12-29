package com.mcdev.twitterapikit.`object`

import com.google.gson.annotations.SerializedName
import com.mcdev.model.*
import com.mcdev.twitterapikit.model.Entity

data class Tweet(var id: String? = null, var text: String? = null ){

    @SerializedName(value = "attachments")
    var attachments: com.mcdev.twitterapikit.`object`.Tweet.Attachments? = null

    @SerializedName(value = "author_id")
    var authorId: String? = null

    @SerializedName(value = "context_annotations")
    var contextAnnotations: List<com.mcdev.twitterapikit.`object`.Tweet.ContextAnnotations>? = null

    @SerializedName(value = "conversation_id")
    var conversationId: String? = null

    @SerializedName(value = "created_at")
    var createdAt: String? = null

    @SerializedName(value = "entities")
    var entities: com.mcdev.twitterapikit.`object`.Tweet.Entities? = null

    @SerializedName(value = "geo")
    var geo: com.mcdev.twitterapikit.`object`.Tweet.Geo? = null

    @SerializedName(value = "in_reply_to_user_id")
    var inReplyToUserId: String? = null

    @SerializedName(value = "lang")
    var lang: String? = null

    @SerializedName(value = "non_public_metrics")
    var nonPublicMetrics: com.mcdev.twitterapikit.`object`.Tweet.NonPublicMetrics? = null

    @SerializedName(value = "organic_metrics")
    var organicMetrics: com.mcdev.twitterapikit.`object`.Tweet.OrganicMetrics? = null

    @SerializedName(value = "possibly_sensitive")
    var possiblySensitive: Boolean = false

    @SerializedName(value = "promoted_metrics")
    var promotedMetrics: com.mcdev.twitterapikit.`object`.Tweet.PromotedMetrics? = null

    @SerializedName(value = "public_metrics")
    var publicMetrics: com.mcdev.twitterapikit.`object`.Tweet.PublicMetrics? = null

    @SerializedName(value = "referenced_tweets")
    var referencedTweets: Array<com.mcdev.twitterapikit.`object`.Tweet.ReferencedTweets>? = null

    @SerializedName(value = "reply_settings")
    var replySettings: String? = null

    @SerializedName(value = "source")
    var source: String? = null

    @SerializedName(value = "withheld")
    var withheld: com.mcdev.twitterapikit.`object`.Tweet.Withheld? = null

    data class Attachments(@SerializedName(value = "poll_ids") var pollIds: List<String>? = null,
                      @SerializedName(value = "media_keys") var mediaKeys: List<String>? = null
    )

    class ContextAnnotations {
        @SerializedName(value = "domain")
        var domain: com.mcdev.twitterapikit.model.Domain? = null

        @SerializedName(value = "entity")
        var entity: com.mcdev.twitterapikit.model.Entity? = null
    }

    class Entities{
        @SerializedName(value = "annotations")
        var annotations: Array<com.mcdev.twitterapikit.model.Annotations>? = null

        @SerializedName(value = "cashtags")
        var cashtags: Array<com.mcdev.twitterapikit.model.Cashtags>? = null

        @SerializedName(value = "hashtags")
        var hashtags: Array<com.mcdev.twitterapikit.model.Hashtags>? = null

        @SerializedName(value = "mentions")
        var mentions: Array<com.mcdev.twitterapikit.model.Mentions>? = null

        @SerializedName(value = "urls")
        var urls: Array<com.mcdev.twitterapikit.model.Urls>? = null
    }

    data class Geo(@SerializedName(value = "coordinates") var coordinates: com.mcdev.twitterapikit.`object`.Tweet.Geo.Coordinates? = null,
                   @SerializedName(value = "place_id") var placeId: String? = null
    )
    {
        data class Coordinates(@SerializedName(value = "type") var type: String? = null){
            @SerializedName(value = "coordinates") var coordinates: Array<String>? = null
        }
    }

    data class NonPublicMetrics(@SerializedName(value = "impression_count") var impressionCount: Long = 0,
                                @SerializedName(value = "url_link_clicks") var urlLinkClicks: Long = 0,
                                @SerializedName(value = "user_profile_clicks") var userProfileClicks: Long? = 0)


    data class OrganicMetrics(@SerializedName(value = "impression_count") var impressionCount: Long = 0,
                              @SerializedName(value = "like_count") var likeCount: Long = 0,
                              @SerializedName(value = "reply_count") var replyCount: Long = 0,
                              @SerializedName(value = "retweet_count") var retweetCount: Long = 0,
                              @SerializedName(value = "url_link_clicks") var urlLinkClicks: Long = 0,
                              @SerializedName(value = "user_profile_clicks") var userProfileClicks: Long? = 0)

    data class PromotedMetrics (  @SerializedName(value = "like_count") var likeCount: Long = 0,
                                  @SerializedName(value = "reply_count") var replyCount: Long = 0,
                                  @SerializedName(value = "retweet_count") var retweetCount: Long = 0,
                                  @SerializedName(value = "impression_count") var impressionCount: Long = 0,
                                  @SerializedName(value = "url_link_clicks") var urlLinkClicks: Long = 0,
                                  @SerializedName(value = "user_profile_clicks") var userProfileClicks: Long? = 0
    )

    data class PublicMetrics(@SerializedName(value = "like_count") var likeCount: Long = 0,
                             @SerializedName(value = "reply_count") var replyCount: Long = 0,
                             @SerializedName(value = "retweet_count") var retweetCount: Long = 0,
                             @SerializedName(value = "quote_count") var quoteCount: Long = 0)


    data class ReferencedTweets(@SerializedName(value = "type") var type: String? = null,
                                @SerializedName(value = "id") var id: String? = null)

    data class Withheld(@SerializedName(value = "copyright") var copyright: Boolean = false, ){
        @SerializedName(value = "country_codes") var countryCodes: Array<String>? = null
    }
}
