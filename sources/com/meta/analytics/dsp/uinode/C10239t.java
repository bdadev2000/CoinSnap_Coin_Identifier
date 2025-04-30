package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10239t {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C1132Eo A04;
    public final boolean A05;
    public final boolean A06;

    public C10239t(C1132Eo c1132Eo, long j7, long j9, long j10, long j11, boolean z8, boolean z9) {
        this.A04 = c1132Eo;
        this.A03 = j7;
        this.A02 = j9;
        this.A00 = j10;
        this.A01 = j11;
        this.A06 = z8;
        this.A05 = z9;
    }

    public final C10239t A00(int i9) {
        return new C10239t(this.A04.A00(i9), this.A03, this.A02, this.A00, this.A01, this.A06, this.A05);
    }

    public final C10239t A01(long j7) {
        return new C10239t(this.A04, j7, this.A02, this.A00, this.A01, this.A06, this.A05);
    }
}
