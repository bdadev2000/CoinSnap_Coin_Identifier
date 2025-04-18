package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Xj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1040Xj implements C1 {
    public final long A00;
    public final C0 A01;

    public C1040Xj(long j3) {
        this(j3, 0L);
    }

    public C1040Xj(long j3, long j10) {
        this.A00 = j3;
        this.A01 = new C0(j10 == 0 ? C2.A03 : new C2(0L, j10));
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final long A6r() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final C0 A7t(long j3) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final boolean A9I() {
        return false;
    }
}
