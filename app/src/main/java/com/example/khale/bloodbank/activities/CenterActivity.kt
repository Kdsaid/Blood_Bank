package com.example.khale.bloodbank.activities

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v4.view.GravityCompat
import android.support.v4.view.ViewPager
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.adapters.ViewPagerAdapter
import com.example.khale.bloodbank.fragments.BlankFragmentcontent
import com.example.khale.bloodbank.fragments.EditeProfileFragment
import com.example.khale.bloodbank.fragments.OneFragment
import com.example.khale.bloodbank.fragments.TwoFragment

import kotlinx.android.synthetic.main.activity_center.*
import kotlinx.android.synthetic.main.activity_edite_profile.*
import kotlinx.android.synthetic.main.app_bar_center.*

class CenterActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_center)
        setSupportActionBar(toolbar)

        val fragment =BlankFragmentcontent()
        DiplayFragment(fragment)
        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
        ////////////////////////



//////////////////////////////

    }

    /////////////////////////




    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.center, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_notify -> {
                startActivity(Intent(this@CenterActivity, NotifiActivity::class.java))
                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {


        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_info -> {
                val fragment =EditeProfileFragment()
                DiplayFragment(fragment)
            }
            R.id.nav_notify_setting -> {
                startActivity(Intent(this@CenterActivity, Edite_Notifiy::class.java))

            }
            R.id.nav_favorite -> {


            }
            R.id.nav_home -> {

            }
            R.id.nav_intro -> {

            }
            R.id.nav_report -> {
                startActivity(Intent(this@CenterActivity, ReportActivity::class.java))

            }
            R.id.nav_communicate -> {
                startActivity(Intent(this@CenterActivity, ContactUSActivity::class.java))

            }

            R.id.nav_rats -> {

            }
            R.id.nav_sign_out -> {

            }


        }



        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    fun DiplayFragment(fragment: Fragment) {
        var fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container,fragment )
        fragmentTransaction.commit()

    }
}