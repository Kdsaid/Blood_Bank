
package com.example.khale.bloodbank.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostsModle {

    @SerializedName("status")
    @Expose
    private int status;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("data")
    @Expose
    private Data_PostsModle data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Data_PostsModle getData() {
        return data;
    }

    public void setData(Data_PostsModle data) {
        this.data = data;
    }

}
