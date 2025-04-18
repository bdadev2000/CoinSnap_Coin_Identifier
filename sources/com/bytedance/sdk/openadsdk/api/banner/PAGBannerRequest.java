package com.bytedance.sdk.openadsdk.api.banner;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* loaded from: classes.dex */
public class PAGBannerRequest extends PAGRequest {
    private PAGBannerSize YFl;

    public PAGBannerRequest(PAGBannerSize pAGBannerSize) {
        this.YFl = pAGBannerSize;
    }

    public PAGBannerSize getAdSize() {
        return this.YFl;
    }

    public void setAdSize(PAGBannerSize pAGBannerSize) {
        this.YFl = pAGBannerSize;
    }
}
