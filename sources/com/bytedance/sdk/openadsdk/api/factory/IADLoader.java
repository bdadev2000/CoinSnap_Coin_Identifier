package com.bytedance.sdk.openadsdk.api.factory;

import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.common.wN;

/* loaded from: classes.dex */
public interface IADLoader<R extends PAGRequest, L extends wN> {
    void loadAd(String str, R r6, L l10);
}
