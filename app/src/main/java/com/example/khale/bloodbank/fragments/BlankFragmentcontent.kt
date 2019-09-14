package com.example.khale.bloodbank.fragments


import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.adapters.ViewPagerAdapter


class BlankFragmentcontent : Fragment() ,View.OnClickListener{
    override fun onClick(v: View?) {
        val fragment = CreateDonationRequestFragment()
        DiplayFragmentREplcae(fragment, v)
    }

    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var view = inflater.inflate(R.layout.fragment_blank_fragmentcontent,
                container, false)

        var viewPager = view.findViewById(R.id.viewpager) as ViewPager
        setupViewPager(viewPager)

       var  tabLayout = view.findViewById(R.id.tabs) as TabLayout
        tabLayout.setupWithViewPager(viewPager)
       val fb=view.findViewById<FloatingActionButton>(R.id.fab)
        fb.setOnClickListener(this)
        return view
    }
    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = ViewPagerAdapter(childFragmentManager)
        adapter.addFragment(OneFragment_article(), "المقالات")
        adapter.addFragment(TwoFragment_donation(), "طلبات التبرع")
        viewPager.adapter = adapter
    }
    private fun DiplayFragmentREplcae(fragment: Fragment, v: View?) {

        val activity = v!!.getContext() as AppCompatActivity

        val fragmentTransaction: FragmentTransaction = activity.supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, fragment)
        fragmentTransaction.commit()
    }

}
