package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static MonitorCrash f6048a = null;
    private static int b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static int f6049c;

    public static MonitorCrash a() {
        if (f6048a == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(com.apm.insight.i.g(), "239017", 1030839L, "1.3.8.nourl-alpha.19", "com.apm.insight");
            f6048a = initSDK;
            initSDK.config().setChannel("release");
        }
        return f6048a;
    }

    private static boolean b() {
        if (b == -1) {
            b = 5;
        }
        int i9 = f6049c;
        if (i9 >= b) {
            return false;
        }
        f6049c = i9 + 1;
        return true;
    }

    public static void a(Throwable th, String str) {
        if (com.apm.insight.i.g() != null && b()) {
            a().reportCustomErr(str, "INNER", th);
        }
    }
}
