package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public abstract class OB {
    public static void A00(View view, boolean z2, View.OnClickListener onClickListener) {
        if (!z2) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z2) {
                return;
            }
            OA oa = new OA(onClickListener);
            view.setOnClickListener(oa);
            view.setOnTouchListener(new O9(oa));
        }
    }
}
