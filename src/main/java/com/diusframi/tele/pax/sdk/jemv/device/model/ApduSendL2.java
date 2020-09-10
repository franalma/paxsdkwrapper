package com.diusframi.tele.pax.sdk.jemv.device.model;

import com.diusframi.tele.logs.Log;

public class ApduSendL2 extends com.pax.jemv.device.model.ApduSendL2 {

    public ApduSendL2() {
        super();
        Log.getInstance().d("Starts");
    }

    public ApduSendL2(byte[] command, short lc, byte[] dataIn, short le) {
       super(command, lc, dataIn, le);
        Log.getInstance().d("Starts");
    }
}
