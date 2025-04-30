package com.meta.analytics.dsp.uinode;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ti, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1505Ti implements InterfaceC1348Nh {
    public final WeakReference<BK> A00;

    public C1505Ti(BK bk) {
        this.A00 = new WeakReference<>(bk);
    }

    public /* synthetic */ C1505Ti(BK bk, BP bp) {
        this(bk);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC1348Nh
    public final void ABh(boolean z8) {
        BK cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z8;
            cardLayout.A04();
        }
    }
}
