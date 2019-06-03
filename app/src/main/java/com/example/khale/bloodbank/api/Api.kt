package com.example.khale.bloodbank.api

import com.example.khale.bloodbank.models.*
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface Api {
  @FormUrlEncoded
    @POST("register")
    fun createUser(
            @Field("name") name: String,
            @Field("email") email: String,
            @Field("birth_date") birth_date: String,
            @Field("city_id") city_id: String,
            @Field("phone") phone: String,
            @Field("donation_last_date")donation_last_date: String,
            @Field("password")password: String,
            @Field("password_confirmation")password_confirmation: String,

            @Field("blood_type")blood_type: String

            ): Call<RegM>
    //@Body user: User
    @FormUrlEncoded
    @POST("login")
    fun loginUser(

            @Field("phone") phone: String,
            @Field("password") password: String

    ): Call<Login_Modle>

//    @GET("api_token")
//     fun getSecret(@Header("Authorization") authenToken: String): Call<ResponseBody>


  @GET("governorates")
  fun getGovernment(): Call<ListOfCourty>

    @GET("cities")
    fun getListCities(@Query("governorate_id") id: Int): Call<ListOfCities>
  @GET("posts")
    fun getPosts(@Query("api_token") id: String): Call<PostsModle>


}
