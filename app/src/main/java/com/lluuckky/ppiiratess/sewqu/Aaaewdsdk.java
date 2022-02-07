package com.lluuckky.ppiiratess.sewqu;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class Aaaewdsdk extends Application {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();
        FragmentButt.ofn(this);
        FragmentPol.isj(this);
        FragmentPol.uyd(this);
        FragmentPol.ytj(this);
    }
}
