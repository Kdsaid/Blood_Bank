package com.example.khale.bloodbank.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    private var retrofit: Retrofit? = null

    constructor() {
        retrofit = Retrofit.Builder().baseUrl(BasuRl).addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    companion object {

        @Synchronized
        fun getInstance(): RetrofitClient {
            if (mInstance == null) {
                mInstance = RetrofitClient()
            }
            return mInstance
        }

        private val BasuRl: String = "http://ipda3.com/blood-bank/api/v1/"
        private var mInstance = RetrofitClient()


    }

    fun getApi(): Api {
        return retrofit!!.create(Api::class.java)
    }

}