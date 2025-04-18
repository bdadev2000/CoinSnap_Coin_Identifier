package com.instagram.common.viewpoint.core;

import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.cH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1191cH implements InterfaceC01780p {
    public int A00;
    public long A01;
    public RewardData A02;

    public abstract int A0G();

    public abstract C1E A0H();

    public abstract boolean A0I();

    public final void A00(int i2) {
        this.A00 = i2;
    }

    public final void A01(long j2) {
        this.A01 = j2;
    }

    public final void A02(RewardData rewardData) {
        this.A02 = rewardData;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC01780p
    public final AdPlacementType A82() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
