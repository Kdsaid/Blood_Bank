package com.example.khale.bloodbank.fragments

/**
 * Created by Parsania Hardik on 20-Jan-18.
 */

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.adapters.ItemAdpter_fragement_row_two_DonationASk
import com.example.khale.bloodbank.api.RetrofitClient
import com.example.khale.bloodbank.models.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class TwoFragment_donation : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_two, container, false)
////// to create
        //  var list = ArrayList<item_row_fragment_two>()
//        var adp = ItemAdpter_fragement_row_two_DonationASk(this!!.activity!!, list)
        // var btn_details=view.findViewById<Button>(R.id.bt_details)
//        btn_details.setOnClickListener{
//           // startActivity()
//        }
        var recyclerView_fragment_two =
                view.findViewById<RecyclerView>(R.id.RecyclerView_fragment_two)
        recyclerView_fragment_two.layoutManager = LinearLayoutManager(context)

        var api: String = "Zz9HuAjCY4kw2Ma2XaA6x7T5O3UODws1UakXI9vgFVSoY3xUXYOarHX2VH27"
        val call = RetrofitClient
                .getInstance()
                .api
                .getdonation_requests(api)
        call.enqueue(
                object : Callback<DonationRequestsModle> {

                    override fun onResponse(call: Call<DonationRequestsModle>, response: Response<DonationRequestsModle>) {
                        var list = response.body()!!.data.data
                        val adp = ItemAdpter_fragement_row_two_DonationASk(list, context)
                        recyclerView_fragment_two.adapter = adp

                    }

                    override fun onFailure(call: Call<DonationRequestsModle>, t: Throwable) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                })
        return view
    }
}

