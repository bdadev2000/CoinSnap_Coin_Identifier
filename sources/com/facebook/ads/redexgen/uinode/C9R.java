package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.9R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C9R extends AbstractC0845Ps {
    public final /* synthetic */ C9Q A00;

    public C9R(C9Q c9q) {
        this.A00 = c9q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0846Pt c0846Pt) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0834Ph(this));
    }
}
