package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.bd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1151bd extends AbstractC01790q {
    public static byte[] A01;
    public static String[] A02 = {"swComlxz6aoGHqKS8LOj1g5iAOstdInC", "iLoXwxITRpbgZFbT1koR1uJW4vvDXY2W", "MpkXHfR6HdYIg9t449R", "HQI6v11U6roDlbOuDHGyMjhCWVrAbgmk", "qsbQ14vrFuO8q1N0nwgFIOsRNgh3HWyt", "NXqrvE65RyYHWICx", "E9yzS8MfEszoKvwo", "osh9YHk0bwFUuMRHqHbnPk"};
    public final /* synthetic */ C1149bb A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 112, 105, 47, 35, 34, 56, 62, 35, 32, 32, 41, 62, 108, 37, Utf8.REPLACEMENT_BYTE, 108, 34, 57, 32, 32};
    }

    static {
        A01();
    }

    public C1151bd(C1149bb c1149bb) {
        this.A00 = c1149bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A04 = false;
            interstitialAdExtendedListener = this.A00.A07;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C0531Fi c0531Fi;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1145bX c1145bX;
        C0531Fi c0531Fi2;
        C0531Fi c0531Fi3;
        C0531Fi c0531Fi4;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        c0531Fi = this.A00.A03;
        if (c0531Fi != null && C0608Im.A22(this.A00.A06)) {
            c0531Fi2 = this.A00.A03;
            c0531Fi2.A0R(new C1152be(this));
            c0531Fi3 = this.A00.A03;
            c0531Fi3.A0M();
            c0531Fi4 = this.A00.A03;
            c0531Fi4.A0J();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        c1145bX = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1145bX.A6E());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1145bX c1145bX;
        interstitialAdExtendedListener = this.A00.A07;
        c1145bX = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(c1145bX.A6E());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1145bX c1145bX;
        this.A00.A06.A0E().A35();
        interstitialAdExtendedListener = this.A00.A07;
        c1145bX = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(c1145bX.A6E());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1145bX c1145bX;
        interstitialAdExtendedListener = this.A00.A07;
        c1145bX = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(c1145bX.A6E());
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0E(View view) {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0F(InterfaceC01780p interfaceC01780p) {
        C0531Fi c0531Fi;
        C0531Fi c0531Fi2;
        C1E c1e;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1145bX c1145bX;
        C1E c1e2;
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener2;
        C1145bX c1145bX2;
        InterstitialAdExtendedListener interstitialAdExtendedListener3;
        C1145bX c1145bX3;
        InterstitialAd interstitialAd2;
        C1145bX c1145bX4;
        C1145bX c1145bX5;
        InterstitialAd interstitialAd3;
        C1145bX c1145bX6;
        C1145bX c1145bX7;
        C1145bX c1145bX8;
        c0531Fi = this.A00.A03;
        if (c0531Fi != null) {
            this.A00.A05 = true;
            C1149bb c1149bb = this.A00;
            c0531Fi2 = this.A00.A03;
            c1149bb.A02 = c0531Fi2.A0H();
            c1e = this.A00.A02;
            if (!(c1e instanceof AbstractC1187cD)) {
                interstitialAdExtendedListener = this.A00.A07;
                String[] strArr = A02;
                if (strArr[0].charAt(8) == strArr[3].charAt(8)) {
                    String[] strArr2 = A02;
                    strArr2[6] = "JHAXxmwzHKs3NajX";
                    strArr2[5] = "FHZeNyejFCAXh3Vz";
                    c1145bX = this.A00.A08;
                    interstitialAdExtendedListener.onAdLoaded(c1145bX.A6E());
                    return;
                }
            } else {
                c1e2 = this.A00.A02;
                final AbstractC1187cD abstractC1187cD = (AbstractC1187cD) c1e2;
                if (abstractC1187cD.A1N() > 0) {
                    L6 l6 = new L6();
                    C1045Zs c1045Zs = this.A00.A06;
                    c1145bX6 = this.A00.A08;
                    if (l6.A09(c1045Zs, c1145bX6.A08(), abstractC1187cD.A1N())) {
                        l6.A08(this.A00.A06, true);
                        C1149bb c1149bb2 = this.A00;
                        C1045Zs c1045Zs2 = this.A00.A06;
                        c1145bX7 = this.A00.A08;
                        String A0A = c1145bX7.A0A();
                        c1145bX8 = this.A00.A08;
                        c1149bb2.A01 = l6.A06(c1045Zs2, A0A, c1145bX8.A08());
                    } else {
                        C1149bb c1149bb3 = this.A00;
                        if (A02[1].charAt(2) != 'w') {
                            A02[7] = "alFbtn3b1";
                            l6.A08(c1149bb3.A06, false);
                        } else {
                            String[] strArr3 = A02;
                            strArr3[6] = "OkLAbmcEeyte5Vfo";
                            strArr3[5] = "zgaU15rF2mVDrexS";
                            l6.A08(c1149bb3.A06, false);
                        }
                    }
                }
                C1149bb c1149bb4 = this.A00;
                if (A02[1].charAt(2) != 'w') {
                    A02[1] = "23I4hcZMgJ395X2lYna8PMjzW0ozt3hz";
                    interstitialAd = c1149bb4.A01;
                    if (interstitialAd != null) {
                        abstractC1187cD.A1Z(true);
                        interstitialAd2 = this.A00.A01;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd2.buildLoadAdConfig().withAdListener(new InterstitialAdListener() { // from class: com.facebook.ads.redexgen.X.23
                            @Override // com.facebook.ads.AdListener
                            public final void onAdClicked(Ad ad) {
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onAdLoaded(Ad ad) {
                                InterstitialAdExtendedListener interstitialAdExtendedListener4;
                                C1145bX c1145bX9;
                                interstitialAdExtendedListener4 = C1151bd.this.A00.A07;
                                c1145bX9 = C1151bd.this.A00.A08;
                                interstitialAdExtendedListener4.onAdLoaded(c1145bX9.A6E());
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onError(Ad ad, AdError adError) {
                                InterstitialAdExtendedListener interstitialAdExtendedListener4;
                                C1145bX c1145bX9;
                                C1151bd.this.A00.A01 = null;
                                abstractC1187cD.A1Z(false);
                                interstitialAdExtendedListener4 = C1151bd.this.A00.A07;
                                c1145bX9 = C1151bd.this.A00.A08;
                                interstitialAdExtendedListener4.onAdLoaded(c1145bX9.A6E());
                            }

                            @Override // com.facebook.ads.InterstitialAdListener
                            public final void onInterstitialDismissed(Ad ad) {
                                C0531Fi c0531Fi3;
                                InterstitialAdExtendedListener interstitialAdExtendedListener4;
                                C1145bX c1145bX9;
                                C0531Fi c0531Fi4;
                                C0531Fi c0531Fi5;
                                C0531Fi c0531Fi6;
                                C1151bd.this.A00.A04 = false;
                                c0531Fi3 = C1151bd.this.A00.A03;
                                if (c0531Fi3 != null) {
                                    c0531Fi4 = C1151bd.this.A00.A03;
                                    c0531Fi4.A0R(new C1153bf(this));
                                    c0531Fi5 = C1151bd.this.A00.A03;
                                    c0531Fi5.A0M();
                                    c0531Fi6 = C1151bd.this.A00.A03;
                                    c0531Fi6.A0J();
                                    C1151bd.this.A00.A03 = null;
                                }
                                interstitialAdExtendedListener4 = C1151bd.this.A00.A07;
                                c1145bX9 = C1151bd.this.A00.A08;
                                interstitialAdExtendedListener4.onInterstitialDismissed(c1145bX9.A6E());
                            }

                            @Override // com.facebook.ads.InterstitialAdListener
                            public final void onInterstitialDisplayed(Ad ad) {
                            }

                            @Override // com.facebook.ads.AdListener
                            public final void onLoggingImpression(Ad ad) {
                            }
                        });
                        c1145bX4 = this.A00.A08;
                        InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags = withAdListener.withCacheFlags(c1145bX4.A0B());
                        c1145bX5 = this.A00.A08;
                        InterstitialAd.InterstitialLoadAdConfig loadAdConfig = withCacheFlags.withRewardData(c1145bX5.A03()).build();
                        interstitialAd3 = this.A00.A01;
                        interstitialAd3.loadAd(loadAdConfig);
                        return;
                    }
                    C1149bb c1149bb5 = this.A00;
                    String[] strArr4 = A02;
                    if (strArr4[0].charAt(8) != strArr4[3].charAt(8)) {
                        interstitialAdExtendedListener3 = c1149bb5.A07;
                        c1145bX3 = this.A00.A08;
                        interstitialAdExtendedListener3.onAdLoaded(c1145bX3.A6E());
                        return;
                    } else {
                        A02[2] = "joZPUUFug9Ts";
                        interstitialAdExtendedListener2 = c1149bb5.A07;
                        c1145bX2 = this.A00.A08;
                        interstitialAdExtendedListener2.onAdLoaded(c1145bX2.A6E());
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        this.A00.A06.A07().AA0(A00(0, 3, 98), C8E.A0N, new C8F(A00(3, 18, 46)));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC01790q
    public final void A0G(C0625Jg c0625Jg) {
        long j2;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1145bX c1145bX;
        C0S A0E = this.A00.A06.A0E();
        j2 = this.A00.A00;
        A0E.A38(C0687Lu.A01(j2), c0625Jg.A03().getErrorCode(), c0625Jg.A04());
        interstitialAdExtendedListener = this.A00.A07;
        c1145bX = this.A00.A08;
        interstitialAdExtendedListener.onError(c1145bX.A6E(), L8.A00(c0625Jg));
    }
}
