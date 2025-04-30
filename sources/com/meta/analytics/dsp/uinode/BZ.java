package com.meta.analytics.dsp.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class BZ extends SA {
    public BZ(C1636Yn c1636Yn) {
        super(c1636Yn);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int newWidthSpec = View.MeasureSpec.getMode(i9);
        if (newWidthSpec == 1073741824) {
            i10 = i9;
        } else {
            int newWidthSpec2 = View.MeasureSpec.getMode(i10);
            if (newWidthSpec2 == 1073741824) {
                i9 = i10;
            }
        }
        super.onMeasure(i9, i10);
    }
}
