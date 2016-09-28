package com.smscountry.models.Smses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 22/09/16.
 */
public class GetSMSDetailsResponse {

    @SerializedName("ApiId")
    @Expose
    private String apiId;

    @SerializedName("Success")
    @Expose
    private String success;

    @SerializedName("Message")
    @Expose
    private String message;

    @SerializedName("SMS")
    @Expose
    private Message sms;

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String isSuccess() {

        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message getSms() {
        return sms;
    }

    public void setSms(Message sms) {
        this.sms = sms;
    }
}
