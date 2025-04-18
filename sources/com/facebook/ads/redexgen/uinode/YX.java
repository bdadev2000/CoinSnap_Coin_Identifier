package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YX implements KJ {
    @Override // com.facebook.ads.redexgen.uinode.KJ
    public final void AFC(Throwable th2, Object obj) {
        if (obj instanceof InterfaceC03947b) {
            C1070Yn adContext = ((InterfaceC03947b) obj).A5t();
            if (adContext != null) {
                adContext.A0O(th2);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C1070Yn)) {
            return;
        }
        ((C1070Yn) context).A0O(th2);
    }
}
