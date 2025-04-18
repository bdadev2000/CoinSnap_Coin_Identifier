package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Uf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0906Uf implements O7 {
    public final WeakReference<BZ> A00;

    public C0906Uf(BZ bz) {
        this.A00 = new WeakReference<>(bz);
    }

    public /* synthetic */ C0906Uf(BZ bz, C0442Bk c0442Bk) {
        this(bz);
    }

    @Override // com.instagram.common.viewpoint.core.O7
    public final void AC8(boolean z2) {
        BZ cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z2;
            cardLayout.A04();
        }
    }
}
