package com.bytedance.sdk.openadsdk.core;

import android.content.Context;

/* loaded from: classes.dex */
public class KS {
    private static volatile KS zp;

    private KS() {
    }

    public static KS zp(Context context) {
        if (zp == null) {
            synchronized (KS.class) {
                try {
                    if (zp == null) {
                        zp = new KS();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zp;
    }

    public String lMd(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.jU.jU.lMd("ttopenadsdk", str, str2);
    }

    public int lMd(String str, int i9) {
        return com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("ttopenadsdk", str, i9);
    }

    public Long lMd(String str, long j7) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("ttopenadsdk", str, j7));
    }

    public void zp(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("ttopenadsdk", str, str2);
    }

    public void zp(String str, int i9) {
        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("ttopenadsdk", str, Integer.valueOf(i9));
    }

    public void zp(String str, long j7) {
        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("ttopenadsdk", str, Long.valueOf(j7));
    }
}
