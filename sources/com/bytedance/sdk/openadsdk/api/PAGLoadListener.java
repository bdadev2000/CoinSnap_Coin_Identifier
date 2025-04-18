package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.wN;

/* loaded from: classes.dex */
public interface PAGLoadListener<Ad> extends wN {
    void onAdLoaded(Ad ad2);

    @Override // com.bytedance.sdk.openadsdk.common.wN
    void onError(int i10, String str);
}
