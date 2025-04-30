package com.bytedance.sdk.component.HWF.zp.QR;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class zp {
    private static int KS = 3000;
    private static volatile Handler lMd;
    private static volatile HandlerThread zp;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        zp = handlerThread;
        handlerThread.start();
    }

    public static int lMd() {
        if (KS <= 0) {
            KS = 3000;
        }
        return KS;
    }

    public static Handler zp() {
        if (zp != null && zp.isAlive()) {
            if (lMd == null) {
                synchronized (zp.class) {
                    try {
                        if (lMd == null) {
                            lMd = new Handler(zp.getLooper());
                        }
                    } finally {
                    }
                }
            }
        } else {
            synchronized (zp.class) {
                try {
                    if (zp != null) {
                        if (!zp.isAlive()) {
                        }
                    }
                    HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                    zp = handlerThread;
                    handlerThread.start();
                    lMd = new Handler(zp.getLooper());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return lMd;
    }
}
