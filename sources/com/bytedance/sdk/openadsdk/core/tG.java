package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.QUv;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class tG {
    public static long COT = 0;
    private static volatile HandlerThread QR = null;
    public static volatile boolean zp = false;
    public static AtomicBoolean lMd = new AtomicBoolean(false);
    public static long KS = 0;
    private static volatile int HWF = 0;
    public static float jU = 1.0f;
    private static volatile Handler ku = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle", 10);
        QR = handlerThread;
        handlerThread.start();
        COT = System.currentTimeMillis();
    }

    public static boolean COT() {
        if (jU() == 1) {
            return true;
        }
        return false;
    }

    public static void HWF() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - KS <= 10000) {
            return;
        }
        KS = elapsedRealtime;
        QUv.zp(new com.bytedance.sdk.component.ku.ku("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.tG.1
            @Override // java.lang.Runnable
            public void run() {
                String KS2 = com.bytedance.sdk.openadsdk.core.settings.dQp.KS(KVG.zp());
                if (!TextUtils.equals(KS2, com.bytedance.sdk.openadsdk.core.settings.dQp.zp)) {
                    com.bytedance.sdk.openadsdk.core.settings.dQp.etV().zp(6, true);
                    com.bytedance.sdk.openadsdk.core.settings.dQp.zp = KS2;
                }
            }
        });
    }

    public static Handler KS() {
        return new Handler(Looper.getMainLooper());
    }

    public static int jU() {
        return HWF;
    }

    public static Handler lMd() {
        if (QR != null && QR.isAlive()) {
            if (ku == null) {
                synchronized (tG.class) {
                    try {
                        if (ku == null) {
                            ku = new Handler(QR.getLooper());
                        }
                    } finally {
                    }
                }
            }
        } else {
            synchronized (tG.class) {
                try {
                    if (QR != null) {
                        if (!QR.isAlive()) {
                        }
                    }
                    HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                    QR = handlerThread;
                    handlerThread.start();
                    ku = new Handler(QR.getLooper());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ku;
    }

    public static void zp(long j7) {
        COT = j7;
    }

    public static long zp() {
        return COT;
    }

    public static void zp(int i9) {
        HWF = i9;
    }
}
