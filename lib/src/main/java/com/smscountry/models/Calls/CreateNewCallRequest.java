package com.smscountry.models.Calls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 23/09/16.
 */
public class CreateNewCallRequest {


    @SerializedName("Number")
    @Expose
    private String number;

    @SerializedName("CallerId")
    @Expose
    private String callerId;

    @SerializedName("RingUrl")
    @Expose
    private String ringUrl;

    @SerializedName("AnswerUrl")
    @Expose
    private String answerUrl;

    @SerializedName("HangupUrl")
    @Expose
    private String hangupUrl;

    @SerializedName("HttpMethod")
    @Expose
    private String httpMethod;

    @SerializedName("Xml")
    @Expose
    private String xml;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCallerId() {

        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public String getRingUrl() {

        return ringUrl;
    }

    public void setRingUrl(String ringUrl) {
        this.ringUrl = ringUrl;
    }

    public String getAnswerUrl() {

        return answerUrl;
    }

    public void setAnswerUrl(String answerUrl) {
        this.answerUrl = answerUrl;
    }

    public String getHangupUrl() {

        return hangupUrl;
    }

    public void setHangupUrl(String hangupUrl) {
        this.hangupUrl = hangupUrl;
    }

    public String getHttpMethod() {

        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }
}
