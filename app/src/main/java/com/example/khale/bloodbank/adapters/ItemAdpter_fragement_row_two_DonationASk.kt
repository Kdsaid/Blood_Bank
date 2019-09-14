package com.example.khale.bloodbank.adapters

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager

import android.net.Uri
import android.support.v4.app.ActivityCompat
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v4.content.ContextCompat
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.activities.MainActivity
import com.example.khale.bloodbank.fragments.Donation_DeatailsFragment
import com.example.khale.bloodbank.fragments.prevent_diseaseFragment
import com.example.khale.bloodbank.models.Datum_DonationRequestsModle
import java.util.jar.Manifest


class ItemAdpter_fragement_row_two_DonationASk
(var list: List<Datum_DonationRequestsModle>, var context: Context?)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>(), View.OnClickListener {
    override fun onClick(v: View?) {
        val fragment = Donation_DeatailsFragment()
        DiplayFragment(fragment, v)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ItemHolder)

        val item: Datum_DonationRequestsModle = list.get(position)
        holder.BloodType.text = item.bloodType
        holder.Patien_Name.text = item.patientName
        holder.Hospital_name.text = item.hospitalName
        holder.City_name.text = item.city.name
        holder.Bt_details.setOnClickListener(this)


        holder.Bt_Phone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:${item.phone}")

            if (ActivityCompat.checkSelfPermission(this.context as Activity,
                            android.Manifest.permission.CALL_PHONE)
                    != PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(context, "plase accpted permission phone call"
                        , Toast.LENGTH_LONG).show()
                rquestpermission()

            } else {
                startActivity(context as Activity, intent, null)

            }


        }
    }

    private fun DiplayFragment(fragment: Fragment, v: View?) {

        val activity = v!!.getContext() as AppCompatActivity

        var fragmentTransaction: FragmentTransaction = activity.supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, fragment)
        fragmentTransaction.commit()
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var v: View = LayoutInflater.from(context).inflate(R.layout.item_row_fragment_two, parent, false)
        return ItemHolder(v)
    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var Bt_details = itemView.findViewById<TextView>(R.id.bt_details)
        var BloodType = itemView.findViewById<TextView>(R.id.bloodType)
        var Patien_Name = itemView.findViewById<TextView>(R.id.patien_Name)
        var Hospital_name = itemView.findViewById<TextView>(R.id.hospital_name)
        var City_name: TextView = itemView.findViewById<TextView>(R.id.city_name)

        var Bt_Phone = itemView.findViewById<Button>(R.id.bt_Phone)

    }

    fun rquestpermission() {
        ActivityCompat.requestPermissions(context as Activity,
                arrayOf(android.Manifest.permission.CALL_PHONE), 1)

    }

}


