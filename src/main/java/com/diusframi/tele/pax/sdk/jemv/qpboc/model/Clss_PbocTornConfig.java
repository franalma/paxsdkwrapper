package com.diusframi.tele.pax.sdk.jemv.qpboc.model;

import com.diusframi.tele.logs.Log;

public class Clss_PbocTornConfig extends com.pax.jemv.qpboc.model.Clss_PbocTornConfig {
    public Clss_PbocTornConfig() {
        super();
        Log.getInstance().d("Starts");
    }

    public Clss_PbocTornConfig(long lTornMaxLifeTime, short usTornLogMaxNum, short usTornSupport, byte[] ucTornRFU) {
        super(lTornMaxLifeTime, usTornLogMaxNum, usTornSupport, ucTornRFU);
        Log.getInstance().d("Starts");
    }

}
