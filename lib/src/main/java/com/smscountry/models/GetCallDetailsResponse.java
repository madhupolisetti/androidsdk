package com.smscountry.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 23/09/16.
 */
public class GetCallDetailsResponse {

    @SerializedName("ApiId")
    @Expose
    private String apiId;

    @SerializedName("Success")
    @Expose
    private boolean success;

    @SerializedName("Message")
    @Expose
    private String message;

    @SerializedName("Call")
    @Expose
    private Call call;

}
