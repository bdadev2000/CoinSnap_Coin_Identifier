package com.bytedance.adsdk.ugeno.DSW;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class AlY {
    private static Resources Sg;
    private static String YFl;

    @SuppressLint({"StaticFieldLeak"})
    private static Context tN;

    public static void YFl(String str) {
        YFl = str;
    }

    private static String YFl(Context context) {
        if (YFl == null) {
            YFl = context.getPackageName();
        }
        return YFl;
    }

    private static int YFl(Context context, String str, String str2) {
        if (Sg == null) {
            Sg = context.getResources();
        }
        return Sg.getIdentifier(str, str2, YFl(context));
    }

    public static int YFl(Context context, String str) {
        return YFl(context, str, "drawable");
    }
}
