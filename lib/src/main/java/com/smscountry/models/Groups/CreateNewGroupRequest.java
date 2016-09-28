package com.smscountry.models.Groups;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateNewGroupRequest {

    @SerializedName("Name")
    @Expose
    private String name;

    @SerializedName("TinyName")
    @Expose
    private String tinyName;

    @SerializedName("StartGroupCallOnEnter")
    @Expose
    private String startGroupCallOnEnter;

    @SerializedName("EndGroupCallOnExit")
    @Expose
    private String endGroupCallOnExit;

    @SerializedName("Members")
    @Expose
    private GroupMember[] members;

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
     * The startGroupCallOnEnter
     */
    public String getStartGroupCallOnEnter() {
        return startGroupCallOnEnter;
    }

    /**
     *
     * @param startGroupCallOnEnter
     * The StartGroupCallOnEnter
     */
    public void setStartGroupCallOnEnter(String startGroupCallOnEnter) {
        this.startGroupCallOnEnter = startGroupCallOnEnter;
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
     * The members
     */
    public GroupMember[] getMembers() {
        return members;
    }

    /**
     *
     * @param members
     * The Members
     */
    public void setMembers(GroupMember[] members) {
        this.members = members;
    }

}