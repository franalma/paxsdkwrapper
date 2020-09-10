package com.diusframi.tele.pax.sdk.jemv.clcommon;

import com.diusframi.tele.logs.Log;

public class EMV_REVOCLIST extends com.pax.jemv.clcommon.EMV_REVOCLIST {

    public EMV_REVOCLIST() {
        super();
        Log.getInstance().d("Starts");
    }

    public EMV_REVOCLIST(byte[] ucRid, byte ucIndex, byte[] ucCertSn) {
        super(ucRid, ucIndex, ucCertSn);
        Log.getInstance().d("Starts");
    }
}
