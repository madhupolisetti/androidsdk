package com.smscountry.models.GroupCalls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.smscountry.models.BaseResponse;

/**
 * Created by jaya on 27/09/16.
 */
public class AllRecordingDetails extends BaseResponse {

    @SerializedName("Recordings")
    @Expose
    private Recording[] recordings;

    /**
     *
     * @return
     * The recording
     */
    public Recording[] getRecording() {
        return recordings;
    }

    /**
     *
     * @param recording
     * The Recording
     */
    public void setRecording(Recording[] recording) {
        this.recordings = recording;
    }
}
