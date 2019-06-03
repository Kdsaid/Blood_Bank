package com.example.khale.bloodbank.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.khale.bloodbank.R
import kotlinx.android.synthetic.main.activity_report.*

class ReportActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)
        backreport.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.backreport -> startActivity(Intent(this@ReportActivity, CenterActivity::class.java))
        }
    }

}
