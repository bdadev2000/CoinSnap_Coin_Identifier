package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.KS;

/* loaded from: classes.dex */
public interface PAGLoadListener<Ad> extends KS {
    void onAdLoaded(Ad ad);

    @Override // com.bytedance.sdk.openadsdk.common.KS
    void onError(int i9, String str);
}
