package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ea, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0508Ea implements InterfaceC1001Ya {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C0508Ea(long j2, long j3, C3 c3) {
        this.A04 = j3;
        this.A01 = c3.A02;
        this.A00 = c3.A00;
        if (j2 == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
        } else {
            this.A02 = j2 - j3;
            this.A03 = A8W(j2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final long A7F() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final C5 A8H(long j2) {
        if (this.A02 == -1) {
            return new C5(new C7(0L, this.A04));
        }
        long positionOffset = this.A01;
        long j3 = ((this.A00 * j2) / 8000000) / positionOffset;
        long positionOffset2 = this.A01;
        long A0E = IK.A0E(j3 * positionOffset2, 0L, this.A02 - this.A01);
        long j4 = this.A04 + A0E;
        long A8W = A8W(j4);
        C7 seekPoint = new C7(A8W, j4);
        if (A8W >= j2 || A0E == this.A02 - this.A01) {
            return new C5(seekPoint);
        }
        long seekTimeUs = this.A01 + j4;
        long seekPosition = A8W(seekTimeUs);
        return new C5(seekPoint, new C7(seekPosition, seekTimeUs));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1001Ya
    public final long A8W(long j2) {
        return ((Math.max(0L, j2 - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final boolean A9h() {
        return this.A02 != -1;
    }
}
