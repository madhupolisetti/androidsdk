package com.smscountry.models.GroupCalls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.smscountry.models.BaseResponse;

/**
 * Created by jaya on 28/09/16.
 */
public class ParticipantDetailsResponse extends BaseResponse{


    @SerializedName("Participant")
    @Expose
    private Participant participant;

    /**
     *
     * @return
     * The participant
     */
    public Participant getParticipant() {
        return participant;
    }

    /**
     *
     * @param participant
     * The Participant
     */
    public void setParticipant(Participant participant) {
        this.participant = participant;
    }


}
