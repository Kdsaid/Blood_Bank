package com.example.khale.bloodbank.models

import kotlinx.android.synthetic.main.item_row_fragment_two.view.*

class item_row_fragment_two {
    var bloodType: String? = null
    var patien_Name: String? = null
    var hospital_name: String? = null
    var coutry_name: String? = null
    var bt_details: String? = null
    var bt_Phone: String? = null

    constructor(bloodType: String?, patien_Name: String?, hospital_name: String?, coutry_name: String?, bt_details: String?, bt_Phone: String?) {
        this.bloodType = bloodType
        this.patien_Name = patien_Name
        this.hospital_name = hospital_name
        this.coutry_name = coutry_name
        this.bt_details = bt_details
        this.bt_Phone = bt_Phone
    }
}
