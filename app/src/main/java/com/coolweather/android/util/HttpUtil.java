package com.coolweather.android.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by dgunzi on 2018/2/1.
 */

public class HttpUtil {
    public static void sendOKHttpRequest(String address, Callback callback){
        OkHttpClient client  = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
