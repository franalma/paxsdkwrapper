package com.disframi.firebase.analytics;

import android.content.Context;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.analytics.FirebaseAnalytics;

public class FirebaseManager {
    private static FirebaseAnalytics mFirebaseAnalytics;
    public static void init(Context context){
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(context);
    }

    public static void addLog(String value){
        if (mFirebaseAnalytics != null){
            Bundle bundle = new Bundle();
            bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "id_"+value);
            bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, value);
            bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "string");
            mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
        }

    }



}
