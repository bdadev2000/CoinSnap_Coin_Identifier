package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Xq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0991Xq implements C6 {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C0991Xq(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A06 = i2;
        this.A07 = i3;
        this.A02 = i4;
        this.A04 = i5;
        this.A03 = i6;
        this.A05 = i7;
    }

    public final int A00() {
        return this.A07 * this.A03 * this.A06;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final int A03() {
        return this.A06;
    }

    public final int A04() {
        return this.A07;
    }

    public final long A05(long j2) {
        long positionOffset = Math.max(0L, j2 - this.A01);
        long j3 = 1000000 * positionOffset;
        long positionOffset2 = this.A02;
        return j3 / positionOffset2;
    }

    public final void A06(long j2, long j3) {
        this.A01 = j2;
        this.A00 = j3;
    }

    public final boolean A07() {
        return (this.A01 == 0 || this.A00 == 0) ? false : true;
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final long A7F() {
        long j2 = 1000000 * (this.A00 / this.A04);
        long numFrames = this.A07;
        return j2 / numFrames;
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final C5 A8H(long j2) {
        long positionOffset = this.A04;
        long j3 = ((this.A02 * j2) / 1000000) / positionOffset;
        long positionOffset2 = this.A04;
        long A0E = IK.A0E(j3 * positionOffset2, 0L, this.A00 - this.A04);
        long j4 = this.A01 + A0E;
        long A05 = A05(j4);
        C7 seekPoint = new C7(A05, j4);
        if (A05 >= j2 || A0E == this.A00 - this.A04) {
            return new C5(seekPoint);
        }
        long seekTimeUs = this.A04 + j4;
        long seekPosition = A05(seekTimeUs);
        return new C5(seekPoint, new C7(seekPosition, seekTimeUs));
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final boolean A9h() {
        return true;
    }
}
