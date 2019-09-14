package com.example.khale.bloodbank.fragments


import android.app.Activity
import android.content.Context
import android.content.Context.LOCATION_SERVICE
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Address
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.api.RetrofitClient
import com.example.khale.bloodbank.models.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import android.location.Geocoder
import android.location.LocationManager
import com.example.khale.bloodbank.activities.CreateUser

class CreateDonationRequestFragment : Fragment() {
    companion object {
        private lateinit var locationManager: LocationManager
    }

    private lateinit var BT_send: Button
    private lateinit var geocoder: Geocoder
    private lateinit var addressList: List<Address>
    var lat: Double = 0.toDouble()
    var lng: Double = 0.toDouble()
    var ID: Int? = null
    var FullAddress: String? = null
    private lateinit var Patient_name: EditText
    private lateinit var Patient_age: EditText
    private lateinit var Blood_type: EditText
    private lateinit var Bags_num: EditText
    private lateinit var Hospital_name: EditText
    private lateinit var Hospital_address: EditText
    private lateinit var Country_donation_create: Spinner
    private lateinit var City_donation_create: Spinner

    private lateinit var Phone: TextView
    private lateinit var Notes: TextView
    private lateinit var Tv_getlocation_donation_create: TextView


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_create_donation_request, container, false)
        init(view)

        initSpinnerType()
        return view
    }


    fun netWorkCall() {

        Log.d("netWorkCall","netWorkCall_1")

        val call = RetrofitClient.getInstance().api
                .getDonation_request_creare(
                        "Zz9HuAjCY4kw2Ma2XaA6x7T5O3UODws1UakXI9vgFVSoY3xUXYOarHX2VH27"
                        , Patient_name.text.toString(),
                        Patient_age.text.toString(),
                        Blood_type.text.toString()
                        , Bags_num.text.toString(),
                        Hospital_name.text.toString()
                        , Hospital_address.text.toString(),
                        "1",
                        Phone.text.toString(),
                        Notes.text.toString()
                        )

        call.enqueue(object : Callback<Donation_request_create_Modle> {
            override fun onResponse(call: Call<Donation_request_create_Modle>, response: Response<Donation_request_create_Modle>) {
                //    var pin=response.body()!!.data
             //   Log.d("lolo", "Success")
                Log.d("netWorkCall","netWorkCall_2   "+response.body()!!.msg)

                val model = response.body()
//
                    Log.d("5555",model!!.msg+" ")
          //          Log.d("55555", "!Success")
                }


            override fun onFailure(call: Call<Donation_request_create_Modle>, t: Throwable) {
                Log.d("lolo", t.localizedMessage)
                Log.d("netWorkCall","netWorkCall_3 error"+t.message)

            }
        })
    }


    fun init(view: View) {
        BT_send = view.findViewById(R.id.bt_send)

        Patient_name = view.findViewById(R.id.patient_name_donation_create)
        Patient_age = view.findViewById(R.id.patient_age_donation_create)
        Phone = view.findViewById(R.id.phone_donation_create)
        Blood_type = view.findViewById(R.id.blood_type_donation_create)
        Bags_num = view.findViewById(R.id.bags_num_donation_create)
        Hospital_name = view.findViewById(R.id.hospital_name_donation_create)
        Hospital_address = view.findViewById(R.id.hospital_name_donation_create)
        Country_donation_create = view.findViewById(R.id.country_donation_create)
        City_donation_create = view.findViewById(R.id.city_donation_create)
        Notes = view.findViewById(R.id.notes_donation_create)
        Tv_getlocation_donation_create = view.findViewById(R.id.tv_getlocation_donation_create)
       // Tv_getlocation_donation_create.setOnClickListener(this)
        BT_send = view.findViewById<Button>(R.id.bt_send)
        BT_send.setOnClickListener {
            netWorkCall()

        }

    }

    fun getLocation() {
        if (ActivityCompat.checkSelfPermission(this.context as Activity,
                        android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(
                        context as Activity, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
        }
    }

    fun initSpinnerType() {

        val call = RetrofitClient.getInstance().api.getGovernment()
        call.enqueue(
                object : Callback<ListOfCourty> {

                    override fun onResponse(call: Call<ListOfCourty>, response: Response<ListOfCourty>) {

                        val listOfCourty = response.body()
                        var country_name: List<Datum_of_country> = listOfCourty!!.data!!
                        var listSpinner = arrayListOf<String>()
                        Log.i("gouvernetmodel", "" + country_name.size)

                        listSpinner.add("اختر المحافظه")

                        var listIds = arrayListOf<Int>()

                        for (i in 0 until country_name.size) {
                            listSpinner.add(country_name.get(i).name!!)
                            listIds.add(country_name.get(i).id)

                        }
                        var id = intArrayOf(-1)

                        var adapter = ArrayAdapter(context as Activity,
                                android.R.layout.simple_spinner_item, listSpinner)
                        Country_donation_create.setAdapter(adapter)

                        Country_donation_create.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

                            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, Id: Long) {
                                if (position != 0) {
                                    id[0] = listIds.get(position - 1)
                                    getlistofcity(id[0])

                                }
                            }

                            override fun onNothingSelected(parent: AdapterView<*>?) {

                            }


                        }

                    }

                    override fun onFailure(call: Call<ListOfCourty>, t: Throwable) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }

                }
        )

    }

    private fun getlistofcity(i: Int) {
        val call = RetrofitClient.getInstance().api.getListCities(i)
        Log.i("selectedItem", "getCity");
        call.enqueue(object : Callback<ListOfCities> {

            override fun onResponse(call: Call<ListOfCities>, response: Response<ListOfCities>) {
                val listOfCities = response.body()
                val city_name: List<Datum_of_Cities> = listOfCities!!.data!!
                val listSpinner = arrayListOf<String>()
                Log.i("gouvernetmodel", "" + city_name.size)

                listSpinner.add("اختر المدينه")
                val listIds = arrayListOf<Int>()

                for (i in 0 until city_name.size) {
                    listSpinner.add(city_name.get(i).name!!)

                }
                val adapter = ArrayAdapter(context as Activity,
                        android.R.layout.simple_spinner_item, listSpinner)
                City_donation_create.setAdapter(adapter)
                City_donation_create.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                        Log.i("selectedItem", listSpinner.get(position))
                        //  userRegister(listSpinner.get(position).toInt())
                        Log.i("lol", " ${position - 1}")
                        //      userinfo.setCity_id((position - 1).toString())
                    }

                    override fun onNothingSelected(parent: AdapterView<*>) {

                    }
                }
            }

            override fun onFailure(call: Call<ListOfCities>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })


    }


}





