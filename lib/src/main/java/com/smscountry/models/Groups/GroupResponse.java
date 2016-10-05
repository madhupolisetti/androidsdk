package com.smscountry.models.Groups;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 26/09/16.
 */
public class GroupResponse {

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("TinyName")
    @Expose
    private String tinyName;
    @SerializedName("StartGroupCallOnEnter")
    @Expose
    private String startGroupOnEnter;
    @SerializedName("EndGroupCallOnExit")
    @Expose
    private String endGroupCallOnExit;
    @SerializedName("Links")
    @Expose
    private String[] links;

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The Id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The tinyName
     */
    public String getTinyName() {
        return tinyName;
    }

    /**
     *
     * @param tinyName
     * The TinyName
     */
    public void setTinyName(String tinyName) {
        this.tinyName = tinyName;
    }

    /**
     *
     * @return
     * The startGroupOnEnter
     */
    public String getStartGroupOnEnter() {
        return startGroupOnEnter;
    }

    /**
     *
     * @param startGroupOnEnter
     * The StartGroupOnEnter
     */
    public void setStartGroupOnEnter(String startGroupOnEnter) {
        this.startGroupOnEnter = startGroupOnEnter;
    }

    /**
     *
     * @return
     * The endGroupCallOnExit
     */
    public String getEndGroupCallOnExit() {
        return endGroupCallOnExit;
    }

    /**
     *
     * @param endGroupCallOnExit
     * The EndGroupCallOnExit
     */
    public void setEndGroupCallOnExit(String endGroupCallOnExit) {
        this.endGroupCallOnExit = endGroupCallOnExit;
    }

    /**
     *
     * @return
     * The links
     */
    public String[] getLinks() {
        return links;
    }

    /**
     *
     * @param links
     * The Links
     */
    public void setLinks(String[] links) {
        this.links = links;
    }
}
