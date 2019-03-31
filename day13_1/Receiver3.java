package com.example.day13_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Receiver3 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String resultData = getResultData();
        //String data = intent.getStringExtra("data");
        //Log.i("tag",data+"++++++++++++++++++");
        Log.i("tag",resultData+"----------------");
        setResultData("很好，");
    }
}
