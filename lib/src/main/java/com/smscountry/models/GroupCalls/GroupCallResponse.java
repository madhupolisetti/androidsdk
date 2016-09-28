package com.smscountry.models.GroupCalls;

import com.smscountry.models.BaseResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by jaya on 27/09/16.
 */
public class GroupCallResponse extends BaseResponse {

    @SerializedName("GroupCall")
    @Expose
    private GroupCall groupCall;

    /**
     *
     * @return
     * The groupCall
     */
    public GroupCall getGroupCall() {
        return groupCall;
    }

    /**
     *
     * @param groupCall
     * The GroupCall
     */
    public void setGroupCall(GroupCall groupCall) {
        this.groupCall = groupCall;
    }
}