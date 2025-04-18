package com.google.android.gms.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);

    private final int zzb;

    AdFormat(int i10) {
        this.zzb = i10;
    }

    @Nullable
    public static AdFormat getAdFormat(int i10) {
        for (AdFormat adFormat : values()) {
            if (adFormat.getValue() == i10) {
                return adFormat;
            }
        }
        return null;
    }

    public int getValue() {
        return this.zzb;
    }
}
