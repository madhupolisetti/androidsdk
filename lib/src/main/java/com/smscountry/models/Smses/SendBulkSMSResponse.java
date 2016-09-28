package com.smscountry.models.Smses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 21/09/16.
 */
public class SendBulkSMSResponse {

    @SerializedName("ApiId")
    @Expose
    private String apiId;

    @SerializedName("Success")
    @Expose
    private Boolean success;

    @SerializedName("Message")
    @Expose
    private String message;

    @SerializedName("MessageUUIDs")
    @Expose
    private String[] messageUUIDs;

    @SerializedName("BatchId")
    @Expose
    private String batchId;

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String[] getMessageUUIDs() {
        return messageUUIDs;
    }

    public void setMessageUUIDs(String[] messageUUIDs) {
        this.messageUUIDs = messageUUIDs;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
}
