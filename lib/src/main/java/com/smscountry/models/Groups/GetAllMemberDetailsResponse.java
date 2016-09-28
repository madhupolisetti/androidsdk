package com.smscountry.models.Groups;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.smscountry.models.BaseResponse;

/**
 * Created by jaya on 28/09/16.
 */
public class GetAllMemberDetailsResponse extends BaseResponse {

    @SerializedName("Member")
    @Expose
    private GroupMember[] member;

    public GroupMember[] getMember() {
        return member;
    }

    public void setMember(GroupMember[] member) {
        this.member = member;
    }
}
