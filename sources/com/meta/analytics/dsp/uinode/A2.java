package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network.dex */
public class A2 extends AbstractC1411Ps {
    public final /* synthetic */ T4 A00;

    public A2(T4 t42) {
        this.A00 = t42;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1412Pt c1412Pt) {
        new Handler(Looper.getMainLooper()).post(new PS(this));
    }
}
