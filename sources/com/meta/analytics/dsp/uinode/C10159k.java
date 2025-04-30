package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.9k, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10159k {
    public int A00;
    public int A01;
    public C10269w A02;
    public boolean A03;

    public C10159k() {
    }

    public final void A03(int i9) {
        this.A01 += i9;
    }

    public final void A04(int i9) {
        if (this.A03 && this.A00 != 4) {
            AbstractC1192Ha.A03(i9 == 4);
        } else {
            this.A03 = true;
            this.A00 = i9;
        }
    }

    public final void A05(C10269w c10269w) {
        this.A02 = c10269w;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(C10269w c10269w) {
        return c10269w != this.A02 || this.A01 > 0 || this.A03;
    }
}
