package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.Bp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0505Bp extends W7 {
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
    public final InterfaceC0616Gp A0A;
    public final InterfaceC0629Hd A0B;

    public C0505Bp(TrackGroup trackGroup, int[] iArr, InterfaceC0616Gp interfaceC0616Gp, long j3, long j10, long j11, float f10, float f11, long j12, InterfaceC0629Hd interfaceC0629Hd) {
        super(trackGroup, iArr);
        this.A0A = interfaceC0616Gp;
        this.A07 = j3 * 1000;
        this.A06 = j10 * 1000;
        this.A08 = 1000 * j11;
        this.A04 = f10;
        this.A05 = f11;
        this.A09 = j12;
        this.A0B = interfaceC0629Hd;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = C.TIME_UNSET;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j3) {
        long A67 = ((float) this.A0A.A67()) * this.A04;
        int i10 = 0;
        for (int i11 = 0; i11 < super.A03; i11++) {
            if (j3 == Long.MIN_VALUE || !A00(i11, j3)) {
                if (Math.round(A76(i11).A04 * this.A00) <= A67) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.W7, com.facebook.ads.redexgen.uinode.InterfaceC0607Gg
    public final void A5U() {
        this.A03 = C.TIME_UNSET;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0607Gg
    public final int A7v() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.W7, com.facebook.ads.redexgen.uinode.InterfaceC0607Gg
    public final void ACc(float f10) {
        this.A00 = f10;
    }
}
