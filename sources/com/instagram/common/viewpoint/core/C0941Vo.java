package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Vo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0941Vo extends KY {
    public final /* synthetic */ LH A00;

    public C0941Vo(LH lh) {
        this.A00 = lh;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        Handler handler;
        long j2;
        if (this.A00.A05()) {
            this.A00.A02();
            handler = this.A00.A05;
            j2 = this.A00.A02;
            handler.postDelayed(this, j2);
        }
    }
}
