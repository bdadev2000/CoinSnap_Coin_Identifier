package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public abstract class C6 {
    public final C4 A00;

    public abstract void A0B(C0651Hz c0651Hz, long j3) throws C04599v;

    public abstract boolean A0C(C0651Hz c0651Hz) throws C04599v;

    public C6(C4 c42) {
        this.A00 = c42;
    }

    public final void A00(C0651Hz c0651Hz, long j3) throws C04599v {
        if (A0C(c0651Hz)) {
            A0B(c0651Hz, j3);
        }
    }
}
