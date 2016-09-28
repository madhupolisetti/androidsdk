package com.smscountry.models.Groups;

/**
 * Created by jaya on 26/09/16.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Group {

    @SerializedName("Id")
    @Expose
    private String id;

    @SerializedName("Name")
    @Expose
    private String name;

    @SerializedName("Members")
    @Expose
    private GroupMember[] members;

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