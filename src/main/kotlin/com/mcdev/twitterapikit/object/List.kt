package com.mcdev.twitterapikit.`object`

import com.google.gson.annotations.SerializedName

/**
 * The list object contains [Twitter Lists](https://help.twitter.com/en/using-twitter/twitter-lists) metadata describing the referenced List.
 * The List object is the primary object returned in the List lookup endpoint.
 * When requesting additional List fields on this endpoint, simply use the fields' parameter list.fields.
 * At the moment, the List object cannot be found as a child object from any other data object.
 * However, user objects can be found and expanded in the user resource.
 * These objects are available for expansion by adding owner_id to the expansions query parameter.
 * Use the expansion with the field parameter: list.fields when requesting additional fields to complete the primary List object and user.fields to complete the expansion object.*/
data class List(
    /**
     * The unique identifier of this List.
     *
     * e.g.
     * ```json
     * "id": "2244994945"
     * ```
     *
     * Use this to programmatically retrieve information about a specific Twitter List.
     */
    @SerializedName(value = "id")
    var id: String? = null,

    /**
     *The name of the List, as defined when creating the List.
     *
     * e.g.
     * ```json
     * "name": "Twitter Lists"
     * ```*/
    @SerializedName(value = "name")
    var name: String? = null
) {

    /**
     * The UTC datetime that the List was created on Twitter.
     *
     * date (ISO 8601)
     *
     * e.g.
     * ```json
     * "created_at": "2013-12-14T04:35:55.000Z"
     * ```
     *
     * Can be used to determine how long a List has been on Twitter*/
    @SerializedName(value = "created_at")
    var createdAt: String? = null

    /**
     * A brief description to let users know about the List.
     *
     * e.g.
     * ```json
     * "description": "People that are active members of the Bay area cycling community on Twitter."
     * ```*/
    @SerializedName(value = "description")
    var description: String? = null

    /**
     * Shows how many users follow this List,
     *
     * ```json
     * "follower_count": 198
     * ```*/
    @SerializedName(value = "follower_count")
    var followerCount: Int = 0

    /**
     * Shows how many members are part of this List.
     *
     * e.g.
     * ```json
     * "member_count": 60
     * ```*/
    @SerializedName(value = "member_count")
    var memberCount: Int = 0

    /**
     *Indicates if the List is private.
     *
     * e.g.
     * ```json
     * "private": false
     * ```*/
    @SerializedName(value = "private")
    var private: Boolean = false

    /**
     * Unique identifier of this List's owner.
     *
     * e.g.
     * ```json
     * "owner_id": "1255542774432063488"
     * ```
     *
     * Returns the List owner ID. Can potentially be used to find out if this specifc user owns any other Lists.
     * Can also be used to expand user objects.*/
    @SerializedName(value = "owner_id")
    var ownerId: String? = null
}
