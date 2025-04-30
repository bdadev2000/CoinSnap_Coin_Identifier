package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize zp;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.zp = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.zp;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.zp = pAGBannerSize;
    }
}
