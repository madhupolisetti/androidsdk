package com.smscountry.models.Calls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 23/09/16.
 */
public class CreateNewCallResponse {

    @SerializedName("ApiId")
    @Expose
    private String apiId;

    @SerializedName("Success")
    @Expose
    private boolean success;

    @SerializedName("Message")
    @Expose
    private String message;

    @SerializedName("CallUUID")
    @Expose
    private String callUUID;

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public boolean isSuccess() {

        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCallUUID() {

        return callUUID;
    }

    public void setCallUUID(String callUUID) {
        this.callUUID = callUUID;
    }
}
