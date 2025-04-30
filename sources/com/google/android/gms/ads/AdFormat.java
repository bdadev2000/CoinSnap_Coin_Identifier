package com.google.android.gms.ads;

/* loaded from: classes2.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);

    private final int zzb;

    AdFormat(int i9) {
        this.zzb = i9;
    }

    public int getValue() {
        return this.zzb;
    }
}
