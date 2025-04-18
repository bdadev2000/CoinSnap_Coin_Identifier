package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network.dex */
public class A7 extends AbstractC0856Sh {
    public final /* synthetic */ A6 A00;

    public A7(A6 a6) {
        this.A00 = a6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC03808x
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C0857Si c0857Si) {
        new Handler(Looper.getMainLooper()).post(new Q0(this));
    }
}
