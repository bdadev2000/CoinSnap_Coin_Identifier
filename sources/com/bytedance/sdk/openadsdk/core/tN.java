package com.bytedance.sdk.openadsdk.core;

import android.content.Context;

/* loaded from: classes.dex */
public class tN {
    private static volatile tN YFl;

    private tN() {
    }

    public static tN YFl(Context context) {
        if (YFl == null) {
            synchronized (tN.class) {
                if (YFl == null) {
                    YFl = new tN();
                }
            }
        }
        return YFl;
    }

    public String Sg(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg("ttopenadsdk", str, str2);
    }

    public int Sg(String str, int i10) {
        return com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("ttopenadsdk", str, i10);
    }

    public Long Sg(String str, long j3) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("ttopenadsdk", str, j3));
    }

    public void YFl(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("ttopenadsdk", str, str2);
    }

    public void YFl(String str, int i10) {
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("ttopenadsdk", str, Integer.valueOf(i10));
    }

    public void YFl(String str, long j3) {
        com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("ttopenadsdk", str, Long.valueOf(j3));
    }
}
