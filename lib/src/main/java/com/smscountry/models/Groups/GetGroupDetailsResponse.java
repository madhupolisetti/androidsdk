package com.smscountry.models.Groups;

/**
 * Created by jaya on 26/09/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.smscountry.models.BaseResponse;

public class GetGroupDetailsResponse extends BaseResponse {

    @SerializedName("Group")
    @Expose
    private GroupResponse group;

    public GroupResponse getGroup() {
        return group;
    }

    public void setGroup(GroupResponse group) {
        this.group = group;
    }
}
