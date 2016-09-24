package com.smscountry.androidsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;

import com.smscountry.ApiBase;
import com.smscountry.SmsService;
import com.smscountry.models.SendSMSRequest;
import com.smscountry.models.SendSMSResponse;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    public static final String ApiBaseUrl = "https://restapi.smscountry.com/v0.1/Accounts/";
    public static final String AuthKey = "5PySDTbhHLVNjGCdeuHe";
    public static final String AuthToken = "dnxRAn6C2O3svfc0DSWrrCOiy6jDwXR8qWG4Wboz";

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

        ApiBase apiBase = new ApiBase();
        apiBase.setApiBaseUrl(ApiBaseUrl);
        apiBase.setAuthKey(AuthKey);
        apiBase.setAuthorizationToken(encoded);

        // Default Content Type application/json
        // To change it to application/xml, uncomment the below code
        // apiBase.setContentType("application/xml");

        SmsService smsService = new SmsService(apiBase);

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
                    }
                });

    }
}
