package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Wl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1582Wl implements C1 {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C1582Wl(int i9, int i10, int i11, int i12, int i13, int i14) {
        this.A06 = i9;
        this.A07 = i10;
        this.A02 = i11;
        this.A04 = i12;
        this.A03 = i13;
        this.A05 = i14;
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

    public final long A05(long j7) {
        long positionOffset = Math.max(0L, j7 - this.A01);
        long j9 = 1000000 * positionOffset;
        long positionOffset2 = this.A02;
        return j9 / positionOffset2;
    }

    public final void A06(long j7, long j9) {
        this.A01 = j7;
        this.A00 = j9;
    }

    public final boolean A07() {
        return (this.A01 == 0 || this.A00 == 0) ? false : true;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        long j7 = 1000000 * (this.A00 / this.A04);
        long numFrames = this.A07;
        return j7 / numFrames;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j7) {
        int i9 = this.A04;
        long positionOffset = i9;
        long j9 = ((this.A02 * j7) / 1000000) / positionOffset;
        long positionOffset2 = i9;
        long A0E = IF.A0E(j9 * positionOffset2, 0L, this.A00 - i9);
        long j10 = this.A01 + A0E;
        long A05 = A05(j10);
        C2 seekPoint = new C2(A05, j10);
        if (A05 < j7) {
            long j11 = this.A00;
            int i10 = this.A04;
            if (A0E != j11 - i10) {
                long seekTimeUs = i10 + j10;
                long seekPosition = A05(seekTimeUs);
                return new C0(seekPoint, new C2(seekPosition, seekTimeUs));
            }
        }
        return new C0(seekPoint);
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return true;
    }
}
