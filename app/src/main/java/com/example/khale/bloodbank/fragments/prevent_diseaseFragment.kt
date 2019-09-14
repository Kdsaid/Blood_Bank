package com.example.khale.bloodbank.fragments


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.api.RetrofitClient
import com.example.khale.bloodbank.models.PostSDetailsModle
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class prevent_diseaseFragment : Fragment() {

    private lateinit var image_dtails_posts: ImageView
    private lateinit var article_dtails_posts: TextView
    private lateinit var article_dtails_posts_tv: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_prevent_disease,
                container, false)
        init(view)
        netWorkCall()

        return view
    }

    private fun init(view: View) {
        image_dtails_posts = view.findViewById(R.id.image_dtails_posts)
        article_dtails_posts = view.findViewById(R.id.article_dtails_posts)
        article_dtails_posts_tv = view.findViewById(R.id.article_dtails_posts_tv)

    }

    private fun netWorkCall() {
        val call = RetrofitClient
                .getInstance()
                .api
                .getPost_details(
                        "Zz9HuAjCY4kw2Ma2XaA6x7T5O3UODws1UakXI9vgFVSoY3xUXYOarHX2VH27", "1")

        call.enqueue(object : Callback<PostSDetailsModle> {
            override fun onResponse(call: Call<PostSDetailsModle>, response: Response<PostSDetailsModle>) {
                //    var pin=response.body()!!.data
                Log.d("lolo", "Success")
                if (response.isSuccessful) {
                    val model = response.body()
                    article_dtails_posts.text = model!!.data.title
                    article_dtails_posts_tv.text = model.data.content
                     image_load(context, model,image_dtails_posts)
                    Log.d("lolo", "Success ${model.data.title}")
                } else {
                    Log.d("lolo", "!Success")
                }
            }

            override fun onFailure(call: Call<PostSDetailsModle>, t: Throwable) {
                Log.d("lolo", t.localizedMessage)
            }
        })
    }

    private fun image_load(context: Context?, model: PostSDetailsModle,view: View) {
        var web: String = "http://ipda3.com/blood-bank" + model.data.thumbnail
        Log.i("llll",web)
        web = web.replace(" ", "%20")

            Glide.with(context!!).load(web).into(image_dtails_posts.findViewById(R.id.image_dtails_posts))
    }
}
