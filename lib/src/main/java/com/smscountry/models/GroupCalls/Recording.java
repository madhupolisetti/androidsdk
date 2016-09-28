package com.smscountry.models.GroupCalls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 28/09/16.
 */
public class Recording {

    @SerializedName("RecordingUUID")
    @Expose
    private String recordingUUID;

    @SerializedName("Url")
    @Expose
    private String url;

    /**
     *
     * @return
     * The recordingUUID
     */
    public String getRecordingUUID() {
        return recordingUUID;
    }

    /**
     *
     * @param recordingUUID
     * The RecordingUUID
     */
    public void setRecordingUUID(String recordingUUID) {
        this.recordingUUID = recordingUUID;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The Url
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
