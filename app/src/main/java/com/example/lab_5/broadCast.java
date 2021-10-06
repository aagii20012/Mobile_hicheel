package com.example.lab_5;

import  android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.BatteryManager;
import android.widget.Toast;

public class broadCast extends  BroadcastReceiver {
    private static final String TAG = "MyBroadcastReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();
        Toast.makeText(context, action, Toast.LENGTH_SHORT).show();
        if(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction()))
        {
            Toast.makeText(context, "Boot Completed", Toast.LENGTH_SHORT).show();
        }
        if(ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){
            Toast.makeText(context, "Connectivity Changed", Toast.LENGTH_SHORT).show();
        }
        if(Intent.ACTION_POWER_CONNECTED.equals(intent.getAction())){
            Toast.makeText(context, "Phone Charging", Toast.LENGTH_SHORT).show();
        }
        if(Intent.ACTION_TIMEZONE_CHANGED.equals((intent.getAction()))){
            Toast.makeText(context, "Time zone changed", Toast.LENGTH_SHORT).show();
        }
        if(Intent.ACTION_DATE_CHANGED.equals(intent.getAction())){
            Toast.makeText(context, "Date changed", Toast.LENGTH_SHORT).show();
        }
    }
}
