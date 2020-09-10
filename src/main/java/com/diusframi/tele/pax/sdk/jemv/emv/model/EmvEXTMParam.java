package com.diusframi.tele.pax.sdk.jemv.emv.model;

import com.diusframi.tele.logs.Log;

public class EmvEXTMParam extends com.pax.jemv.emv.model.EmvEXTMParam {
    public EmvEXTMParam() {
        super();
        Log.getInstance().d("Starts");
    }

    public EmvEXTMParam(byte ucUseTermAIPFlg, byte[] aucTermAIP, byte ucBypassAllFlg) {
        super(ucUseTermAIPFlg, aucTermAIP, ucBypassAllFlg);
        Log.getInstance().d("Starts");
    }
}
