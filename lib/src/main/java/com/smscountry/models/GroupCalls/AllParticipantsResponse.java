package com.smscountry.models.GroupCalls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.smscountry.models.BaseResponse;

/**
 * Created by jaya on 28/09/16.
 */
public class AllParticipantsResponse extends BaseResponse {

    @SerializedName("FailedParticipantIds")
    @Expose
    private String[] failedParticipantIds;

    /**
     *
     * @return
     * The failedParticipantIds
     */
    public String[] getFailedParticipantIds() {
        return failedParticipantIds;
    }

    /**
     *
     * @param failedParticipantIds
     * The FailedParticipantIds
     */
    public void setFailedParticipantIds(String[] failedParticipantIds) {
        this.failedParticipantIds = failedParticipantIds;
    }

}
