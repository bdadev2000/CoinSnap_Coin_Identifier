package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.9a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C10059a extends AbstractC1411Ps {
    public final /* synthetic */ C1494Sx A00;

    public C10059a(C1494Sx c1494Sx) {
        this.A00 = c1494Sx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC09988s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1412Pt c1412Pt) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1393Pa(this));
    }
}
