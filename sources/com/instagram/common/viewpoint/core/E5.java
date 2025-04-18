package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class E5 implements XU, XV {
    public static String[] A06 = {"FKxkeTyNcELruURTBl6lcHzQkOtglqVi", "5VUPZyR", "h4QAdQ2k4bq5I5kw9k507iFMyPiUKBqg", "ACG7if3eIl7svvFGCbIXgylPM5X6", "MMEOde", "Ne8Swyj20Utm40D", "fzp5cmA7a9jEIH2cS1qn9VNYlxJ5WcKE", "e38WKWMIi9RGh5e82fLDO75VNnvmj40O"};
    public long A00;
    public long A01;
    public long A02;
    public XV A03;
    public C0978Xa[] A04 = new C0978Xa[0];
    public final XU A05;

    public E5(XU xu, boolean z2, long j2, long j3) {
        this.A05 = xu;
        this.A02 = z2 ? j2 : -9223372036854775807L;
        this.A01 = j2;
        this.A00 = j3;
    }

    private AI A00(long j2, AI ai) {
        long toleranceBeforeUs = IK.A0E(ai.A01, 0L, j2 - this.A01);
        long j3 = ai.A00;
        long j4 = this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j2;
        if (A06[6].length() != 32) {
            throw new RuntimeException();
        }
        A06[7] = "39x0yJkTHKofHHETezutF7bVoixqTCZQ";
        long A0E = IK.A0E(j3, 0L, j4);
        if (toleranceBeforeUs == ai.A01 && A0E == ai.A00) {
            return ai;
        }
        return new AI(toleranceBeforeUs, A0E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.FH
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void ABd(XU xu) {
        this.A03.ABd(this);
    }

    public static boolean A02(long j2, InterfaceC0556Gl[] interfaceC0556GlArr) {
        if (j2 != 0) {
            for (InterfaceC0556Gl interfaceC0556Gl : interfaceC0556GlArr) {
                if (interfaceC0556Gl != null && !AbstractC0594Hx.A09(interfaceC0556Gl.A8I().A0O)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != -9223372036854775807L;
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final boolean A4p(long j2) {
        return this.A05.A4p(j2);
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final void A5W(long j2, boolean z2) {
        this.A05.A5W(j2, z2);
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final long A6L(long j2, AI ai) {
        if (j2 == this.A01) {
            return this.A01;
        }
        return this.A05.A6L(j2, A00(j2, ai));
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final long A6b() {
        long A6b = this.A05.A6b();
        if (A6b != Long.MIN_VALUE) {
            long bufferedPositionUs = this.A00;
            if (A06[2].charAt(4) == 'm') {
                throw new RuntimeException();
            }
            A06[2] = "v7PeKUnzeGhoG0IESTdo7BlOEWICkZOG";
            if (bufferedPositionUs == Long.MIN_VALUE || A6b < this.A00) {
                return A6b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final long A7s() {
        long A7s = this.A05.A7s();
        if (A7s == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && A7s >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return A7s;
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final TrackGroupArray A8Z() {
        return this.A05.A8Z();
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final void AAn() throws IOException {
        this.A05.AAn();
    }

    @Override // com.instagram.common.viewpoint.core.XV
    public final void ADC(XU xu) {
        this.A03.ADC(this);
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final void AEX(XV xv, long j2) {
        this.A03 = xv;
        this.A05.AEX(this, j2);
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final long AEo() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = -9223372036854775807L;
            long initialDiscontinuityUs = AEo();
            return initialDiscontinuityUs != -9223372036854775807L ? initialDiscontinuityUs : childDiscontinuityUs;
        }
        long AEo = this.A05.AEo();
        if (AEo == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z2 = true;
        AbstractC0576Hf.A04(AEo >= this.A01);
        long discontinuityUs = this.A00;
        if (discontinuityUs != Long.MIN_VALUE && AEo > this.A00) {
            z2 = false;
        }
        AbstractC0576Hf.A04(z2);
        return AEo;
    }

    @Override // com.instagram.common.viewpoint.core.XU
    public final void AEu(long j2) {
        this.A05.AEu(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r5 <= r8.A00) goto L18;
     */
    @Override // com.instagram.common.viewpoint.core.XU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AGB(long r9) {
        /*
            r8 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A02 = r0
            com.facebook.ads.redexgen.X.Xa[] r3 = r8.A04
            int r2 = r3.length
            r7 = 0
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
            com.facebook.ads.redexgen.X.XU r0 = r8.A05
            long r5 = r0.AGB(r9)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L4a
            long r0 = r8.A01
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.E5.A06
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 28
            if (r1 == r0) goto L4f
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.E5.A06
            java.lang.String r1 = "IA7KJv"
            r0 = 1
            r2[r0] = r1
            if (r3 < 0) goto L4b
            long r3 = r8.A00
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L4a
            long r1 = r8.A00
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L4b
        L4a:
            r7 = 1
        L4b:
            com.instagram.common.viewpoint.core.AbstractC0576Hf.A04(r7)
            return r5
        L4f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.E5.AGB(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    @Override // com.instagram.common.viewpoint.core.XU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AGC(com.instagram.common.viewpoint.core.InterfaceC0556Gl[] r15, boolean[] r16, com.instagram.common.viewpoint.core.FG[] r17, boolean[] r18, long r19) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.E5.AGC(com.facebook.ads.redexgen.X.Gl[], boolean[], com.facebook.ads.redexgen.X.FG[], boolean[], long):long");
    }
}
