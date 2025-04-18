package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public final class FE {
    public FE A00;
    public C0561Gq A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public FE(long j2, int i2) {
        this.A04 = j2;
        this.A03 = i2 + j2;
    }

    public final int A00(long j2) {
        return ((int) (j2 - this.A04)) + this.A01.A00;
    }

    public final FE A01() {
        this.A01 = null;
        FE fe = this.A00;
        this.A00 = null;
        return fe;
    }

    public final void A02(C0561Gq c0561Gq, FE fe) {
        this.A01 = c0561Gq;
        this.A00 = fe;
        this.A02 = true;
    }
}
