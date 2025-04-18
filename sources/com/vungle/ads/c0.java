package com.vungle.ads;

/* loaded from: classes4.dex */
public enum c0 {
    VUNGLE_MREC("mrec", 300, 250),
    BANNER("banner", 320, 50),
    BANNER_SHORT("banner_short", 300, 50),
    BANNER_LEADERBOARD("banner_leaderboard", 728, 90);

    private final int height;
    private final String sizeName;
    private final int width;

    c0(String str, int i10, int i11) {
        this.sizeName = str;
        this.width = i10;
        this.height = i11;
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
