package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.Bp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1071Bp extends W7 {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final InterfaceC1182Gp A0A;
    public final InterfaceC1195Hd A0B;

    public C1071Bp(TrackGroup trackGroup, int[] iArr, InterfaceC1182Gp interfaceC1182Gp, long j7, long j9, long j10, float f9, float f10, long j11, InterfaceC1195Hd interfaceC1195Hd) {
        super(trackGroup, iArr);
        this.A0A = interfaceC1182Gp;
        this.A07 = j7 * 1000;
        this.A06 = j9 * 1000;
        this.A08 = 1000 * j10;
        this.A04 = f9;
        this.A05 = f10;
        this.A09 = j11;
        this.A0B = interfaceC1195Hd;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = C.TIME_UNSET;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j7) {
        long A67 = ((float) this.A0A.A67()) * this.A04;
        int i9 = 0;
        for (int i10 = 0; i10 < super.A03; i10++) {
            if (j7 == Long.MIN_VALUE || !A00(i10, j7)) {
                if (Math.round(A76(i10).A04 * this.A00) <= A67) {
                    return i10;
                }
                i9 = i10;
            }
        }
        return i9;
    }

    @Override // com.meta.analytics.dsp.uinode.W7, com.meta.analytics.dsp.uinode.InterfaceC1173Gg
    public final void A5U() {
        this.A03 = C.TIME_UNSET;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1173Gg
    public final int A7v() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.W7, com.meta.analytics.dsp.uinode.InterfaceC1173Gg
    public final void ACc(float f9) {
        this.A00 = f9;
    }
}
