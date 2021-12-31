package com.mcdev.twitterapikit.`object`

import com.google.gson.annotations.SerializedName

data class Space(var id: String? = null, var state: String? = null) {
    @SerializedName("created_at")
    var createdAt: String? = null

    @SerializedName("creator_id")
    var creatorId: String? = null

    @SerializedName("host_ids")
    var hostIds: Array<String>? = null

    @SerializedName("lang")
    var lang: String? = null

    @SerializedName("is_ticketed")
    var isTicketed: Boolean = false

    @SerializedName("invited_user_ids")
    var invitedUserIds: Array<String>? = null

    @SerializedName("participant_count")
    var participantCount: Int = 0

    @SerializedName("scheduled_start")
    var scheduledStart: String? = null

    @SerializedName("speaker_ids")
    var speakerIds: Array<String>? = null

    @SerializedName("started_at")
    var startedAt: String? = null

    @SerializedName("title")
    var title: String? = null

    @SerializedName("updated_at")
    var updatedAt: String? = null
}
