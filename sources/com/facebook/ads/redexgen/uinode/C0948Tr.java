package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Tr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0948Tr extends KT {
    public final /* synthetic */ C0781Ng A00;

    public C0948Tr(C0781Ng c0781Ng) {
        this.A00 = c0781Ng;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        boolean z10;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z10 = this.A00.A08;
        if (z10) {
            handler = this.A00.A0D;
            runnable = this.A00.A0F;
            handler.postDelayed(runnable, 250L);
        }
    }
}
