package com.example.khale.bloodbank.models

public class User {

    private var name: String? = null
    private var email: String? = null
    private var birth_date: String? = null
    private var city_id: String? = null
    private var phone: String? = null

    private var donation_last_date: String? = null
    private var password: String? = null
    private var password_confirmation: String? = null

    private var blood_type: String? = null

//    constructor(name: String?, email: String?, birth_date: String?, city_id: String?, donation_last_date: String?,
//                password: String?, password_confirmation: String?, blood_type: String?,phone: String?) {
//        this.name = name
//        this.email = email
//        this.birth_date = birth_date
//        this.city_id = city_id
//        this.donation_last_date = donation_last_date
//        this.password = password
//        this.password_confirmation = password_confirmation
//        this.blood_type = blood_type
//        this.phone=phone
//    }

    fun setName(name: String) {
        this.name = name
    }


    fun setEmail(email: String) {
        this.email = email

    }

    fun setBirth_date(birth_date: String) {
        this.birth_date = birth_date
    }

    fun setPhone(phone: String) {
        this.phone = phone
    }

    fun setCity_id(city_id: String) {
        this.city_id = city_id
    }
    fun setPassword_confirmation(name: String) {
        this.name = name
    }

    fun setDonation_last_date(donation_last_date: String) {
        this.donation_last_date
    }

    fun setPassword(password: String) {
        this.password = password
    }

    fun setBlood_type(blood_type: String) {
        this.blood_type = blood_type
    }

    fun getName(): String? {
        return name
    }

    fun getEmail(): String? {
        return email
    }

    fun getBirth_date(): String? {
        return birth_date
    }

    fun getPhone(): String? {
        return phone
    }

    fun getCity_id(): String? {
        return city_id
    }

    fun getDonation_last_date(): String? {
        return donation_last_date
    }

    fun getPassword(): String? {
        return password
    }


    fun getBlood_type(): String? {
        return blood_type
    }


    fun getPassword_confirmation(): String? {
        return password_confirmation
    }



}
