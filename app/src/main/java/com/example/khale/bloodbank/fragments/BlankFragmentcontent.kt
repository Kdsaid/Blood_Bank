package com.example.khale.bloodbank.fragments


import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.activities.DonationAskActivity
import com.example.khale.bloodbank.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_blank_fragmentcontent.*
import java.nio.FloatBuffer


class BlankFragmentcontent : Fragment() {
    private var tabLayout: TabLayout? = null
    var viewPager: ViewPager? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment

        var view = inflater.inflate(R.layout.fragment_blank_fragmentcontent, container, false)

        var viewPager = view.findViewById(R.id.viewpager) as ViewPager
        setupViewPager(viewPager)

       var  tabLayout = view.findViewById(R.id.tabs) as TabLayout
        tabLayout.setupWithViewPager(viewPager)
       var fb=view.findViewById<FloatingActionButton>(R.id.fab)
        fb.setOnClickListener {

            startActivity(Intent(activity, DonationAskActivity::class.java))
        }
        return view
    }
    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.addFragment(OneFragment(), "المقالات")
        adapter.addFragment(TwoFragment(), "طلبات التبرع")
        viewPager.adapter = adapter
    }

}
