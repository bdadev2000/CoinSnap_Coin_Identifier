package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class lMd {
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.woN> zp;

    public static com.bytedance.sdk.openadsdk.core.model.woN zp() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.woN> softReference = zp;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void zp(com.bytedance.sdk.openadsdk.core.model.woN won) {
        if (won == null) {
            return;
        }
        zp = new SoftReference<>(won);
    }
}
