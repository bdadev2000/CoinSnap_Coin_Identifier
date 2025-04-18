package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class DSW {
    private static volatile Handler YFl;

    public static Handler Sg() {
        if (YFl == null) {
            synchronized (DSW.class) {
                if (YFl == null) {
                    YFl = new Handler(Looper.getMainLooper());
                }
            }
        }
        return YFl;
    }

    public static Handler YFl() {
        return com.bytedance.sdk.component.qsH.YFl.YFl.YFl().Sg();
    }
}
