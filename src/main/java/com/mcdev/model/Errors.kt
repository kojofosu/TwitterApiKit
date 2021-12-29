package com.mcdev.model

import com.google.gson.annotations.SerializedName

data class Errors(@SerializedName(value = "title") var title: String? = null){
    @SerializedName(value = "detail")
    var detail: String? = null

    @SerializedName(value = "resource_type")
    var resourceType: String? = null

    @SerializedName(value = "parameter")
    var parameter: String? = null

    @SerializedName(value = "value")
    var value: String? = null

    @SerializedName(value = "type")
    var type: String? = null

    @SerializedName(value = "field")
    var field: String? = null

    @SerializedName(value = "resource_id")
    var resourceId: String? = null

    @SerializedName(value = "section")
    var section: String? = null
}

