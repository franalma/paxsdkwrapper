package com.diusframi.tele.pax.sdk.amex;

import com.diusframi.tele.logs.Log;

public class Clss_AddReaderParam_AE extends com.pax.jemv.amex.model.Clss_AddReaderParam_AE {


    public Clss_AddReaderParam_AE(byte[] aucTmTransCapa, byte ucDelayAuthFlag, byte[] aucRFU) {
        super(aucTmTransCapa, ucDelayAuthFlag, aucRFU);
        Log.getInstance().d("Starts:");
    }
}
