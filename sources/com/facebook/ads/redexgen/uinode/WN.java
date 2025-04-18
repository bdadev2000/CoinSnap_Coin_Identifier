package com.facebook.ads.redexgen.uinode;

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

    public WN(long j3, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, Object obj) {
        this.A01 = j3;
        this.A05 = j10;
        this.A00 = j11;
        this.A03 = j12;
        this.A04 = j13;
        this.A02 = j14;
        this.A08 = z10;
        this.A07 = z11;
        this.A06 = obj;
    }

    public WN(long j3, long j10, long j11, long j12, boolean z10, boolean z11, Object obj) {
        this(C.TIME_UNSET, C.TIME_UNSET, j3, j10, j11, j12, z10, z11, obj);
    }

    public WN(long j3, boolean z10, boolean z11, Object obj) {
        this(j3, j3, 0L, 0L, z10, z11, obj);
    }

    @Override // com.facebook.ads.redexgen.uinode.AH
    public final int A00() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.uinode.AH
    public final int A01() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.uinode.AH
    public final int A04(Object obj) {
        return A09.equals(obj) ? 0 : -1;
    }

    @Override // com.facebook.ads.redexgen.uinode.AH
    public final AF A0A(int i10, AF af2, boolean z10) {
        AbstractC0626Ha.A00(i10, 0, 1);
        Object uid = z10 ? A09 : null;
        return af2.A0B(null, uid, 0, this.A00, -this.A04);
    }

    @Override // com.facebook.ads.redexgen.uinode.AH
    public final AG A0D(int i10, AG ag2, boolean z10, long j3) {
        Object obj;
        AbstractC0626Ha.A00(i10, 0, 1);
        if (z10) {
            obj = this.A06;
        } else {
            obj = null;
        }
        long j10 = this.A02;
        boolean z11 = this.A07;
        if (z11 && j3 != 0) {
            long windowDefaultStartPositionUs = this.A03;
            if (windowDefaultStartPositionUs == C.TIME_UNSET) {
                j10 = C.TIME_UNSET;
            } else {
                j10 += j3;
                if (j10 > windowDefaultStartPositionUs) {
                    j10 = C.TIME_UNSET;
                }
            }
        }
        return ag2.A04(obj, this.A01, this.A05, this.A08, z11, j10, this.A03, 0, 0, this.A04);
    }
}
