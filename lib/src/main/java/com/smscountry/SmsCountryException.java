package com.smscountry;

import com.smscountry.models.BaseResponse;
import java.io.IOException;
import java.lang.annotation.Annotation;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.HttpException;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jaya on 27/09/16.
 */

public class SmsCountryException{

    private HttpException httpException;
    private ApiBase apiBase;

    public SmsCountryException(HttpException httpException, ApiBase apiBase) {
        this.httpException = httpException;
        this.apiBase = apiBase;
    }

    public BaseResponse getErrorDetails() throws IOException{
        Response response = this.httpException.response();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(this.apiBase.getApiBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Converter<ResponseBody, BaseResponse> errorConverter =
                retrofit.responseBodyConverter(BaseResponse.class, new Annotation[0]);

        return errorConverter.convert(response.errorBody());
    }
}
