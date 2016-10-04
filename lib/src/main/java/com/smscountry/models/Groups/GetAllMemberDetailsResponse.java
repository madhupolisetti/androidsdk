package com.smscountry.models.Groups;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.smscountry.models.BaseResponse;

/**
 * Created by jaya on 28/09/16.
 */
public class GetAllMemberDetailsResponse extends BaseResponse {

    @SerializedName("Members")
    @Expose
    private GroupMember[] members;

    public GroupMember[] getMembers() {
        return members;
    }

    public void setMembers(GroupMember[] members) {
        this.members = members;
    }
}
