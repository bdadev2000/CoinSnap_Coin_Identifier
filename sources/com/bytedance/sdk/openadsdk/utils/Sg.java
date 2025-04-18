package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public class Sg {
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.Wwa> YFl;

    public static com.bytedance.sdk.openadsdk.core.model.Wwa YFl() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.Wwa> softReference = YFl;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa) {
        if (wwa == null) {
            return;
        }
        YFl = new SoftReference<>(wwa);
    }
}
