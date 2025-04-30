package com.bytedance.sdk.openadsdk.api.factory;

import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.common.KS;

/* loaded from: classes.dex */
public interface IADLoader<R extends PAGRequest, L extends KS> {
    void loadAd(String str, R r9, L l);
}
