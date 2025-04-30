package com.bytedance.sdk.openadsdk.core.model;

/* loaded from: classes.dex */
public class COT {
    public static int zp(int i9) {
        if (i9 <= 0) {
            return 0;
        }
        return i9 >= 11 ? i9 - 10 : i9;
    }
}
