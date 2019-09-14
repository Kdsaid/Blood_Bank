package com.example.khale.bloodbank.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.R.id.btn_signup
import com.example.khale.bloodbank.api.RetrofitClient
import com.example.khale.bloodbank.models.Login_Modle
import com.example.khale.bloodbank.models.User
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private var userinfo = User()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_signup.setOnClickListener(this)
        bt_login.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_signup -> startActivity(Intent(this, CreateUser::class.java))
            R.id.bt_login -> userLogin()
        }
    }


    fun userLogin() {

        val call = RetrofitClient
                .getInstance()
                .api
                .loginUser(login_mobile.text.toString(),
                        login_password.text.toString()
                )

        call.enqueue(
                object : Callback<Login_Modle> {
                    override fun onResponse(call: Call<Login_Modle>, response: Response<Login_Modle>) {
                        var login = Login_Modle()
                        login = response.body()!!
                        if ((login.status) != 0) {
                            Toast.makeText(this@LoginActivity, response.body()!!.msg!!, Toast.LENGTH_LONG).show()
                            startActivity(Intent(this@LoginActivity, CenterActivity::class.java))
                        } else {
                            Toast.makeText(this@LoginActivity, response.body()!!.msg!!, Toast.LENGTH_LONG).show()
                        }
                    }

                    override fun onFailure(call: Call<Login_Modle>, t: Throwable) {

                        Toast.makeText(this@LoginActivity, t.message, Toast.LENGTH_LONG).show()

                    }
                })
//        getSecret()
    }

}

