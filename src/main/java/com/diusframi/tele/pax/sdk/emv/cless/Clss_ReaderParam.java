package com.diusframi.tele.pax.sdk.emv.cless;

import com.diusframi.tele.logs.Log;

public class Clss_ReaderParam extends com.pax.jemv.clcommon.Clss_ReaderParam{

    public Clss_ReaderParam() {
        super();
        Log.getInstance().d("Starts");
    }

    public Clss_ReaderParam(long ulReferCurrCon, short usMchLocLen, byte[] aucMchNameLoc,
                            byte[] aucMerchCatCode, byte[] aucMerchantID, byte[] acquierId,
                            byte[] aucTmID, byte ucTmType, byte[] aucTmCap, byte[] aucTmCapAd,
                            byte[] aucTmCntrCode, byte[] aucTmTransCur, byte ucTmTransCurExp,
                            byte[] aucTmRefCurCode, byte ucTmRefCurExp, byte[] aucRFU) {
        super( ulReferCurrCon,  usMchLocLen, aucMchNameLoc, aucMerchCatCode, aucMerchantID,
                acquierId, aucTmID,  ucTmType, aucTmCap, aucTmCapAd, aucTmCntrCode,
                aucTmTransCur,  ucTmTransCurExp, aucTmRefCurCode,  ucTmRefCurExp,  aucRFU);
        Log.getInstance().d("Starts");
    }
}
