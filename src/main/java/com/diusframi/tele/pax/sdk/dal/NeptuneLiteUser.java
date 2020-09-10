package com.diusframi.tele.pax.sdk.dal;

import android.content.Context;

import com.diusframi.tele.logs.Log;
import com.pax.dal.IDAL;

public class NeptuneLiteUser {
    private com.pax.neptunelite.api.NeptuneLiteUser neptuneLiteUser;
    private static NeptuneLiteUser instance;

    static {
        System.loadLibrary("F_DEVICE_LIB_PayDroid");
        System.loadLibrary("F_PUBLIC_LIB_PayDroid");
        System.loadLibrary("F_EMV_LIB_PayDroid");
        System.loadLibrary("F_EMV_LIBC_PayDroid");
        System.loadLibrary("JNI_EMV_v102");
        System.loadLibrary("F_ENTRY_LIB_PayDroid");
        System.loadLibrary("JNI_ENTRY_v103");
        System.loadLibrary("F_MC_LIB_PayDroid");
        System.loadLibrary("JNI_MC_v100_01");
        System.loadLibrary("F_WAVE_LIB_PayDroid");
        System.loadLibrary("JNI_WAVE_v100");
        System.loadLibrary("F_AE_LIB_PayDroid");
        System.loadLibrary("JNI_AE_v101");
        System.loadLibrary("F_QPBOC_LIB_PayDroid");
        System.loadLibrary("JNI_QPBOC_v100");
        System.loadLibrary("F_DPAS_LIB_PayDroid");
        System.loadLibrary("JNI_DPAS_v100");
        System.loadLibrary("F_JCB_LIB_PayDroid");
        System.loadLibrary("JNI_JCB_v100");
        System.loadLibrary("F_PURE_LIB_PayDroid");
        System.loadLibrary("JNI_PURE_v100");
    }

    private NeptuneLiteUser() {
        Log.getInstance().d("Starts");
        neptuneLiteUser = com.pax.neptunelite.api.NeptuneLiteUser.getInstance();
    }

    public static synchronized NeptuneLiteUser getInstance() {
        Log.getInstance().d("Starts");
        if (instance == null){
            instance = new NeptuneLiteUser();
        }
        return instance;
    }

    public IDAL getDal(Context context) throws Exception {
        Log.getInstance().d("Starts");
       return neptuneLiteUser.getDal(context);
    }

    public String calcMD5(String str) {
        Log.getInstance().d("Starts");
        return neptuneLiteUser.calcMD5(str);
    }

}
