package com.vungle.ads;

/* loaded from: classes3.dex */
public enum C {
    VUNGLE_MREC("mrec", 300, 250),
    BANNER("banner", 320, 50),
    BANNER_SHORT("banner_short", 300, 50),
    BANNER_LEADERBOARD("banner_leaderboard", 728, 90);

    private final int height;
    private final String sizeName;
    private final int width;

    C(String str, int i9, int i10) {
        this.sizeName = str;
        this.width = i9;
        this.height = i10;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getSizeName() {
        return this.sizeName;
    }

    public final int getWidth() {
        return this.width;
    }
}
