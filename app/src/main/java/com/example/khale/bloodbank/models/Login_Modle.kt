package com.example.khale.bloodbank.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

 class Login_Modle {


    @Expose
    @SerializedName("data")
    var data: Data? = null
    @Expose
    @SerializedName("msg")
    var msg: String? = null
    @Expose
    @SerializedName("status")
    var status: Int = 0

    class Data {
        @Expose
        @SerializedName("client")
        var client: Client? = null
        @Expose
        @SerializedName("api_token")
        var api_token: String? = null
    }

    class Client {
        @Expose
        @SerializedName("is_active")
        var is_active: String? = null
        @Expose
        @SerializedName("blood_type")
        var blood_type: String? = null
        @Expose
        @SerializedName("donation_last_date")
        var donation_last_date: String? = null
        @Expose
        @SerializedName("phone")
        var phone: String? = null
        @Expose
        @SerializedName("city_id")
        var city_id: String? = null
        @Expose
        @SerializedName("birth_date")
        var birth_date: String? = null
        @Expose
        @SerializedName("email")
        var email: String? = null
        @Expose
        @SerializedName("name")
        var name: String? = null
        @Expose
        @SerializedName("updated_at")
        var updated_at: String? = null
        @Expose
        @SerializedName("created_at")
        var created_at: String? = null
        @Expose
        @SerializedName("id")
        var id: Int = 0
    }
}
