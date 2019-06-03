package com.example.khale.bloodbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegM {
    public RegM(Data data, String msg, int status) {
        this.data = data;
        this.msg = msg;
        this.status = status;
    }

    @Expose
    @SerializedName("data")
    private Data data;
    @Expose
    @SerializedName("msg")
    private String msg;
    @Expose
    @SerializedName("status")
    private int status;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class Data {

        public Data(Client client, String api_token) {
            this.client = client;
            this.api_token = api_token;
        }

        @Expose
        @SerializedName("client")
        private Client client;
        @Expose
        @SerializedName("api_token")
        private String api_token;

        public Client getClient() {
            return client;
        }

        public void setClient(Client client) {
            this.client = client;
        }

        public String getApi_token() {
            return api_token;
        }

        public void setApi_token(String api_token) {
            this.api_token = api_token;
        }
    }

    public static class Client {

        public Client(int id, String created_at, String updated_at, String blood_type, String donation_last_date, String phone, String city_id, String birth_date, String email, String name) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.blood_type = blood_type;
            this.donation_last_date = donation_last_date;
            this.phone = phone;
            this.city_id = city_id;
            this.birth_date = birth_date;
            this.email = email;
            this.name = name;
        }

        @Expose
        @SerializedName("id")
        private int id;
        @Expose
        @SerializedName("created_at")
        private String created_at;
        @Expose
        @SerializedName("updated_at")
        private String updated_at;
        @Expose
        @SerializedName("blood_type")
        private String blood_type;
        @Expose
        @SerializedName("donation_last_date")
        private String donation_last_date;
        @Expose
        @SerializedName("phone")
        private String phone;
        @Expose
        @SerializedName("city_id")
        private String city_id;
        @Expose
        @SerializedName("birth_date")
        private String birth_date;
        @Expose
        @SerializedName("email")
        private String email;
        @Expose
        @SerializedName("name")
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getBlood_type() {
            return blood_type;
        }

        public void setBlood_type(String blood_type) {
            this.blood_type = blood_type;
        }

        public String getDonation_last_date() {
            return donation_last_date;
        }

        public void setDonation_last_date(String donation_last_date) {
            this.donation_last_date = donation_last_date;
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

        public String getBirth_date() {
            return birth_date;
        }

        public void setBirth_date(String birth_date) {
            this.birth_date = birth_date;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
