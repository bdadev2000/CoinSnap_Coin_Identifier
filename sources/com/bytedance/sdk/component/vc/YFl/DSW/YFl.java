package com.bytedance.sdk.component.vc.YFl.DSW;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public class YFl {
    private static volatile Handler Sg = null;
    private static volatile HandlerThread YFl = null;
    private static int tN = 3000;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        YFl = handlerThread;
        handlerThread.start();
    }

    public static int Sg() {
        if (tN <= 0) {
            tN = 3000;
        }
        return tN;
    }

    public static Handler YFl() {
        if (YFl != null && YFl.isAlive()) {
            if (Sg == null) {
                synchronized (YFl.class) {
                    if (Sg == null) {
                        Sg = new Handler(YFl.getLooper());
                    }
                }
            }
        } else {
            synchronized (YFl.class) {
                if (YFl == null || !YFl.isAlive()) {
                    HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                    YFl = handlerThread;
                    handlerThread.start();
                    Sg = new Handler(YFl.getLooper());
                }
            }
        }
        return Sg;
    }
}
