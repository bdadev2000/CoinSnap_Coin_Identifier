package com.meta.analytics.dsp.uinode;

import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1703aV extends AbstractC08010q {
    public static byte[] A01;
    public static String[] A02 = {"", "lR4UvBki6PSdVcLREjEHAbqRd1OmLUQf", "DjKPGQUWmMf7x", "ODfaPUPPzX7KhktdCz15RADFZIjUcUTH", "SOtQhTlfKwNvvZXzwoqU2I3z2iEV30z7", "BHtVd6ktyCMEATMZK8J5wjGrCvXYI9tG", "P8UTzFKpwpJ94", "IxNcf87J3g"};
    public final /* synthetic */ C1701aT A00;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{99, 114, 107, Ascii.GS, 17, Ascii.DLE, 10, Ascii.FF, 17, Ascii.DC2, Ascii.DC2, Ascii.ESC, Ascii.FF, 94, Ascii.ETB, Ascii.CR, 94, Ascii.DLE, Ascii.VT, Ascii.DC2, Ascii.DC2};
    }

    static {
        A01();
    }

    public C1703aV(C1701aT c1701aT) {
        this.A00 = c1701aT;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
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

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        FQ fq;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass26 anonymousClass26;
        FQ fq2;
        FQ fq3;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        fq = this.A00.A03;
        if (fq != null && C1225Ih.A1j(this.A00.A06)) {
            fq2 = this.A00.A03;
            fq2.A0P(new C1704aW(this));
            fq3 = this.A00.A03;
            fq3.A0K();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        anonymousClass26 = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(anonymousClass26.A01());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass26 anonymousClass26;
        interstitialAdExtendedListener = this.A00.A07;
        anonymousClass26 = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(anonymousClass26.A01());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass26 anonymousClass26;
        this.A00.A06.A0E().A2j();
        interstitialAdExtendedListener = this.A00.A07;
        anonymousClass26 = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(anonymousClass26.A01());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass26 anonymousClass26;
        interstitialAdExtendedListener = this.A00.A07;
        anonymousClass26 = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(anonymousClass26.A01());
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A0E(View view) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
    
        if (r5 > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        r6 = new com.meta.analytics.dsp.uinode.C1288Kz();
        r2 = r7.A00.A06;
        r0 = r7.A00.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b3, code lost:
    
        if (r6.A09(r2, r0.A08(), r4.A0v()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b5, code lost:
    
        r6.A08(r7.A00.A06, true);
        r5 = r7.A00;
        r2 = r5.A06;
        r0 = r7.A00.A08;
        r1 = r0.A0A();
        r0 = r7.A00.A08;
        r5.A01 = r6.A06(r2, r1, r0.A08());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0137, code lost:
    
        r6.A08(r7.A00.A06, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00db, code lost:
    
        r0 = r7.A00.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e1, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e3, code lost:
    
        r4.A17(true);
        r0 = r7.A00.A01;
        r1 = r0.buildLoadAdConfig().withAdListener(new com.meta.analytics.dsp.uinode.AnonymousClass24(r7, r4));
        r0 = r7.A00.A08;
        r1 = r1.withCacheFlags(r0.A0B());
        r0 = r7.A00.A08;
        r1 = r1.withRewardData(r0.A03()).build();
        r0 = r7.A00.A01;
        r0.loadAd(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0122, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0123, code lost:
    
        r1 = r7.A00.A07;
        r0 = r7.A00.A08;
        r1.onAdLoaded(r0.A01());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0140, code lost:
    
        if (r5 > 0) goto L16;
     */
    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0F(com.meta.analytics.dsp.uinode.InterfaceC08000p r8) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1703aV.A0F(com.facebook.ads.redexgen.X.0p):void");
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC08010q
    public final void A0G(C1242Jb c1242Jb) {
        long j7;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        AnonymousClass26 anonymousClass26;
        C0S A0E = this.A00.A06.A0E();
        j7 = this.A00.A00;
        A0E.A2m(C1294Lf.A01(j7), c1242Jb.A03().getErrorCode(), c1242Jb.A04());
        interstitialAdExtendedListener = this.A00.A07;
        anonymousClass26 = this.A00.A08;
        interstitialAdExtendedListener.onError(anonymousClass26.A01(), L1.A00(c1242Jb));
    }
}
