package com.smscountry.models.GroupCalls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 28/09/16.
 */
public class StartRecordingRequest {

    @SerializedName("FileFormat")
    @Expose
    private String fileFormat;

    /**
     *
     * @return
     * The fileFormat
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     *
     * @param fileFormat
     * The File
     */
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }
}
