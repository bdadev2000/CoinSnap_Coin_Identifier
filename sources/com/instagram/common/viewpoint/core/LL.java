package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class LL {
    public static byte[] A05;
    public static String[] A06 = {"hdh4k6eZclrlxxYg19ck", "OIQuDIQFpzBifrZrtJIvg4BasUaQd63c", "6y0NffGMqcG8EugdtirNjkqg6svCH2Zl", "13Ua2r6CYJwc6p6BI5coDxRAaPqMz7yS", "7WkbYpbXunBRly3lB1oHckvOip2eqLp6", "2PYz6J8qU0vRqLO17bgOak7iCaiihwk", "gvpJ77qQnx", "SLFhDDNvl2CxgKHJ1vqMDyCxDe74woQD"};
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AbstractC1187cD A02;
    public final C1045Zs A03;
    public final LJ A04;

    public static String A02(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{84, 91, 94, 84, 92, 104, 68, 88, 66, 69, 84, 82};
    }

    static {
        A03();
    }

    public LL(C1045Zs c1045Zs, AbstractC1187cD abstractC1187cD, LJ lj) {
        this.A03 = c1045Zs;
        this.A04 = lj;
        this.A02 = abstractC1187cD;
    }

    public static LL A01(C1045Zs c1045Zs, AbstractC1187cD abstractC1187cD, LJ lj) {
        Object creativeAsCtaLoggingHelper = c1045Zs.A0H();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new LL(c1045Zs, abstractC1187cD, lj);
            c1045Zs.A0O(creativeAsCtaLoggingHelper);
        }
        return (LL) creativeAsCtaLoggingHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(String str, C1T c1t, String str2) {
        Map<String, String> A052 = new O8().A03(null).A02(null).A05();
        A052.put(A02(0, 12, 53), str);
        this.A03.A09().AA9(str2, A052);
        if (c1t != null) {
            C1T.A06(c1t, this.A03);
        }
        if (C0608Im.A2J(this.A03)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC1222cm.A03, Boolean.TRUE.toString());
            hashMap.put(AbstractC1222cm.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC1222cm.A05, Boolean.TRUE.toString());
            this.A03.A09().AAI(str2, hashMap);
        }
        this.A04.ACa();
    }

    private void A06(String str, C1T c1t, String str2, long j2) {
        this.A00 = true;
        this.A01.postDelayed(new LI(this, str, c1t, str2), j2);
    }

    public static boolean A07(C1045Zs c1045Zs) {
        return C0608Im.A1W(c1045Zs) && L2.A0H(c1045Zs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r5 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.instagram.common.viewpoint.core.LK A0A(com.instagram.common.viewpoint.core.AbstractC1187cD r7) {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Zs r0 = r6.A03
            boolean r0 = com.instagram.common.viewpoint.core.C0608Im.A1c(r0)
            r4 = 1
            if (r0 == 0) goto L1f
            boolean r0 = r7.A17()
            if (r0 == 0) goto L1d
            com.facebook.ads.redexgen.X.Zs r0 = r6.A03
            boolean r0 = A07(r0)
            if (r0 == 0) goto L1d
        L17:
            com.facebook.ads.redexgen.X.LK r0 = new com.facebook.ads.redexgen.X.LK
            r0.<init>(r4, r4)
            return r0
        L1d:
            r4 = 0
            goto L17
        L1f:
            boolean r3 = r7.A17()
            if (r3 == 0) goto L51
            com.facebook.ads.redexgen.X.Zs r0 = r6.A03
            boolean r5 = A07(r0)
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.LL.A06
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L53
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.LL.A06
            java.lang.String r1 = "D5RQoHah0ZffyX7n6MMHscTeZuBHZQ8g"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "oKN8Sif1fTCm3hFJqGEcKAR8lt3N8fjA"
            r0 = 4
            r2[r0] = r1
            if (r5 == 0) goto L51
        L4b:
            com.facebook.ads.redexgen.X.LK r0 = new com.facebook.ads.redexgen.X.LK
            r0.<init>(r3, r4)
            return r0
        L51:
            r4 = 0
            goto L4b
        L53:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.LL.A0A(com.facebook.ads.redexgen.X.cD):com.facebook.ads.redexgen.X.LK");
    }

    public final void A0B() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }

    public final void A0C(String str, C1T c1t, String str2) {
        A0B();
        A06(str, c1t, str2, this.A02 != null ? this.A02.A0T() : 2000L);
    }

    public final void A0D(String str, C1T c1t, String str2) {
        A0B();
        A06(str, c1t, str2, this.A02 != null ? this.A02.A0U() : 2000L);
    }
}
