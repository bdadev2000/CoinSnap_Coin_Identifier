package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int zp;

    public int getTimeout() {
        return this.zp;
    }

    public void setTimeout(int i9) {
        this.zp = i9;
    }
}
