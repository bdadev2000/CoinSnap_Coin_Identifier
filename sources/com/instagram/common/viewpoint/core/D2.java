package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;

/* loaded from: assets/audience_network.dex */
public final class D2 extends XC {
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
    public final InterfaceC0565Gu A0A;
    public final InterfaceC0579Hi A0B;

    public D2(TrackGroup trackGroup, int[] iArr, InterfaceC0565Gu interfaceC0565Gu, long j2, long j3, long j4, float f2, float f3, long j5, InterfaceC0579Hi interfaceC0579Hi) {
        super(trackGroup, iArr);
        this.A0A = interfaceC0565Gu;
        this.A07 = j2 * 1000;
        this.A06 = j3 * 1000;
        this.A08 = 1000 * j4;
        this.A04 = f2;
        this.A05 = f3;
        this.A09 = j5;
        this.A0B = interfaceC0579Hi;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j2) {
        long A6V = ((float) this.A0A.A6V()) * this.A04;
        int i2 = 0;
        for (int i3 = 0; i3 < super.A03; i3++) {
            if (j2 == Long.MIN_VALUE || !A00(i3, j2)) {
                if (Math.round(A7U(i3).A04 * this.A00) <= A6V) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // com.instagram.common.viewpoint.core.XC, com.instagram.common.viewpoint.core.InterfaceC0556Gl
    public final void A5q() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0556Gl
    public final int A8J() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.XC, com.instagram.common.viewpoint.core.InterfaceC0556Gl
    public final void AD5(float f2) {
        this.A00 = f2;
    }
}
