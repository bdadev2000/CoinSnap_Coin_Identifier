package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0951Tu extends KT {
    public final WeakReference<RE> A00;

    public C0951Tu(RE re2) {
        this.A00 = new WeakReference<>(re2);
    }

    public C0951Tu(WeakReference<RE> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        RE viewabilityChecker = this.A00.get();
        if (viewabilityChecker != null) {
            viewabilityChecker.A0U();
        }
    }
}
