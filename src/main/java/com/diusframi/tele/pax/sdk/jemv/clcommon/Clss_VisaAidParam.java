package com.diusframi.tele.pax.sdk.jemv.clcommon;

import com.diusframi.tele.logs.Log;

public class Clss_VisaAidParam extends  com.pax.jemv.clcommon.Clss_VisaAidParam {
    public Clss_VisaAidParam() {
        super();
        Log.getInstance().d("Starts");
    }

    public Clss_VisaAidParam(long ulTermFLmt, byte ucDomesticOnly, byte ucCvmReqNum,
                             byte[] aucCvmReq, byte ucEnDDAVerNo) {
        super(ulTermFLmt, ucDomesticOnly, ucCvmReqNum,  aucCvmReq, ucEnDDAVerNo);
        Log.getInstance().d("Starts");

    }
}
