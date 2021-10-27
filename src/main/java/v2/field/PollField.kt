package v2.field

/**
 * List of fields for the poll object.
 * Expansion required.*/
enum class PollField(val value: String) {
    /*Default Values*/
    ID("id"),
    OPTIONS("options"),

    /*Allowed Values*/
    DURATION("duration_minutes"),
    END_DATETIME("end_datetime"),
    VOTING_STATUS("voting_status")
}