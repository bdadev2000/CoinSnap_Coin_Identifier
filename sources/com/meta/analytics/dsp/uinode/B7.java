package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public abstract class B7 {
    public int A00;

    public final void A00(int i9) {
        this.A00 |= i9;
    }

    public final void A01(int i9) {
        this.A00 &= i9 ^ (-1);
    }

    public final void A02(int i9) {
        this.A00 = i9;
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

    public final boolean A06(int i9) {
        return (this.A00 & i9) == i9;
    }

    public void A07() {
        this.A00 = 0;
    }
}
