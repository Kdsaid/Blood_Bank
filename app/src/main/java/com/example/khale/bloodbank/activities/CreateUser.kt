package com.example.khale.bloodbank.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.*
import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.api.RetrofitClient
import com.example.khale.bloodbank.models.*
import kotlinx.android.synthetic.main.activity_create_user.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.khale.bloodbank.storage.SharedPrefManager


class CreateUser : AppCompatActivity(), View.OnClickListener {

    private var spinner1: Spinner? = null
    private var spinner2: Spinner? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
        //   setSupportActionBar(toolbar)
        spinner1 = findViewById(R.id.spinner_government)
        spinner2 = findViewById(R.id.spinner_cities)

        req_signup_c.setOnClickListener(this)
        initSpinnerType()


//
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.req_signup_c -> userRegister()
//            R.id.bt_login -> startActivity(Intent(this, LoginActivity::class.java))
        }
    }
    //set spinner data

    fun initSpinnerType() {

        val call = RetrofitClient.getInstance().getApi().getGovernment()
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

                        var adapter = ArrayAdapter(this@CreateUser,
                                android.R.layout.simple_spinner_item, listSpinner)
                        spinner1!!.setAdapter(adapter)

                        spinner1?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

                            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, Id: Long) {
                                if (position != 0) {
                                    id[0] = listIds.get(position - 1)
                                    getlistofcity(id[0]);

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
        val call = RetrofitClient.getInstance().getApi().getListCities(i)
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
                val adapter = ArrayAdapter(this@CreateUser,
                        android.R.layout.simple_spinner_item, listSpinner)
                spinner2!!.setAdapter(adapter)
                spinner2?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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


    fun userRegister() {

        val call = RetrofitClient
                .getInstance()
                .getApi()
                .createUser(reg_name1.text.toString(),
                        reg_email.text.toString(),
                        "1990-07-21",
                        "1",
                        reg_phone.text.toString(),
                        donation_last_date.text.toString(),
                        reg_password1.text.toString(),
                        reg_password_confirm.text.toString(),
                        reg_blod_type.text.toString()

                )


//                        "khaled",
//                        "khaledsaid55@gmail.com"
//                        , "1990-07-21",
//                        "1"
//                        , "01016179833",
//                        "2018-07-21",
//                        "123"
//                        , "123"
//                        , "A-"

//                       userinfo.getName().toString(),
//                        userinfo.getEmail().toString(),
//                        userinfo.getBirth_date().toString()
//                        , "1",
//                        userinfo.getPhone().toString(),
//                        userinfo.getDonation_last_date().toString(),
//                        userinfo.getPassword().toString(),
//                        userinfo.getPassword_confirmation().toString(),
//                        userinfo.getBlood_type().toString()


        call.enqueue(
                object : Callback<RegM> {
                    override fun onResponse(call: Call<RegM>, response: Response<RegM>) {


                        Toast.makeText(this@CreateUser, response.body()!!.msg, Toast.LENGTH_LONG).show()
                        Log.i("RegM", response.body()!!.msg + "---" + response.body()!!.status)
                       var api_token= response.body()!!.data.api_token
                        SharedPrefManager.getInstance(this@CreateUser)
                                .saveUser(api_token)
                    }

                    override fun onFailure(call: Call<RegM>, t: Throwable) {

                        Toast.makeText(this@CreateUser, t.message, Toast.LENGTH_LONG).show()

                    }
                })


    }
}