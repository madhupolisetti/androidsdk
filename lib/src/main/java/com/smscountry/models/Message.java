package com.smscountry.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 21/09/16.
 */
public class Message {

    @SerializedName("MessageUUID")
    @Expose
    private String messageUUID;

    @SerializedName("Number")
    @Expose
    private String number;

    @SerializedName("Tool")
    @Expose
    private String tool;

    @SerializedName("SenderId")
    @Expose
    private String senderId;

    @SerializedName("Text")
    @Expose
    private String text;

    @SerializedName("Status")
    @Expose
    private String status;

    @SerializedName("StatusTime")
    @Expose
    private String statusTime;

    @SerializedName("Cost")
    @Expose
    private String cost;

    public String getMessageUUID() {
        return messageUUID;
    }

    public void setMessageUUID(String messageUUID) {
        this.messageUUID = messageUUID;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTool() {

        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public String getSenderId() {

        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusTime() {

        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    public String getCost() {

        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
