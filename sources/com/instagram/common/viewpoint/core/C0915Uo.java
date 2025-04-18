package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Uo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0915Uo extends KY {
    public final /* synthetic */ O6 A00;

    public C0915Uo(O6 o6) {
        this.A00 = o6;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        boolean z2;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z2 = this.A00.A08;
        if (z2) {
            handler = this.A00.A0D;
            runnable = this.A00.A0F;
            handler.postDelayed(runnable, 250L);
        }
    }
}
