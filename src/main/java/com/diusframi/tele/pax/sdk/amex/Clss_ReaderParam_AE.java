package com.diusframi.tele.pax.sdk.amex;

import com.diusframi.tele.logs.Log;
import com.pax.jemv.clcommon.Clss_ReaderParam;

public class Clss_ReaderParam_AE extends com.pax.jemv.amex.model.Clss_ReaderParam_AE{
    public Clss_ReaderParam_AE(){
        super(null, (byte)0, null);
        Log.getInstance().d("Starts");
    }

    public Clss_ReaderParam_AE(Clss_ReaderParam stReaderParam, byte ucTmSupOptTrans, byte[] aucUNRange) {
        super(stReaderParam,ucTmSupOptTrans,aucUNRange);
        Log.getInstance().d("Starts");
    }
}
