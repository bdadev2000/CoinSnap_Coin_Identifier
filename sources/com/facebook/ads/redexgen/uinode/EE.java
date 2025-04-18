package com.facebook.ads.redexgen.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: assets/audience_network.dex */
public final class EE implements XV {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public EE(long j3, long j10, By by) {
        this.A04 = j10;
        this.A01 = by.A02;
        this.A00 = by.A00;
        if (j3 == -1) {
            this.A02 = -1L;
            this.A03 = C.TIME_UNSET;
        } else {
            this.A02 = j3 - j10;
            this.A03 = A88(j3);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final long A6r() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final C0 A7t(long j3) {
        long j10 = this.A02;
        if (j10 == -1) {
            return new C0(new C2(0L, this.A04));
        }
        int i10 = this.A01;
        long A0E = IF.A0E((((this.A00 * j3) / 8000000) / i10) * i10, 0L, j10 - i10);
        long j11 = this.A04 + A0E;
        long A88 = A88(j11);
        C2 seekPoint = new C2(A88, j11);
        if (A88 < j3) {
            long j12 = this.A02;
            int i11 = this.A01;
            if (A0E != j12 - i11) {
                long j13 = i11 + j11;
                return new C0(seekPoint, new C2(A88(j13), j13));
            }
        }
        return new C0(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.uinode.XV
    public final long A88(long j3) {
        return ((Math.max(0L, j3 - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final boolean A9I() {
        return this.A02 != -1;
    }
}
