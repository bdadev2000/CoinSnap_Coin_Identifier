package com.mbridge.msdk.dycreator.e;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public final class e {
    public static int a(Context context, float f9) {
        return (int) ((f9 / a(context).density) + 0.5f);
    }

    public static DisplayMetrics a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }
}
