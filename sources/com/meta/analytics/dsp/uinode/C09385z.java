package com.meta.analytics.dsp.uinode;

import com.facebook.ads.RewardedVideoAd;

/* renamed from: com.facebook.ads.redexgen.X.5z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09385z implements RewardedVideoAd.RewardedVideoAdShowConfigBuilder, RewardedVideoAd.RewardedVideoShowAdConfig {
    public int A00 = -1;
    public long A01;

    public final int A00() {
        return this.A00;
    }

    public final long A01() {
        return this.A01;
    }

    public final C09385z A02(long j7) {
        this.A01 = j7;
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder, com.facebook.ads.FullScreenAd.ShowConfigBuilder
    public final RewardedVideoAd.RewardedVideoShowAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdShowConfigBuilder
    public final RewardedVideoAd.RewardedVideoAdShowConfigBuilder withAppOrientation(int i9) {
        this.A00 = i9;
        return this;
    }
}
