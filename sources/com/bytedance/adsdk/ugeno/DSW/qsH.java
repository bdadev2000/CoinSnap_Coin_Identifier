package com.bytedance.adsdk.ugeno.DSW;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.TypedValue;

/* loaded from: classes.dex */
public class qsH {
    private static final Object Sg = new Object();
    public static Handler YFl = new Handler(Looper.getMainLooper());
    private static TypedValue tN;

    public static int Sg(Context context, float f10) {
        float f11 = context.getResources().getDisplayMetrics().density;
        if (f11 <= 0.0f) {
            f11 = 1.0f;
        }
        return (int) ((f10 / f11) + 0.5f);
    }

    public static float YFl(Context context, String str) {
        float f10;
        float f11 = context.getResources().getDisplayMetrics().density;
        try {
            f10 = Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            f10 = 0.0f;
        }
        return (f10 * f11) + 0.5f;
    }

    public static float YFl(Context context, float f10) {
        return (f10 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static Bitmap YFl(Context context, Bitmap bitmap, int i10) {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            RenderScript create = RenderScript.create(context);
            if (create == null) {
                return null;
            }
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(i10);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Drawable YFl(Context context, int i10) {
        return context.getDrawable(i10);
    }

    public static boolean YFl() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void YFl(Runnable runnable) {
        if (YFl()) {
            runnable.run();
        } else {
            YFl.post(runnable);
        }
    }
}
