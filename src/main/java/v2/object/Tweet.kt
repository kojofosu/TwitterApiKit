package v2.`object`

import com.google.gson.annotations.SerializedName
import com.mcdev.model.*
import v2.model.Entity

data class Tweet(var id: String, var text: String ){

    @SerializedName(value = "attachments")
    var attachments: Attachments? = null

    @SerializedName(value = "author_id")
    var authorId: String? = null

    @SerializedName(value = "context_annotations")
    var contextAnnotations: List<ContextAnnotations>? = null

    @SerializedName(value = "conversation_id")
    var conversationId: String? = null

    @SerializedName(value = "created_at")
    var createdAt: String? = null

    @SerializedName(value = "entities")
    var entities: Entities? = null

    @SerializedName(value = "geo")
    var geo: Geo? = null

    @SerializedName(value = "in_reply_to_user_id")
    var inReplyToUserId: String? = null

    @SerializedName(value = "lang")
    var lang: String? = null

    @SerializedName(value = "non_public_metrics")
    var nonPublicMetrics: NonPublicMetrics? = null

    @SerializedName(value = "organic_metrics")
    var organicMetrics: OrganicMetrics? = null

    @SerializedName(value = "possibly_sensitive")
    var possiblySensitive: Boolean = false

    @SerializedName(value = "promoted_metrics")
    var promotedMetrics: PromotedMetrics? = null

    @SerializedName(value = "public_metrics")
    var publicMetrics: PublicMetrics? = null

    @SerializedName(value = "referenced_tweets")
    var referencedTweets: Array<ReferencedTweets>? = null

    @SerializedName(value = "reply_settings")
    var replySettings: String? = null

    @SerializedName(value = "source")
    var source: String? = null

    @SerializedName(value = "withheld")
    var withheld: Withheld? = null

    data class Attachments(@SerializedName(value = "poll_ids") var pollIds: List<String>? = null,
                      @SerializedName(value = "media_keys") var mediaKeys: List<String>? = null
    )

    class ContextAnnotations {
        @SerializedName(value = "domain")
        var domain: Domain? = null

        @SerializedName(value = "entity")
        var entity: Entity? = null
    }

    class Entities{
        @SerializedName(value = "annotations")
        var annotations: Array<Annotations>? = null

        @SerializedName(value = "cashtags")
        var cashtags: Array<Cashtags>? = null

        @SerializedName(value = "hashtags")
        var hashtags: Array<Hashtags>? = null

        @SerializedName(value = "mentions")
        var mentions: Array<Mentions>? = null

        @SerializedName(value = "urls")
        var urls: Array<Urls>? = null
    }

    data class Geo(@SerializedName(value = "coordinates") var coordinates: Coordinates? = null,
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
