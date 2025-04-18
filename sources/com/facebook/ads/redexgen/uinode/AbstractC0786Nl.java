package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0786Nl {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z10) {
                return;
            }
            ViewOnClickListenerC0785Nk viewOnClickListenerC0785Nk = new ViewOnClickListenerC0785Nk(onClickListener);
            view.setOnClickListener(viewOnClickListenerC0785Nk);
            view.setOnTouchListener(new ViewOnTouchListenerC0784Nj(viewOnClickListenerC0785Nk));
        }
    }
}
