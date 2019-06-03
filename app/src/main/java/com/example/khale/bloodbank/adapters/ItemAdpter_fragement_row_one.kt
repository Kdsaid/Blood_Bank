package com.example.khale.bloodbank.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.models.Datum_PostsModle


class ItemAdpter_fragement_row_one(var context: Context?, var list: List<Datum_PostsModle>)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ItemHolder)
//        (holder as ItemHolder).bind(
//                list[position].article_Title!!,
//                list[position].article_Image!!)
        var item:Datum_PostsModle=list.get(position)
        holder.v.setText(item.title)
        holder.v.setText(item.thumbnail)
    }
    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var v: View = LayoutInflater.from(context).inflate(R.layout.item_row_fragment_one, parent, false)
        return ItemHolder(v)

    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var v=itemView.findViewById<TextView>(R.id.article_Title)
        var vv=itemView.findViewById<>(R.id.imageView)
//
//        fun bind(article_Title:String,article_Image: String ) {
//            itemView.article_Title.text = article_Title.toString()
//
//            var web:String="http://i.imgur.com/DvpvklR.png"
//            web=web.replace(" ","%20")
//            Picasso.with(itemView.context).load(web).into(itemView.article_Image)
//
//
//        }
    }
}