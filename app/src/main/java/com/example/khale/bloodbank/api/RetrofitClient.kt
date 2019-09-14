package com.example.khale.bloodbank.api

import android.annotation.SuppressLint
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    private var retrofit: Retrofit? = null

    init {
        retrofit = Retrofit.Builder().baseUrl(BasuRl).addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    companion object {
        private val BasuRl: String = "http://ipda3.com/blood-bank/api/v1/"


        @SuppressLint("StaticFieldLeak")
        @Volatile
        private var mInstance: RetrofitClient? = null


        fun getInstance()= mInstance?: synchronized(this) {
            mInstance?:RetrofitClient().also { mInstance=it }

        }
    }





val api: Api
    get() = retrofit!!.create<Api>(Api::class.java!!)

}