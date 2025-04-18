package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ti, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0939Ti implements InterfaceC0782Nh {
    public final WeakReference<BK> A00;

    public C0939Ti(BK bk) {
        this.A00 = new WeakReference<>(bk);
    }

    public /* synthetic */ C0939Ti(BK bk, BP bp) {
        this(bk);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0782Nh
    public final void ABh(boolean z10) {
        BK cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z10;
            cardLayout.A04();
        }
    }
}
