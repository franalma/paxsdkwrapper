package com.diusframi.tele.logs;

import android.content.Context;

public class Log {
    com.diusframi.android.logs2json.Log logger;
    private static Log instance;
    private String tag = "PaxSdkWrapper";
    private static Context context;

    private Log(){
        logger = new com.diusframi.android.logs2json.Log(tag, "sdkwrapper.json");
        logger.setToFile(true);
    }

    public static void init(Context c){
        com.diusframi.android.logs2json.Log.init(c,4);
        context = c;
    }

    public void d(String log){
        if (context != null){
            logger.d(tag,log);
        }
    }

    public static Log getInstance(){
        if (instance == null){
            instance = new Log();
        }
        return instance;
    }
}
