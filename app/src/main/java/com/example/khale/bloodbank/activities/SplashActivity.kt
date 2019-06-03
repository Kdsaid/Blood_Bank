package com.example.khale.bloodbank.activities

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.net.ConnectivityManager
import android.os.Build
import android.support.annotation.RequiresApi
import android.widget.Toast
import com.example.khale.bloodbank.R


class SplashActivity : AppCompatActivity() {

    private var isConnected = false


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        val  connMgr = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        var isWifiConn: Boolean = false
        var isMobileConn: Boolean = false
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }, 5000)
        connMgr.allNetworks.forEach { network ->
            connMgr.getNetworkInfo(network).apply {
                if (type == ConnectivityManager.TYPE_WIFI) {
                    isWifiConn = isWifiConn or isConnected

                }

                if (type == ConnectivityManager.TYPE_MOBILE) {
                    isMobileConn = isMobileConn or isConnected
                }
            }
        }
        when (isWifiConn or isMobileConn) {
            false -> Toast.makeText(this@SplashActivity,"برجاء فتح الانترنت", Toast.LENGTH_LONG).show()

        }


    }

}
