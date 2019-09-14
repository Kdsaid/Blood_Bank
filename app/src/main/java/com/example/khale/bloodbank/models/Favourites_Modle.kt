package com.example.khale.bloodbank.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

 class Favourites_Modle {

    @Expose
    @SerializedName("data")
    var data: Data? = null
    @Expose
    @SerializedName("msg")
    var msg: String? = null
    @Expose
    @SerializedName("status")
    var status: Int = 0

     constructor(data: Data?, msg: String?, status: Int) {
         this.data = data
         this.msg = msg
         this.status = status
     }

     class Data {
        @Expose
        @SerializedName("total")
        var total: Int = 0
        @Expose
        @SerializedName("per_page")
        var per_page: Int = 0
        @Expose
        @SerializedName("path")
        var path: String? = null
        @Expose
        @SerializedName("last_page_url")
        var last_page_url: String? = null
        @Expose
        @SerializedName("last_page")
        var last_page: Int = 0
        @Expose
        @SerializedName("first_page_url")
        var first_page_url: String? = null
        @Expose
        @SerializedName("data")
        var data: List<String>? = null
        @Expose
        @SerializedName("current_page")
        var current_page: Int = 0

         constructor(total: Int, per_page: Int, path: String?, last_page_url: String?, last_page: Int, first_page_url: String?, data: List<String>?, current_page: Int) {
             this.total = total
             this.per_page = per_page
             this.path = path
             this.last_page_url = last_page_url
             this.last_page = last_page
             this.first_page_url = first_page_url
             this.data = data
             this.current_page = current_page
         }
     }
}
