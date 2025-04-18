package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class CI implements WP, WQ {
    public static String[] A06 = {"ZtwyXb21lqsDJdKT2ajh9JxAXgW69QuB", "FrcJuXyaSLrnc8pAXv2TAxnFyZgF4qHK", "0iGJizGlWH9", "qhteMkWWDojgH5n0mIn7zojGTGtfRfRL", "S4vRLIoihFPQ", "xoDrhUfozcoi1lbYtymgci4hovtTAG3t", "yhmtadr4WKeMx7Xbvtz69UkymvwaYHjB", "iiLQKF6aVsd0mv8Gzt0Boeru5TAZQ446"};
    public long A00;
    public long A01;
    public long A02;
    public WQ A03;
    public WV[] A04 = new WV[0];
    public final WP A05;

    public CI(WP wp, boolean z10, long j3, long j10) {
        this.A05 = wp;
        this.A02 = z10 ? j3 : C.TIME_UNSET;
        this.A01 = j3;
        this.A00 = j10;
    }

    private AD A00(long j3, AD ad2) {
        long toleranceBeforeUs = IF.A0E(ad2.A01, 0L, j3 - this.A01);
        long j10 = ad2.A00;
        long j11 = this.A00;
        long A0E = IF.A0E(j10, 0L, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j3);
        if (toleranceBeforeUs == ad2.A01 && A0E == ad2.A00) {
            return ad2;
        }
        return new AD(toleranceBeforeUs, A0E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.FC
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ABC(WP wp) {
        this.A03.ABC(this);
    }

    public static boolean A02(long j3, InterfaceC0607Gg[] interfaceC0607GgArr) {
        if (j3 != 0) {
            for (InterfaceC0607Gg interfaceC0607Gg : interfaceC0607GgArr) {
                if (interfaceC0607Gg != null && !AbstractC0644Hs.A09(interfaceC0607Gg.A7u().A0O)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != C.TIME_UNSET;
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final boolean A4T(long j3) {
        return this.A05.A4T(j3);
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final void A5A(long j3, boolean z10) {
        this.A05.A5A(j3, z10);
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long A5x(long j3, AD ad2) {
        long j10 = this.A01;
        if (j3 == j10) {
            return j10;
        }
        return this.A05.A5x(j3, A00(j3, ad2));
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long A6D() {
        long A6D = this.A05.A6D();
        if (A6D != Long.MIN_VALUE) {
            long j3 = this.A00;
            if (j3 != Long.MIN_VALUE) {
                if (A06[2].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "DtDan6JMsc2D9dL8KrRs9GVt0cLu7T4O";
                if (A6D >= j3) {
                }
            }
            return A6D;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long A7U() {
        long A7U = this.A05.A7U();
        if (A7U != Long.MIN_VALUE) {
            long j3 = this.A00;
            if (j3 == Long.MIN_VALUE || A7U < j3) {
                return A7U;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final TrackGroupArray A8B() {
        return this.A05.A8B();
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final void AAN() throws IOException {
        this.A05.AAN();
    }

    @Override // com.facebook.ads.redexgen.uinode.WQ
    public final void ACj(WP wp) {
        this.A03.ACj(this);
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final void AE4(WQ wq, long j3) {
        this.A03 = wq;
        this.A05.AE4(this, j3);
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final long AEL() {
        if (A03()) {
            long initialDiscontinuityUs = this.A02;
            if (A06[4].length() != 12) {
                throw new RuntimeException();
            }
            A06[6] = "LhyfL76jA11YYofpKqTom8Rw5oMGbfG9";
            this.A02 = C.TIME_UNSET;
            long AEL = AEL();
            return AEL != C.TIME_UNSET ? AEL : initialDiscontinuityUs;
        }
        long AEL2 = this.A05.AEL();
        if (AEL2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        boolean z10 = true;
        AbstractC0626Ha.A04(AEL2 >= this.A01);
        long discontinuityUs = this.A00;
        if (discontinuityUs != Long.MIN_VALUE && AEL2 > discontinuityUs) {
            z10 = false;
        }
        AbstractC0626Ha.A04(z10);
        return AEL2;
    }

    @Override // com.facebook.ads.redexgen.uinode.WP
    public final void AER(long j3) {
        this.A05.AER(j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r6 <= r4) goto L20;
     */
    @Override // com.facebook.ads.redexgen.uinode.WP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AFl(long r10) {
        /*
            r9 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9.A02 = r0
            com.facebook.ads.redexgen.X.WV[] r3 = r9.A04
            int r2 = r3.length
            r8 = 0
            r1 = 0
        Lc:
            if (r1 >= r2) goto L18
            r0 = r3[r1]
            if (r0 == 0) goto L15
            r0.A00()
        L15:
            int r1 = r1 + 1
            goto Lc
        L18:
            com.facebook.ads.redexgen.X.WP r0 = r9.A05
            long r6 = r0.AFl(r10)
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 == 0) goto L50
            long r1 = r9.A01
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L51
            long r4 = r9.A00
            r1 = -9223372036854775808
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L50
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.CI.A06
            r0 = 0
            r1 = r1[r0]
            r0 = 28
            char r1 = r1.charAt(r0)
            r0 = 57
            if (r1 == r0) goto L47
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L47:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.CI.A06
            java.lang.String r1 = "Q"
            r0 = 2
            r2[r0] = r1
            if (r3 > 0) goto L51
        L50:
            r8 = 1
        L51:
            com.facebook.ads.redexgen.uinode.AbstractC0626Ha.A04(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.CI.AFl(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r7 > r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    @Override // com.facebook.ads.redexgen.uinode.WP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AFm(com.facebook.ads.redexgen.uinode.InterfaceC0607Gg[] r16, boolean[] r17, com.facebook.ads.redexgen.uinode.FB[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r4 = r18
            int r0 = r4.length
            com.facebook.ads.redexgen.X.WV[] r0 = new com.facebook.ads.redexgen.uinode.WV[r0]
            r15.A04 = r0
            int r0 = r4.length
            com.facebook.ads.redexgen.X.FB[] r11 = new com.facebook.ads.redexgen.uinode.FB[r0]
            r2 = 0
        Lb:
            int r0 = r4.length
            r3 = 0
            if (r2 >= r0) goto L20
            com.facebook.ads.redexgen.X.WV[] r1 = r15.A04
            r0 = r4[r2]
            com.facebook.ads.redexgen.X.WV r0 = (com.facebook.ads.redexgen.uinode.WV) r0
            r1[r2] = r0
            if (r0 == 0) goto L1b
            com.facebook.ads.redexgen.X.FB r3 = r0.A01
        L1b:
            r11[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L20:
            com.facebook.ads.redexgen.X.WP r8 = r15.A05
            r9 = r16
            r10 = r17
            r12 = r19
            r13 = r20
            long r7 = r8.AFm(r9, r10, r11, r12, r13)
            boolean r0 = r15.A03()
            if (r0 == 0) goto L8e
            long r0 = r15.A01
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L8e
            boolean r0 = A02(r0, r9)
            if (r0 == 0) goto L8e
            r0 = r7
        L41:
            r15.A02 = r0
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 == 0) goto L59
            long r1 = r15.A01
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L8c
            long r1 = r15.A00
            r5 = -9223372036854775808
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L59
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L8c
        L59:
            r0 = 1
        L5a:
            com.facebook.ads.redexgen.uinode.AbstractC0626Ha.A04(r0)
            r5 = 0
        L5e:
            int r0 = r4.length
            if (r5 >= r0) goto L94
            r0 = r11[r5]
            if (r0 != 0) goto L72
            com.facebook.ads.redexgen.X.WV[] r0 = r15.A04
            r0[r5] = r3
        L69:
            com.facebook.ads.redexgen.X.WV[] r0 = r15.A04
            r0 = r0[r5]
            r4[r5] = r0
            int r5 = r5 + 1
            goto L5e
        L72:
            r0 = r4[r5]
            if (r0 == 0) goto L80
            com.facebook.ads.redexgen.X.WV[] r0 = r15.A04
            r0 = r0[r5]
            com.facebook.ads.redexgen.X.FB r1 = r0.A01
            r0 = r11[r5]
            if (r1 == r0) goto L69
        L80:
            com.facebook.ads.redexgen.X.WV[] r2 = r15.A04
            r1 = r11[r5]
            com.facebook.ads.redexgen.X.WV r0 = new com.facebook.ads.redexgen.X.WV
            r0.<init>(r15, r1)
            r2[r5] = r0
            goto L69
        L8c:
            r0 = 0
            goto L5a
        L8e:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L41
        L94:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.CI.AFm(com.facebook.ads.redexgen.X.Gg[], boolean[], com.facebook.ads.redexgen.X.FB[], boolean[], long):long");
    }
}
