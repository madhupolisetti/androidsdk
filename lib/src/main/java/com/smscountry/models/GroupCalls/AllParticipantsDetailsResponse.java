package com.smscountry.models.GroupCalls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.smscountry.models.BaseResponse;

/**
 * Created by jaya on 28/09/16.
 */
public class AllParticipantsDetailsResponse extends BaseResponse {

    @SerializedName("Participants")
    @Expose
    private Participant[] participants;

    /**
     *
     * @return
     * The participants
     */
    public Participant[] getParticipants() {
        return participants;
    }

    /**
     *
     * @param participants
     * The Participant
     */
    public void setParticipants(Participant[] participants) {
        this.participants = participants;
    }

}
