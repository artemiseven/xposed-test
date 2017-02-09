package com.xposed.raingo.xposed_test;

import android.app.Application;
import android.content.Context;

/**
 * Created by rain on 2017/2/9.
 */

public class XApplication extends Application {
    private static Context mContext;
    public static Context getContext(){
        if (null == mContext){
            throw new RuntimeException("zaogao!!");
        }
        return mContext;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }
}
