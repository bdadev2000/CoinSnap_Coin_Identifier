package com.meta.analytics.dsp.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: assets/audience_network.dex */
public final class EE implements XV {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public EE(long j7, long j9, By by) {
        this.A04 = j9;
        this.A01 = by.A02;
        this.A00 = by.A00;
        if (j7 == -1) {
            this.A02 = -1L;
            this.A03 = C.TIME_UNSET;
        } else {
            this.A02 = j7 - j9;
            this.A03 = A88(j7);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        return this.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j7) {
        long j9 = this.A02;
        if (j9 == -1) {
            return new C0(new C2(0L, this.A04));
        }
        int i9 = this.A01;
        long A0E = IF.A0E((((this.A00 * j7) / 8000000) / i9) * i9, 0L, j9 - i9);
        long j10 = this.A04 + A0E;
        long A88 = A88(j10);
        C2 seekPoint = new C2(A88, j10);
        if (A88 < j7) {
            long j11 = this.A02;
            int i10 = this.A01;
            if (A0E != j11 - i10) {
                long j12 = i10 + j10;
                return new C0(seekPoint, new C2(A88(j12), j12));
            }
        }
        return new C0(seekPoint);
    }

    @Override // com.meta.analytics.dsp.uinode.XV
    public final long A88(long j7) {
        return ((Math.max(0L, j7 - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return this.A02 != -1;
    }
}
