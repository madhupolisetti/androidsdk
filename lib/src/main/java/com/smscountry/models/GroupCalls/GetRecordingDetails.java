package com.smscountry.models.GroupCalls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.smscountry.models.BaseResponse;

/**
 * Created by jaya on 28/09/16.
 */
public class GetRecordingDetails extends BaseResponse {

    @SerializedName("Recording")
    @Expose
    private Recording recording;

    /**
     *
     * @return
     * The recording
     */
    public Recording getRecording() {
        return recording;
    }

    /**
     *
     * @param recording
     * The Recording
     */
    public void setRecording(Recording recording) {
        this.recording = recording;
    }
}
