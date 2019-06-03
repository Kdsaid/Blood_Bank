package com.example.khale.bloodbank.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Datum_of_Cities {

    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("created_at")
    @Expose
    var createdAt: Any? = null
    @SerializedName("updated_at")
    @Expose
    var updatedAt: Any? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("governorate_id")
    @Expose
    var governorateId: String? = null

}
