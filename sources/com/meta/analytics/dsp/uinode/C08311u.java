package com.meta.analytics.dsp.uinode;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.1u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C08311u {
    public int A00;
    public long A01;
    public RewardData A02;
    public JL A03;
    public String A04;
    public String A05;
    public boolean A06;
    public final C8Z A07;
    public final EnumC1244Je A08;
    public final EnumC1246Jg A09;
    public final String A0A;
    public final EnumSet<CacheFlag> A0B;
    public final int A0C;
    public final AdPlacementType A0D;

    public C08311u(String str, EnumC1246Jg enumC1246Jg, AdPlacementType adPlacementType, EnumC1244Je enumC1244Je, int i9, C8Z c8z) {
        this(str, enumC1246Jg, adPlacementType, enumC1244Je, i9, EnumSet.of(CacheFlag.NONE), c8z);
    }

    public C08311u(String str, EnumC1246Jg enumC1246Jg, AdPlacementType adPlacementType, EnumC1244Je enumC1244Je, int i9, EnumSet<CacheFlag> cacheFlags, C8Z c8z) {
        this.A0A = str;
        this.A0D = adPlacementType;
        this.A08 = enumC1244Je;
        this.A0C = i9;
        this.A0B = cacheFlags;
        this.A09 = enumC1246Jg;
        this.A00 = -1;
        this.A07 = c8z;
    }

    public final AdPlacementType A00() {
        AdPlacementType adPlacementType = this.A0D;
        if (adPlacementType != null) {
            return adPlacementType;
        }
        EnumC1244Je enumC1244Je = this.A08;
        if (enumC1244Je == null) {
            return AdPlacementType.NATIVE;
        }
        if (enumC1244Je == EnumC1244Je.A07) {
            return AdPlacementType.INTERSTITIAL;
        }
        return AdPlacementType.BANNER;
    }

    public final K1 A01(C1636Yn c1636Yn, C1251Jl c1251Jl, AdExperienceType adExperienceType) {
        String str = this.A0A;
        EnumC1244Je enumC1244Je = this.A08;
        return new K1(c1636Yn, str, enumC1244Je != null ? new LQ(enumC1244Je.A03(), this.A08.A02()) : null, this.A09, this.A0C, c1251Jl, LW.A01(C1225Ih.A0J(c1636Yn)), this.A04, adExperienceType != null ? adExperienceType.getAdExperienceType() : null, this.A07);
    }

    public final void A02(int i9) {
        this.A00 = i9;
    }

    public final void A03(long j7) {
        this.A01 = j7;
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

    public final void A08(boolean z8) {
        this.A06 = z8;
    }
}
