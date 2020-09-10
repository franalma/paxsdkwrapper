package com.diusframi.tele.pax.sdk.jemv.clcommon;

import com.diusframi.tele.logs.Log;

public class Clss_PreProcInfo extends com.pax.jemv.clcommon.Clss_PreProcInfo {


    public Clss_PreProcInfo() {
        super();
        Log.getInstance().d("Starts");
    }

    public Clss_PreProcInfo(long ulTermFLmt, long ulRdClssTxnLmt, long ulRdCVMLmt, long ulRdClssFLmt,
                            byte[] aucAID, byte ucAidLen, byte ucKernType, byte ucCrypto17Flg,
                            byte ucZeroAmtNoAllowed, byte ucStatusCheckFlg, byte[] aucReaderTTQ,
                            byte ucTermFLmtFlg, byte ucRdClssTxnLmtFlg, byte ucRdCVMLmtFlg,
                            byte ucRdClssFLmtFlg, byte[] aucRFU) {
        super(ulTermFLmt, ulRdClssTxnLmt,
                ulRdCVMLmt, ulRdClssFLmt, aucAID, ucAidLen, ucKernType, ucCrypto17Flg,
                ucZeroAmtNoAllowed, ucStatusCheckFlg,aucReaderTTQ,
                ucTermFLmtFlg, ucRdClssTxnLmtFlg,ucRdCVMLmtFlg,ucRdClssFLmtFlg, aucRFU);
        Log.getInstance().d("Starts");
    }
}
