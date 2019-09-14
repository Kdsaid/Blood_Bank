package com.example.khale.bloodbank.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Donation_request_create_Modle(@field:Expose
                                    @field:SerializedName("data")
                                    var data: Data?, @field:Expose
                                    @field:SerializedName("msg")
                                    var msg: String?, @field:Expose
                                    @field:SerializedName("status")
                                    var status: Int) {

    class Data(@field:Expose
               @field:SerializedName("city")
               var city: City?, @field:Expose
               @field:SerializedName("id")
               var id: Int, @field:Expose
               @field:SerializedName("created_at")
               var created_at: String?, @field:Expose
               @field:SerializedName("updated_at")
               var updated_at: String?, @field:Expose
               @field:SerializedName("client_id")
               var client_id: Int, @field:Expose
               @field:SerializedName("latitude")
               var latitude: String?, @field:Expose
               @field:SerializedName("notes")
               var notes: String?, @field:Expose
               @field:SerializedName("phone")
               var phone: String?, @field:Expose
               @field:SerializedName("city_id")
               var city_id: String?, @field:Expose
               @field:SerializedName("hospital_address")
               var hospital_address: String?, @field:Expose
               @field:SerializedName("hospital_name")
               var hospital_name: String?, @field:Expose
               @field:SerializedName("bags_num")
               var bags_num: String?, @field:Expose
               @field:SerializedName("blood_type")
               var blood_type: String?, @field:Expose
               @field:SerializedName("patient_age")
               var patient_age: String?, @field:Expose
               @field:SerializedName("patient_name")
               var patient_name: String?)

     class City(@field:Expose
                     @field:SerializedName("governorate")
                     var governorate: Governorate?, @field:Expose
                     @field:SerializedName("governorate_id")
                     var governorate_id: String?, @field:Expose
                     @field:SerializedName("name")
                     var name: String?, @field:Expose
                     @field:SerializedName("id")
                     var id: Int)

     class Governorate(@field:Expose
                            @field:SerializedName("name")
                            var name: String?, @field:Expose
                            @field:SerializedName("id")
                            var id: Int)
}
