package com.diusframi.tele.pax.sdk.jemv.clcommon;

public class CLSS_TORN_LOG_RECORD extends com.pax.jemv.clcommon.CLSS_TORN_LOG_RECORD {

    public CLSS_TORN_LOG_RECORD() {
        super();
    }

    public CLSS_TORN_LOG_RECORD(byte[] aucPAN, byte ucPANLen, byte ucPANSeqFlg,
                                byte ucPANSeq, byte[] aucTornData, int unTornDataLen) {
        super(aucPAN, ucPANLen, ucPANSeqFlg, ucPANSeq, aucTornData,  unTornDataLen);
    }
}
