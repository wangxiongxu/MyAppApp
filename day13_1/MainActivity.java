package com.example.day13_1;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 发送广播
     */
    private Button mBt;
    private Receiver1 receiver1;
    private Receiver2 receiver2;
    private Receiver3 receiver3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        receiver1 = new Receiver1();
        IntentFilter aaa1 = new IntentFilter("aaa");
        aaa1.setPriority(1000);
        registerReceiver(receiver1,aaa1);

        receiver2 = new Receiver2();
        IntentFilter aaa2 = new IntentFilter("aaa");
        aaa2.setPriority(1000);
        registerReceiver(receiver2,aaa2);

        receiver3 = new Receiver3();
        IntentFilter aaa3 = new IntentFilter("aaa");
        aaa3.setPriority(1000);
        registerReceiver(receiver3,aaa3);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(receiver1);
        unregisterReceiver(receiver2);
        unregisterReceiver(receiver3);
    }

    private void initView() {
        mBt = (Button) findViewById(R.id.bt);
        mBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.bt:
                Intent intent = new Intent("aaa");
                intent.putExtra("data","今年买个大众");
                sendOrderedBroadcast(intent,null);
                break;
        }
    }
}
