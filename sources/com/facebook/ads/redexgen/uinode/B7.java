package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public abstract class B7 {
    public int A00;

    public final void A00(int i10) {
        this.A00 |= i10;
    }

    public final void A01(int i10) {
        this.A00 &= i10 ^ (-1);
    }

    public final void A02(int i10) {
        this.A00 = i10;
    }

    public final boolean A03() {
        return A06(Integer.MIN_VALUE);
    }

    public final boolean A04() {
        return A06(4);
    }

    public final boolean A05() {
        return A06(1);
    }

    public final boolean A06(int i10) {
        return (this.A00 & i10) == i10;
    }

    public void A07() {
        this.A00 = 0;
    }
}
