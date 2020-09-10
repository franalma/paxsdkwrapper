package com.diusframi.tele.pax.sdk.jemv;


import com.diusframi.tele.logs.Log;
import com.pax.jemv.clcommon.ByteArray;
import com.pax.jemv.clcommon.EMV_APPLIST;
import com.pax.jemv.emv.api.EMVApi;

public class EMVCallback extends EMVApi {
    private com.pax.jemv.emv.api.EMVCallback emvCallback;
    private static  EMVCallback instance;

    private EMVCallback() {
        Log.getInstance().d("Starts");
        emvCallback = com.pax.jemv.emv.api.EMVCallback .getInstance();
    }

    public static EMVCallback getInstance() {
        if (instance == null) {
            instance = new EMVCallback();
        }
        return instance;
    }

    public void setCallBackResult(int result) {
        Log.getInstance().d("Starts");
        emvCallback.setCallBackResult(result);
    }

    public void setCallbackListener(com.pax.jemv.emv.api.EMVCallback.EmvCallbackListener listener) {
        Log.getInstance().d("Starts");
        emvCallback.setCallbackListener(listener);
    }

    public int cEMVWaitAppSel(int tryCnt, EMV_APPLIST[] list, int appNum) {
        Log.getInstance().d("Starts");
        return emvCallback.cEMVWaitAppSel(tryCnt, list, appNum);
    }

    public int cEMVInputAmount(long[] amt) {
        Log.getInstance().d("Starts");
        return emvCallback.cEMVInputAmount(amt);
    }

    public int cEMVGetHolderPwd(int tryFlag, int remainCnt, byte[] pin) {
        Log.getInstance().d("Starts");
        return emvCallback.cEMVGetHolderPwd(tryFlag, remainCnt, pin);
    }

    public void cEMVAdviceProc() {
        Log.getInstance().d("Starts");
        emvCallback.cEMVAdviceProc();
    }

    public void cEMVVerifyPINOK() {
        Log.getInstance().d("Starts");
        emvCallback.cEMVVerifyPINOK();
    }

    public int cEMVUnknowTLVData(short tag, ByteArray data) {
        Log.getInstance().d("Starts");
        return emvCallback.cEMVUnknowTLVData(tag, data);
    }

    public int cCertVerify() {
        Log.getInstance().d("Starts");
        return emvCallback.cCertVerify();
    }

    public int cEMVSetParam() {
        Log.getInstance().d("Starts");
        return emvCallback.cEMVSetParam();
    }

    public int cEMVVerifyPINfailed(byte[] rfu) {
        Log.getInstance().d("Starts");
        return emvCallback.cEMVVerifyPINfailed(rfu);
    }

    public int cRFU2() {
        Log.getInstance().d("Starts");
        return emvCallback.cRFU2();
    }
}
