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
            @Field("donation_last_date") donation_last_date: String,
            @Field("password") password: String,
            @Field("password_confirmation") password_confirmation: String,

            @Field("blood_type") blood_type: String

    ): Call<RegM>

    //@Body user: User
    @FormUrlEncoded
    @POST("login")
    fun loginUser(

            @Field("phone") phone: String,
            @Field("password") password: String

    ): Call<Login_Modle>

    @FormUrlEncoded
    @POST("donation-request/create")
    fun getDonation_request_creare(

            @Field("api_token") api_token: String,
            @Field("patient_name") patient_name: String,
            @Field("patient_age") patient_age: String,
            @Field("blood_type") blood_type: String,
            @Field("bags_num") bags_num: String,
            @Field("hospital_name") hospital_name: String,
            @Field("hospital_address") hospital_address: String,
            @Field("city_id") city_id: String,
            @Field("phone") phone: String,
            @Field("notes") notes: String,
            @Field("latitude") latitude: String,
            @Field("logitude") logitude: String


    ): Call<Donation_request_create_Modle>


    @FormUrlEncoded
    @POST("donation-request/create")
    fun getDonation_request_creare(

            @Field("api_token") api_token: String,
            @Field("patient_name") patient_name: String,
            @Field("patient_age") patient_age: String,
            @Field("blood_type") blood_type: String,
            @Field("bags_num") bags_num: String,
            @Field("hospital_name") hospital_name: String,
            @Field("hospital_address") hospital_address: String,
            @Field("city_id") city_id: String,
            @Field("phone") phone: String,
            @Field("notes") notes: String
    ): Call<Donation_request_create_Modle>

//    @GET("api_token")
//     fun getSecret(@Header("Authorization") authenToken: String): Call<ResponseBody>


    @GET("governorates")
    fun getGovernment(): Call<ListOfCourty>

    @GET("cities")
    fun getListCities(@Query("governorate_id") id: Int): Call<ListOfCities>

    @GET("posts")
    fun getPosts(@Query("api_token") id: String): Call<PostsModle>

    @GET("post")
    fun getPost_details(@Query("api_token") api: String,
                        @Query("post_id") post_id: String
    ): Call<PostSDetailsModle>

    @GET("donation-request")
    fun getdonation_requests_donation_id_details(@Query("api_token") api: String,
                                                 @Query("donation_id") donation_id: String
    ): Call<donation_details_Modle>
 /*http://ipda3.com/blood-bank/api/v1/?api_token=Zz9HuAjCY4kw2Ma2XaA6x7T5O3UODws1UakXI9vgFVSoY3xUXYOarHX2VH27
 * */
    @GET("settings")
    fun getcontactus(@Query("api_token") api: String
    ): Call<Contact_US_Modle>

    @GET("donation-requests")
    fun getdonation_requests(@Query("api_token") id: String
            /*,
            @Query("blood_type") blood_type: String,
            @Query("city_id") city_id: String
            */): Call<DonationRequestsModle>


}
