package com.bytedance.sdk.component.COT;

import com.bytedance.sdk.openadsdk.ats.ATSApi;
import com.bytedance.sdk.openadsdk.ats.ATSMethod;

@ATSApi
/* loaded from: classes.dex */
public interface KVG<T> {
    @ATSMethod(2)
    void zp(int i9, String str, Throwable th);

    @ATSMethod(1)
    void zp(Bj<T> bj);
}
