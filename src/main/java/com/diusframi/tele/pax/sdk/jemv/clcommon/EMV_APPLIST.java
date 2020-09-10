package com.diusframi.tele.pax.sdk.jemv.clcommon;

import com.diusframi.tele.logs.Log;

public class EMV_APPLIST extends com.pax.jemv.clcommon.EMV_APPLIST{

    public EMV_APPLIST() {
        super();
        Log.getInstance().d("Starts");
    }

    public EMV_APPLIST(byte[] appName, byte[] aid, byte aidLen, byte selFlag, byte priority,
                       byte targetPer, byte maxTargetPer, byte floorLimitCheck, byte randTransSel,
                       byte velocityCheck, long floorLimit, long threshold, byte[] tacDenial,
                       byte[] tacOnline, byte[] tacDefault, byte[] acquierId, byte[] dDOL,
                       byte[] tDOL, byte[] version, byte[] riskManData) {

        super( appName, aid, aidLen,selFlag, priority, targetPer,  maxTargetPer,  floorLimitCheck,
                randTransSel, velocityCheck,  floorLimit,  threshold, tacDenial, tacOnline,
                tacDefault,  acquierId, dDOL, tDOL, version,  riskManData);
        Log.getInstance().d("Starts");
    }

}
