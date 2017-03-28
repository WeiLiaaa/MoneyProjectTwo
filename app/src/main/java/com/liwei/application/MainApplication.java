package com.liwei.application;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by wu  suo  wei on 2017/3/16.
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderConfiguration conf=new ImageLoaderConfiguration.Builder(this).memoryCacheExtraOptions(400, 300) .build();
        ImageLoader.getInstance().init(conf);

    }
}
