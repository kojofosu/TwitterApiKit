package com.mcdev.twitterapikit.tweetlookup

import com.mcdev.twitterapikit.`object`.Tweet
import com.mcdev.twitterapikit.model.Errors

class SingleTweetUserContext {
    var data: Tweet? = null
    var errors: ArrayList<Errors>? = null
}