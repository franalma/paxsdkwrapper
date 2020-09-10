package com.diusframi.tele.pax.sdk.gl.page;

import android.content.Context;
import android.graphics.Bitmap;

import com.diusframi.tele.logs.Log;
import com.pax.gl.page.IPage;


public class PaxGLPage  {

    private static Context context;
    public static com.pax.gl.page.PaxGLPage  getInstance(Context c){
        Log.getInstance().d("Starts");
        context = c;
        return com.pax.gl.page.PaxGLPage.getInstance(c);
    }

    public Bitmap pageToBitmap(IPage page, int pageWidth) {
        Log.getInstance().d("Starts");
        return com.pax.gl.page.PaxGLPage.getInstance(context).pageToBitmap(page, pageWidth);
    }

    public IPage createPage() {
        Log.getInstance().d("Starts");
        return com.pax.gl.page.PaxGLPage.getInstance(context).createPage();
    }


}
