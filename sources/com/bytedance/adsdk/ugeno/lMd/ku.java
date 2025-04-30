package com.bytedance.adsdk.ugeno.lMd;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* loaded from: classes.dex */
public class ku {
    public static int lMd(Context context, float f9) {
        float f10 = context.getResources().getDisplayMetrics().density;
        if (f10 <= 0.0f) {
            f10 = 1.0f;
        }
        return (int) ((f9 / f10) + 0.5f);
    }

    public static float zp(Context context, String str) {
        float f9;
        float f10 = context.getResources().getDisplayMetrics().density;
        try {
            f9 = Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            f9 = 0.0f;
        }
        return (f9 * f10) + 0.5f;
    }

    public static float zp(Context context, float f9) {
        return (f9 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static Bitmap zp(Context context, Bitmap bitmap, int i9) {
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            if (create == null) {
                return null;
            }
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(i9);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }
}
