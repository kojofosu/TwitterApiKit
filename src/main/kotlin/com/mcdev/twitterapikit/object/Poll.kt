package com.mcdev.twitterapikit.`object`

import com.google.gson.annotations.SerializedName

data class Poll(@SerializedName(value = "id") var id: String? = null){
    @SerializedName(value = "options")
    var options: Array<com.mcdev.twitterapikit.`object`.Poll.Options>? = null

    @SerializedName(value ="duration_minutes")
    var duration: Int = 0

    @SerializedName(value = "end_datetime")
    var endDateTime: String? = null

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
