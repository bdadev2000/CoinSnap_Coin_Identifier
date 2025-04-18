package com.bytedance.sdk.openadsdk;

/* loaded from: classes.dex */
public class TTImage {
    private double AlY;
    private final int Sg;
    private final int YFl;
    private final String tN;

    public TTImage(int i10, int i11, String str, double d10) {
        this.YFl = i10;
        this.Sg = i11;
        this.tN = str;
        this.AlY = d10;
    }

    public double getDuration() {
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

    public boolean isValid() {
        String str;
        return this.YFl > 0 && this.Sg > 0 && (str = this.tN) != null && str.length() > 0;
    }

    public TTImage(int i10, int i11, String str) {
        this(i10, i11, str, 0.0d);
    }
}
