package com.example.wangsl.threadofnotification;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static HomeWatcherReceiver mHomeKeyReceiver = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHomeKeyReceiver = new HomeWatcherReceiver();
        final IntentFilter homeFilter = new IntentFilter(Intent.ACTION_CLOSE_SYSTEM_DIALOGS);

        this.registerReceiver(mHomeKeyReceiver, homeFilter);
    }
    public void XuanGua(View v){

    }
    public void Putong(View v){

    }
    public void Zhedie(View v){

    }

}
