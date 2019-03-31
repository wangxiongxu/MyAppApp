package com.example.day13_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Receiver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String resultData = getResultData();
        //String data = intent.getStringExtra("data");
        Log.i("tag",resultData+"----------------");
        setResultData("不好，还是买个迈巴赫！！！！@银行");
    }
}
