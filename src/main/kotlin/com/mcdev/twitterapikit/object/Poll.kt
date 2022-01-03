package com.mcdev.twitterapikit.`object`

import com.google.gson.annotations.SerializedName

/**
 * A poll included in a Tweet is not a primary object on any endpoint, but can be found and expanded in the Tweet object.
 * The object is available for expansion with ?expansions=attachments.poll_ids to get the condensed object with only default fields.
 * Use the expansion with the field parameter: poll.fields when requesting additional fields to complete the object.*/
data class Poll(
    /**
     *Unique identifier of the expanded poll.
     *
     * ```json
     * "id": "1199786642791452673"
     * ```*/
    @SerializedName(value = "id")
    var id: String? = null)
{
    /**
     * Contains objects describing each choice in the referenced poll.
     *
     * e.g.
     * ```json
     * "options":[
     *  {
     *   "position":1,
     *   "label":"“C Sharp”",
     *   "votes":795
     *  },
     *  {
     *   "position":2,
     *   "label":"“C Hashtag”",
     *   "votes":156
     *  }
     *  ]
     * ```*/
    @SerializedName(value = "options")
    var options: ArrayList<Options>? = null

    /**
     *Specifies the total duration of this poll.
     *
     * e.g.
     * ```json
     * "duration_minutes": 1440
     * ```*/
    @SerializedName(value ="duration_minutes")
    var duration: Int = 0

    /**
     * Specifies the end date and time for this poll.
     *
     * date (ISO 8601)
     *
     * e.g.
     * ```json
     * "end_datetime": "2019-11-28T20:26:41.000Z"
     * ```*/
    @SerializedName(value = "end_datetime")
    var endDateTime: String? = null

    /**
     *Indicates if this poll is still active and can receive votes, or if the voting is now closed.
     *
     * e.g.
     * ```json
     * "voting_status": "closed"
     * ```*/
    @SerializedName(value = "voting_status")
    var votingStatus: String? = null

    class Options{
        @SerializedName(value = "position")
        var position: Int = 0

        @SerializedName(value = "label")
        var label: String? = null

        @SerializedName(value = "votes")
        var votes: Long? = 0
    }
}
