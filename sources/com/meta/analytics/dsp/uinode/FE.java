package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import com.facebook.ads.Ad;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* loaded from: assets/audience_network.dex */
public final class FE extends AbstractC1708aa {
    public static String[] A02 = {"6CKGqR2K2MH05agWbJN3ka4F1ij3xhtD", "25gFyXHUhXKi43K8KJ4chgoS7w07JQQZ", "vjdmG7Wc53PSGoj25veSMfUO8xL7SxfR", "TQa00i6LjIP9KGMZzj8Rx2HUQjG1dRa1", "ap4e45gngLG", "PTi4Abr85pNMPfkRgyZo1NxbOs1aDg0f", "O7pu2EfbMgektne8Y3vUNLOEHbflJ4Uv", "IlEhKaiOmMN"};
    public C1698aQ A00;
    public final C2F A01;

    public FE(C2F c2f, String str) {
        super(c2f.A0B, str, A00(c2f));
        this.A01 = c2f;
    }

    public static C1690aI A00(C2F c2f) {
        return new C1690aI(c2f);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1708aa
    public final void A08() {
        if (super.A01.A01) {
            this.A05.A56();
        }
        C1698aQ c1698aQ = this.A00;
        if (c1698aQ != null) {
            c1698aQ.destroy();
        }
        super.A00.AFw(AnonymousClass20.A04);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC1708aa
    public final void A09() {
        C1698aQ c1698aQ = new C1698aQ(this.A01, this, A04());
        this.A00 = c1698aQ;
        c1698aQ.A0J(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    public final void A0D(Ad ad, String str, AdExperienceType adExperienceType, boolean z8) {
        if (super.A00.A5d()) {
            return;
        }
        this.A01.A03(ad);
        C1698aQ c1698aQ = this.A00;
        if (c1698aQ != null) {
            c1698aQ.A0J(str, adExperienceType, z8);
            String[] strArr = A02;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "snzzAybKLkKRz85P4BzzU6VwJ24uwEo8";
            strArr2[1] = "iwkpZYLOXs3iYxZlCgOD0Nxy0vDnSGoK";
            return;
        }
        this.A01.A05 = str;
        this.A01.A02 = adExperienceType;
        this.A01.A08 = z8;
        if (AbstractC1227Ik.A07(this.A02) && AbstractC1227Ik.A09(this.A02)) {
            A05();
        } else {
            A09();
        }
    }

    public final void A0E(RewardData rewardData) {
        this.A01.A03 = rewardData;
        if (super.A01.A01) {
            super.A01.A0F(2003, C2M.A00(new Bundle(), rewardData));
            return;
        }
        C1698aQ c1698aQ = this.A00;
        if (c1698aQ != null) {
            c1698aQ.A0I(rewardData);
        }
    }

    public final boolean A0F() {
        C1698aQ c1698aQ = this.A00;
        if (c1698aQ != null) {
            return c1698aQ.A0K();
        }
        return this.A01.A01 > 0 && C1294Lf.A00() > this.A01.A01;
    }

    public final boolean A0G() {
        C1698aQ c1698aQ = this.A00;
        if (c1698aQ != null) {
            return c1698aQ.A0L();
        }
        return super.A00.A5v() == AnonymousClass20.A06;
    }

    public final boolean A0H(Ad ad, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int A00 = ((C09385z) rewardedVideoShowAdConfig).A00();
        long A01 = ((C09385z) rewardedVideoShowAdConfig).A01();
        if (super.A00.A5e()) {
            return false;
        }
        this.A01.A03(ad);
        if (super.A01.A01) {
            A0A(A00);
            return true;
        }
        C1698aQ c1698aQ = this.A00;
        if (c1698aQ != null) {
            return c1698aQ.A0M(A00, A01);
        }
        C1698aQ c1698aQ2 = new C1698aQ(this.A01, this, A04());
        this.A00 = c1698aQ2;
        c1698aQ2.A0M(A00, A01);
        return false;
    }
}
