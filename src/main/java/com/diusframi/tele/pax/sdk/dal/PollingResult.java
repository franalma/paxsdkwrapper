package com.diusframi.tele.pax.sdk.dal;

import com.diusframi.tele.logs.Log;
import com.pax.dal.entity.EReaderType;

public class PollingResult {
    private com.pax.dal.entity.PollingResult pollingResult;

    public com.pax.dal.entity.PollingResult.EOperationType getOperationType() {
        Log.getInstance().d("Starts");
        return pollingResult.getOperationType();
    }

    public void setOperationType(com.pax.dal.entity.PollingResult.EOperationType operationType) {
        Log.getInstance().d("Starts");
        pollingResult.setOperationType(operationType);
    }

    public PollingResult(){
        Log.getInstance().d("Starts");
        this.pollingResult = new com.pax.dal.entity.PollingResult();
    }


    public EReaderType getReaderType() {
        Log.getInstance().d("Starts");
        return pollingResult.getReaderType();
    }

    public void setReaderType(EReaderType readerType) {
        Log.getInstance().d("Starts");
        pollingResult.setReaderType(readerType);
    }

    public String getTrack1() {
        Log.getInstance().d("Starts");
        return this.pollingResult.getTrack1();
    }

    public void setTrack1(String track1) {
        Log.getInstance().d("Starts");
        this.pollingResult.setTrack1(track1);
    }

    public String getTrack2() {
        Log.getInstance().d("Starts");
        return this.pollingResult.getTrack2();
    }

    public void setTrack2(String track2) {
        Log.getInstance().d("Starts");
        this.pollingResult.setTrack2(track2);
    }

    public String getTrack3() {
        Log.getInstance().d("Starts");
        return this.pollingResult.getTrack3();
    }

    public void setTrack3(String track3) {
        Log.getInstance().d("Starts");
        this.pollingResult.setTrack3(track3);
    }

    public byte[] getSerialInfo() {
        Log.getInstance().d("Starts");
        return this.pollingResult.getSerialInfo();
    }

    public void setSerialInfo(byte[] serialInfo) {
        Log.getInstance().d("Starts");
        this.pollingResult.setSerialInfo(serialInfo);
    }

}
