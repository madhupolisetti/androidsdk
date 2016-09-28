package com.smscountry.models.Groups;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.smscountry.models.BaseResponse;

/**
 * Created by jaya on 26/09/16.
 */
public class GetGroupCollectionResponse extends BaseResponse {

    @SerializedName("Groups")
    @Expose
    private GroupResponse[] groups;

    public GroupResponse[] getGroups() {
        return groups;
    }

    public void setGroups(GroupResponse[] groups) {
        this.groups = groups;
    }
}
