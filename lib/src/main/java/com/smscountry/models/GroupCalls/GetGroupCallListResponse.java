package com.smscountry.models.GroupCalls;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.smscountry.models.BaseResponse;

/**
 * Created by jaya on 28/09/16.
 */
public class GetGroupCallListResponse extends BaseResponse {

    @SerializedName("GroupCalls")
    @Expose
    private GroupCall[] groupCalls;

    /**
     *
     * @return
     * The groupCalls
     */
    public GroupCall[] getGroupCalls() {
        return groupCalls;
    }

    /**
     *
     * @param groupCalls
     * The GroupCall
     */
    public void setGroupCalls(GroupCall[] groupCalls) {
        this.groupCalls = groupCalls;
    }
}
