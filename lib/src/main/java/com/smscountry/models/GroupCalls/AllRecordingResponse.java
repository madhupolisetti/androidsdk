package com.smscountry.models.GroupCalls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.smscountry.models.BaseResponse;

/**
 * Created by jaya on 27/09/16.
 */
public class AllRecordingResponse extends BaseResponse {

    @SerializedName("AffectedRecordingUUIDs")
    @Expose
    private String[] affectedRecordingUUIDs;

    /**
     *
     * @return
     * The affectedRecordingUUIDs
     */
    public String[] getAffectedRecordingUUIDs() {
        return affectedRecordingUUIDs;
    }

    /**
     *
     * @param affectedRecordingUUIDs
     * The AffectedRecordingUUIDs
     */
    public void setAffectedRecordingUUIDs(String[] affectedRecordingUUIDs) {
        this.affectedRecordingUUIDs = affectedRecordingUUIDs;
    }

}
