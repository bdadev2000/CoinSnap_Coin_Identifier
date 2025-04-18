package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public final class F9 {
    public F9 A00;
    public C0612Gl A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public F9(long j3, int i10) {
        this.A04 = j3;
        this.A03 = i10 + j3;
    }

    public final int A00(long j3) {
        return ((int) (j3 - this.A04)) + this.A01.A00;
    }

    public final F9 A01() {
        this.A01 = null;
        F9 f92 = this.A00;
        this.A00 = null;
        return f92;
    }

    public final void A02(C0612Gl c0612Gl, F9 f92) {
        this.A01 = c0612Gl;
        this.A00 = f92;
        this.A02 = true;
    }
}
