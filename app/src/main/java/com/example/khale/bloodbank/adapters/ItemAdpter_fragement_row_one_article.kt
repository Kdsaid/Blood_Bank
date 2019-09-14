package com.example.khale.bloodbank.adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.models.Datum_PostsModle
import android.support.v7.app.AppCompatActivity
import com.example.khale.bloodbank.fragments.prevent_diseaseFragment


class ItemAdpter_fragement_row_one_article
(var list: List<Datum_PostsModle>, var context: Context?)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>(), View.OnClickListener {
    override fun onClick(v: View?) {
        val fragment = prevent_diseaseFragment()
        DiplayFragment(fragment, v)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ItemHolder)


        val item: Datum_PostsModle = list.get(position)
        holder.posts_article_Title.text = item.title
        var web: String = "http://ipda3.com/blood-bank" + item.thumbnail
        web = web.replace(" ", "%20")
        Glide
                .with(this!!.context!!)
                .load(web)

                .into(holder.posts_article_Image.findViewById(R.id.article_Image))

        holder.posts_article_Image.setOnClickListener(this)



        Log.i("well", web)


    }

    private fun DiplayFragment(fragment: Fragment, v: View?) {

        val activity = v!!.getContext() as AppCompatActivity

        var fragmentTransaction: FragmentTransaction = activity.supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.container, fragment)
        fragmentTransaction.commit()
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var v: View = LayoutInflater.from(context).inflate(R.layout.item_row_fragment_one, parent, false)
        return ItemHolder(v)

    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var posts_article_Title = itemView.findViewById<TextView>(R.id.article_Title)
        var posts_article_Image = itemView.findViewById<ImageView>(R.id.article_Image)


    }
}
