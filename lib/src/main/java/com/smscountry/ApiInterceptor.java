package com.smscountry;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by jaya on 21/09/16.
 */
public class ApiInterceptor implements Interceptor {

    private String contentType;
    private String authorizationToken;

    public ApiInterceptor() {
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }


    public void setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
    }

    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException
    {
        Request original = chain.request();
        Request.Builder requestBuilder = original.newBuilder()
                .header("Accept-Encoding", "gzip, deflate")
                .header("Accept", "*/*")
                .header("Cache-Control", "no-cache");
        this.setAuthToken(requestBuilder);
        Request request = requestBuilder.method(original.method(), original.body())
                .build();
        String body = request.toString();
        Response response = chain.proceed(request);
        String bodyString = response.body().string();

        return response.newBuilder()
                .body(ResponseBody.create(response.body().contentType(), bodyString))
                .build();
    }

    private void setAuthToken(Request.Builder requestBuilder){
        requestBuilder.header("Authorization", "Basic " + this.authorizationToken);
    }

}


