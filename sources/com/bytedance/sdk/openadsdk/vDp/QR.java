package com.bytedance.sdk.openadsdk.vDp;

/* loaded from: classes.dex */
public class QR {
    private static zp zp;

    /* loaded from: classes.dex */
    public interface zp {
        void zp(String str, String str2, Throwable th);
    }

    public static void zp(zp zpVar) {
        zp = zpVar;
    }

    public static boolean zp() {
        return zp != null;
    }

    public static void zp(String str, String str2, Throwable th) {
        if (zp == null) {
            return;
        }
        if (th == null) {
            th = new Throwable();
        }
        zp.zp(str, str2, th);
    }
}
