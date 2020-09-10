package com.diusframi.tele.pax.sdk.jemv.clcommon;

import com.diusframi.tele.logs.Log;

public class Clss_ProgramID extends  com.pax.jemv.clcommon.Clss_ProgramID {

    public Clss_ProgramID() {
        super();
    }

    public Clss_ProgramID(long ulRdClssTxnLmt, long ulRdCVMLmt, long ulRdClssFLmt, long ulTermFLmt,
                          byte[] aucProgramId, byte ucPrgramIdLen, byte ucRdClssFLmtFlg,
                          byte ucRdClssTxnLmtFlg, byte ucRdCVMLmtFlg, byte ucTermFLmtFlg,
                          byte ucStatusCheckFlg, byte ucAmtZeroNoAllowed, byte[] aucRFU) {

        super(ulRdClssTxnLmt, ulRdCVMLmt, ulRdClssFLmt, ulTermFLmt, aucProgramId,  ucPrgramIdLen,
            ucRdClssFLmtFlg,ucRdClssTxnLmtFlg,  ucRdCVMLmtFlg,  ucTermFLmtFlg,
            ucStatusCheckFlg,  ucAmtZeroNoAllowed, aucRFU);
        Log.getInstance().d("Starts");
    }

}
