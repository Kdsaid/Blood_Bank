package com.example.khale.bloodbank.activities

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.R.id.toolbar

import kotlinx.android.synthetic.main.activity_notifi.*

class NotifiActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.getId()) {
            R.id.backnotify -> startActivity(Intent(this, CenterActivity::class.java))
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifi)
        backnotify.setOnClickListener(this)
    }

}
