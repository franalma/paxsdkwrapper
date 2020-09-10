package com.diusframi.tele.pax.sdk.amex;

import com.diusframi.tele.logs.Log;

public class ONLINE_PARAM extends com.pax.jemv.amex.model.ONLINE_PARAM {
    public ONLINE_PARAM() {
        super();
        Log.getInstance().d("Starts");
    }

    public ONLINE_PARAM(byte[] aucRspCode, byte[] aucAuthCode, int nAuthCodeLen, byte[] aucIAuthData,
                        int nIAuthDataLen, byte[] aucScript, int nScriptLen) {
        super(aucRspCode, aucAuthCode, nAuthCodeLen, aucIAuthData, nIAuthDataLen, aucScript,
                nScriptLen);
        Log.getInstance().d("Starts");
    }
}
