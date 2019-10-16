package com.titi.mj.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DonationResponse {

    @Expose
    @SerializedName("message")
    public String message;
    @Expose
    @SerializedName("data")
    public List<Data> data;
    @Expose
    @SerializedName("success")
    public boolean success;

    public static class Data {
        @Expose
        @SerializedName("updated_at")
        public String updatedAt;
        @Expose
        @SerializedName("created_at")
        public String createdAt;
        @Expose
        @SerializedName("donation_category")
        public Integer donationCategory;
        @Expose
        @SerializedName("donation_end")
        public String donationEnd;
        @Expose
        @SerializedName("donation_user")
        public int donationUser;
        @Expose
        @SerializedName("donator_total")
        public int donatorTotal;
        @Expose
        @SerializedName("donation_received")
        public int donationReceived;
        @Expose
        @SerializedName("donation_image")
        public String donationImage;
        @Expose
        @SerializedName("donation_title")
        public String donationTitle;
        @Expose
        @SerializedName("id")
        public int id;
    }
}
