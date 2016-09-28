package com.smscountry.Interface;

import com.smscountry.models.BaseResponse;
import com.smscountry.models.GroupCalls.AllParticipantsDetailsResponse;
import com.smscountry.models.GroupCalls.AllParticipantsResponse;
import com.smscountry.models.GroupCalls.AllRecordingDetails;
import com.smscountry.models.GroupCalls.AllRecordingResponse;
import com.smscountry.models.GroupCalls.GetGroupCallListResponse;
import com.smscountry.models.GroupCalls.GroupCall;
import com.smscountry.models.GroupCalls.GroupCallResponse;
import com.smscountry.models.GroupCalls.HangUpAllParticipantsResponse;
import com.smscountry.models.GroupCalls.ParticipantDetailsResponse;
import com.smscountry.models.GroupCalls.PlaySoundRequest;
import com.smscountry.models.GroupCalls.RecordingResponse;
import com.smscountry.models.GroupCalls.StartRecordingRequest;

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
 * Created by jaya on 27/09/16.
 */
public interface GroupCallsInterface {

    @POST("{authKey}/GroupCalls/")
    @Headers("Content-Type: application/json")
    Observable<GroupCallResponse> JsonCreateGroupCall(@Path("authKey") String authKey,
                                                      @Body GroupCall body);

    @POST("{authKey}/GroupCalls/")
    @Headers("Content-Type: application/xml")
    Observable<GroupCallResponse> XmlCreateGroupCall(@Path("authKey") String authKey,
                                                     @Body GroupCall body);

    @GET("{authKey}/GroupCalls/")
    @Headers("Content-Type: application/json")
    Observable<GetGroupCallListResponse> JsonGroupCallList(@Path("authKey") String authKey,
                                                           @Query("FromDate") String fromDate,
                                                           @Query("ToDate") String toDate,
                                                           @Query("Offset") String callerId,
                                                           @Query("Limit") String Offset);

    @GET("{authKey}/GroupCalls/")
    @Headers("Content-Type: application/xml")
    Observable<GetGroupCallListResponse> XmlGroupCallList(@Path("authKey") String authKey,
                                                          @Query("FromDate") String fromDate,
                                                          @Query("ToDate") String toDate,
                                                          @Query("Offset") String callerId,
                                                          @Query("Limit") String Offset);

    @GET("{authKey}/GroupCalls/{groupCallUUID}/")
    @Headers("Content-Type: application/json")
    Observable<GroupCallResponse> JsonGroupCallList(@Path("authKey") String authKey,
                                                    @Path("groupCallUUID") String groupCallUUID);

    @GET("{authKey}/GroupCalls/{groupCallUUID}/")
    @Headers("Content-Type: application/xml")
    Observable<GroupCallResponse> XmlGroupCallList(@Path("authKey") String authKey,
                                                   @Path("groupCallUUID") String groupCallUUID);

    @GET("{authKey}/GroupCalls/{groupCallUUID}/Participants/{participantId}/")
    @Headers("Content-Type: application/json")
    Observable<ParticipantDetailsResponse> JsonGetParticipantDetails(@Path("authKey") String authKey,
                                                                     @Path("groupCallUUID") String groupCallUUID,
                                                                     @Path("participantId") String participantId);

    @GET("{authKey}/GroupCalls/{groupCallUUID}/Participants/{participantId}/")
    @Headers("Content-Type: application/xml")
    Observable<ParticipantDetailsResponse> XmlGetParticipantDetails(@Path("authKey") String authKey,
                                                                    @Path("groupCallUUID") String groupCallUUID,
                                                                    @Path("participantId") String participantId);

    @GET("{authKey}/GroupCalls/{groupCallUUID}/Participants/")
    @Headers("Content-Type: application/json")
    Observable<AllParticipantsDetailsResponse> JsonGetAllParticipantDetails(@Path("authKey") String authKey,
                                                                            @Path("groupCallUUID") String groupCallUUID);

    @GET("{authKey}/GroupCalls/{groupCallUUID}/Participants/")
    @Headers("Content-Type: application/xml")
    Observable<AllParticipantsDetailsResponse> XmlGetAllParticipantDetails(@Path("authKey") String authKey,
                                                                           @Path("groupCallUUID") String groupCallUUID);

    @POST("{authKey}/GroupCalls/{groupCallUUID}/Play/")
    @Headers("Content-Type: application/json")
    Observable<BaseResponse> JsonPlayASound(@Path("authKey") String authKey,
                                            @Path("groupCallUUID") String groupCallUUID,
                                            @Body PlaySoundRequest body);

    @POST("{authKey}/GroupCalls/{groupCallUUID}/Play/")
    @Headers("Content-Type: application/xml")
    Observable<BaseResponse> XmlPlayASound(@Path("authKey") String authKey,
                                           @Path("groupCallUUID") String groupCallUUID,
                                           @Body PlaySoundRequest body);

    @POST("{authKey}/GroupCalls/{groupCallUUID}/Participants/{participantId}/Play/")
    @Headers("Content-Type: application/json")
    Observable<BaseResponse> JsonPlayASoundIntoPartcipantCall(@Path("authKey") String authKey,
                                                              @Path("groupCallUUID") String groupCallUUID,
                                                              @Path("participantId") String participantId,
                                                              @Body PlaySoundRequest body);

    @POST("{authKey}/GroupCalls/{groupCallUUID}/Participants/{participantId}/Play/")
    @Headers("Content-Type: application/xml")
    Observable<BaseResponse> XmlPlayASoundIntoPartcipantCall(@Path("authKey") String authKey,
                                                             @Path("groupCallUUID") String groupCallUUID,
                                                             @Path("participantId") String participantId,
                                                             @Body PlaySoundRequest body);

    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/Mute/")
    @Headers("Content-Type: application/json")
    Observable<AllParticipantsResponse> JsonMuteAllParticipants(@Path("authKey") String authKey,
                                                                @Path("groupCallUUID") String groupCallUUID);

    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/Mute/")
    @Headers("Content-Type: application/xml")
    Observable<AllParticipantsResponse> XmlMuteAllParticipants(@Path("authKey") String authKey,
                                                               @Path("groupCallUUID") String groupCallUUID);


    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/Participants/{participantId}/Mute/")
    @Headers("Content-Type: application/json")
    Observable<BaseResponse> JsonMuteParticipant(@Path("authKey") String authKey,
                                                 @Path("groupCallUUID") String groupCallUUID,
                                                 @Path("participantId") String participantId);

    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/Participants/{participantId}/Mute/")
    @Headers("Content-Type: application/xml")
    Observable<BaseResponse> XmlMuteParticipant(@Path("authKey") String authKey,
                                                @Path("groupCallUUID") String groupCallUUID,
                                                @Path("participantId") String participantId);

    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/UnMute/")
    @Headers("Content-Type: application/json")
    Observable<AllParticipantsResponse> JsonUnMuteAllParticipants(@Path("authKey") String authKey,
                                                                  @Path("groupCallUUID") String groupCallUUID);

    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/UnMute/")
    @Headers("Content-Type: application/xml")
    Observable<AllParticipantsResponse> XmlUnMuteAllParticipants(@Path("authKey") String authKey,
                                                                 @Path("groupCallUUID") String groupCallUUID);


    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/Participants/{participantId}/UnMute/")
    @Headers("Content-Type: application/json")
    Observable<BaseResponse> JsonUnMuteParticipant(@Path("authKey") String authKey,
                                                   @Path("groupCallUUID") String groupCallUUID,
                                                   @Path("participantId") String participantId);

    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/Participants/{participantId}/UnMute/")
    @Headers("Content-Type: application/xml")
    Observable<BaseResponse> XmlUnMuteParticipant(@Path("authKey") String authKey,
                                                  @Path("groupCallUUID") String groupCallUUID,
                                                  @Path("participantId") String participantId);

    @POST("{authKey}/GroupCalls/{groupCallUUID}/Recordings/")
    @Headers("Content-Type: application/json")
    Observable<RecordingResponse> JsonStartRecording(@Path("authKey") String authKey,
                                                     @Path("groupCallUUID") String groupCallUUID,
                                                     @Body StartRecordingRequest body);

    @POST("{authKey}/GroupCalls/{groupCallUUID}/Recordings/")
    @Headers("Content-Type: application/xml")
    Observable<RecordingResponse> XmlStartRecording(@Path("authKey") String authKey,
                                                    @Path("groupCallUUID") String groupCallUUID,
                                                    @Body StartRecordingRequest body);

    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/Recordings/{recordingUUID}/")
    @Headers("Content-Type: application/json")
    Observable<BaseResponse> JsonStopRecording(@Path("authKey") String authKey,
                                               @Path("groupCallUUID") String groupCallUUID,
                                               @Path("recordingUUID") String recordingUUID);

    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/Recordings/{recordingUUID}/")
    @Headers("Content-Type: application/xml")
    Observable<BaseResponse> XmlStopRecording(@Path("authKey") String authKey,
                                              @Path("groupCallUUID") String groupCallUUID,
                                              @Path("recordingUUID") String recordingUUID);

    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/Recordings/")
    @Headers("Content-Type: application/json")
    Observable<AllRecordingResponse> JsonStopAllRecording(@Path("authKey") String authKey,
                                                          @Path("groupCallUUID") String groupCallUUID);

    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/Recordings/")
    @Headers("Content-Type: application/xml")
    Observable<AllRecordingResponse> XmlStopAllRecording(@Path("authKey") String authKey,
                                                         @Path("groupCallUUID") String groupCallUUID);

    @GET("{authKey}/GroupCalls/{groupCallUUID}/Recordings/{recordingUUID}/")
    @Headers("Content-Type: application/json")
    Observable<RecordingResponse> JsonGetRecordingDetails(@Path("authKey") String authKey,
                                                          @Path("groupCallUUID") String groupCallUUID,
                                                          @Path("recordingUUID") String recordingUUID);

    @GET("{authKey}/GroupCalls/{groupCallUUID}/Recordings/{recordingUUID}/")
    @Headers("Content-Type: application/xml")
    Observable<RecordingResponse> XmlGetRecordingDetails(@Path("authKey") String authKey,
                                                         @Path("groupCallUUID") String groupCallUUID,
                                                         @Path("recordingUUID") String recordingUUID);

    @GET("{authKey}/GroupCalls/{groupCallUUID}/Recordings/")
    @Headers("Content-Type: application/json")
    Observable<AllRecordingDetails> JsonGetAllRecordingDetails(@Path("authKey") String authKey,
                                                               @Path("groupCallUUID") String groupCallUUID);

    @GET("{authKey}/GroupCalls/{groupCallUUID}/Recordings/")
    @Headers("Content-Type: application/xml")
    Observable<AllRecordingDetails> XmlGetAllRecordingDetails(@Path("authKey") String authKey,
                                                              @Path("groupCallUUID") String groupCallUUID);


    @DELETE("{authKey}/GroupCalls/{groupCallUUID}/Recordings/{recordingUUID}/")
    @Headers("Content-Type: application/json")
    Observable<Void> JsonDeleteRecording(@Path("authKey") String authKey,
                                         @Path("groupCallUUID") String groupCallUUID,
                                         @Path("recordingUUID") String recordingUUID);

    @DELETE("{authKey}/GroupCalls/{groupCallUUID}/Recordings/{recordingUUID}/")
    @Headers("Content-Type: application/xml")
    Observable<Void> XmlDeleteRecording(@Path("authKey") String authKey,
                                        @Path("groupCallUUID") String groupCallUUID,
                                        @Path("recordingUUID") String recordingUUID);

    @DELETE("{authKey}/GroupCalls/{groupCallUUID}/Recordings/")
    @Headers("Content-Type: application/json")
    Observable<Void> JsonDeleteAllRecording(@Path("authKey") String authKey,
                                            @Path("groupCallUUID") String groupCallUUID);

    @DELETE("{authKey}/GroupCalls/{groupCallUUID}/Recordings/")
    @Headers("Content-Type: application/xml")
    Observable<Void> XmlDeleteAllRecording(@Path("authKey") String authKey,
                                           @Path("groupCallUUID") String groupCallUUID);

    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/Hangup/")
    @Headers("Content-Type: application/json")
    Observable<HangUpAllParticipantsResponse> JsonHangUpAllParticipants(@Path("authKey") String authKey,
                                                                  @Path("groupCallUUID") String groupCallUUID);

    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/Hangup/")
    @Headers("Content-Type: application/xml")
    Observable<HangUpAllParticipantsResponse> XmlHangUpAllParticipants(@Path("authKey") String authKey,
                                                                       @Path("groupCallUUID") String groupCallUUID);

    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/Participants/{participantId}/Hangup/")
    @Headers("Content-Type: application/json")
    Observable<BaseResponse> JsonHangUpParticipant(@Path("authKey") String authKey,
                                                              @Path("groupCallUUID") String groupCallUUID,
                                                              @Path("participantId") String participantId);

    @PATCH("{authKey}/GroupCalls/{groupCallUUID}/Participants/{participantId}/Hangup/")
    @Headers("Content-Type: application/xml")
    Observable<BaseResponse> XmlHangUpParticipant(@Path("authKey") String authKey,
                                                             @Path("groupCallUUID") String groupCallUUID,
                                                             @Path("participantId") String participantId);

}
