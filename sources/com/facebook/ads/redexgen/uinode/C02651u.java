package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.1u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02651u {
    public int A00;
    public long A01;
    public RewardData A02;
    public JL A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final C8Z A07;
    public final EnumC0678Je A08;
    public final EnumC0680Jg A09;
    public final String A0A;
    public final EnumSet<CacheFlag> A0B;
    public final int A0C;
    public final AdPlacementType A0D;

    public C02651u(String str, EnumC0680Jg enumC0680Jg, AdPlacementType adPlacementType, EnumC0678Je enumC0678Je, int i10, C8Z c8z) {
        this(str, enumC0680Jg, adPlacementType, enumC0678Je, i10, EnumSet.of(CacheFlag.NONE), c8z);
    }

    public C02651u(String str, EnumC0680Jg enumC0680Jg, AdPlacementType adPlacementType, EnumC0678Je enumC0678Je, int i10, EnumSet<CacheFlag> cacheFlags, C8Z c8z) {
        this.A0A = str;
        this.A0D = adPlacementType;
        this.A08 = enumC0678Je;
        this.A0C = i10;
        this.A0B = cacheFlags;
        this.A09 = enumC0680Jg;
        this.A00 = -1;
        this.A07 = c8z;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0D;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        EnumC0678Je enumC0678Je = this.A08;
        if (enumC0678Je == null) {
            return AdPlacementType.NATIVE;
        }
        if (enumC0678Je == EnumC0678Je.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final K1 A01(C1070Yn c1070Yn, C0685Jl c0685Jl, AdExperienceType adExperienceType) {
        String str = this.A0A;
        EnumC0678Je enumC0678Je = this.A08;
        return new K1(c1070Yn, str, enumC0678Je != null ? new LQ(enumC0678Je.A03(), this.A08.A02()) : null, this.A09, this.A0C, c0685Jl, LW.A01(C0659Ih.A0J(c1070Yn)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null, this.A07);
    }

    public final void A02(int i10) {
        this.A00 = i10;
    }

    public final void A03(long j3) {
        this.A01 = j3;
    }

    public final void A04(RewardData rewardData) {
        this.A02 = rewardData;
    }

    public final void A05(JL jl) {
        this.A03 = jl;
    }

    public final void A06(String str) {
        this.A04 = str;
    }

    public final void A07(String str) {
        this.A05 = str;
    }

    public final void A08(boolean z10) {
        this.A06 = z10;
    }
}
