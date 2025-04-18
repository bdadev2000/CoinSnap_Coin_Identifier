package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04579t {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C0566Eo A04;
    public final boolean A05;
    public final boolean A06;

    public C04579t(C0566Eo c0566Eo, long j3, long j10, long j11, long j12, boolean z10, boolean z11) {
        this.A04 = c0566Eo;
        this.A03 = j3;
        this.A02 = j10;
        this.A00 = j11;
        this.A01 = j12;
        this.A06 = z10;
        this.A05 = z11;
    }

    public final C04579t A00(int i10) {
        return new C04579t(this.A04.A00(i10), this.A03, this.A02, this.A00, this.A01, this.A06, this.A05);
    }

    public final C04579t A01(long j3) {
        return new C04579t(this.A04, j3, this.A02, this.A00, this.A01, this.A06, this.A05);
    }
}
