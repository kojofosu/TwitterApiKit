package com.mcdev.twitterapikit.model

import com.google.gson.annotations.SerializedName
import com.mcdev.twitterapikit.`object`.Media
import com.mcdev.twitterapikit.`object`.Poll
import com.mcdev.twitterapikit.`object`.Tweet
import com.mcdev.twitterapikit.`object`.User

data class Includes(
    /**
     * This includes a list of referenced users in the form of user objects with their default fields and any additional fields requested using the user.fields parameter.*/
    @SerializedName(value = "users")
    var users: ArrayList<User>?,

    @SerializedName(value = "topics")
    var topics: ArrayList<Topic>?,

    @SerializedName(value = "tweets")
    var tweets: ArrayList<Tweet>?,

    @SerializedName(value = "polls")
    var polls: ArrayList<Poll>?,

    @SerializedName(value = "media")
    var media: ArrayList<Media>?
)