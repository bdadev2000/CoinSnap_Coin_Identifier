package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.8H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C8H extends AbstractC0820Qx {
    public final /* synthetic */ OY A00;

    public C8H(OY oy) {
        this.A00 = oy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0821Qy c0821Qy) {
        T7 t7;
        Handler handler;
        t7 = this.A00.A01;
        if (t7 == null || c0821Qy.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new R3(this));
    }
}
