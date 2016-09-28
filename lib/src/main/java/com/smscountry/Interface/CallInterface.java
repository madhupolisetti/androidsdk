package com.smscountry.Interface;

import com.smscountry.models.Calls.CreateBulkCallRequest;
import com.smscountry.models.Calls.CreateBulkCallResponse;
import com.smscountry.models.Calls.CreateNewCallRequest;
import com.smscountry.models.Calls.CreateNewCallResponse;
import com.smscountry.models.Calls.DisconnectACallResponse;
import com.smscountry.models.Calls.GetCallDetailsResponse;
import com.smscountry.models.Calls.GetCallsListResponse;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by jaya on 23/09/16.
 */
public interface CallInterface {

    @POST("{authKey}/Calls/")
    @Headers("Content-Type: application/json")
    Observable<CreateNewCallResponse> JsonCreateNewCall(@Path("authKey") String authKey,
                                                        @Body CreateNewCallRequest body);

    @POST("{authKey}/BulkCalls/")
    @Headers("Content-Type: application/json")
    Observable<CreateBulkCallResponse> JsonCreateBulkCall(@Path("authKey") String authKey,
                                                         @Body CreateBulkCallRequest body);

    @GET("{authKey}/Calls/{callUUID}/")
    @Headers("Content-Type: application/json")
    Observable<GetCallDetailsResponse> JsonGetCallDetails(@Path("authKey") String authKey,
                                                          @Path("callUUID") String callUUID);


    @GET("{authKey}/Calls/")
    @Headers("Content-Type: application/json")
    Observable<GetCallsListResponse> JsonGetCallList(@Path("authKey") String authKey,
                                                     @Query("FromDate") String fromDate,
                                                     @Query("ToDate") String toDate,
                                                     @Query("CallerId") String callerId,
                                                     @Query("Offset") String Offset,
                                                     @Query("Limit") String Limit);

    @PATCH("{authKey}/Calls/{callUUID}/")
    @Headers("Content-Type: application/json")
    Observable<DisconnectACallResponse> JsonDisconnectACall(@Path("authKey") String authKey,
                                                            @Path("callUUID") String callUUID);


    @POST("{authKey}/Calls/")
    @Headers("Content-Type: application/xml")
    Observable<CreateNewCallResponse> XmlCreateNewCall(@Path("authKey") String authKey,
                                                        @Body CreateNewCallRequest body);

    @POST("{authKey}/BulkCalls/")
    @Headers("Content-Type: application/xml")
    Observable<CreateBulkCallResponse> XmlCreateBulkCall(@Path("authKey") String authKey,
                                                          @Body CreateBulkCallRequest body);

    @GET("{authKey}/Calls/{callUUID}/")
    @Headers("Content-Type: application/xml")
    Observable<GetCallDetailsResponse> XmlGetCallDetails(@Path("authKey") String authKey,
                                                          @Path("callUUID") String callUUID);


    @GET("{authKey}/Calls/")
    @Headers("Content-Type: application/xml")
    Observable<GetCallsListResponse> XmlGetCallList(@Path("authKey") String authKey,
                                                    @Query("FromDate") String fromDate,
                                                    @Query("ToDate") String toDate,
                                                    @Query("CallerId") String callerId,
                                                    @Query("Offset") String Offset,
                                                    @Query("Limit") String Limit);

    @PATCH("{authKey}/Calls/{callUUID}/")
    @Headers("Content-Type: application/xml")
    Observable<DisconnectACallResponse> XmlDisconnectACall(@Path("authKey") String authKey,
                                                            @Path("callUUID") String callUUID);

}
