package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1029Zc implements KO {
    @Override // com.instagram.common.viewpoint.core.KO
    public final void AFg(Throwable th, Object obj) {
        if (obj instanceof InterfaceC03417e) {
            C1045Zs adContext = ((InterfaceC03417e) obj).A6G();
            if (adContext != null) {
                adContext.A0P(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C1045Zs)) {
            return;
        }
        ((C1045Zs) context).A0P(th);
    }
}
