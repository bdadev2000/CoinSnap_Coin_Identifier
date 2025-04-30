package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public final class AG {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public Object A07;
    public boolean A08;
    public boolean A09;

    public final long A00() {
        return C9W.A01(this.A02);
    }

    public final long A01() {
        return this.A02;
    }

    public final long A02() {
        return C9W.A01(this.A03);
    }

    public final long A03() {
        return this.A04;
    }

    public final AG A04(Object obj, long j7, long j9, boolean z8, boolean z9, long j10, long j11, int i9, int i10, long j12) {
        this.A07 = obj;
        this.A05 = j7;
        this.A06 = j9;
        this.A09 = z8;
        this.A08 = z9;
        this.A02 = j10;
        this.A03 = j11;
        this.A00 = i9;
        this.A01 = i10;
        this.A04 = j12;
        return this;
    }
}
