package com.example.khale.bloodbank.adapters

import android.content.ClipData
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.models.item_row_fragment_two
import kotlinx.android.synthetic.main.item_row_fragment_two.view.*


class ItemAdpter_fragement_row_two(var context: Context, var list: ArrayList<item_row_fragment_two>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        (holder as ItemHolder).bind(list[position].bloodType!!, list[position].patien_Name!!, list[position].hospital_name!!,
                list[position].coutry_name!!,
                list[position].bt_details!!,
                list[position].bt_Phone!!


        )

    }
    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var v: View = LayoutInflater.from(context).inflate(R.layout.item_row_fragment_two, parent, false)
        return ItemHolder(v)

    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(bloodType: String, patien_Name: String, hospital_name: String, coutry_name: String, bt_details: String, bt_Phone: String) {
            itemView.bloodType.text = bloodType.toString()
            itemView.patien_Name.text = patien_Name.toString()
            itemView.hospital_name.text = hospital_name.toString()
            itemView.coutry_name.text = coutry_name.toString()
            itemView.bt_details.text = bt_details.toString()
            itemView.bt_Phone.text = bt_Phone


        }
    }
}