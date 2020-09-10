package com.diusframi.tele.pax.sdk.jemv.clcommon;

import com.diusframi.tele.logs.Log;

public class Clss_TransParam extends com.pax.jemv.clcommon.Clss_TransParam {

    public Clss_TransParam() {
        super();
        Log.getInstance().d("Starts");
    }

    public Clss_TransParam(long ulAmntAuth, long ulAmntOther, long ulTransNo, byte ucTransType,
                           byte[] aucTransDate, byte[] aucTransTime) {
        super(ulAmntAuth, ulAmntOther, ulTransNo, ucTransType,  aucTransDate,  aucTransTime);
        Log.getInstance().d("Starts");
    }
}
