package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Sn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0862Sn implements InterfaceC0813Qq {
    public final View A00;
    public final C1045Zs A01;

    public C0862Sn(C1045Zs c1045Zs, View view) {
        this.A01 = c1045Zs;
        this.A00 = view;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0813Qq
    public final double A8i() {
        C0834Rl result = C0833Rk.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
