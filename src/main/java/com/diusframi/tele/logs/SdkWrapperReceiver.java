package com.diusframi.tele.logs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SdkWrapperReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String result = Log.getInstance().getLogFullInfo();
        Intent intentResponse = new Intent("com.disframi.pax.sdk.wrapper.getlogs.response");
        intentResponse.putExtra("result", result);
        context.sendBroadcast(intentResponse);
    }
}
