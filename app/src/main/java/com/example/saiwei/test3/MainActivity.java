package com.example.saiwei.test3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView tvHello;

    @Override
    protected void onResume() {
        super.onResume();

        //测试acra
//        tvHello.setText("Test Crash");
    }

    public void test(View view){

        Intent broadcast=new Intent();
        broadcast.setAction("cn.bgxt.Broadcastdemo.Basic.broadcast");
        broadcast.putExtra("msg", "这是一个普通广播");
        sendBroadcast(broadcast);
    }
}
