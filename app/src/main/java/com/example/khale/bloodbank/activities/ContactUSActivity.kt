package com.example.khale.bloodbank.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.khale.bloodbank.R
import kotlinx.android.synthetic.main.activity_contact_us.*

class ContactUSActivity : AppCompatActivity(),View.OnClickListener {

    override fun onClick(v: View?) {
            when (v!!.id) {
                R.id.backcontact -> startActivity(Intent(this@ContactUSActivity, CenterActivity::class.java))
            }
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)
        backcontact.setOnClickListener(this)

    }
}
