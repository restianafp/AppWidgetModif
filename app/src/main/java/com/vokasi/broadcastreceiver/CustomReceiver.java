package com.vokasi.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {
    private static final String ACTION_CUSTOM_BROADCAST=
            "com.vokasi.broadcastreceiver.ACTION_CUSTOM_BROADCAST";

    @Override
    public void onReceive(Context context, Intent intent) {
       String intentActionn = intent.getAction();
       if (intentAction!=null){
           String toastMessage ="";
           switch (intentActionn){
               case Intent.ACTION_POWER_CONNECTED:
                   toastMessage="Power Connected";
                   break;
               case Intent.ACTION_POWER_DISCONNECTED:
                   toastMessage="Power Disconnected";
                   break;
               case ACTION_CUSTOM_BROADCAST:
                   toastMessage=intent.getStringExtra("DATA");
                   break;
           }
           Toast.makeText(context,toastMessage,Toast.LENGTH_SHORT).show();
       }
    }
}
