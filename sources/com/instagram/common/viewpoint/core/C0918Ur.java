package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ur, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0918Ur extends KY {
    public final WeakReference<C0833Rk> A00;

    public C0918Ur(C0833Rk c0833Rk) {
        this.A00 = new WeakReference<>(c0833Rk);
    }

    public C0918Ur(WeakReference<C0833Rk> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        C0833Rk viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
