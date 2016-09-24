package com.smscountry.Interface;

import com.smscountry.models.GetSMSCollectionResponse;
import com.smscountry.models.GetSMSDetailsResponse;
import com.smscountry.models.SendBulkSMSRequest;
import com.smscountry.models.SendBulkSMSResponse;
import com.smscountry.models.SendSMSRequest;
import com.smscountry.models.SendSMSResponse;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by jaya on 22/09/16.
 */
public interface SmsInterface {

    @POST("{authKey}/SMSes/")
    @Headers("Content-Type: application/json")
    Observable<SendSMSResponse> JsonSendAnSMS(@Path("authKey") String authKey,
                                              @Body SendSMSRequest body);

    @GET("{authKey}/SMSes/{messageUUID}/")
    @Headers("Content-Type: application/json")
    Observable<GetSMSDetailsResponse> JsonGetSMSDetails(@Path("authKey") String authKey,
                                                  @Path("messageUUID") String messageUUID);

    @GET("{authKey}/SMSes/")
    @Headers("Content-Type: application/json")
    Observable<GetSMSCollectionResponse> JsonGetSMSCollection(@Path("authKey") String authKey,
                                                              @Query("FromDate") String fromDate,
                                                              @Query("ToDate") String toDate,
                                                              @Query("SenderId") String senderId,
                                                              @Query("Offset") String Offset,
                                                              @Query("Limit") String Limit);

    @POST("{authKey}/BulkSMSes/")
    @Headers("Content-Type: application/json")
    Observable<SendBulkSMSResponse> JsonSendBulkSMSes(@Path("authKey") String authKey,
                                                @Body SendBulkSMSRequest body);

    @POST("{authKey}/SMSes.xml/")
    @Headers("Content-Type: application/xml")
    Observable<SendSMSResponse> XmlSendAnSMS(@Path("authKey") String authKey,
                                        @Body SendSMSRequest body);

    @GET("{authKey}/SMSes/{messageUUID}.xml/")
    @Headers("Content-Type: application/xml")
    Observable<GetSMSDetailsResponse> XmlGetSMSDetails(@Path("authKey") String authKey,
                                                  @Path("messageUUID") String messageUUID);

    @GET("{authKey}/SMSes.xml/")
    @Headers("Content-Type: application/xml")
    Observable<GetSMSCollectionResponse> XmlGetSMSCollection(@Path("authKey") String authKey,
                                                     @Query("FromDate") String fromDate,
                                                     @Query("ToDate") String toDate,
                                                     @Query("SenderId") String senderId,
                                                     @Query("Offset") String Offset,
                                                     @Query("Limit") String Limit);

    @POST("{authKey}/BulkSMSes.xml/")
    @Headers("Content-Type: application/xml")
    Observable<SendBulkSMSResponse> XmlSendBulkSMSes(@Path("authKey") String authKey,
                                                @Body SendBulkSMSRequest body);
}
