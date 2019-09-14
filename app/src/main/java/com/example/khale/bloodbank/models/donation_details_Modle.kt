package com.example.khale.bloodbank.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class donation_details_Modle(@field:Expose
                             @field:SerializedName("data")
                             var data: Data?, @field:Expose
                             @field:SerializedName("msg")
                             var msg: String?, @field:Expose
                             @field:SerializedName("status")
                             var status: Int) {

    class Data {
        @Expose
        @SerializedName("client")
        var client: Client? = null
        @Expose
        @SerializedName("city")
        var city: City? = null
        @Expose
        @SerializedName("longitude")
        var longitude: String? = null
        @Expose
        @SerializedName("latitude")
        var latitude: String? = null
        @Expose
        @SerializedName("notes")
        var notes: String? = null
        @Expose
        @SerializedName("phone")
        var phone: String? = null
        @Expose
        @SerializedName("city_id")
        var city_id: String? = null
        @Expose
        @SerializedName("hospital_address")
        var hospital_address: String? = null
        @Expose
        @SerializedName("hospital_name")
        var hospital_name: String? = null
        @Expose
        @SerializedName("bags_num")
        var bags_num: String? = null
        @Expose
        @SerializedName("blood_type")
        var blood_type: String? = null
        @Expose
        @SerializedName("patient_age")
        var patient_age: String? = null
        @Expose
        @SerializedName("patient_name")
        var patient_name: String? = null
        @Expose
        @SerializedName("client_id")
        var client_id: String? = null
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

    class Client(@field:Expose
                 @field:SerializedName("is_active")
                 var is_active: String?, @field:Expose
                 @field:SerializedName("blood_type")
                 var blood_type: String?, @field:Expose
                 @field:SerializedName("donation_last_date")
                 var donation_last_date: String?, @field:Expose
                 @field:SerializedName("phone")
                 var phone: String?, @field:Expose
                 @field:SerializedName("city_id")
                 var city_id: String?, @field:Expose
                 @field:SerializedName("birth_date")
                 var birth_date: String?, @field:Expose
                 @field:SerializedName("email")
                 var email: String?, @field:Expose
                 @field:SerializedName("name")
                 var name: String?, @field:Expose
                 @field:SerializedName("updated_at")
                 var updated_at: String?, @field:Expose
                 @field:SerializedName("created_at")
                 var created_at: String?, @field:Expose
                 @field:SerializedName("id")
                 var id: Int)

    class City(@field:Expose
               @field:SerializedName("governorate")
               var governorate: Governorate?, @field:Expose
               @field:SerializedName("governorate_id")
               var governorate_id: String?, @field:Expose
               @field:SerializedName("name")
               var name: String?, @field:Expose
               @field:SerializedName("id")
               var id: Int)

    class Governorate {
        @Expose
        @SerializedName("name")
        var name: String? = null
        @Expose
        @SerializedName("id")
        var id: Int = 0
    }
}
