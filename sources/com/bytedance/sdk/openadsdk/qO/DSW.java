package com.bytedance.sdk.openadsdk.qO;

/* loaded from: classes.dex */
public class DSW {
    private static YFl YFl;

    /* loaded from: classes.dex */
    public interface YFl {
        void YFl(String str, String str2, Throwable th2);
    }

    public static void YFl(YFl yFl) {
        YFl = yFl;
    }

    public static boolean YFl() {
        return YFl != null;
    }

    public static void YFl(String str, String str2, Throwable th2) {
        if (YFl == null) {
            return;
        }
        if (th2 == null) {
            th2 = new Throwable();
        }
        YFl.YFl(str, str2, th2);
    }
}
