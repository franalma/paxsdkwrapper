package com.diusframi.tele.pax.sdk.jemv.clcommon;

import com.diusframi.tele.logs.Log;

public class EMV_CAPK extends com.pax.jemv.clcommon.EMV_CAPK {

    public EMV_CAPK() {
        super();
        Log.getInstance().d("Starts");
    }

    public EMV_CAPK(byte[] rID, byte keyID, byte hashInd, byte arithInd, byte modulLen,
                    byte[] modul, byte exponentLen, byte[] exponent, byte[] expDate, byte[] checkSum) {
      super( rID,  keyID,  hashInd,  arithInd, modulLen, modul,  exponentLen,
              exponent, expDate,checkSum);
        Log.getInstance().d("Starts");
    }
}
