package com.liwei.utils;

import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by wu  suo  wei on 2017/3/16.
 * 网络请求数据
 */

public class OkhttpTest{
    public static void getStr(String url, final getCallBackStr cbs){
        //创建okHttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
        //创建一个Request
        final Request request = new Request.Builder()
                .url(url)
                .build();
        //new call
        Call call = mOkHttpClient.newCall(request);
        //请求加入调度
        call.enqueue(new Callback()
        {
            @Override
            public void onFailure(Call call, IOException e) {

            }
            //解析成功的数据
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String sring = response.body().string();
                Log.i("kkk",sring);
                cbs.getDataBase(sring);
            }

        });
    }
    //接口回调返回okhttp解析出来的数据
    public static interface getCallBackStr{
        void getDataBase(String sring);
    }

}
