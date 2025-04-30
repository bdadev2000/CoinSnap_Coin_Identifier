package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Xj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1606Xj implements C1 {
    public final long A00;
    public final C0 A01;

    public C1606Xj(long j7) {
        this(j7, 0L);
    }

    public C1606Xj(long j7, long j9) {
        this.A00 = j7;
        this.A01 = new C0(j9 == 0 ? C2.A03 : new C2(0L, j9));
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j7) {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return false;
    }
}
