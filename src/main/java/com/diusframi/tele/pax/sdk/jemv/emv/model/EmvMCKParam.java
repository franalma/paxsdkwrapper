package com.diusframi.tele.pax.sdk.jemv.emv.model;

import com.diusframi.tele.logs.Log;
import com.pax.jemv.emv.model.EmvEXTMParam;

public class EmvMCKParam extends com.pax.jemv.emv.model.EmvMCKParam {
    public EmvMCKParam() {
        super();
        Log.getInstance().d("Starts");
    }

    public EmvMCKParam(byte ucBypassPin, byte ucBatchCapture, EmvEXTMParam extmParam) {
        super( ucBypassPin,  ucBatchCapture,  extmParam);
        Log.getInstance().d("Starts");
    }
}

