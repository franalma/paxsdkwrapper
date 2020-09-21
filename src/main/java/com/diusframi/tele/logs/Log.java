package com.diusframi.tele.logs;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Log {
    com.diusframi.android.logs2json.Log logger;
    private static Log instance;
    private String tag = "PaxSdkWrapper";
    private static Context context;
    private final static String FILE_NAME = "sdkwrapper.json";

    private Log(){
        logger = new com.diusframi.android.logs2json.Log(tag, FILE_NAME);
        logger.setToFile(true);
    }

    public String getLogFullInfo() {
        JSONArray jac = new JSONArray();
        try{
            File dir = context.getFilesDir();
            BufferedReader reader = new BufferedReader(new FileReader(dir+"/"+ FILE_NAME));
            String line;
            while((line = reader.readLine()) != null){
                line = line.replaceAll("\\\\","");
                JSONObject joc = new JSONObject(line);
                jac.put(joc);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        return jac.toString();
    }
    public boolean clearLogs(){
        File file = new File (context.getFilesDir()+"/"+FILE_NAME);
        boolean res = true;
        try{
            res = file.delete();
            res = file.createNewFile();
//            FileWriter writer = new FileWriter(file);
//            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return res;
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
