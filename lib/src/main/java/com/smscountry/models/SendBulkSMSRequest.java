package com.smscountry.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 21/09/16.
 */
public class SendBulkSMSRequest {

    @SerializedName("Text")
    @Expose
    private String text;

    @SerializedName("Numbers")
    @Expose
    private String[] numbers;

    @SerializedName("SenderId")
    @Expose
    private String senderId;

    @SerializedName("DRNotifyUrl")
    @Expose
    private String deliveryNotifyUrl;

    @SerializedName("DRNotifyHttpMethod")
    @Expose
    private String deliveryNotifyHttpMethod;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getNumbers() {
        return numbers;
    }

    public void setNumbers(String[] numbers) {
        this.numbers = numbers;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getDeliveryNotifyUrl() {
        return deliveryNotifyUrl;
    }

    public void setDeliveryNotifyUrl(String deliveryNotifyUrl) {
        this.deliveryNotifyUrl = deliveryNotifyUrl;
    }

    public String getDeliveryNotifyHttpMethod() {
        return deliveryNotifyHttpMethod;
    }

    public void setDeliveryNotifyHttpMethod(String deliveryNotifyHttpMethod) {
        this.deliveryNotifyHttpMethod = deliveryNotifyHttpMethod;
    }
}
