package com.bytedance.sdk.openadsdk;

/* loaded from: classes.dex */
public class TTImage {
    private final String KS;
    private double jU;
    private final int lMd;
    private final int zp;

    public TTImage(int i9, int i10, String str, double d2) {
        this.zp = i9;
        this.lMd = i10;
        this.KS = str;
        this.jU = d2;
    }

    public double getDuration() {
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

    public boolean isValid() {
        String str;
        if (this.zp > 0 && this.lMd > 0 && (str = this.KS) != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public TTImage(int i9, int i10, String str) {
        this(i9, i10, str, 0.0d);
    }
}
