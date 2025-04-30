package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1352Nl {
    public static void A00(View view, boolean z8, View.OnClickListener onClickListener) {
        if (!z8) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z8) {
                return;
            }
            ViewOnClickListenerC1351Nk viewOnClickListenerC1351Nk = new ViewOnClickListenerC1351Nk(onClickListener);
            view.setOnClickListener(viewOnClickListenerC1351Nk);
            view.setOnTouchListener(new ViewOnTouchListenerC1350Nj(viewOnClickListenerC1351Nk));
        }
    }
}
