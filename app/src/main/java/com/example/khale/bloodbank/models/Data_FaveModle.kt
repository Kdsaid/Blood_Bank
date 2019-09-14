package com.example.khale.bloodbank.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data_FaveModle(@field:SerializedName("current_page")
                     @field:Expose
                     var currentPage: Int, data: List<Datum_FaveModle>, @field:SerializedName("first_page_url")
                     @field:Expose
                     var firstPageUrl: String?, @field:SerializedName("from")
                     @field:Expose
                     var from: Int, @field:SerializedName("last_page")
                     @field:Expose
                     var lastPage: Int, @field:SerializedName("last_page_url")
                     @field:Expose
                     var lastPageUrl: String?, @field:SerializedName("next_page_url")
                     @field:Expose
                     var nextPageUrl: Any?, @field:SerializedName("path")
                     @field:Expose
                     var path: String?, @field:SerializedName("per_page")
                     @field:Expose
                     var perPage: Int, @field:SerializedName("prev_page_url")
                     @field:Expose
                     var prevPageUrl: Any?, @field:SerializedName("to")
                     @field:Expose
                     var to: Int, @field:SerializedName("total")
                     @field:Expose
                     var total: Int) {
    @SerializedName("data")
    @Expose
    var data: List<Datum_FaveModle>? = null

    init {
        this.data = data
    }

}
