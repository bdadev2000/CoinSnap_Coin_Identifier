package com.meta.analytics.dsp.uinode;

/* loaded from: assets/audience_network.dex */
public abstract class C6 {
    public final C4 A00;

    public abstract void A0B(C1217Hz c1217Hz, long j7) throws C10259v;

    public abstract boolean A0C(C1217Hz c1217Hz) throws C10259v;

    public C6(C4 c42) {
        this.A00 = c42;
    }

    public final void A00(C1217Hz c1217Hz, long j7) throws C10259v {
        if (A0C(c1217Hz)) {
            A0B(c1217Hz, j7);
        }
    }
}
