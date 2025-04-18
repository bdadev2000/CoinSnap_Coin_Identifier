package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;

/* renamed from: com.facebook.ads.redexgen.X.Fc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0525Fc extends AbstractC1156bi {
    public static String[] A02 = {"eAQfPHHoyWilLfBxOFaJj1G06pGOxPq", "94FVrmFRVghPmyms9ar5cFWRdDurlkVe", "0NqQX4CUu3LD8PHaDMvmRAbh4clEtoM7", "DpSRaNejvtQ52XA7I6oeLqqk6ldlwRKU", "AVeirdKHq7BiC91JmOFjEM59wAwHTkmS", "1THCMBeh6DIPctxeAaB65wntvUu4aFha", "yEsJBiLTEnojRHdtAiiv5fZXbmAhiMSc", "YuG6RWvr5fcVmyx3SnaQUPOafyGz2fG"};
    public C1146bY A00;
    public final C1136bO A01;

    public C0525Fc(C1136bO c1136bO, String str) {
        super(c1136bO.A0B, str, A00(c1136bO));
        this.A01 = c1136bO;
    }

    public static C1135bN A00(C1136bO c1136bO) {
        return new C1135bN(c1136bO);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1156bi
    public final void A08() {
        if (super.A01.A01) {
            this.A05.A5S();
        }
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AGM(EnumC02141z.A03);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1156bi
    public final void A09() {
        this.A00 = new C1146bY(this.A01, this, A04());
        this.A00.A0J(this.A01.A05, this.A01.A02, this.A01.A08);
    }

    public final void A0D(Ad ad, String str, AdExperienceType adExperienceType, boolean z2) {
        if (super.A00.A5z()) {
            return;
        }
        this.A01.A02(ad);
        if (this.A00 != null) {
            this.A00.A0J(str, adExperienceType, z2);
            return;
        }
        this.A01.A05 = str;
        this.A01.A02 = adExperienceType;
        this.A01.A08 = z2;
        if (AbstractC0610Ip.A07(this.A02) && AbstractC0610Ip.A09(this.A02)) {
            A05();
        } else {
            A09();
        }
    }

    public final void A0E(RewardData rewardData) {
        this.A01.A03 = rewardData;
        if (super.A01.A01) {
            super.A01.A0F(AdError.INTERNAL_ERROR_2003, C2K.A00(new Bundle(), rewardData));
        } else if (this.A00 != null) {
            this.A00.A0I(rewardData);
        }
    }

    public final boolean A0F() {
        if (this.A00 != null) {
            return this.A00.A0K();
        }
        return this.A01.A01 > 0 && C0687Lu.A00() > this.A01.A01;
    }

    public final boolean A0G() {
        if (this.A00 != null) {
            return this.A00.A0L();
        }
        return super.A00.A6J() == EnumC02141z.A05;
    }

    public final boolean A0H(Ad ad, RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        int A00 = ((AnonymousClass61) rewardedVideoShowAdConfig).A00();
        long A01 = ((AnonymousClass61) rewardedVideoShowAdConfig).A01();
        if (super.A00.A60()) {
            return false;
        }
        this.A01.A02(ad);
        String[] strArr = A02;
        String str = strArr[7];
        String str2 = strArr[0];
        int length = str.length();
        int appOrientation = str2.length();
        if (length == appOrientation) {
            String[] strArr2 = A02;
            strArr2[5] = "m9KaRECdYgffkM0tCirP5ynC5R03VfN7";
            strArr2[6] = "WVyWW47u948M29zNqYDy5rdzHxlGG88k";
            if (super.A01.A01) {
                A0A(A00);
                return true;
            }
            C1146bY c1146bY = this.A00;
            String[] strArr3 = A02;
            String str3 = strArr3[2];
            String str4 = strArr3[1];
            int charAt = str3.charAt(27);
            int appOrientation2 = str4.charAt(27);
            if (charAt != appOrientation2) {
                String[] strArr4 = A02;
                strArr4[7] = "SVQKcBS7FHKRAHC3EplGepZBNeGcwFJ";
                strArr4[0] = "IfCkczTPSOxE6DmqSLPQVuiWAstWVdL";
                if (c1146bY != null) {
                    return this.A00.A0M(A00, A01);
                }
                this.A00 = new C1146bY(this.A01, this, A04());
                this.A00.A0M(A00, A01);
                return false;
            }
        }
        throw new RuntimeException();
    }
}
