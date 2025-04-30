package com.bytedance.sdk.openadsdk.api.banner;

/* loaded from: classes.dex */
public final class PAGBannerSize {
    private final int lMd;
    private final int zp;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i9, int i10) {
        this.zp = i9;
        this.lMd = i10;
    }

    public int getHeight() {
        return this.lMd;
    }

    public int getWidth() {
        return this.zp;
    }
}
