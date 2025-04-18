package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class pDU {
    private static volatile HandlerThread DSW = null;
    public static volatile boolean YFl = false;
    public static long wN;
    public static AtomicBoolean Sg = new AtomicBoolean(false);
    public static long tN = 0;

    /* renamed from: vc, reason: collision with root package name */
    private static volatile int f10719vc = 0;
    public static float AlY = 1.0f;
    private static volatile Handler qsH = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle", 10);
        DSW = handlerThread;
        handlerThread.start();
        wN = System.currentTimeMillis();
    }

    public static int AlY() {
        return f10719vc;
    }

    public static void DSW() {
        Sg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.pDU.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.rkt.tN.YFl(new com.bytedance.sdk.openadsdk.rkt.AlY() { // from class: com.bytedance.sdk.openadsdk.core.pDU.2.1
                        @Override // com.bytedance.sdk.openadsdk.rkt.AlY
                        public com.bytedance.sdk.openadsdk.rkt.Sg.YFl generatorModel() {
                            com.bytedance.sdk.openadsdk.rkt.Sg.YFl yFl = new com.bytedance.sdk.openadsdk.rkt.Sg.YFl();
                            yFl.Sg("init");
                            return yFl;
                        }
                    });
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("InitHelper", th2.getMessage());
                }
            }
        });
    }

    public static Handler Sg() {
        if (DSW != null && DSW.isAlive()) {
            if (qsH == null) {
                synchronized (pDU.class) {
                    if (qsH == null) {
                        qsH = new Handler(DSW.getLooper());
                    }
                }
            }
        } else {
            synchronized (pDU.class) {
                if (DSW == null || !DSW.isAlive()) {
                    HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                    DSW = handlerThread;
                    handlerThread.start();
                    qsH = new Handler(DSW.getLooper());
                }
            }
        }
        return qsH;
    }

    public static void YFl(long j3) {
        wN = j3;
    }

    public static Handler tN() {
        return new Handler(Looper.getMainLooper());
    }

    public static void vc() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - tN <= 10000) {
            return;
        }
        tN = elapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.mn.YFl(new com.bytedance.sdk.component.qsH.qsH("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.pDU.1
            @Override // java.lang.Runnable
            public void run() {
                String tN2 = com.bytedance.sdk.openadsdk.core.settings.rkt.tN(lG.YFl());
                if (!TextUtils.equals(tN2, com.bytedance.sdk.openadsdk.core.settings.rkt.AlY)) {
                    com.bytedance.sdk.openadsdk.core.settings.rkt.JwO().YFl(6, true);
                    com.bytedance.sdk.openadsdk.core.settings.rkt.AlY = tN2;
                }
            }
        });
    }

    public static boolean wN() {
        return AlY() == 1;
    }

    public static long YFl() {
        return wN;
    }

    public static void YFl(int i10) {
        f10719vc = i10;
    }

    public static void YFl(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if ("mediation".equals(jSONObject.optString("name", ""))) {
                    NjR.Sg().Sg(jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE, ""));
                    return;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("InitHelper", th2.getMessage());
        }
    }
}
