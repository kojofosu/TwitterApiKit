package com.mcdev.twitterapikit.model

import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName(value = "user.fields")
    var userFields: List<String>?,

    @SerializedName(value = "topic.fields")
    var topicFields: List<String>?,

    @SerializedName(value = "space.fields")
    var spaceFields: List<String>?,

    @SerializedName(value = "expansions")
    var expansions: List<String>?,

    @SerializedName(value = "query")
    var query: List<String>?,

    @SerializedName(value = "state")
    var state: List<String>?,

    @SerializedName(value = "max_results")
    var maxResults: List<String>?,

    @SerializedName(value = "ids")
    var ids: List<String>?,

    @SerializedName(value = "user_ids")
    var userIds: List<String>?,

    @SerializedName(value = "pagination_token")
    var paginationToken: List<String>?
    )