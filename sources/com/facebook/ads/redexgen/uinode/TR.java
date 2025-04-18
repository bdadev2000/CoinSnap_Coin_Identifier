package com.facebook.ads.redexgen.uinode;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class TR implements InterfaceC0782Nh {
    public final WeakReference<B4> A00;

    public TR(B4 b42) {
        this.A00 = new WeakReference<>(b42);
    }

    public /* synthetic */ TR(B4 b42, BH bh2) {
        this(b42);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0782Nh
    public final void ABh(boolean z10) {
        B4 cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A06 = z10;
            cardLayout.A04();
        }
    }
}
