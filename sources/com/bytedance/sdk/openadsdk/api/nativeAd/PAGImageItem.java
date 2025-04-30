package com.bytedance.sdk.openadsdk.api.nativeAd;

/* loaded from: classes.dex */
public class PAGImageItem {
    private final String KS;
    private float jU;
    private final int lMd;
    private final int zp;

    public PAGImageItem(int i9, int i10, String str, float f9) {
        this.zp = i9;
        this.lMd = i10;
        this.KS = str;
        this.jU = f9;
    }

    public float getDuration() {
        return this.jU;
    }

    public int getHeight() {
        return this.zp;
    }

    public String getImageUrl() {
        return this.KS;
    }

    public int getWidth() {
        return this.lMd;
    }

    public PAGImageItem(int i9, int i10, String str) {
        this(i9, i10, str, 0.0f);
    }
}
