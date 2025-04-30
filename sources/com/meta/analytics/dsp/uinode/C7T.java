package com.meta.analytics.dsp.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.7T, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7T extends MX {
    public final /* synthetic */ L7 A00;

    public C7T(L7 l7) {
        this.A00 = l7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MY my) {
        SA sa;
        Handler handler;
        sa = this.A00.A01;
        if (sa == null || my.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new QX(this));
    }
}
