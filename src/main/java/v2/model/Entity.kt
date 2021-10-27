package v2.model

import com.google.gson.annotations.SerializedName

data class Entity(@SerializedName(value = "id") var id: String? = null,
                  @SerializedName(value = "name") var name: String? = null)
