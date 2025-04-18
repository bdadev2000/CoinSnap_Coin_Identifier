package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.Ac, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0410Ac extends AbstractC0856Sh {
    public final /* synthetic */ C0409Ab A00;

    public C0410Ac(C0409Ab c0409Ab) {
        this.A00 = c0409Ab;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0857Si c0857Si) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0789Ps(this));
    }
}
