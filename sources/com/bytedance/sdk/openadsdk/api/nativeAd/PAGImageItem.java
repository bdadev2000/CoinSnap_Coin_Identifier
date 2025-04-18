package com.bytedance.sdk.openadsdk.api.nativeAd;

/* loaded from: classes.dex */
public class PAGImageItem {
    private float AlY;
    private final int Sg;
    private final int YFl;
    private final String tN;

    public PAGImageItem(int i10, int i11, String str, float f10) {
        this.YFl = i10;
        this.Sg = i11;
        this.tN = str;
        this.AlY = f10;
    }

    public float getDuration() {
        return this.AlY;
    }

    public int getHeight() {
        return this.YFl;
    }

    public String getImageUrl() {
        return this.tN;
    }

    public int getWidth() {
        return this.Sg;
    }

    public PAGImageItem(int i10, int i11, String str) {
        this(i10, i11, str, 0.0f);
    }
}
