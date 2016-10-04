package com.smscountry.androidsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.smscountry.ApiBase;
import com.smscountry.CallService;
import com.smscountry.GroupCallsService;
import com.smscountry.GroupsService;
import com.smscountry.SmsCountryException;
import com.smscountry.SmsService;
import com.smscountry.models.BaseResponse;
import com.smscountry.models.Calls.CreateBulkCallRequest;
import com.smscountry.models.Calls.CreateBulkCallResponse;
import com.smscountry.models.Calls.CreateNewCallRequest;
import com.smscountry.models.Calls.CreateNewCallResponse;
import com.smscountry.models.Calls.DisconnectACallResponse;
import com.smscountry.models.GroupCalls.GetGroupCallListResponse;
import com.smscountry.models.GroupCalls.GroupCall;
import com.smscountry.models.GroupCalls.GroupCallResponse;
import com.smscountry.models.GroupCalls.Participant;
import com.smscountry.models.Groups.CreateNewGroupRequest;
import com.smscountry.models.Groups.CreateNewGroupResponse;
import com.smscountry.models.Groups.GetGroupDetailsResponse;
import com.smscountry.models.Groups.GroupMember;
import com.smscountry.models.Smses.GetSMSCollectionResponse;
import com.smscountry.models.Smses.GetSMSDetailsResponse;
import com.smscountry.models.Smses.SendBulkSMSRequest;
import com.smscountry.models.Smses.SendBulkSMSResponse;
import com.smscountry.models.Smses.SendSMSRequest;
import com.smscountry.models.Smses.SendSMSResponse;

import java.io.IOException;

import retrofit2.adapter.rxjava.HttpException;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    public static final String ApiBaseUrl = "https://restapi.smscountry.com/v0.1/Accounts/";
    public static final String AuthKey = "5PySDTbhHLVNjGCdeuHe";
    public static final String AuthToken = "dnxRAn6C2O3svfc0DSWrrCOiy6jDwXR8qWG4Wboz";

    private ApiBase apiBase;
    private String messageUuidString;
    private String callUuidString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Generate Base64 token from authKey and authToken
        String tokenString = AuthKey + ":" + AuthToken;
        String encoded = "";
        try{
            encoded = Base64.encodeToString(tokenString.getBytes(), Base64.NO_WRAP);
        }catch (Exception e){

        }

        this.apiBase = new ApiBase();
        this.apiBase.setApiBaseUrl(ApiBaseUrl);
        this.apiBase.setAuthKey(AuthKey);
        this.apiBase.setAuthorizationToken(encoded);

        // Default Content Type application/json
        // To change it to application/xml, uncomment the below code
        // apiBase.setContentType("application/xml");
    }

    public void sendSMSClicked(View v){
        if(v.getId() == R.id.sendSMS){
            SmsService smsService = new SmsService(this.apiBase);

            // Sending a SMS
            SendSMSRequest sendSMSRequest = new SendSMSRequest();
            sendSMSRequest.setText("Test Message");
            sendSMSRequest.setNumber("9840915731");

            smsService.sendSms(sendSMSRequest)
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<SendSMSResponse>() {
                        @Override
                        public void onCompleted() {
                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.w("Development", e.getMessage());
                        }

                        @Override
                        public void onNext(SendSMSResponse response) {
                            Log.w("SMS Country SDK: ","Successfully Request sent");
                            Log.w("Message UUID: ",response.getMessageUUID());
                            TextView messageUuid = (TextView) findViewById(R.id.messageUUID);
                            messageUuidString = response.getMessageUUID();
                            messageUuid.setText(messageUuidString);
                        }
                    });
        }
    }

    public void getSMSDetailsClicked(View v){
        if(v.getId() == R.id.getSMSDetails){
            Log.w("Development", "Get SMS Details Clicked");
            SmsService smsService = new SmsService(this.apiBase);
            smsService.getSmsDetails(messageUuidString)
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<GetSMSDetailsResponse>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.w("Development", e.getMessage());
                        }

                        @Override
                        public void onNext(GetSMSDetailsResponse getSMSDetailsResponse) {
                            Log.w("SMS Country SDK: ","Successfully SMS Details is fetched");
                        }
                    });
        }
    }

    public void getSMSCollectionClick(View v){
        if(v.getId() == R.id.getSMSCollection) {
            Log.w("Development", "Get SMS Collection Clicked");
            SmsService smsService = new SmsService(this.apiBase);
            smsService.getSMSCollection("", "", "", "", "")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GetSMSCollectionResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.w("Development", e.getMessage());
                    }

                    @Override
                    public void onNext(GetSMSCollectionResponse getSMSCollectionResponse) {
                        Log.w("SMS Country SDK: ","Successfully SMS Collection Details fetched");
                    }
                });
        }
    }

    public void sendBulkSmsesClick(View v){
        if(v.getId() == R.id.sendBulkSmses) {
            Log.w("Development", "Send Bulk Smses Clicked");
            SmsService smsService = new SmsService(this.apiBase);
            SendBulkSMSRequest sendBulkSMSRequest = new SendBulkSMSRequest();
            String numbers[] = {"919490851731", "89390153731"};
            sendBulkSMSRequest.setNumbers(numbers);
            sendBulkSMSRequest.setText("Test message");

            smsService.sendBulkSMSes(sendBulkSMSRequest)
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<SendBulkSMSResponse>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.w("Development", e.getMessage());
                        }

                        @Override
                        public void onNext(SendBulkSMSResponse sendBulkSMSResponse) {
                            Log.w("SMS Country SDK: ","Successfully Sent Bulk Smses");
                        }
                    });

        }
    }

    public void createNewCallClicked(View v){
        if(v.getId() == R.id.createNewCall){
            CallService callService = new CallService(this.apiBase);

            // Sending a SMS
            CreateNewCallRequest createNewCallRequest = new CreateNewCallRequest();
            createNewCallRequest.setNumber("9840915731");
            createNewCallRequest.setRingUrl("http://domainname/ringurl");
            createNewCallRequest.setAnswerUrl("http://domainname/answerurl");
            createNewCallRequest.setCallerId("");
            createNewCallRequest.setHangupUrl("http://domainname/hangupurl");
            createNewCallRequest.setHttpMethod("POST");
            createNewCallRequest.setXml("<Request><play>xxx</play></Request>");

            callService.createNewCall(createNewCallRequest)
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<CreateNewCallResponse>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.w("Development", e.getMessage());
                        }

                        @Override
                        public void onNext(CreateNewCallResponse createNewCallResponse) {
                            Log.w("SMS Country SDK: ","Successfully Created New call.");
                            Log.w("SMS Country SDK: ", createNewCallResponse.getCallUUID());
                            TextView callUuid = (TextView) findViewById(R.id.callUUID);
                            callUuidString = createNewCallResponse.getCallUUID();
                            callUuid.setText(callUuidString);
                        }
                    });
        }
    }

    public void createBulkCallsClick(View v){
        if(v.getId() == R.id.createBulkCalls){
            CallService callService = new CallService(this.apiBase);

            // Sending a SMS
            CreateBulkCallRequest createBulkCallRequest = new CreateBulkCallRequest();
            String[] numbers = {"9840915731", "9789774496"};
            createBulkCallRequest.setNumbers(numbers);
            createBulkCallRequest.setRingUrl("http://domainname/ringurl");
            createBulkCallRequest.setAnswerUrl("http://domainname/answerurl");
            createBulkCallRequest.setCallerId("");
            createBulkCallRequest.setHangupUrl("http://domainname/hangupurl");
            createBulkCallRequest.setHttpMethod("POST");
            createBulkCallRequest.setXml("<Request><play>xxx</play></Request>");

            callService.createBulkCall(createBulkCallRequest)
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<CreateBulkCallResponse>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.w("Development", e.getMessage());

                        }

                        @Override
                        public void onNext(CreateBulkCallResponse createBulkCallResponse) {
                            Log.w("SMS Country SDK: ","Successfully Created Bulk calls.");
                        }
                    });

        }
    }

    public void disconnectCallClicked(View v){
        if(v.getId() == R.id.disconnectCall){
            CallService callService = new CallService(this.apiBase);

            callService.disconnectACall(callUuidString)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<DisconnectACallResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        if (e instanceof HttpException) {
                            HttpException exception = (HttpException) e;
                            SmsCountryException smsCountryException = new SmsCountryException(exception, apiBase);

                            try {
                                BaseResponse response = smsCountryException.getErrorDetails();
                                Log.w("Development", e.getMessage());
                            } catch (IOException e1) {
                                e1.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onNext(DisconnectACallResponse disconnectACallResponse) {
                        Log.w("SMS Country SDK: ","Successfully Disconnected the call.");
                    }
                });
        }
    }

    public void createNewGroup(View v){
        if(v.getId() == R.id.createNewGroup){
            getGroupCallDetails("23");
//            GroupsService groupsService = new GroupsService(this.apiBase);
//
//            final CreateNewGroupRequest createNewGroupRequest = new CreateNewGroupRequest();
//            createNewGroupRequest.setName("Family1");
//            createNewGroupRequest.setTinyName("blabla1");
//            createNewGroupRequest.setStartGroupCallOnEnter("91XXXXXXXXXX");
//            createNewGroupRequest.setEndGroupCallOnExit("");
//
//            GroupMember member1 = new GroupMember();
//            member1.setName("someone1");
//            member1.setNumber("91XXXXXXXXXX");
//
//            GroupMember member2 = new GroupMember();
//            member2.setName("11");
//            member2.setNumber("91XXXXXXXXXX");
//            GroupMember[] members = {member1, member2};
//            createNewGroupRequest.setMembers(members);
//            groupsService.createNewGroup(createNewGroupRequest)
//                    .subscribeOn(Schedulers.newThread())
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .subscribe(new Subscriber<CreateNewGroupResponse>() {
//                        @Override
//                        public void onCompleted() {
//
//                        }
//
//                        @Override
//                        public void onError(Throwable e) {
//                            Log.w("Development", e.getMessage());
//                        }
//
//                        @Override
//                        public void onNext(CreateNewGroupResponse createNewGroupResponse) {
//                            Log.w("SMS Country SDK: ","Successfully Create new Group");
//                            getGroupCallDetails(createNewGroupResponse.getGroup().getId());
//                        }
//                    });

        }
    }

    public void createNewGroupCall(View v) {
        if (v.getId() == R.id.createNewGroupCall) {
            GroupCallsService groupCallsService = new GroupCallsService(apiBase);

            GroupCall groupCall = new GroupCall();
            groupCall.setName("samplecall1");
            groupCall.setWelcomeSound("htp://yourdomain/welcomesoundurl");
            groupCall.setWaitSound("http://yourdomain/waitsoundurl");
            groupCall.setStartGroupCallOnEnter("91XXXXXXXXXX");
            groupCall.setEndGroupCallOnExit("91XXXXXXXXXX");
            groupCall.setAnswerUrl("www.yourdomain.com/samplepage");

            Participant participant1=new Participant();
            participant1.setName("someone1");
            participant1.setNumber("91XXXXXXXXX");

            Participant participant2=new Participant();
            participant2.setName("someone2");
            participant2.setNumber("91XXXXXXXXX");

            Participant[] participants={participant1, participant2};

            groupCall.setParticipants(participants);

            groupCallsService.createGroupCall(groupCall)
                    .subscribeOn(Schedulers.newThread())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<GroupCallResponse>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            Log.w("Development", e.getMessage());
                        }

                        @Override
                        public void onNext(GroupCallResponse groupCallResponse) {
                            Log.w("SMS Country SDK: ","Successfully Create new Group Call");
                            getGroupCallList();
                        }
                    });
        }

    }

    public void getGroupCallDetails(String groupId){
        GroupsService groupsService = new GroupsService(apiBase);

        groupsService.getGroupDetails(groupId)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GetGroupDetailsResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.w("Development", e.getMessage());
                    }

                    @Override
                    public void onNext(GetGroupDetailsResponse getGroupDetailsResponse) {
                        Log.w("SMS Country SDK: ","Successfully Create new Group Call");
                    }
                });
    }

    public void getGroupCallList(){
        GroupCallsService groupCallsService = new GroupCallsService(apiBase);

        groupCallsService.groupCallList("", "", "", "")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GetGroupCallListResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.w("Development", e.getMessage());
                    }

                    @Override
                    public void onNext(GetGroupCallListResponse getGroupCallListResponse) {
                        Log.w("SMS Country SDK: ","Successfully Create new Group Call");
                    }
                });
    }
}
