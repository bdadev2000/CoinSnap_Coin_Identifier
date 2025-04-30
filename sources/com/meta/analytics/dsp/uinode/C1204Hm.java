package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Hm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1204Hm {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;

    public C1204Hm(byte[] bArr, int i9) {
        C1216Hy c1216Hy = new C1216Hy(bArr);
        c1216Hy.A07(i9 * 8);
        this.A04 = c1216Hy.A04(16);
        this.A02 = c1216Hy.A04(16);
        this.A05 = c1216Hy.A04(24);
        this.A03 = c1216Hy.A04(24);
        this.A06 = c1216Hy.A04(20);
        this.A01 = c1216Hy.A04(3) + 1;
        this.A00 = c1216Hy.A04(5) + 1;
        this.A07 = ((c1216Hy.A04(4) & 15) << 32) | (c1216Hy.A04(32) & 4294967295L);
    }

    public final int A00() {
        return this.A00 * this.A06;
    }

    public final long A01() {
        return (this.A07 * 1000000) / this.A06;
    }
}
