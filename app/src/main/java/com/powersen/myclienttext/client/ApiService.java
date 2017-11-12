package com.powersen.myclienttext.client;

import com.powersen.myclientdemo.Mybean;
import com.powersen.myclienttext.Mybean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by lenovo on 2017/11/12.
 */

public interface ApiService {

    @GET("/api/4/theme/11")
    Observable<Mybean> getHome();
}
