package com.bytedance.sdk.openadsdk.multipro;

import com.bytedance.sdk.openadsdk.core.KVG;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class jU {
    public static String zp = "com.bytedance.openadsdk";
    public static String lMd = AbstractC2914a.h(new StringBuilder("content://"), zp, ".TTMultiProvider");

    static {
        zp();
    }

    public static void zp() {
        if (KVG.zp() != null) {
            zp = KVG.zp().getPackageName();
            lMd = AbstractC2914a.h(new StringBuilder("content://"), zp, ".TTMultiProvider");
        }
    }
}
