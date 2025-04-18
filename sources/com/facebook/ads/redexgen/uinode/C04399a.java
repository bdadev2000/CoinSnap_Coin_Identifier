package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.9a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C04399a extends AbstractC0845Ps {
    public final /* synthetic */ C0928Sx A00;

    public C04399a(C0928Sx c0928Sx) {
        this.A00 = c0928Sx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC04328s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0846Pt c0846Pt) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0827Pa(this));
    }
}
