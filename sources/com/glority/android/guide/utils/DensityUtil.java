package com.glority.android.guide.utils;

import android.content.Context;

/* loaded from: classes3.dex */
public final class DensityUtil {
    public static int dip2px(Context context, float f) {
        return (int) ((f * (context != null ? context.getResources().getDisplayMetrics().density : 2.0f)) + 0.5f);
    }

    public static int px2dip(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
