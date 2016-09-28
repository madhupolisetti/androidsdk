package com.smscountry.models.Calls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 23/09/16.
 */
public class Call {

    @SerializedName("Number")
    @Expose
    private String number;

    @SerializedName("CallUUID")
    @Expose
    private String callUUID;

    @SerializedName("CallerId")
    @Expose
    private String callerId;

    @SerializedName("Status")
    @Expose
    private String status;

    @SerializedName("RingTime")
    @Expose
    private String ringTime;

    @SerializedName("AnswerTime")
    @Expose
    private String answerTime;

    @SerializedName("EndTime")
    @Expose
    private String endTime;

    @SerializedName("EndReaon")
    @Expose
    private String endReaon;

    @SerializedName("Cost")
    @Expose
    private String cost;

    @SerializedName("Direction")
    @Expose
    private String direction;

    @SerializedName("Pulse")
    @Expose
    private String pulse;

    @SerializedName("Pulses")
    @Expose
    private String pulses;

    @SerializedName("PricePerPulse")
    @Expose
    private String pricePerPulse;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCallUUID() {

        return callUUID;
    }

    public void setCallUUID(String callUUID) {
        this.callUUID = callUUID;
    }

    public String getCallerId() {

        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRingTime() {

        return ringTime;
    }

    public void setRingTime(String ringTime) {
        this.ringTime = ringTime;
    }

    public String getAnswerTime() {

        return answerTime;
    }

    public void setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
    }

    public String getEndTime() {

        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndReaon() {

        return endReaon;
    }

    public void setEndReaon(String endReaon) {
        this.endReaon = endReaon;
    }

    public String getCost() {

        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDirection() {

        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPulse() {

        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getPulses() {

        return pulses;
    }

    public void setPulses(String pulses) {
        this.pulses = pulses;
    }

    public String getPricePerPulse() {

        return pricePerPulse;
    }

    public void setPricePerPulse(String pricePerPulse) {
        this.pricePerPulse = pricePerPulse;
    }
}
