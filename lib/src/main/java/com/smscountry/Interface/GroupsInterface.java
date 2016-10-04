package com.smscountry.Interface;

import com.smscountry.models.BaseResponse;
import com.smscountry.models.Groups.CreateNewGroupRequest;
import com.smscountry.models.Groups.CreateNewGroupResponse;
import com.smscountry.models.Groups.GetAllMemberDetailsResponse;
import com.smscountry.models.Groups.GetGroupCollectionResponse;
import com.smscountry.models.Groups.GetGroupDetailsResponse;
import com.smscountry.models.Groups.GroupMember;
import com.smscountry.models.Groups.MemberDetailsResponse;
import com.smscountry.models.Groups.GroupResponse;

import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by jaya on 26/09/16.
 */
public interface GroupsInterface {

    @POST("{authKey}/Groups/")
    @Headers("Content-Type: application/json")
    Observable<CreateNewGroupResponse> JsonCreateNewGroup(@Path("authKey") String authKey,
                                                         @Body CreateNewGroupRequest body);

    @POST("{authKey}/Groups/")
    @Headers("Content-Type: application/xml")
    Observable<CreateNewGroupResponse> XmlCreateNewGroup(@Path("authKey") String authKey,
                                                         @Body CreateNewGroupRequest body);

    @GET("{authKey}/Groups/{groupId}/")
    @Headers("Content-Type: application/json")
    Observable<GetGroupDetailsResponse> JsonGetGroupDetails(@Path("authKey") String authKey,
                                                            @Path("groupId") String groupId);

    @GET("{authKey}/Groups/{groupId}/")
    @Headers("Content-Type: application/xml")
    Observable<GetGroupDetailsResponse> XmlGetGroupDetails(@Path("authKey") String authKey,
                                                           @Path("groupId") String groupId);

    @GET("{authKey}/Groups/")
    @Headers("Content-Type: application/json")
    Observable<GetGroupCollectionResponse> JsonGetGroupCollection(@Path("authKey") String authKey,
                                                                  @Query("nameLike") String fromDate,
                                                                  @Query("startGroupCallOnEnter") String toDate,
                                                                  @Query("endGroupCallOnExit") String callerId,
                                                                  @Query("tinyName") String Offset);
    @GET("{authKey}/Groups/")
    @Headers("Content-Type: application/xml")
    Observable<GetGroupCollectionResponse> XmlGetGroupCollection(@Path("authKey") String authKey,
                                                                 @Query("nameLike") String fromDate,
                                                                 @Query("startGroupCallOnEnter") String toDate,
                                                                 @Query("endGroupCallOnExit") String callerId,
                                                                 @Query("tinyName") String Offset);

    @PATCH("{authKey}/Groups/{groupId}/")
    @Headers("Content-Type: application/json")
    Observable<BaseResponse> JsonUpdateGroup(@Path("authKey") String authKey,
                                             @Path("groupId") String groupId,
                                             @Body GroupResponse body);

    @PATCH("{authKey}/Groups/{groupId}/")
    @Headers("Content-Type: application/xml")
    Observable<BaseResponse> XmlUpdateGroup(@Path("authKey") String authKey,
                                            @Path("groupId") String groupId,
                                            @Body GroupResponse body);

    @DELETE("{authKey}/Groups/{groupId}/")
    @Headers("Content-Type: application/json")
    Observable<Void> JsonDeleteGroup(@Path("authKey") String authKey,
                                     @Path("groupId") String groupId);

    @DELETE("{authKey}/Groups/{groupId}/")
    @Headers("Content-Type: application/xml")
    Observable<Void> XmlDeleteGroup(@Path("authKey") String authKey,
                                    @Path("groupId") String groupId);

    @GET("{authKey}/Groups/{groupId}/Members/{memberId}/")
    @Headers("Content-Type: application/json")
    Observable<MemberDetailsResponse> JsonGetMemberDetails(@Path("authKey") String authKey,
                                                           @Path("groupId") String groupId,
                                                           @Path("memberId") String memberId);

    @GET("{authKey}/Groups/{groupId}/Members/{memberId}/")
    @Headers("Content-Type: application/xml")
    Observable<MemberDetailsResponse> XmlGetMemberDetails(@Path("authKey") String authKey,
                                                          @Path("groupId") String groupId,
                                                          @Path("memberId") String memberId);

    @GET("{authKey}/Groups/{groupId}/Members/")
    @Headers("Content-Type: application/json")
    Observable<GetAllMemberDetailsResponse> JsonGetAllMembersDetails(@Path("authKey") String authKey,
                                                                     @Path("groupId") String groupId);

    @GET("{authKey}/Groups/{groupId}/Members/")
    @Headers("Content-Type: application/xml")
    Observable<GetAllMemberDetailsResponse> XmlGetAllMembersDetails(@Path("authKey") String authKey,
                                                                    @Path("groupId") String groupId);

    @PATCH("{authKey}/Groups/{groupId}/Members/{memberId}/")
    @Headers("Content-Type: application/json")
    Observable<BaseResponse> JsonUpdateMemberDetails(@Path("authKey") String authKey,
                                                     @Path("groupId") String groupId,
                                                     @Path("memberId") String memberId,
                                                     @Body GroupMember member);

    @PATCH("{authKey}/Groups/{groupId}/Members/{memberId}/")
    @Headers("Content-Type: application/xml")
    Observable<BaseResponse> XmlUpdateMemberDetails(@Path("authKey") String authKey,
                                                    @Path("groupId") String groupId,
                                                    @Path("memberId") String memberId,
                                                    @Body GroupMember member);

    @DELETE("{authKey}/Groups/{groupId}/Members/{memberId}/")
    @Headers("Content-Type: application/json")
    Observable<Void> JsonDeleteMember(@Path("authKey") String authKey,
                                      @Path("groupId") String groupId,
                                      @Path("memberId") String memberId);

    @DELETE("{authKey}/Groups/{groupId}/Members/{memberId}/")
    @Headers("Content-Type: application/xml")
    Observable<Void> XmlDeleteMember(@Path("authKey") String authKey,
                                      @Path("groupId") String groupId,
                                      @Path("memberId") String memberId);

    @POST("{authKey}/Groups/{groupId}/Members/")
    @Headers("Content-Type: application/json")
    Observable<MemberDetailsResponse> JsonAddMember(@Path("authKey") String authKey,
                                                    @Path("groupId") String groupId,
                                                    @Body GroupMember body);

    @POST("{authKey}/Groups/{groupId}/Members/")
    @Headers("Content-Type: application/xml")
    Observable<MemberDetailsResponse> XmlAddMember(@Path("authKey") String authKey,
                                                   @Path("groupId") String groupId,
                                                   @Body GroupMember body);
}
