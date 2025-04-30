package com.bytedance.sdk.component.HWF.zp;

/* loaded from: classes.dex */
public class KS {
    public static void zp(Object obj, String str) {
        if (obj == null) {
            zp(str);
        }
    }

    public static void zp(String str) {
        throw new IllegalArgumentException(str);
    }
}
