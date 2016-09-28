package com.smscountry.models.GroupCalls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 27/09/16.
 */
public class CallDetails {

    @SerializedName("CallStatus")
    @Expose
    private String callStatus;
    @SerializedName("AnswerTime")
    @Expose
    private String answerTime;
    @SerializedName("EndTime")
    @Expose
    private String endTime;
    @SerializedName("EndReason")
    @Expose
    private String endReason;
    @SerializedName("Cost")
    @Expose
    private String cost;
    @SerializedName("Pulse")
    @Expose
    private String pulse;
    @SerializedName("PricePerPulse")
    @Expose
    private String pricePerPulse;

    /**
     *
     * @return
     * The callStatus
     */
    public String getCallStatus() {
        return callStatus;
    }

    /**
     *
     * @param callStatus
     * The CallStatus
     */
    public void setCallStatus(String callStatus) {
        this.callStatus = callStatus;
    }

    /**
     *
     * @return
     * The answerTime
     */
    public String getAnswerTime() {
        return answerTime;
    }

    /**
     *
     * @param answerTime
     * The AnswerTime
     */
    public void setAnswerTime(String answerTime) {
        this.answerTime = answerTime;
    }

    /**
     *
     * @return
     * The endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     *
     * @param endTime
     * The EndTime
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     *
     * @return
     * The endReason
     */
    public String getEndReason() {
        return endReason;
    }

    /**
     *
     * @param endReason
     * The EndReason
     */
    public void setEndReason(String endReason) {
        this.endReason = endReason;
    }

    /**
     *
     * @return
     * The cost
     */
    public String getCost() {
        return cost;
    }

    /**
     *
     * @param cost
     * The Cost
     */
    public void setCost(String cost) {
        this.cost = cost;
    }

    /**
     *
     * @return
     * The pulse
     */
    public String getPulse() {
        return pulse;
    }

    /**
     *
     * @param pulse
     * The Pulse
     */
    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    /**
     *
     * @return
     * The pricePerPulse
     */
    public String getPricePerPulse() {
        return pricePerPulse;
    }

    /**
     *
     * @param pricePerPulse
     * The PricePerPulse
     */
    public void setPricePerPulse(String pricePerPulse) {
        this.pricePerPulse = pricePerPulse;
    }

}
