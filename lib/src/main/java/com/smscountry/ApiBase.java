package com.smscountry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiBase {

    private String contentType;
    private String authKey;
    private String authorizationToken;

    private HttpLoggingInterceptor.Level loggingLevel;
    private String apiBaseUrl;
    private String dateFormat;


    public ApiBase() {
        this.contentType="application/json";
        this.loggingLevel = HttpLoggingInterceptor.Level.NONE;
        this.dateFormat = "yyyy-MM-dd HH:mm:ss";
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public String getAuthorizationToken() {
        return authorizationToken;
    }

    public void setAuthorizationToken(String authToken) {
        this.authorizationToken = authToken;
    }

    public String getApiBaseUrl() {
        return apiBaseUrl;
    }

    public void setApiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    //HttpLoggingInterceptor.Level.NONE
    //HttpLoggingInterceptor.Level.BASIC
    //HttpLoggingInterceptor.Level.HEADERS
    //HttpLoggingInterceptor.Level.BODY
    public void setLoggingLevel(HttpLoggingInterceptor.Level loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    public  <T> T createService(final Class<T> clazz)
    {
        ApiInterceptor apiInterceptor = new ApiInterceptor();
        apiInterceptor.setAuthorizationToken(this.authorizationToken);
        apiInterceptor.setContentType(this.contentType);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(apiInterceptor);
        OkHttpClient client = httpClient.build();
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(this.loggingLevel);
        httpClient.addInterceptor(logging);
        Gson gson = new GsonBuilder()
                .setDateFormat(this.dateFormat)
                .create();
        GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create(gson);

        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(this.apiBaseUrl)
                .addConverterFactory(gsonConverterFactory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build();

        T service = retrofit.create(clazz);

        return service;
    }
}
