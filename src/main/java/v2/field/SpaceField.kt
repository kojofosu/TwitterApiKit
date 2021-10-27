package v2.field

/**
 * List of fields from the Space object you want to return from your request.*/
enum class SpaceField(val value: String) {
    /*Default Values*/
    ID("id"),
    STATE("state"),

    /*Allowed Values*/
    HOST_IDS("host_ids"),
    CREATED_AT("created_at"),
    CREATOR_ID("creator_id"),
    LANG("lang"),
    INVITED_USER_IDS("invited_user_ids"),
    PARTICIPANT_COUNT("participant_count"),
    SPEAKER_IDS("speaker_ids"),
    STARTED_AT("started_at"),
    TITLE("title"),
    UPDATED_AT("updated_at"),
    SCHEDULED_START("scheduled_start"),
    IS_TICKETED("is_ticketed")
}