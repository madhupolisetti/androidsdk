package com.smscountry;

import com.smscountry.Interface.GroupsInterface;
import com.smscountry.models.BaseResponse;
import com.smscountry.models.Groups.CreateNewGroupRequest;
import com.smscountry.models.Groups.CreateNewGroupResponse;
import com.smscountry.models.Groups.GetAllMemberDetailsResponse;
import com.smscountry.models.Groups.GetGroupCollectionResponse;
import com.smscountry.models.Groups.GetGroupDetailsResponse;
import com.smscountry.models.Groups.GroupMember;
import com.smscountry.models.Groups.GroupResponse;
import com.smscountry.models.Groups.MemberDetailsResponse;

import rx.Observable;

/**
 * Created by jaya on 27/09/16.
 */
public class GroupsService {

    private ApiBase apiBase;
    private GroupsInterface groupsInterface;

    public GroupsService(ApiBase apiBase) {
        this.apiBase = apiBase;
        this.groupsInterface = this.apiBase.createService(GroupsInterface.class);
    }

    public Observable<CreateNewGroupResponse> createNewGroup(CreateNewGroupRequest body){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupsInterface.JsonCreateNewGroup(this.apiBase.getAuthKey(), body);
        }else{
            return this.groupsInterface.XmlCreateNewGroup(this.apiBase.getAuthKey(), body);
        }
    }

    public Observable<GetGroupDetailsResponse> getGroupDetails(String groupId){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupsInterface.JsonGetGroupDetails(this.apiBase.getAuthKey(), groupId);
        }else{
            return this.groupsInterface.XmlGetGroupDetails(this.apiBase.getAuthKey(), groupId);
        }
    }

    public Observable<GetGroupCollectionResponse> GetGroupCollection(String fromDate,
                                                                  String toDate,
                                                                  String callerId,
                                                                  String Offset){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupsInterface.JsonGetGroupCollection(this.apiBase.getAuthKey(),
                    fromDate, toDate, callerId, Offset);
        }else{
            return this.groupsInterface.XmlGetGroupCollection(this.apiBase.getAuthKey(),
                    fromDate, toDate, callerId, Offset);
        }
    }

    public Observable<BaseResponse> updateGroup(String groupId,
                                         GroupResponse body){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupsInterface.JsonUpdateGroup(this.apiBase.getAuthKey(), groupId, body);
        }else{
            return this.groupsInterface.JsonUpdateGroup(this.apiBase.getAuthKey(), groupId, body);
        }
    }

    public Observable<Void> deleteGroup(String groupId){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupsInterface.JsonDeleteGroup(this.apiBase.getAuthKey(), groupId);
        }else{
            return this.groupsInterface.XmlDeleteGroup(this.apiBase.getAuthKey(), groupId);
        }
    }

    public Observable<MemberDetailsResponse> getMemberDetails(String groupId,
                                                       String memberId){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupsInterface.JsonGetMemberDetails(this.apiBase.getAuthKey(), groupId, memberId);
        }else{
            return this.groupsInterface.XmlGetMemberDetails(this.apiBase.getAuthKey(), groupId, memberId);
        }
    }

    public Observable<GetAllMemberDetailsResponse> getAllMembersDetails(String groupId){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupsInterface.JsonGetAllMembersDetails(this.apiBase.getAuthKey(), groupId);
        }else{
            return this.groupsInterface.XmlGetAllMembersDetails(this.apiBase.getAuthKey(), groupId);
        }
    }

    public Observable<BaseResponse> updateMemberDetails(String groupId,
                                                        String memberId,
                                                        GroupMember member){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupsInterface.JsonUpdateMemberDetails(this.apiBase.getAuthKey(),
                    groupId, memberId, member);
        }else{
            return this.groupsInterface.XmlUpdateMemberDetails(this.apiBase.getAuthKey(),
                    groupId, memberId, member);
        }
    }

    public Observable<Void> deleteMember(String groupId,
                                  String memberId){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupsInterface.JsonDeleteMember(this.apiBase.getAuthKey(), groupId, memberId);
        }else{
            return this.groupsInterface.XmlDeleteMember(this.apiBase.getAuthKey(), groupId, memberId);
        }
    }

    public Observable<MemberDetailsResponse> addMember(String groupId, GroupMember body){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupsInterface.JsonAddMember(this.apiBase.getAuthKey(), groupId, body);
        }else{
            return this.groupsInterface.XmlAddMember(this.apiBase.getAuthKey(), groupId, body);
        }
    }
}
