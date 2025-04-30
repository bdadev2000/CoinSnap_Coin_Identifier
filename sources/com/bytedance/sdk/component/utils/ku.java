package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class ku {
    private static volatile Handler zp;

    public static Handler lMd() {
        if (zp == null) {
            synchronized (ku.class) {
                try {
                    if (zp == null) {
                        zp = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public static Handler zp() {
        return com.bytedance.sdk.component.ku.zp.zp.zp().lMd();
    }
}
