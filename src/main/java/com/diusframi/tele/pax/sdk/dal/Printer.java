package com.diusframi.tele.pax.sdk.dal;

import android.graphics.Bitmap;

import com.diusframi.tele.logs.Log;
import com.pax.dal.IPrinter;
import com.pax.dal.entity.EFontTypeAscii;
import com.pax.dal.entity.EFontTypeExtCode;
import com.pax.dal.exceptions.PrinterDevException;

public class Printer {
    public IPrinter iPrinter;

    public void init() throws PrinterDevException{
        Log.getInstance().d("Starts");
        iPrinter.init();
    }

    public void fontSet(EFontTypeAscii var1, EFontTypeExtCode var2) throws PrinterDevException{
        Log.getInstance().d("Starts");
        iPrinter.fontSet(var1, var2);
    }

    public void spaceSet(byte var1, byte var2) throws PrinterDevException{
        Log.getInstance().d("Starts");
        iPrinter.spaceSet(var1, var2);
    }

    public void step(int var1) throws PrinterDevException{
        Log.getInstance().d("Starts");
        iPrinter.step(var1);
    }

    public void printStr(String var1, String var2) throws PrinterDevException{
        Log.getInstance().d("Starts");
        iPrinter.printStr(var1, var2);
    }

    public void printBitmap(Bitmap var1) throws PrinterDevException{
        Log.getInstance().d("Starts");
        iPrinter.printBitmap(var1);
    }

    public void printBitmapWithMonoThreshold(Bitmap var1, int var2) throws PrinterDevException{
        Log.getInstance().d("Starts");
        iPrinter.printBitmapWithMonoThreshold(var1, var2);
    }

    public int start() throws PrinterDevException{
        Log.getInstance().d("Starts");
        int res =  iPrinter.start();
        return res;
    }

    public int getStatus() throws PrinterDevException{
        Log.getInstance().d("Starts");
        int res =  iPrinter.getStatus();
        return res;
    }

    public void leftIndent(int var1) throws PrinterDevException{
        Log.getInstance().d("Starts");
        iPrinter.leftIndent(var1);
    }

    public int getDotLine() throws PrinterDevException{
        Log.getInstance().d("Starts");
        return iPrinter.getDotLine();
    }

    public void setGray(int var1) throws PrinterDevException{
        Log.getInstance().d("Starts");
        iPrinter.setGray(var1);
    }

    public void doubleWidth(boolean var1, boolean var2) throws PrinterDevException{
        Log.getInstance().d("Starts");
        iPrinter.doubleWidth(var1,var2);
    }

    public void doubleHeight(boolean var1, boolean var2) throws PrinterDevException{
        Log.getInstance().d("Starts");
        iPrinter.doubleHeight(var1, var2);
    }

    public void invert(boolean var1) throws PrinterDevException{
        Log.getInstance().d("Starts");
        iPrinter.invert(var1);
    }

    public void cutPaper(int var1) throws PrinterDevException{
        Log.getInstance().d("Starts");
        iPrinter.cutPaper(var1);
    }

    public int getCutMode() throws PrinterDevException{
        Log.getInstance().d("Starts");
       return iPrinter.getCutMode();
    }

    public void print(Bitmap var1, IPrinter.IPinterListener var2){
        Log.getInstance().d("Starts");
        iPrinter.print(var1, var2);
    }

    public void print(Bitmap var1, int var2, IPrinter.IPinterListener var3){
        Log.getInstance().d("Starts");
        iPrinter.print(var1, var3);
    }

    public void setFontPath(String var1) throws PrinterDevException{
        Log.getInstance().d("Starts");
        iPrinter.setFontPath(var1);
    }
}
