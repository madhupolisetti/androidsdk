package com.smscountry.models.GroupCalls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 28/09/16.
 */
public class PlaySoundRequest {

    @SerializedName("File")
    @Expose
    private String file;

    /**
     *
     * @return
     * The file
     */
    public String getFile() {
        return file;
    }

    /**
     *
     * @param file
     * The File
     */
    public void setFile(String file) {
        this.file = file;
    }

}
