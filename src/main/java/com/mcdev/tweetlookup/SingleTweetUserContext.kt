package com.mcdev.tweetlookup

import com.mcdev.`object`.Tweet
import com.mcdev.model.Errors

class SingleTweetUserContext {
    var data: Tweet? = null
    var errors: Array<Errors>? = null
}