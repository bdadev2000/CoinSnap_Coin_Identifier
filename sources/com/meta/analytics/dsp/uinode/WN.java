package com.meta.analytics.dsp.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: assets/audience_network.dex */
public final class WN extends AH {
    public static final Object A09 = new Object();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    public WN(long j7, long j9, long j10, long j11, long j12, long j13, boolean z8, boolean z9, Object obj) {
        this.A01 = j7;
        this.A05 = j9;
        this.A00 = j10;
        this.A03 = j11;
        this.A04 = j12;
        this.A02 = j13;
        this.A08 = z8;
        this.A07 = z9;
        this.A06 = obj;
    }

    public WN(long j7, long j9, long j10, long j11, boolean z8, boolean z9, Object obj) {
        this(C.TIME_UNSET, C.TIME_UNSET, j7, j9, j10, j11, z8, z9, obj);
    }

    public WN(long j7, boolean z8, boolean z9, Object obj) {
        this(j7, j7, 0L, 0L, z8, z9, obj);
    }

    @Override // com.meta.analytics.dsp.uinode.AH
    public final int A00() {
        return 1;
    }

    @Override // com.meta.analytics.dsp.uinode.AH
    public final int A01() {
        return 1;
    }

    @Override // com.meta.analytics.dsp.uinode.AH
    public final int A04(Object obj) {
        return A09.equals(obj) ? 0 : -1;
    }

    @Override // com.meta.analytics.dsp.uinode.AH
    public final AF A0A(int i9, AF af, boolean z8) {
        AbstractC1192Ha.A00(i9, 0, 1);
        Object uid = z8 ? A09 : null;
        return af.A0B(null, uid, 0, this.A00, -this.A04);
    }

    @Override // com.meta.analytics.dsp.uinode.AH
    public final AG A0D(int i9, AG ag, boolean z8, long j7) {
        Object obj;
        AbstractC1192Ha.A00(i9, 0, 1);
        if (z8) {
            obj = this.A06;
        } else {
            obj = null;
        }
        long j9 = this.A02;
        boolean z9 = this.A07;
        if (z9 && j7 != 0) {
            long windowDefaultStartPositionUs = this.A03;
            if (windowDefaultStartPositionUs == C.TIME_UNSET) {
                j9 = C.TIME_UNSET;
            } else {
                j9 += j7;
                if (j9 > windowDefaultStartPositionUs) {
                    j9 = C.TIME_UNSET;
                }
            }
        }
        return ag.A04(obj, this.A01, this.A05, this.A08, z9, j9, this.A03, 0, 0, this.A04);
    }
}
