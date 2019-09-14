package com.example.khale.bloodbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
    @Expose
    @SerializedName("client")
    private Client_DonationRequestsModle client;
    @Expose
    @SerializedName("city")
    private City_DonationRequestsModle city;
    @Expose
    @SerializedName("longitude")
    private String longitude;
    @Expose
    @SerializedName("latitude")
    private String latitude;
    @Expose
    @SerializedName("notes")
    private String notes;
    @Expose
    @SerializedName("phone")
    private String phone;
    @Expose
    @SerializedName("city_id")
    private String city_id;
    @Expose
    @SerializedName("hospital_address")
    private String hospital_address;
    @Expose
    @SerializedName("hospital_name")
    private String hospital_name;
    @Expose
    @SerializedName("bags_num")
    private String bags_num;
    @Expose
    @SerializedName("blood_type")
    private String blood_type;
    @Expose
    @SerializedName("patient_age")
    private String patient_age;
    @Expose
    @SerializedName("patient_name")
    private String patient_name;
    @Expose
    @SerializedName("client_id")
    private String client_id;
    @Expose
    @SerializedName("updated_at")
    private String updated_at;
    @Expose
    @SerializedName("created_at")
    private String created_at;
    @Expose
    @SerializedName("id")
    private int id;

    public Client_DonationRequestsModle getClient() {
        return client;
    }

    public void setClient(Client_DonationRequestsModle client) {
        this.client = client;
    }

    public City_DonationRequestsModle getCity() {
        return city;
    }

    public void setCity(City_DonationRequestsModle city) {
        this.city = city;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getHospital_address() {
        return hospital_address;
    }

    public void setHospital_address(String hospital_address) {
        this.hospital_address = hospital_address;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getBags_num() {
        return bags_num;
    }

    public void setBags_num(String bags_num) {
        this.bags_num = bags_num;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getPatient_age() {
        return patient_age;
    }

    public void setPatient_age(String patient_age) {
        this.patient_age = patient_age;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
