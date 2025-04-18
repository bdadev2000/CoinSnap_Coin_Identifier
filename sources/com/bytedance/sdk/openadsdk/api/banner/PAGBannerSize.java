package com.bytedance.sdk.openadsdk.api.banner;

/* loaded from: classes.dex */
public final class PAGBannerSize {
    private final int Sg;
    private final int YFl;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(320, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i10, int i11) {
        this.YFl = i10;
        this.Sg = i11;
    }

    public int getHeight() {
        return this.Sg;
    }

    public int getWidth() {
        return this.YFl;
    }
}
