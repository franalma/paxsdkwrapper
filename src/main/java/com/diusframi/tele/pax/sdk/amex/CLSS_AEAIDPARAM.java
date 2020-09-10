package com.diusframi.tele.pax.sdk.amex;

import com.diusframi.tele.logs.Log;

public class CLSS_AEAIDPARAM extends com.pax.jemv.amex.model.CLSS_AEAIDPARAM {

    public CLSS_AEAIDPARAM() {
        super();
        Log.getInstance().d("Starts");
    }

    public CLSS_AEAIDPARAM(byte FloorLimitCheck, long FloorLimit, byte[] TACDenial, byte[] TACOnline,
                           byte[] TACDefault, byte[] AcquierId, byte[] dDOL, byte[] tDOL,
                           byte[] Version, byte ucAETermCap, byte[] aucRFU) {
        super( FloorLimitCheck,  FloorLimit,  TACDenial, TACOnline, TACDefault,
                AcquierId, dDOL, tDOL, Version,  ucAETermCap, aucRFU);
        Log.getInstance().d("Starts");
    }
}
