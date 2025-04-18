package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0520Ch {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C0517Ce A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public C0520Ch(C0517Ce c0517Ce, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j3) {
        AbstractC0626Ha.A03(iArr.length == jArr2.length);
        AbstractC0626Ha.A03(jArr.length == jArr2.length);
        AbstractC0626Ha.A03(iArr2.length == jArr2.length);
        this.A03 = c0517Ce;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i10;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j3;
        this.A01 = jArr.length;
    }

    public final int A00(long j3) {
        for (int i10 = IF.A0B(this.A07, j3, true, false); i10 >= 0; i10--) {
            int startIndex = this.A04[i10];
            if ((startIndex & 1) != 0) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A01(long r4) {
        /*
            r3 = this;
            long[] r1 = r3.A07
            r0 = 0
            r2 = 1
            int r1 = com.facebook.ads.redexgen.uinode.IF.A0A(r1, r4, r2, r0)
        L8:
            long[] r0 = r3.A07
            int r0 = r0.length
            if (r1 >= r0) goto L18
            int[] r0 = r3.A04
            r0 = r0[r1]
            r0 = r0 & r2
            if (r0 == 0) goto L15
            return r1
        L15:
            int r1 = r1 + 1
            goto L8
        L18:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0520Ch.A01(long):int");
    }
}
