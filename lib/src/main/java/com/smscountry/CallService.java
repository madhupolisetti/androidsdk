package com.smscountry;

import com.smscountry.Interface.CallInterface;
import com.smscountry.models.Calls.CreateBulkCallRequest;
import com.smscountry.models.Calls.CreateBulkCallResponse;
import com.smscountry.models.Calls.CreateNewCallRequest;
import com.smscountry.models.Calls.CreateNewCallResponse;
import com.smscountry.models.Calls.DisconnectACallResponse;
import com.smscountry.models.Calls.GetCallDetailsResponse;
import com.smscountry.models.Calls.GetCallsListResponse;

import rx.Observable;

/**
 * Created by jaya on 23/09/16.
 */
public class CallService {

    private ApiBase apiBase;
    private CallInterface callInterface;

    public CallService(ApiBase apiBase) {
        this.apiBase = apiBase;
        this.callInterface = this.apiBase.createService(CallInterface.class);
    }

    public Observable<CreateNewCallResponse> createNewCall(CreateNewCallRequest body){
        if(this.apiBase.getContentType() == "application/json"){
            return this.callInterface.JsonCreateNewCall(this.apiBase.getAuthKey(), body);
        }else{
            return this.callInterface.XmlCreateNewCall(this.apiBase.getAuthKey(), body);
        }
    }

    public Observable<CreateBulkCallResponse> createBulkCall(CreateBulkCallRequest body){
        if(this.apiBase.getContentType() == "application/json"){
            return this.callInterface.JsonCreateBulkCall(this.apiBase.getAuthKey(), body);
        }else{
            return this.callInterface.XmlCreateBulkCall(this.apiBase.getAuthKey(), body);
        }
    }

    public Observable<GetCallDetailsResponse> getCallDetails(String callUUID){
        if(this.apiBase.getContentType() == "application/json"){
            return this.callInterface.JsonGetCallDetails(this.apiBase.getAuthKey(), callUUID);
        }else{
            return this.callInterface.XmlGetCallDetails(this.apiBase.getAuthKey(), callUUID);
        }
    }

    public Observable<GetCallsListResponse> getCallList(String fromDate,
                                                        String toDate,
                                                        String senderId,
                                                        String offset,
                                                        String limit){
        if(this.apiBase.getContentType() == "application/json"){
            return this.callInterface.JsonGetCallList(this.apiBase.getAuthKey(),
                    fromDate, toDate, senderId, offset, limit);
        }else{
            return this.callInterface.XmlGetCallList(this.apiBase.getAuthKey(),
                    fromDate, toDate, senderId, offset, limit);
        }
    }

    public Observable<DisconnectACallResponse> disconnectACall(String callUUID){
        if(this.apiBase.getContentType() == "application/json"){
            return this.callInterface.JsonDisconnectACall(this.apiBase.getAuthKey(), callUUID);
        }else{
            return this.callInterface.XmlDisconnectACall(this.apiBase.getAuthKey(), callUUID);
        }
    }

}
