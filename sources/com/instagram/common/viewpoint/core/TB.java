package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class TB extends KY {
    public final /* synthetic */ T7 A00;

    public TB(T7 t7) {
        this.A00 = t7;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        boolean z2;
        C03798w c03798w;
        Handler handler;
        int i2;
        z2 = this.A00.A03;
        if (!z2) {
            c03798w = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c03798w.A02(new AbstractC0859Sk(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.9O
            });
            handler = this.A00.A07;
            i2 = this.A00.A00;
            handler.postDelayed(this, i2);
        }
    }
}
