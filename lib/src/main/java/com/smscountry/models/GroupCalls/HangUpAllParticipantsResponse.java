package com.smscountry.models.GroupCalls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.smscountry.models.BaseResponse;

/**
 * Created by jaya on 28/09/16.
 */
public class HangUpAllParticipantsResponse extends BaseResponse {

    @SerializedName("AffectedParticipantIds")
    @Expose
    private String[] affectedParticipantIds;

    /**
     *
     * @return
     * The afftectedParticipantIds
     */
    public String[] getAffectedParticipantIds() {
        return affectedParticipantIds;
    }

    /**
     *
     * @param affectedParticipantIds
     * The AffectedParticipantIds
     */
    public void setAffectedParticipantIds(String[] affectedParticipantIds) {
        this.affectedParticipantIds = affectedParticipantIds;
    }

}
