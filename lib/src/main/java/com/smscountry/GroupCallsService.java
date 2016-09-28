package com.smscountry;

import com.smscountry.Interface.GroupCallsInterface;
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

import rx.Observable;

/**
 * Created by jaya on 27/09/16.
 */
public class GroupCallsService {

    private ApiBase apiBase;
    private GroupCallsInterface groupCallsInterface;

    public GroupCallsService(ApiBase apiBase) {
        this.apiBase = apiBase;
        this.groupCallsInterface = this.apiBase.createService(GroupCallsInterface.class);
    }

    public Observable<GroupCallResponse> createGroupCall(GroupCall body){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupCallsInterface.JsonCreateGroupCall(this.apiBase.getAuthKey(), body);
        }else{
            return this.groupCallsInterface.XmlCreateGroupCall(this.apiBase.getAuthKey(), body);
        }
    }

    public Observable<GetGroupCallListResponse> groupCallList(String fromDate,
                                                       String toDate,
                                                       String callerId,
                                                       String Offset){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupCallsInterface.JsonGroupCallList(this.apiBase.getAuthKey(),
                    fromDate, toDate, callerId, Offset);
        }else{
            return this.groupCallsInterface.XmlGroupCallList(this.apiBase.getAuthKey(),
                    fromDate, toDate, callerId, Offset);
        }
    }

    public Observable<GroupCallResponse> groupCallList(String groupCallUUID){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupCallsInterface.JsonGroupCallList(this.apiBase.getAuthKey(), groupCallUUID);
        }else{
            return this.groupCallsInterface.XmlGroupCallList(this.apiBase.getAuthKey(), groupCallUUID);
        }
    }

    public Observable<ParticipantDetailsResponse> getParticipantDetails(String groupCallUUID,
                                                                 String participantId){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupCallsInterface.JsonGetParticipantDetails(this.apiBase.getAuthKey(),
                    groupCallUUID, participantId);
        }else{
            return this.groupCallsInterface.XmlGetParticipantDetails(this.apiBase.getAuthKey(),
                    groupCallUUID, participantId);
        }
    }

    public Observable<AllParticipantsDetailsResponse> getAllParticipantDetails(String groupCallUUID){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupCallsInterface.JsonGetAllParticipantDetails(this.apiBase.getAuthKey(),
                    groupCallUUID);
        }else{
            return this.groupCallsInterface.XmlGetAllParticipantDetails(this.apiBase.getAuthKey(),
                    groupCallUUID);
        }
    }

    public Observable<BaseResponse> playASound(String groupCallUUID, PlaySoundRequest body){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupCallsInterface.JsonPlayASound(this.apiBase.getAuthKey(),
                    groupCallUUID, body);
        }else{
            return this.groupCallsInterface.JsonPlayASound(this.apiBase.getAuthKey(),
                    groupCallUUID, body);
        }
    }

    public Observable<BaseResponse> playASoundIntoPartcipantCall(String groupCallUUID,
                                                          String participantId,
                                                          PlaySoundRequest body){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupCallsInterface.JsonPlayASoundIntoPartcipantCall(this.apiBase.getAuthKey(),
                    groupCallUUID, participantId, body);
        }else{
            return this.groupCallsInterface.XmlPlayASoundIntoPartcipantCall(this.apiBase.getAuthKey(),
                    groupCallUUID, participantId, body);
        }
    }

    public Observable<AllParticipantsResponse> muteAllParticipants(String groupCallUUID){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupCallsInterface.JsonMuteAllParticipants(this.apiBase.getAuthKey(),
                    groupCallUUID);
        }else{
            return this.groupCallsInterface.XmlMuteAllParticipants(this.apiBase.getAuthKey(),
                    groupCallUUID);
        }
    }

    public Observable<BaseResponse> muteParticipant(String groupCallUUID,
                                                 String participantId){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupCallsInterface.JsonMuteParticipant(this.apiBase.getAuthKey(),
                    groupCallUUID, participantId);
        }else{
            return this.groupCallsInterface.XmlMuteParticipant(this.apiBase.getAuthKey(),
                    groupCallUUID, participantId);
        }
    }

    public Observable<AllParticipantsResponse> unMuteAllParticipants(String groupCallUUID){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupCallsInterface.JsonUnMuteAllParticipants(this.apiBase.getAuthKey(),
                    groupCallUUID);
        }else{
            return this.groupCallsInterface.XmlUnMuteAllParticipants(this.apiBase.getAuthKey(),
                    groupCallUUID);
        }
    }

    public Observable<BaseResponse> unMuteParticipant(String groupCallUUID,
                                                   String participantId){
        if(this.apiBase.getContentType() == "application/json"){
            return this.groupCallsInterface.JsonUnMuteParticipant(this.apiBase.getAuthKey(),
                    groupCallUUID, participantId);
        }else{
            return this.groupCallsInterface.XmlUnMuteParticipant(this.apiBase.getAuthKey(),
                    groupCallUUID, participantId);
        }
    }

    public Observable<RecordingResponse> startRecording(String groupCallUUID,
                                                 StartRecordingRequest body) {
        if (this.apiBase.getContentType() == "application/json") {
            return this.groupCallsInterface.JsonStartRecording(this.apiBase.getAuthKey(),
                    groupCallUUID, body);
        } else {
            return this.groupCallsInterface.XmlStartRecording(this.apiBase.getAuthKey(),
                    groupCallUUID, body);
        }

    }

    public Observable<BaseResponse> stopRecording(String groupCallUUID,
                                               String recordingUUID){
        if (this.apiBase.getContentType() == "application/json") {
            return this.groupCallsInterface.JsonStopRecording(this.apiBase.getAuthKey(),
                    groupCallUUID, recordingUUID);
        } else {
            return this.groupCallsInterface.XmlStopRecording(this.apiBase.getAuthKey(),
                    groupCallUUID, recordingUUID);
        }
    }

    public Observable<AllRecordingResponse> stopAllRecording(String groupCallUUID){
        if (this.apiBase.getContentType() == "application/json") {
            return this.groupCallsInterface.JsonStopAllRecording(this.apiBase.getAuthKey(),
                    groupCallUUID);
        } else {
            return this.groupCallsInterface.XmlStopAllRecording(this.apiBase.getAuthKey(),
                    groupCallUUID);
        }
    }

    public Observable<RecordingResponse> getRecordingDetails(String groupCallUUID,
                                                      String recordingUUID){
        if (this.apiBase.getContentType() == "application/json") {
            return this.groupCallsInterface.JsonGetRecordingDetails(this.apiBase.getAuthKey(),
                    groupCallUUID, recordingUUID);
        } else {
            return this.groupCallsInterface.XmlGetRecordingDetails(this.apiBase.getAuthKey(),
                    groupCallUUID, recordingUUID);
        }

    }

    public Observable<AllRecordingDetails> getAllRecordingDetails(String groupCallUUID){
        if (this.apiBase.getContentType() == "application/json") {
            return this.groupCallsInterface.JsonGetAllRecordingDetails(this.apiBase.getAuthKey(),
                    groupCallUUID);
        } else {
            return this.groupCallsInterface.XmlGetAllRecordingDetails(this.apiBase.getAuthKey(),
                    groupCallUUID);
        }
    }

    public Observable<Void> deleteRecording(String groupCallUUID,
                                         String recordingUUID){
        if (this.apiBase.getContentType() == "application/json") {
            return this.groupCallsInterface.JsonDeleteRecording(this.apiBase.getAuthKey(),
                    groupCallUUID, recordingUUID);
        } else {
            return this.groupCallsInterface.JsonDeleteRecording(this.apiBase.getAuthKey(),
                    groupCallUUID, recordingUUID);
        }
    }

    public Observable<Void> deleteAllRecording(String groupCallUUID){
        if (this.apiBase.getContentType() == "application/json") {
            return this.groupCallsInterface.JsonDeleteAllRecording(this.apiBase.getAuthKey(),
                    groupCallUUID);
        } else {
            return this.groupCallsInterface.XmlDeleteAllRecording(this.apiBase.getAuthKey(),
                    groupCallUUID);
        }
    }

    public Observable<HangUpAllParticipantsResponse> hangUpAllParticipants(String groupCallUUID){
        if (this.apiBase.getContentType() == "application/json") {
            return this.groupCallsInterface.JsonHangUpAllParticipants(this.apiBase.getAuthKey(),
                    groupCallUUID);
        } else {
            return this.groupCallsInterface.XmlHangUpAllParticipants(this.apiBase.getAuthKey(),
                    groupCallUUID);
        }
    }

    public Observable<BaseResponse> hangUpParticipant(String groupCallUUID,
                                               String participantId){
        if (this.apiBase.getContentType() == "application/json") {
            return this.groupCallsInterface.JsonHangUpParticipant(this.apiBase.getAuthKey(),
                    groupCallUUID, participantId);
        } else {
            return this.groupCallsInterface.XmlHangUpParticipant(this.apiBase.getAuthKey(),
                    groupCallUUID, participantId);
        }
    }
}
