package com.facebook.ads.redexgen.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Sn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0918Sn implements C5T {
    public final /* synthetic */ C9Y A00;

    public C0918Sn(C9Y c9y) {
        this.A00 = c9y;
    }

    @Override // com.facebook.ads.redexgen.uinode.C5T
    public final boolean A8u() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        return !atomicBoolean.get() || this.A00.A0T();
    }
}
