package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04499k {
    public int A00;
    public int A01;
    public C04609w A02;
    public boolean A03;

    public C04499k() {
    }

    public final void A03(int i10) {
        this.A01 += i10;
    }

    public final void A04(int i10) {
        if (this.A03 && this.A00 != 4) {
            AbstractC0626Ha.A03(i10 == 4);
        } else {
            this.A03 = true;
            this.A00 = i10;
        }
    }

    public final void A05(C04609w c04609w) {
        this.A02 = c04609w;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(C04609w c04609w) {
        return c04609w != this.A02 || this.A01 > 0 || this.A03;
    }
}
