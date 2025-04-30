package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1689aH extends C2I implements InterstitialAdExtendedListener {
    public static byte[] A01;
    public final C1701aT A00;

    static {
        A01();
    }

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-68, -63, -57, -46, -72, -59, -59, -62, -59, -46, -74, -62, -73, -72, -46, -66, -72, -52, -103, -100, -101, -108, -84, -106, -101, -93, -114, -103, -106, -111, -114, -95, -106, -100, -101, -84, -95, -106, -102, -110, -84, -104, -110, -90, Ascii.SI, Ascii.DLE, Ascii.SO, Ascii.ESC, 1, Ascii.SO, Ascii.SO, Ascii.VT, Ascii.SO, Ascii.ESC, 9, 1, Ascii.SI, Ascii.SI, -3, 3, 1, Ascii.ESC, 7, 1, Ascii.NAK};
    }

    public C1689aH(String str, C2K c2k, C1701aT c1701aT) {
        super(str, c2k);
        this.A00 = c1701aT;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
        super.A00.ACJ(1024, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(18, 26, 0), this.A00.A0D());
        super.A00.ACJ(1020, this.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(44, 21, 111), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 38), adError.getErrorCode());
        super.A00.ACJ(1023, this.A01, bundle);
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        super.A00.ACJ(1026, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        super.A00.ACJ(1022, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
        super.A00.ACJ(1021, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
        super.A00.ACJ(1025, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdCompleted() {
        super.A00.ACJ(3000, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerFailed() {
        super.A00.ACJ(3002, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerSucceeded() {
        super.A00.ACJ(3001, this.A01, null);
    }
}
