package com.diusframi.tele.pax.sdk.jemv.clcommon;

import com.diusframi.tele.logs.Log;

public class Clss_PreProcInterInfo extends com.pax.jemv.clcommon.Clss_PreProcInterInfo {

    public Clss_PreProcInterInfo(){
        super();
        Log.getInstance().d("Starts");
    }
    public Clss_PreProcInterInfo(byte[] aucAID, byte ucAidLen, byte ucZeroAmtFlg, byte ucStatusCheckFlg,
                                 byte[] aucReaderTTQ, byte ucCLAppNotAllowed, byte ucTermFLmtExceed,
                                 byte ucRdCLTxnLmtExceed, byte ucRdCVMLmtExceed, byte ucRdCLFLmtExceed,
                                 byte ucTermFLmtFlg, byte[] aucTermFLmt, byte ucCrypto17Flg,
                                 byte ucRandomSelect) {

        super(aucAID, ucAidLen, ucZeroAmtFlg, ucStatusCheckFlg, aucReaderTTQ, ucCLAppNotAllowed,
                ucTermFLmtExceed, ucRdCLTxnLmtExceed, ucRdCVMLmtExceed, ucRdCLFLmtExceed,
                ucTermFLmtFlg, aucTermFLmt, ucCrypto17Flg, ucRandomSelect);
        Log.getInstance().d("Starts");

    }
}
