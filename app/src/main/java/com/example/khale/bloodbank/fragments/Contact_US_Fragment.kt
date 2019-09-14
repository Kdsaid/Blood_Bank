package com.example.khale.bloodbank.fragments


import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.api.RetrofitClient
import com.example.khale.bloodbank.models.Contact_US_Modle
import kotlinx.android.synthetic.main.fragment_contact__us_.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import android.net.Uri.fromParts
import android.content.Intent
import android.net.Uri
import android.net.Uri.parse
import android.widget.ImageButton
import com.example.khale.bloodbank.activities.CenterActivity


class Contact_US_Fragment : Fragment() {

    private lateinit var facebook_us: ImageView
    private lateinit var youtube_us: ImageView
    private lateinit var twiter_us: ImageView
    private lateinit var instgram_us: ImageView
    private lateinit var phone_us: TextView
    private lateinit var whats_us: ImageView

    private lateinit var mail_us: TextView


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_contact__us_, container, false)
        view.findViewById<ImageButton>(R.id.backcontact_us).setOnClickListener {
            startActivity(Intent(context as Activity, CenterActivity::class.java))
        }
        init(view)
        netWorkCall()
        return view
    }

    fun netWorkCall() {

        Log.d("netWorkCall", "netWorkCall_1")

        val call = RetrofitClient.getInstance().api
                .getcontactus(
                        "Zz9HuAjCY4kw2Ma2XaA6x7T5O3UODws1UakXI9vgFVSoY3xUXYOarHX2VH27"
                )

        call.enqueue(object : Callback<Contact_US_Modle> {
            override fun onResponse(call: Call<Contact_US_Modle>, response: Response<Contact_US_Modle>) {
                //    var pin=response.body()!!.data
                //   Log.d("lolo", "Success")
                Log.d("netWorkCall", "netWorkCall_2   " + response.body()!!.msg)

                val model = response.body()!!.data
                var instgram = response.body()!!.data!!.instagram_url
                var face = response.body()!!.data!!.facebook_url
                var mail = response.body()!!.data!!.email
                var whats = response.body()!!.data!!.whatsapp
                var twiter = response.body()!!.data!!.twitter_url
                var phone = response.body()!!.data!!.phone
                var youtube = response.body()!!.data!!.youtube_url
                facebook_us.setOnClickListener {
                    val webIntent: Intent = Uri.parse(face).let { webpage ->
                        Intent(Intent.ACTION_VIEW, webpage)
                    }
                    startActivity(webIntent)
                }
                instgram_us.setOnClickListener {
                    val webIntent: Intent = Uri.parse(instgram).let { webpage ->
                        Intent(Intent.ACTION_VIEW, webpage)
                    }
                    startActivity(webIntent)
                }
                twiter_us.setOnClickListener {
                    val webIntent: Intent = Uri.parse(twiter).let { webpage ->
                        Intent(Intent.ACTION_VIEW, webpage)
                    }
                    startActivity(webIntent)
                }
                youtube_us.setOnClickListener {
                    val webIntent: Intent = Uri.parse(youtube).let { webpage ->
                        Intent(Intent.ACTION_VIEW, webpage)
                    }
                    startActivity(webIntent)
                }

                phone_us.setOnClickListener {
                    val callIntent: Intent = Uri.parse("tel:$phone").let { number ->
                        Intent(Intent.ACTION_DIAL, number)
                    }
                    startActivity(callIntent)
                }
                mail_us.setOnClickListener {
                    val mailto = "mailto:${mail}"


                    val emailIntent = Intent(Intent.ACTION_SENDTO)

                    emailIntent.data = Uri.parse(mailto)
                    startActivity(emailIntent)
                }
                whats_us.setOnClickListener {
                    try {
                        val text = "برجاء ارسل  لنامقتراحتكم "// Replace with your message.

                        val toNumber = "+2" + whats // Replace with mobile phone number without +Sign or leading zeros.


                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse("http://api.whatsapp.com/send?phone=$toNumber&text=$text")
                        startActivity(intent)
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }

                }
            }


            override fun onFailure(call: Call<Contact_US_Modle>, t: Throwable) {
                Log.d("lolo", t.localizedMessage)
                Log.d("netWorkCall", "netWorkCall_3 error" + t.message)

            }
        })
    }

    fun init(view: View) {
        facebook_us = view.findViewById(R.id.facebook_us)
        whats_us = view.findViewById(R.id.whats_us)
        instgram_us = view.findViewById(R.id.instgram_us)
        mail_us = view.findViewById(R.id.mail_us)
        phone_us = view.findViewById(R.id.phone_us)
        youtube_us = view.findViewById(R.id.youtube_us)
        twiter_us = view.findViewById(R.id.twiter_us)

    }

}