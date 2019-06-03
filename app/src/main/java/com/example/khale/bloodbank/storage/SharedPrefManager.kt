package com.example.khale.bloodbank.storage

import android.content.Context

class SharedPrefManager {
    private val mCtx: Context

    companion object {
        private val SHARED_PREF_NAME = "my_shared_preff"
        private var mInstance: SharedPrefManager? = null

        @Synchronized
        fun getInstance(mCtx: Context): SharedPrefManager {
            if (mInstance == null) {
                mInstance = SharedPrefManager(mCtx)
            }
            return mInstance as SharedPrefManager
        }


    }


    constructor(mCtx: Context) {
        this.mCtx = mCtx
    }


    fun saveUser(user: String) {

        val sharedPreferences = mCtx.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("Apitoken", user)
//
//        editor.putString("name", user.getName())
//        editor.putString("email", user.getEmail())
//        editor.putString("birth_date", user.getBirth_date())
//        editor.putString("city_id", user.getCity_id())
//        editor.putString("phone", user.getPhone())
//        editor.putString("donation_last_date", user.getDonation_last_date())
//        editor.putString("password", user.getPassword())
//      //  editor.putString("password_confirmation", user.getPassword_confirmation())
//        editor.putString("blood_type", user.getBlood_type())
//

        editor.apply()

    }
}
