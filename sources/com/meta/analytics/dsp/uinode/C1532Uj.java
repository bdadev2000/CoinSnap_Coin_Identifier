package com.meta.analytics.dsp.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Uj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1532Uj extends KT {
    public final /* synthetic */ L9 A00;

    public C1532Uj(L9 l9) {
        this.A00 = l9;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        Handler handler;
        long j7;
        if (this.A00.A05()) {
            this.A00.A02();
            handler = this.A00.A05;
            j7 = this.A00.A02;
            handler.postDelayed(this, j7);
        }
    }
}
