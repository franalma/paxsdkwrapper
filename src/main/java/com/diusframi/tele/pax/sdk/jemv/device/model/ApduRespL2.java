package com.diusframi.tele.pax.sdk.jemv.device.model;

import com.diusframi.tele.logs.Log;

public class ApduRespL2 extends com.pax.jemv.device.model.ApduRespL2{

    public ApduRespL2() {
        super();
        Log.getInstance().d("Starts");
    }

    public ApduRespL2(short lenOut, byte[] dataOut, byte swa, byte swb) {
       super(lenOut, dataOut, swa, swb);
        Log.getInstance().d("Starts");
    }
}
