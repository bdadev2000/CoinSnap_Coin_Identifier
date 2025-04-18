package com.instagram.common.viewpoint.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ba, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1148ba extends AbstractC01790q {
    public static byte[] A01;
    public final /* synthetic */ C1146bY A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, 24, 1, 36, 40, 41, 51, 53, 40, 43, 43, 34, 53, 103, 46, 52, 103, 41, 50, 43, 43};
    }

    public C1148ba(C1146bY c1146bY) {
        this.A00 = c1146bY;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j2;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A03;
            AnonymousClass61 anonymousClass61 = (AnonymousClass61) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j2 = this.A00.A02;
            anonymousClass61.A02(currentTimeMillis - j2);
            rewardedVideoAd3 = this.A00.A03;
            rewardedVideoAd3.show(anonymousClass61.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1136bO c1136bO;
        this.A00.A07.A0E().A35();
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c1136bO = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onAdClicked(c1136bO.A6E());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1136bO c1136bO;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c1136bO = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(c1136bO.A6E());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0F(InterfaceC01780p interfaceC01780p) {
        C0527Fe c0527Fe;
        C1136bO c1136bO;
        C1136bO c1136bO2;
        C0527Fe c0527Fe2;
        C1E c1e;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1136bO c1136bO3;
        C1E c1e2;
        RewardedVideoAd rewardedVideoAd2;
        C1E c1e3;
        C1136bO c1136bO4;
        RewardedVideoAd rewardedVideoAd3;
        C1E c1e4;
        C1136bO c1136bO5;
        C1136bO c1136bO6;
        C1136bO c1136bO7;
        C1E c1e5;
        C1136bO c1136bO8;
        c0527Fe = this.A00.A05;
        if (c0527Fe == null) {
            this.A00.A07.A07().AA0(A00(0, 3, 67), C8E.A0N, new C8F(A00(3, 18, 108)));
            return;
        }
        AbstractC1191cH abstractC1191cH = (AbstractC1191cH) interfaceC01780p;
        c1136bO = this.A00.A09;
        if (c1136bO.A03 != null) {
            c1136bO8 = this.A00.A09;
            abstractC1191cH.A02(c1136bO8.A03);
        }
        c1136bO2 = this.A00.A09;
        c1136bO2.A00 = abstractC1191cH.A0G();
        this.A00.A06 = true;
        C1146bY c1146bY = this.A00;
        c0527Fe2 = this.A00.A05;
        c1146bY.A04 = c0527Fe2.A0H();
        c1e = this.A00.A04;
        if (c1e != null) {
            int i2 = 0;
            c1e4 = this.A00.A04;
            if (!c1e4.A15()) {
                c1e5 = this.A00.A04;
                i2 = ((AbstractC1187cD) c1e5).A1N();
            }
            if (i2 > 0) {
                L6 l6 = new L6();
                C1045Zs c1045Zs = this.A00.A07;
                c1136bO5 = this.A00.A09;
                if (l6.A09(c1045Zs, c1136bO5.A06, i2)) {
                    l6.A08(this.A00.A07, true);
                    C1146bY c1146bY2 = this.A00;
                    C1045Zs c1045Zs2 = this.A00.A07;
                    c1136bO6 = this.A00.A09;
                    String str = c1136bO6.A0D;
                    c1136bO7 = this.A00.A09;
                    c1146bY2.A03 = l6.A07(c1045Zs2, str, c1136bO7.A06);
                } else {
                    l6.A08(this.A00.A07, false);
                }
            }
        }
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            c1136bO3 = this.A00.A09;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(c1136bO3.A6E());
            return;
        }
        c1e2 = this.A00.A04;
        ((AbstractC1187cD) c1e2).A1Z(true);
        rewardedVideoAd2 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        c1e3 = this.A00.A04;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(c1e3.A0W());
        c1136bO4 = this.A00.A09;
        RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(c1136bO4.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.24
            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(Ad ad) {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(Ad ad) {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C1136bO c1136bO9;
                s2SRewardedVideoAdExtendedListener2 = C1148ba.this.A00.A08;
                c1136bO9 = C1148ba.this.A00.A09;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(c1136bO9.A6E());
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(Ad ad, AdError adError) {
                C1E c1e6;
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C1136bO c1136bO9;
                C1148ba.this.A00.A03 = null;
                c1e6 = C1148ba.this.A00.A04;
                ((AbstractC1187cD) c1e6).A1Z(false);
                s2SRewardedVideoAdExtendedListener2 = C1148ba.this.A00.A08;
                c1136bO9 = C1148ba.this.A00.A09;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(c1136bO9.A6E());
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(Ad ad) {
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoClosed() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C1148ba.this.A00.A08;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoClosed();
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoCompleted() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C1148ba.this.A00.A08;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoCompleted();
            }
        }).build();
        rewardedVideoAd3 = this.A00.A03;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0G(C0625Jg c0625Jg) {
        C1136bO c1136bO;
        long j2;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1136bO c1136bO2;
        this.A00.A0D(true);
        c1136bO = this.A00.A09;
        C0S A0E = c1136bO.A0B.A0E();
        j2 = this.A00.A01;
        A0E.A38(C0687Lu.A01(j2), c0625Jg.A03().getErrorCode(), c0625Jg.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c1136bO2 = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onError(c1136bO2.A6E(), L8.A00(c0625Jg));
    }
}
