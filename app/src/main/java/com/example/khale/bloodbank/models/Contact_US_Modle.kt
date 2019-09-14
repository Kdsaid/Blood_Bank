package com.example.khale.bloodbank.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Contact_US_Modle(@field:Expose
                       @field:SerializedName("data")
                       var data: Data?, @field:Expose
                       @field:SerializedName("msg")
                       var msg: String?, @field:Expose
                       @field:SerializedName("status")
                       var status: Int) {

    inner class Data(@field:Expose
                     @field:SerializedName("google_url")
                     var google_url: String?, @field:Expose
                     @field:SerializedName("instagram_url")
                     var instagram_url: String?, @field:Expose
                     @field:SerializedName("whatsapp")
                     var whatsapp: String?, @field:Expose
                     @field:SerializedName("youtube_url")
                     var youtube_url: String?, @field:Expose
                     @field:SerializedName("twitter_url")
                     var twitter_url: String?, @field:Expose
                     @field:SerializedName("facebook_url")
                     var facebook_url: String?, @field:Expose
                     @field:SerializedName("about_app")
                     var about_app: String?, @field:Expose
                     @field:SerializedName("email")
                     var email: String?, @field:Expose
                     @field:SerializedName("phone")
                     var phone: String?, @field:Expose
                     @field:SerializedName("id")
                     var id: Int)
}
