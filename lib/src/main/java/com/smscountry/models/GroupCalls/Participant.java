package com.smscountry.models.GroupCalls;

/**
 * Created by jaya on 28/09/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Participant {

    @SerializedName("Name")
    @Expose
    private String name;

    @SerializedName("number")
    @Expose
    private String number;

    @SerializedName("Calls")
    @Expose
    private CallDetails[] calls;

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The number
     */
    public String getNumber() {
        return number;
    }

    /**
     *
     * @param number
     * The number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     *
     * @return
     * The calls
     */
    public CallDetails[] getCalls() {
        return calls;
    }

    /**
     *
     * @param calls
     * The Calls
     */
    public void setCalls(CallDetails[] calls) {
        this.calls = calls;
    }

}
