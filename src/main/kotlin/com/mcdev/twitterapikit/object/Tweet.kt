package com.mcdev.twitterapikit.`object`

import com.google.gson.annotations.SerializedName
import com.mcdev.twitterapikit.model.*

/**
 * Tweets are the basic building block of all things Twitter.
 * The Tweet object has a long list of ‘root-level’ fields, such as id, text, and created_at.
 * Tweet objects are also the ‘parent’ object to several child objects including user, media, poll, and place.
 * Use the field parameter tweet.fields when requesting these root-level fields on the Tweet object.

The Tweet object that can be found and expanded in the user resource.
Additional Tweets related to the requested Tweet can also be found and expanded in the Tweet resource.
The object is available for expansion with ?expansions=pinned_tweet_id in the user resource or ?expansions=referenced_tweets.id in the Tweet resource to get the object with only default fields.
Use the expansion with the field parameter: tweet.fields when requesting additional fields to complete the object.*/
data class Tweet(
    /**
     * The unique identifier of the requested Tweet.
     *
     * e.g.
     * ```json
     * "id": "1050118621198921728"
     * ```
     *
     * Use this to `programmatically` retrieve a specific Tweet.*/
    @SerializedName("id")
    var id: String? = null,

    /**
     * The actual UTF-8 text of the Tweet. See [twitter-text](https://github.com/twitter/twitter-text/) for details on what characters are currently considered valid.
     *
     * e.g.
     * ```json
     * "text": "To make room for more expression, we will now count all emojis as equal—including those with gender‍‍‍ ‍‍and skin tone modifiers 👍🏻👍🏽👍🏿.This is now reflected in Twitter-Text, our Open Source library. \n\n Using Twitter-Text? See the forum post for detail: https://t.co/Nx1XZmRCXA"
     * ```
     *
     * This can be used for keyword extraction and sentiment analysis/classification.
     * */
    @SerializedName("text")
    var text: String? = null ){

    /**
     * Specifies the type of attachments (if any) present in this Tweet.
     *
     * e.g.
     * ```json
     * "attachments": {
     *       "poll_ids": [
     *           "1199786642468413448"
     *       ]
     *   }

    * "attachments": {
    *    "media_keys": [
    *        "3_1136048009270239232"
    *        ]
    *    }
     * ```
     *
     * Can be used for Understanding the objects returned for requested expansions. */
    @SerializedName(value = "attachments")
    var attachments: Attachments? = null

    /**
     * The unique identifier of the User who posted this Tweet.
     *
     * e.g.
     * ```json
     * "author_id": "2244994945"
     * ```
     *
     * Hydrating User object, sharing dataset for peer review
     */
    @SerializedName(value = "author_id")
    var authorId: String? = null

    /**
     * Contains context annotations for the Tweet.
     *
     * e.g.
     *
     * ```json
     * {
     *  "context_annotations":[
     *   {
     *    "domain":{
     *     "id":"45",
     *     "name":"Brand Vertical",
     *     "description":"Top level entities that describe a Brands industry"
     *    }
     *   },
     *   {
     *    "domain":{
     *     "id":"46",
     *     "name":"Brand Category",
     *     "description":"Categories within Brand Verticals that narrow down the scope of Brands"
     *    },
     *    "entity":{
     *     id":"781974596752842752",
     *     "name":"Services"
     *     }
     *   },
     *   {
     *    "domain":{
     *     "id":"47",
     *     "name":"Brand",
     *     "description":"Brands and Companies"
     *    },
     *    "entity":{
     *     "id":"10045225402",
     *     "name":"Twitter"
     *    }
     *   }
     *  ]
     * }
     * ```
     *
     * Entity recognition/extraction, topical analysis */
    @SerializedName(value = "context_annotations")
    var contextAnnotations: Array<ContextAnnotations>? = null

    /**
     * The Tweet ID of the original Tweet of the conversation (which includes direct replies, replies of replies).
     *
     * e.g.
     * ```json
     * "conversation_id": "1050118621198921728"
     * ```
     *
     * Use this to reconstruct the conversation from a Tweet.
     */
    @SerializedName(value = "conversation_id")
    var conversationId: String? = null

    /**
     * Creation time of the Tweet.
     *
     *
     * date (ISO 8601)

     * e.g.
     * ```json
     * "created_at": "2019-06-04T23:12:08.000Z"
     * ```
     *
     * This field can be used to understand when a Tweet was created and used for time-series analysis etc.
     */
    @SerializedName(value = "created_at")
    var createdAt: String? = null

    /**
     * Entities which have been parsed out of the text of the Tweet. Additionally see entities in Twitter Objects.
     *
     *
     * Entities are JSON objects that provide additional information about hashtags, urls, user mentions, and cashtags associated with a Tweet.
     * Reference each respective entity for further details.
     * Please note that all start indices are inclusive. The majority of end indices are exclusive, except for entities.annotations.end, which is currently inclusive.
     * We will be changing this to exclusive with our v3 bump since it is a breaking change.*/
    @SerializedName(value = "entities")
    var entities: Entities? = null

    /**
     * Contains details about the location tagged by the user in this Tweet, if they specified one.
     * e.g.
     * ```json
     * {
     *  "geo":{
     *   "coordinates":{
     *    "type":"Point",
     *    "coordinates":[-73.99960455,40.74168819]
     *   },
     *   "place_id":"01a9a39529b27f36"
     *  }
     * }
     * ```
     *
     * Determine if a Tweet is related to a named location with corresponding geo coordinates.*/
    @SerializedName(value = "geo")
    var geo: Geo? = null

    /**
     *If the represented Tweet is a reply, this field will contain the original Tweet’s author ID.
     * This will not necessarily always be the user directly mentioned in the Tweet.
     *
     * e.g.
     * ```json
     * "in_reply_to_user_id": "2244994945"
     * ```
     *
     * Use this to determine if this Tweet was in reply to another Tweet.
     */
    @SerializedName(value = "in_reply_to_user_id")
    var inReplyToUserId: String? = null

    /**
     * Language of the Tweet, if detected by Twitter. Returned as a BCP47 language tag.
     *
     * e.g.
     * ```json
     * "lang": "en"
     * ```
     *
     * Classify Tweets by spoken language.*/
    @SerializedName(value = "lang")
    var lang: String? = null

    /**
     * Non-public engagement metrics for the Tweet at the time of the request.
     * Requires user context authentication.
     *
     * e.g.
     * ```json
     * {
     *  "non_public_metrics":
     *   {
     *    "impression_count":99,
     *    "url_link_clicks":37,
     *    "user_profile_clicks":22
     *   }
     * }
     * ```
     *
     * Use this to determine the total number of impressions generated for the Tweet.
     */
    @SerializedName(value = "non_public_metrics")
    var nonPublicMetrics: NonPublicMetrics? = null

    /**
     * Engagement metrics, tracked in an organic context, for the Tweet at the time of the request.
     * Requires user context authentication.
     *
     * e.g.
     * ```json
     * {
     *  "organic_metrics":
     *   {
     *    "impression_count":3880,
     *    "like_count":8,
     *    "reply_count":0,
     *    "retweet_count":4,
     *    "url_link_clicks":3,
     *    "user_profile_clicks":2
     *   }
     * }
     * ```
     *
     * Use this to measure organic engagement for the Tweet.
     */
    @SerializedName(value = "organic_metrics")
    var organicMetrics: OrganicMetrics? = null

    /**
     * This field only surfaces when a Tweet contains a link.
     * The meaning of the field doesn’t pertain to the Tweet content itself,
     * but instead it is an indicator that the URL contained in the Tweet may contain content or media identified as sensitive content.
     *
     * e.g.
     * ```json
     * "possibly_sensitive": false
     * ```
     *
     * Studying circulation of certain types of content.

     */
    @SerializedName(value = "possibly_sensitive")
    var possiblySensitive: Boolean = false

    /**
     * Engagement metrics, tracked in a promoted context, for the Tweet at the time of the request.
     * Requires user context authentication.
     *
     * e.g.
     * ```json
     * {
     *  "promoted_metrics":{
     *   "impression_count":1082,
     *   "like_count":187,
     *   "reply_count":6,
     *   "retweet_count":25,
     *   "url_link_clicks":30,
     *   "user_profile_clicks":2
     *  }
     * }
     * ```
     *
     * Use this to measure engagement for the Tweet when it was promoted.
     */
    @SerializedName(value = "promoted_metrics")
    var promotedMetrics: PromotedMetrics? = null

    /**
     * Public engagement metrics for the Tweet at the time of the request.
     *
     * e.g.
     * ```json
     * {
     *  "public_metrics":{
     *   "retweet_count":8,
     *   "reply_count":2,
     *   "like_count":39,
     *   "quote_count":1
     *  }
     * }
     * ```
     *
     * Use this to measure Tweet engagement.
     */
    @SerializedName(value = "public_metrics")
    var publicMetrics: PublicMetrics? = null

    /**
     * A list of Tweets this Tweet refers to.
     * For example, if the parent Tweet is a Retweet, a Retweet with comment (also known as Quoted Tweet) or a Reply, it will include the related Tweet referenced to by its parent.
     *
     * e.g.
     * ```json
     * "referenced_tweets":[
     *  {
     *   "type":"replied_to",
     *   "id":"1242125486844604425"
     *  }],
     *  "referenced_tweets":[
     *   {
     *    "type":"quoted",
     *    "id":"1265712391578214400"
     *    }]
     * ```
     *
     * This field can be used to understand conversational aspects of retweets etc.
     */
    @SerializedName(value = "referenced_tweets")
    var referencedTweets: Array<ReferencedTweets>? = null

    /**
     * Shows you who can reply to a given Tweet. Fields returned are "everyone", "mentioned_users", and "followers".
     *
     * e.g.
     * ```json
     * "reply_settings": "everyone"
     * ```
     *
     * This field allows you to determine whether conversation reply settings have been set for the Tweet and if so, what settings have been set.
     * */
    @SerializedName(value = "reply_settings")
    var replySettings: String? = null

    /**
     * The name of the app the user Tweeted from.
     *
     * e.g.
     * ```json
     * "source": "Twitter Web App"
     * ```
     *
     * Determine if a Twitter user posted from the web, mobile device, or other app.
     */
    @SerializedName(value = "source")
    var source: String? = null

    /**
     * When present, contains withholding details for [withheld content](https://help.twitter.com/en/rules-and-policies/tweet-withheld-by-country).
     *
     * e.g.
     * ```json
     * {
     *  "withheld":{
     *   "copyright":false,
     *   "country_codes":["IN"]
     *  }
     * }
     * ```*/
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
