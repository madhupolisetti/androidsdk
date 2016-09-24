package com.smscountry.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 21/09/16.
 */
public class SendSMSRequest {

    @SerializedName("Text")
    @Expose
    private String text;

    @SerializedName("Number")
    @Expose
    private String number;

    @SerializedName("SenderId")
    @Expose
    private String senderId;

    @SerializedName("DRNotifyUrl")
    @Expose
    private String deliveryNotifyUrl;

    @SerializedName("DRNotifyHttpMethod")
    @Expose
    private String deliveryNotifyHttpMethod;

    public String getDeliveryNotifyHttpMethod() {
        return deliveryNotifyHttpMethod;
    }

    public void setDeliveryNotifyHttpMethod(String deliveryNotifyHttpMethod) {
        this.deliveryNotifyHttpMethod = deliveryNotifyHttpMethod;
    }

    public String getDeliveryNotifyUrl() {

        return deliveryNotifyUrl;
    }

    public void setDeliveryNotifyUrl(String deliveryNotifyUrl) {
        this.deliveryNotifyUrl = deliveryNotifyUrl;
    }

    public String getSenderId() {

        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
