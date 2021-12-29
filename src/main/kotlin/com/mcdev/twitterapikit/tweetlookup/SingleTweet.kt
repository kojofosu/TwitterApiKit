package com.mcdev.twitterapikit.tweetlookup

import com.mcdev.twitterapikit.`object`.Tweet
import com.mcdev.twitterapikit.model.Errors

class SingleTweet {
    var data: Tweet? = null
    var errors: Array<Errors>? = null
}