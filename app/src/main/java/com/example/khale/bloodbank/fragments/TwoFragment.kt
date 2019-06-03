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
import android.widget.Button
import com.example.khale.bloodbank.R
import com.example.khale.bloodbank.R.id.RecyclerView_fragment_two
import com.example.khale.bloodbank.adapters.ItemAdpter_fragement_row_two
import com.example.khale.bloodbank.models.item_row_fragment_two
import kotlinx.android.synthetic.main.item_row_fragment_two.*


class TwoFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_two, container, false)
////// to create
        var list = ArrayList<item_row_fragment_two>()
        list.add(item_row_fragment_two("A-", "ali", "cairo", "Egypt", "00000", "01016179833"))
        var adp = ItemAdpter_fragement_row_two(this!!.activity!!, list)
//       var btn_details=view.findViewById<Button>(R.id.bt_details)
//        btn_details.setOnClickListener{
//           // startActivity()
//        }
        var recyclerView_fragment_two = view.findViewById<RecyclerView>(R.id.RecyclerView_fragment_two)
        recyclerView_fragment_two.layoutManager = LinearLayoutManager(context)
        recyclerView_fragment_two.adapter = adp


        return view
    }

}