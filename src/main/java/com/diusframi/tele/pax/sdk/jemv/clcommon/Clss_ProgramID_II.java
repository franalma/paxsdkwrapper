package com.diusframi.tele.pax.sdk.jemv.clcommon;

public class Clss_ProgramID_II extends com.pax.jemv.clcommon.Clss_ProgramID_II {
    public Clss_ProgramID_II() {
        super();
    }

    public Clss_ProgramID_II(byte[] aucRdClssTxnLmt, byte[] aucRdCVMLmt, byte[] aucRdClssFLmt,
                             byte[] aucTermFLmt, byte[] aucProgramId, byte ucPrgramIdLen,
                             byte ucRdClssFLmtFlg, byte ucRdClssTxnLmtFlg,
                             byte ucRdCVMLmtFlg, byte ucTermFLmtFlg,
                             byte ucStatusCheckFlg, byte ucAmtZeroNoAllowed,
                             byte ucDynamicLimitSet, byte ucRFU) {
        super(aucRdClssTxnLmt,  aucRdCVMLmt, aucRdClssFLmt, aucTermFLmt, aucProgramId,ucPrgramIdLen,
        ucRdClssFLmtFlg,  ucRdClssTxnLmtFlg, ucRdCVMLmtFlg, ucTermFLmtFlg, ucStatusCheckFlg,
                ucAmtZeroNoAllowed, ucDynamicLimitSet, ucRFU);
    }
}
