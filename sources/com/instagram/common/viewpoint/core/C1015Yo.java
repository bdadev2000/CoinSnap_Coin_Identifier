package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Yo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1015Yo implements C6 {
    public final long A00;
    public final C5 A01;

    public C1015Yo(long j2) {
        this(j2, 0L);
    }

    public C1015Yo(long j2, long j3) {
        this.A00 = j2;
        this.A01 = new C5(j3 == 0 ? C7.A04 : new C7(0L, j3));
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final long A7F() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final C5 A8H(long j2) {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.C6
    public final boolean A9h() {
        return false;
    }
}
