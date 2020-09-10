package com.diusframi.tele.pax.sdk.jemv.qpboc.model;

import com.diusframi.tele.logs.Log;

public class Clss_PbocAidParam extends com.pax.jemv.qpboc.model.Clss_PbocAidParam {
    public Clss_PbocAidParam() {
        super();
        Log.getInstance().d("Starts");
    }

    public Clss_PbocAidParam(long ulTermFLmt, byte[] aucRFU) {
        super(ulTermFLmt, aucRFU);
        Log.getInstance().d("Starts");
    }

}
