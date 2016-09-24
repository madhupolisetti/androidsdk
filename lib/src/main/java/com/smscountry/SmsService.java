package com.smscountry;

import com.smscountry.Interface.SmsInterface;
import com.smscountry.models.GetSMSCollectionResponse;
import com.smscountry.models.GetSMSDetailsResponse;
import com.smscountry.models.SendBulkSMSRequest;
import com.smscountry.models.SendBulkSMSResponse;
import com.smscountry.models.SendSMSRequest;
import com.smscountry.models.SendSMSResponse;

import rx.Observable;

/**
 * Created by jaya on 22/09/16.
 */
public class SmsService {

    private ApiBase apiBase;
    private SmsInterface smsInterface;

    public SmsService(ApiBase apiBase) {
        this.apiBase = apiBase;
        this.smsInterface = this.apiBase.createService(SmsInterface.class);
    }

    public Observable<SendSMSResponse> sendSms(SendSMSRequest sendSMSRequest){

        if(this.apiBase.getContentType() == "application/json"){
            return this.smsInterface.JsonSendAnSMS(this.apiBase.getAuthKey(), sendSMSRequest);
        }else{
            return this.smsInterface.XmlSendAnSMS(this.apiBase.getAuthKey(), sendSMSRequest);
        }
    }

    public Observable<GetSMSDetailsResponse> getSmsDetails(String messageUUID){
        if(this.apiBase.getContentType() == "application/json"){
            return this.smsInterface.JsonGetSMSDetails(this.apiBase.getAuthKey(), messageUUID);
        }else{
            return this.smsInterface.XmlGetSMSDetails(this.apiBase.getAuthKey(), messageUUID);
        }
    }

    public Observable<GetSMSCollectionResponse> getSMSCollection(String fromDate,
                                                           String toDate,
                                                           String senderId,
                                                           String offset,
                                                           String limit){
        if(this.apiBase.getContentType() == "application/json") {
            return this.smsInterface.JsonGetSMSCollection(this.apiBase.getAuthKey(),
                    fromDate, toDate, senderId, offset, limit);
        }else{
            return this.smsInterface.XmlGetSMSCollection(this.apiBase.getAuthKey(),
                    fromDate, toDate, senderId, offset, limit);
        }
    }

    public Observable<SendBulkSMSResponse> sendBulkSMSes(SendBulkSMSRequest body){
        if(this.apiBase.getContentType() == "application/json") {
            return this.smsInterface.JsonSendBulkSMSes(this.apiBase.getAuthKey(),body);
        }else{
            return this.smsInterface.XmlSendBulkSMSes(this.apiBase.getAuthKey(), body);
        }
    }
}
