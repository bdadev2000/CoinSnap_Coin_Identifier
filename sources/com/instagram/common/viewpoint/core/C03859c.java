package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.9c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C03859c extends AbstractC0856Sh {
    public final /* synthetic */ C03839a A00;

    public C03859c(C03839a c03839a) {
        this.A00 = c03839a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0857Si c0857Si) {
        new Handler(Looper.getMainLooper()).post(new QA(this));
    }
}
