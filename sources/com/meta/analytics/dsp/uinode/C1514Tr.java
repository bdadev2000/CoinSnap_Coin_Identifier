package com.meta.analytics.dsp.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Tr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1514Tr extends KT {
    public final /* synthetic */ C1347Ng A00;

    public C1514Tr(C1347Ng c1347Ng) {
        this.A00 = c1347Ng;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        boolean z8;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z8 = this.A00.A08;
        if (z8) {
            handler = this.A00.A0D;
            runnable = this.A00.A0F;
            handler.postDelayed(runnable, 250L);
        }
    }
}
