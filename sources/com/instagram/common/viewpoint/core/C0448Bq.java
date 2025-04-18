package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0448Bq extends T7 {
    public C0448Bq(C1045Zs c1045Zs) {
        super(c1045Zs);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int newWidthSpec = View.MeasureSpec.getMode(i2);
        if (newWidthSpec == 1073741824) {
            i3 = i2;
        } else {
            int newWidthSpec2 = View.MeasureSpec.getMode(i3);
            if (newWidthSpec2 == 1073741824) {
                i2 = i3;
            }
        }
        super.onMeasure(i2, i3);
    }
}
