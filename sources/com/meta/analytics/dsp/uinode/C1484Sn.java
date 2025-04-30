package com.meta.analytics.dsp.uinode;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Sn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1484Sn implements C5T {
    public final /* synthetic */ C9Y A00;

    public C1484Sn(C9Y c9y) {
        this.A00 = c9y;
    }

    @Override // com.meta.analytics.dsp.uinode.C5T
    public final boolean A8u() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        return !atomicBoolean.get() || this.A00.A0T();
    }
}
