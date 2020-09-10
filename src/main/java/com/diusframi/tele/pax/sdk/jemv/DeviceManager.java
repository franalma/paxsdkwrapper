package com.diusframi.tele.pax.sdk.jemv;

import com.diusframi.tele.logs.Log;
import com.pax.jemv.device.IDevice;
import com.pax.jemv.device.model.ApduRespL2;
import com.pax.jemv.device.model.ApduSendL2;
import com.pax.jemv.device.model.RsaPinKeyL2;

public class DeviceManager {
    private com.pax.jemv.device.DeviceManager deviceManager;
    private static com.pax.jemv.device.DeviceManager instance;

    public DeviceManager(){
        Log.getInstance().d("Starts");
        deviceManager = new com.pax.jemv.device.DeviceManager();
    }

    public static com.pax.jemv.device.DeviceManager getInstance() {
        Log.getInstance().d("Starts");
        if (instance == null) {
            instance = new com.pax.jemv.device.DeviceManager();
        }
        return instance;
    }

    public void setIDevice(IDevice device) {
        deviceManager.setIDevice(device);
    }

    public void timerSet(byte[] timerNo, short usTimeMS) {
        Log.getInstance().d("Starts");
       deviceManager.timerSet(timerNo, usTimeMS);
    }

    public short timerCheck(byte timerNo) {
        Log.getInstance().d("Starts");
        return deviceManager.timerCheck(timerNo);
    }

    public void delayMs(short usTimeMS) {
        Log.getInstance().d("Starts");
        deviceManager.delayMs(usTimeMS);
    }

    public int setPinInputParam(byte[] pucExpectPinLen, long ulTimeoutMs) {
        Log.getInstance().d("Starts");
        return deviceManager.setPinInputParam(pucExpectPinLen, ulTimeoutMs);
    }

    public int sm3(byte[] paucMsgIn, int nMsglenIn, byte[] paucResultOut) {
        Log.getInstance().d("Starts");
        return deviceManager.sm3(paucMsgIn, nMsglenIn, paucResultOut);
    }

    public byte setControlParam(byte[] pucParam) {
        Log.getInstance().d("Starts");
        return deviceManager.setControlParam(pucParam);
    }

    public int setCancelKey(byte ucKeyValue) {
        Log.getInstance().d("Starts");
        return deviceManager.setCancelKey(ucKeyValue);
    }

    public int iccSetTxnIF(int ucTxnIF) {
        Log.getInstance().d("Starts");
        return deviceManager.iccSetTxnIF(ucTxnIF);
    }

    public int iccGetTxnIF() {
        Log.getInstance().d("Starts");
        return deviceManager.iccGetTxnIF();
    }

    public void setIccSlot(byte ucSlot) {
        Log.getInstance().d("Starts");
        deviceManager.setIccSlot(ucSlot);
    }

    public int iccReset() {
        Log.getInstance().d("Starts");
        return deviceManager.iccReset();
    }

    public int fInitiate() {
        Log.getInstance().d("Starts");
        return deviceManager.fInitiate();
    }

    public int fWriteData(int nFileIndex, byte[] paucDataIn, int unDataInLen) {
        Log.getInstance().d("Starts");
        return deviceManager.fWriteData(nFileIndex, paucDataIn, unDataInLen);
    }

    public int fReadData(int nFileIndex, byte[] paucDataOut, int unDataExceptLen) {
        Log.getInstance().d("Starts");
        return deviceManager.fReadData(nFileIndex, paucDataOut, unDataExceptLen);
    }

    public int fRemove(int nFileIndex) {
        Log.getInstance().d("Starts");
        return deviceManager.fRemove(nFileIndex);
    }

    public void setDebug(byte ucDebugFlag, byte ucPortChannel) {
        Log.getInstance().d("Starts");
        deviceManager.setDebug(ucDebugFlag, ucPortChannel);
    }

    public void getRand(byte[] buf, int len) {
        Log.getInstance().d("Starts");
        deviceManager.getRand(buf, len);
    }

    public void getTime(byte[] time) {
        Log.getInstance().d("Starts");
        deviceManager.getTime(time);
    }

    public void readSN(byte[] serialNo) {
        Log.getInstance().d("Starts");
        deviceManager.readSN(serialNo);
    }

    public long getTickCount() {
        Log.getInstance().d("Starts");
        return deviceManager.getTickCount();
    }

    public void des(byte[] input, byte[] output, byte[] deskey, int mode) {
        Log.getInstance().d("Starts");
       deviceManager.des(input, output,deskey, mode);
    }

    public int aes(byte[] input, byte[] output, byte[] aesKey, int keyLen, int mode) {
        Log.getInstance().d("Starts");
        return deviceManager.aes(input, output, aesKey, keyLen, mode);
    }

    public void hash(byte[] dataIn, int dataInLen, byte[] dataOut) {
        Log.getInstance().d("Starts");
       deviceManager.hash(dataIn, dataInLen, dataOut);
    }

    public int rsaRecover(byte[] pbyModule, int dwModuleLen, byte[] pbyExp, int dwExpLen,
                          byte[] pbyDataIn, byte[] pbyDataOut) {
        Log.getInstance().d("Starts");
        return deviceManager.rsaRecover(pbyModule, dwModuleLen, pbyExp, dwExpLen, pbyDataIn, pbyDataOut);
    }

    public int sm2Verify(byte paucPubkeyIn, byte[] paucMsgIn, int nMsglenIn, byte[] paucSignIn, int nSignlenIn) {
        Log.getInstance().d("Starts");
        return deviceManager.sm2Verify(paucPubkeyIn, paucMsgIn, nMsglenIn, paucSignIn, nSignlenIn);
    }

    public byte iccCommand(ApduSendL2 ptApduSend, ApduRespL2 ptApduRecv) {
        Log.getInstance().d("Starts");
        return deviceManager.iccCommand(ptApduSend, ptApduRecv);
    }

    public int pedVerifyPlainPin(byte[] ucIccRespOut, byte ucMode) {
        Log.getInstance().d("Starts");
        return deviceManager.pedVerifyPlainPin(ucIccRespOut, ucMode);
    }

    public int pedVerifyCipherPin(RsaPinKeyL2 tRsaPinKeyIn, byte[] ucIccRespOut, byte ucMode) {
        Log.getInstance().d("Starts");
        return deviceManager.pedVerifyCipherPin(tRsaPinKeyIn, ucIccRespOut, ucMode);
    }


}
