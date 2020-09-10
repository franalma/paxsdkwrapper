package com.diusframi.tele.pax.sdk.dal.entity;

import com.diusframi.tele.logs.Log;

public class PiccCardInfo extends com.pax.dal.entity.PiccCardInfo {

    public PiccCardInfo() {
        super();
        Log.getInstance().d("Starts");
    }

    public PiccCardInfo(byte cardType, byte[] serialInfo, byte cid, byte[] other) {
        super(cardType, serialInfo, cid, other);
        Log.getInstance().d("Starts");
    }

    public byte getCardType() {
        Log.getInstance().d("Starts");
        return super.getCardType();

    }

    public void setCardType(byte cardType) {
        super.setCardType(cardType);
        Log.getInstance().d("Starts");

    }

    public byte[] getSerialInfo() {
        Log.getInstance().d("Starts");
        return super.getSerialInfo();
    }

    public void setSerialInfo(byte[] serialInfo) {
        super.setSerialInfo(serialInfo);
        Log.getInstance().d("Starts");
    }

    public byte getCID() {
        Log.getInstance().d("Starts");
        return super.getCID();
    }

    public void setCID(byte cID) {
        super.setCID(cID);
        Log.getInstance().d("Starts");
    }

    public byte[] getOther() {
        Log.getInstance().d("Starts");
        return super.getOther();
    }

    public void setOther(byte[] other) {
        super.setOther(other);
        Log.getInstance().d("Starts");
    }

}
