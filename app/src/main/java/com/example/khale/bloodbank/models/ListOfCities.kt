package com.example.khale.bloodbank.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ListOfCities {

    @SerializedName("status")
    @Expose
    var status: Int = 0
    @SerializedName("msg")
    @Expose
    var msg: String? = null
    @SerializedName("data")
    @Expose
    var data: List<Datum_of_Cities>? = null

}
