package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* loaded from: classes.dex */
public class m {
    private static MonitorCrash a = null;

    /* renamed from: b, reason: collision with root package name */
    private static int f3338b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static int f3339c;

    public static MonitorCrash a() {
        if (a == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(com.apm.insight.i.g(), "239017", 1030842L, "1.3.8.nourl-alpha.22", "com.apm.insight");
            a = initSDK;
            initSDK.config().setChannel("release");
        }
        return a;
    }

    private static boolean b() {
        if (f3338b == -1) {
            f3338b = 5;
        }
        int i10 = f3339c;
        if (i10 >= f3338b) {
            return false;
        }
        f3339c = i10 + 1;
        return true;
    }

    public static void a(Throwable th2, String str) {
        if (com.apm.insight.i.g() != null && b()) {
            a().reportCustomErr(str, "INNER", th2);
        }
    }
}
