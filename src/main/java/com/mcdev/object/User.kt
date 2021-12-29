package com.mcdev.`object`

import com.google.gson.annotations.SerializedName
import com.mcdev.model.*

data class User(
    @SerializedName(value = "id") var id: String? = null,
    @SerializedName(value = "name") var name: String? = null,
    @SerializedName(value = "username") var username: String? = null
) {
    @SerializedName(value = "created_at")
    var createdAt: String? = null

    @SerializedName(value = "description")
    var description: String? = null

    @SerializedName(value = "entities")
    var entities: Entities? = null

    @SerializedName(value = "pinned_tweet_id")
    var pinnedTweetId: String? = null

    @SerializedName(value = "profile_image_url")
    var profileImageUrl: String? = null

    @SerializedName(value = "protected")
    var protected: Boolean = false

    @SerializedName(value = "public_metrics")
    var publicMetrics: PublicMetrics? = null

    @SerializedName(value = "url")
    var url: String? =  null

    @SerializedName(value = "verified")
    var verified: Boolean = false

    @SerializedName(value = "withheld")
    var withheld: Withheld? = null

    data class Withheld(@SerializedName(value = "copyright") var copyright: Boolean = false, ){
        @SerializedName(value = "country_codes") var countryCodes: Array<String>? = null
    }

    class Entities{
        @SerializedName(value = "url")
        var url: Urls? = null

        @SerializedName(value = "description")
        var description: Description? = null

        class Description {
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

