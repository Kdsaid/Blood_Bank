package com.example.khale.bloodbank.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class FaveModle(@field:SerializedName("status")
                @field:Expose
                var status: Int, @field:SerializedName("msg")
                @field:Expose
                var msg: String?, @field:SerializedName("data")
                @field:Expose
                var data: Data_FaveModle?)
