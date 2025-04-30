package com.bytedance.adsdk.ugeno.lMd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class jU {

    @SuppressLint({"StaticFieldLeak"})
    private static Context KS;
    private static Resources lMd;
    private static String zp;

    public static int lMd(Context context, String str) {
        return zp(context, str, "drawable");
    }

    private static String zp(Context context) {
        if (zp == null) {
            zp = context.getPackageName();
        }
        return zp;
    }

    private static int zp(Context context, String str, String str2) {
        if (lMd == null) {
            lMd = context.getResources();
        }
        return lMd.getIdentifier(str, str2, zp(context));
    }

    public static Drawable zp(Context context, String str) {
        return context.getResources().getDrawable(lMd(context, str));
    }
}
