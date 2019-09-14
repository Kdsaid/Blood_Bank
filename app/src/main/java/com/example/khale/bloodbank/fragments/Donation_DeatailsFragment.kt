package com.example.khale.bloodbank.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.api.RetrofitClient
import com.example.khale.bloodbank.models.PostSDetailsModle
import com.example.khale.bloodbank.models.donation_details_Modle
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Donation_DeatailsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_donation__deatails, container, false)
        init(view)
        netWorkCall()
        return view
    }

    fun init(view: View) {}

    fun netWorkCall() {
        val call = RetrofitClient
                .getInstance()
                .api
                .getdonation_requests_donation_id_details(
                        "Zz9HuAjCY4kw2Ma2XaA6x7T5O3UODws1UakXI9vgFVSoY3xUXYOarHX2VH27", "1")

        call.enqueue(object : Callback<donation_details_Modle> {
            override fun onResponse(call: Call<donation_details_Modle>, response: Response<donation_details_Modle>) {
                //    var pin=response.body()!!.data
                Log.d("lolo", "Success")
                if (response.isSuccessful) {
                    val model = response.body()

                    Log.d("lolo", "Success ${model!!.data!!.patient_name}")
                } else {
                    Log.d("lolo", "!Success")
                }
            }

            override fun onFailure(call: Call<donation_details_Modle>, t: Throwable) {
                Log.d("lolo", t.localizedMessage)
            }
        })
    }
}