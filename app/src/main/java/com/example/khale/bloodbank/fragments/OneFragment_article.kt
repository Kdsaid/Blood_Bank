package com.example.khale.bloodbank.fragments

/**
 * Created by Parsania Hardik on 20-Jan-18.
 */
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.adapters.ItemAdpter_fragement_row_one_article
import com.example.khale.bloodbank.api.RetrofitClient
import com.example.khale.bloodbank.models.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class OneFragment_article : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        //var button = view.findViewById<EditText>(R.id.button) as Button
        val view = inflater.inflate(R.layout.fragment_one, container, false)

       // var list = ArrayList<item_row_fragment_one>()
       // list.add(item_row_fragment_one("death", "DvpvklR.png"))
        // var adp = ItemAdpter_fragement_row_one(this.activity!!, list)
        var recyclerViewitem_row_fragment_one = view.findViewById<RecyclerView>(R.id.RecyclerView_fragment_one)
        recyclerViewitem_row_fragment_one.layoutManager = LinearLayoutManager(context)
       // recyclerViewitem_row_fragment_one.adapter = adp
        var api: String = "Zz9HuAjCY4kw2Ma2XaA6x7T5O3UODws1UakXI9vgFVSoY3xUXYOarHX2VH27"
        val call = RetrofitClient
                .getInstance()
                .api
                .getPosts(api)
        call.enqueue(
                object : Callback<PostsModle> {

                    override fun onResponse(call: Call<PostsModle>, response: Response<PostsModle>) {
                        var list=response.body()!!.data.data


                        val adp = ItemAdpter_fragement_row_one_article(list , context)
                         recyclerViewitem_row_fragment_one.adapter = adp

                 //       Toast.makeText(context, response.body()!!.data.data.get(0).title, Toast.LENGTH_LONG).show()

                    }

                    override fun onFailure(call: Call<PostsModle>, t: Throwable) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }


                })


        return view


    }

}