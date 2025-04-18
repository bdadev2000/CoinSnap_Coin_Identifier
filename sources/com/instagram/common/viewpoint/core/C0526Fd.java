package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardData;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0526Fd extends AbstractC1156bi {
    public static final AnonymousClass25 A02 = new C1143bV();
    public C1149bb A00;
    public final C1145bX A01;

    public C0526Fd(C1145bX c1145bX, String str) {
        super(c1145bX.A05(), str, A02.A53(c1145bX));
        this.A01 = c1145bX;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1156bi
    public final void A08() {
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AGM(EnumC02141z.A03);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1156bi
    public final void A09() {
        this.A00 = new C1149bb(this.A01, this, A04());
        this.A00.A0G(this.A01.A0B(), this.A01.A07());
    }

    public final void A0D(InterstitialAd interstitialAd, EnumSet<CacheFlag> cacheFlags, String str) {
        if (super.A00.A5z()) {
            return;
        }
        this.A01.A0D(interstitialAd);
        if (this.A00 != null) {
            this.A00.A0G(cacheFlags, str);
            return;
        }
        this.A01.A0K(cacheFlags);
        this.A01.A0H(str);
        if (AbstractC0610Ip.A07(this.A02) && AbstractC0610Ip.A08(this.A02)) {
            A05();
        } else {
            A09();
        }
    }

    public final void A0E(RewardData rewardData) {
        this.A01.A0F(rewardData);
        if (super.A01.A01) {
            super.A01.A0F(1013, C2K.A00(new Bundle(), rewardData));
        }
    }

    public final boolean A0F() {
        if (this.A00 != null) {
            return this.A00.A0H();
        }
        return this.A01.A00() > 0 && C0687Lu.A00() > this.A01.A00();
    }

    public final boolean A0G() {
        if (this.A00 != null) {
            return this.A00.A0I();
        }
        return super.A00.A6J() == EnumC02141z.A05;
    }

    public final boolean A0H(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A60()) {
            return false;
        }
        this.A01.A0D(interstitialAd);
        if (super.A01.A01) {
            A0A(-1);
            return true;
        }
        if (this.A00 != null) {
            return this.A00.A0J();
        }
        this.A00 = new C1149bb(this.A01, this, A04());
        this.A00.A0J();
        return false;
    }
}
