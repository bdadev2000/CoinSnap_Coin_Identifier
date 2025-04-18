package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class UN implements O7 {
    public final WeakReference<BP> A00;

    public UN(BP bp) {
        this.A00 = new WeakReference<>(bp);
    }

    public /* synthetic */ UN(BP bp, BU bu) {
        this(bp);
    }

    @Override // com.instagram.common.viewpoint.core.O7
    public final void AC8(boolean z2) {
        BP cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A06 = z2;
            cardLayout.A05();
        }
    }
}
