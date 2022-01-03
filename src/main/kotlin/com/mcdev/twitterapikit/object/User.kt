package com.mcdev.twitterapikit.`object`

import com.google.gson.annotations.SerializedName
import com.mcdev.twitterapikit.model.*

/**
 * The user object contains Twitter user account metadata describing the referenced user.
 * The user object is the primary object returned in the [users lookup](https://developer.twitter.com/en/docs/twitter-api/users/lookup/introduction) endpoint.
 * When requesting additional user fields on this endpoint, simply use the fields parameter user.fields.
 * The user object can also be found as a child object and expanded in the Tweet object. The object is available for expansion with ?expansions=author_id or ?expansions=in_reply_to_user_id to get the condensed object with only default fields. Use the expansion with the field parameter: user.fields when requesting additional fields to complete the object.*/
data class User(
    /**
     *The unique identifier of this user.
     *
     * e.g.
     * ```json
     * "id": "2244994945"
     * ```
     *
     * Use this to programmatically retrieve information about a specific Twitter user.
     */
    @SerializedName(value = "id") var id: String? = null,

    /**
     * The name of the user, as they’ve defined it on their profile.
     * Not necessarily a person’s name. Typically capped at 50 characters, but subject to change.
     *
     * e.g.
     * ```json
     * "name": "Twitter Dev"
     * ```
     * */
    @SerializedName(value = "name") var name: String? = null,

    /**
     * The Twitter screen name, handle, or alias that this user identifies themselves with.
     * Usernames are unique but subject to change.
     * Typically a maximum of 15 characters long, but some historical accounts may exist with longer names.
     *
     * e.g.
     * ```json
     * "username": "TwitterDev"
     * ```*/
    @SerializedName(value = "username") var username: String? = null
) {

    /**
     * The UTC datetime that the user account was created on Twitter.
     *
     * date (ISO 8601)
     *
     * e.g.
     * ```json
     * "created_at": "2013-12-14T04:35:55.000Z"
     * ```
     *
     * Can be used to determine how long someone has been using Twitter
     */
    @SerializedName(value = "created_at")
    var createdAt: String? = null

    /**
     * The text of this user's profile description (also known as bio), if the user provided one.
     *
     * e.g.
     * ```json
     * "description": "The voice of Twitter's #DevRel team, and your official source for updates, news, & events about Twitter's API. \n\n#BlackLivesMatter"
     * ```*/
    @SerializedName(value = "description")
    var description: String? = null

    /**
     * Contains details about text that has a special meaning in the user's description.
     *
     * Entities are JSON objects that provide additional information about hashtags, urls, user mentions, and cashtags associated with the description.
     * Reference each respective entity for further details.
     * All user start indices are inclusive, while all user end indices are exclusive.*/
    @SerializedName(value = "entities")
    var entities: Entities? = null

    /**
     * The location specified in the user's profile, if the user provided one.
     * As this is a freeform value, it may not indicate a valid location, but it may be fuzzily evaluated when performing searches with location queries.
     *
     * e.g.
     * ```json
     * "location": "127.0.0.1"
     * ```*/
    @SerializedName(value = "location")
    var location: String? = null

    /**
     * Unique identifier of this user's pinned Tweet.
     *
     * e.g.
     * ```json
     * "pinned_tweet_id": "1255542774432063488"
     * ```
     *
     * Determine the Tweet pinned to the top of the user’s profile. Can potentially be used to determine the user’s language.
     */
    @SerializedName(value = "pinned_tweet_id")
    var pinnedTweetId: String? = null

    /**
     * The URL to the profile image for this user, as shown on the user's profile.
     *
     * e.g.
     * ```json
     * "profile_image_url": "https://pbs.twimg.com/profile_images/1267175364003901441/tBZNFAgA_normal.jpg"
     * ```
     *
     * Can be used to download this user's profile image.
     */
    @SerializedName(value = "profile_image_url")
    var profileImageUrl: String? = null

    /**
     * Indicates if this user has chosen to protect their Tweets (in other words, if this user's Tweets are private).
     *
     * e.g.
     * ```json
     * "protected": false
     * ```*/
    @SerializedName(value = "protected")
    var protected: Boolean = false

    /**
     * Contains details about activity for this user.
     *
     * e.g.
     * ```json
     * {
     *  "public_metrics":
     *   {
     *    "followers_count":507902,
     *    "following_count":1863,
     *    "tweet_count":3561,
     *    "listed_count":1550
     *   }
     *  }
     * ```
     *
     * Can potentially be used to determine a Twitter user’s reach or influence, quantify the user’s range of interests, and the user’s level of engagement on Twitter.*/
    @SerializedName(value = "public_metrics")
    var publicMetrics: PublicMetrics? = null

    /**
     * The URL specified in the user's profile, if present.
     *
     * e.g.
     * ```json
     * "url": "https://t.co/3ZX3TNiZCY"
     * ```
     *
     * A URL provided by a Twitter user in their profile. This could be a homepage, but is not always the case.*/
    @SerializedName(value = "url")
    var url: String? =  null

    /**
     * Indicates if this user is a verified Twitter User.
     *
     * e.g.
     * ```json
     * "verified": true
     * ```
     *
     * Indicates whether or not this Twitter user has a verified account. A verified account lets people know that an account of public interest is authentic.*/
    @SerializedName(value = "verified")
    var verified: Boolean = false

    /**
     * Contains withholding details for [withheld content](https://help.twitter.com/en/rules-and-policies/tweet-withheld-by-country) , if applicable.*/
    @SerializedName(value = "withheld")
    var withheld: Withheld? = null

    data class Withheld(@SerializedName(value = "copyright") var copyright: Boolean = false, ){
        @SerializedName(value = "country_codes") var countryCodes: ArrayList<String>? = null
    }

    class Entities{
        @SerializedName(value = "url")
        var url: Urls? = null

        @SerializedName(value = "description")
        var description: Description? = null

        class Description {
            @SerializedName(value = "annotations")
            var annotations: ArrayList<Annotations>? = null

            @SerializedName(value = "cashtags")
            var cashtags: ArrayList<Cashtags>? = null

            @SerializedName(value = "hashtags")
            var hashtags: ArrayList<Hashtags>? = null

            @SerializedName(value = "mentions")
            var mentions: ArrayList<Mentions>? = null

            @SerializedName(value = "urls")
            var urls: ArrayList<Urls>? = null
        }
    }

    class PublicMetrics{
        @SerializedName(value = "followers_count")
        var followersCount: Long = 0

        @SerializedName(value = "following_count")
        var followingCount: Long = 0

        @SerializedName(value = "tweet_count")
        var tweetCount: Long = 0

        @SerializedName(value = "listed_count")
        var listedCount: Long = 0
    }

}

