package com.diusframi.tele.pax.sdk.jemv.emv.model;

import com.diusframi.tele.logs.Log;

public class EmvParam extends  com.pax.jemv.emv.model.EmvParam {
    public EmvParam() {
        super();
        Log.getInstance().d("Starts");
    }

    public EmvParam(byte[] merchName, byte[] merchCateCode, byte[] merchId, byte[] termId,
                    byte terminalType, byte[] capability, byte[] exCapability, byte transCurrExp,
                    byte referCurrExp, byte[] referCurrCode, byte[] countryCode, byte[] transCurrCode,
                    long referCurrCon, byte transType, byte forceOnline, byte getDataPIN,
                    byte surportPSESel) {

        super( merchName, merchCateCode,  merchId,  termId, terminalType,  capability,
                exCapability,  transCurrExp, referCurrExp,  referCurrCode, countryCode, transCurrCode,
         referCurrCon,  transType,  forceOnline,  getDataPIN, surportPSESel);
        Log.getInstance().d("Starts");

    }

}
