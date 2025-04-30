package com.meta.analytics.dsp.uinode;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.b9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1743b9 implements InterfaceC08000p {
    public int A00;
    public long A01;
    public RewardData A02;

    public abstract int A0G();

    public abstract C1F A0H();

    public abstract boolean A0I();

    public final void A00(int i9) {
        this.A00 = i9;
    }

    public final void A01(long j7) {
        this.A01 = j7;
    }

    public final void A02(RewardData rewardData) {
        this.A02 = rewardData;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC08000p
    public final AdPlacementType A7e() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
