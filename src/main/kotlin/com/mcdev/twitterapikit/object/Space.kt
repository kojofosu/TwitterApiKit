package com.mcdev.twitterapikit.`object`

import com.google.gson.annotations.SerializedName

/**
 * Spaces allow expression and interaction via live audio conversations.
 * The Space data dictionary contains relevant metadata about a Space; all the details are updated in real time.
 * User objects can be found and expanded in the user resource.
 * These objects are available for expansion by adding at least one of host_ids, creator_id, speaker_ids, mentioned_user_ids to the expansions query parameter.
 *
 * Unlike Tweets, Spaces are ephemeral and become unavailable after they end or when they are canceled by their creator.
 * When your app handles Spaces data, you are responsible for returning the most up-to-date information, and must remove data that is no longer available from the platform.
 * The [Spaces lookup endpoints](https://developer.twitter.com/en/docs/twitter-api/spaces/lookup/introduction) can help you ensure you respect the users’ expectations and intent.*/
data class Space(
    /**
     * The unique identifier of the requested Space.
     *
     * e.g
     * ```json
     * "id": "1zqKVXPQhvZJB"
     * ```
     *
     * Uniquely identify a Space returned in the response.*/
    @SerializedName(value = "id")
    var id: String? = null,

    /**
     * Indicates if the Space has started or will start in the future, or if it has ended.
     *
     * e.g.
     * ```json
     * "state": "live"
     * ```
     *
     * Filter live or scheduled Spaces.*/
    @SerializedName(value = "state")
    var state: String? = null)
{
    /**
     * Creation time of this Space.
     *
     * date (ISO 8601)
     *
     * e.g.
     * ```json
     * "created_at": "2021-07-04T23:12:08.000Z"
     * ```
     *
     * Understand when a Space was first created and sort Spaces by creation time.*/
    @SerializedName("created_at")
    var createdAt: String? = null

    /**
     * Time when the Space was ended. Only available for ended Spaces.
     *
     * date (ISO 8601)
     *
     * e.g.
     * ```json
     * "ended_at": "2021-07-04T00:11:44.000Z"
     * ```
     *
     * Understand when a live Space ended in order to compute its runtime duration.*/
    @SerializedName("ended_at")
    var endedAt: String? = null

    /**
     * The unique identifier of the users who are hosting this Space.
     *
     * e.g.
     * ```json
     * "host_ids": ["2244994945","6253282"]
     * ```
     * Expand User objects, understand engagement.
     */
    @SerializedName("host_ids")
    var hostIds: ArrayList<String>? = null

    /**
     * Language of the Space, if detected by Twitter. Returned as a BCP47 language tag.
     *
     * e.g
     * ```json
     * "lang": "en"
     * ```
     *
     * Classify Spaces by inferred language.*/
    @SerializedName("lang")
    var lang: String? = null

    /**
     * Indicates is this is a ticketed Space.
     *
     * e.g
     * ```json
     * "is_ticketed": false
     * ```
     *
     * Create user experiences to highlight content of interest.*/
    @SerializedName("is_ticketed")
    var isTicketed: Boolean = false

    /**
     * The list of user IDs that were invited to join as speakers.
     * Usually, users in this list are invited to speak via the Invite user option.
     *
     * e.g.
     * ```json
     * "mentioned_user_ids": ["2244994945","6253282"]
     * ```
     *
     * Expand User objects, understand engagement.

     */
    @SerializedName("invited_user_ids")
    var invitedUserIds: ArrayList<String>? = null

    /**
     * The current number of users in the Space, including Hosts and Speakers.
     *
     * e.g.
     * ```json
     * "participant_count": 420
     * ```
     *
     * Understand engagement, and create reports and visualizations for creators.*/
    @SerializedName("participant_count")
    var participantCount: Int = 0

    /**
     * Indicates the start time of a scheduled Space, as set by the creator of the Space.
     * This field is returned only if the Space has been scheduled; in other words, if the field is returned, it means the Space is a scheduled Space.
     *
     * date (ISO 8601)
     *
     * e.g.
     * ```json
     * "scheduled_start": "2021-07-14T08:00:00.000Z"
     * ```
     *
     * Integrate with calendar notifications, filter and sort Spaces by time.*/
    @SerializedName("scheduled_start")
    var scheduledStart: String? = null

    /**
     * The list of users who were speaking at any point during the Space.
     * This list contains all the users in invited_user_ids in addition to any user who requested to speak and was allowed via the Add speaker option.
     *
     * e.g
     * ```json
     * "speaker_ids": ["2244994945","6253282"]
     * ```
     *
     * Expand User objects, understand engagement.*/
    @SerializedName("speaker_ids")
    var speakerIds: ArrayList<String>? = null

    /**
     *Indicates the actual start time of a Space.
     *
     *date (ISO 8601)
     *
     * e.g.
     * ```json
     * "started_at": "2021-07-14T08:00:12.000Z"
     * ```
     * Determine start time of a Space.*/
    @SerializedName("started_at")
    var startedAt: String? = null

    /**
     * The title of the Space as specified by the creator.
     *
     * e.g.
     * ```json
     * "title": "Say hello to the Space data object!"
     * ```
     *
     * Determine the title of a Space, understand referenced keywords, hashtags, and mentions.*/
    @SerializedName("title")
    var title: String? = null

    /**
     * A list of IDs of the topics selected by the creator of the Space.
     *
     * e.g.
     * ```json
     *"topic_ids": ["2244994945","6253282"]
     * ```
     *
     * Determine the title of a Space, understand referenced keywords, hashtags, and mentions.*/
    @SerializedName(value = "topic_ids")
    var topicIds: ArrayList<String>? = null

    /**
     * Specifies the date and time of the last update to any of the Space's metadata, such as its title or scheduled time.
     *
     * date (ISO 8601)
     *
     * e.g.
     * ```json
     * "updated_at": "2021-07-11T14:44:44.000Z"
     * ```
     *
     * Keep information up to date.*/
    @SerializedName("updated_at")
    var updatedAt: String? = null

    /**
     * The user ID of the account that created this Space.
     * This ID is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
     * To return this field, add`space.fields=creator_id`in the request's query parameter.
     * You can obtain the expanded object in includes.users by adding expansions=creator_id in the request's query parameter.*/
    @SerializedName("creator_id")
    var creatorId: String? = null
}
