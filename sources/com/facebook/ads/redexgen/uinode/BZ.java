package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class BZ extends SA {
    public BZ(C1070Yn c1070Yn) {
        super(c1070Yn);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int newWidthSpec = View.MeasureSpec.getMode(i10);
        if (newWidthSpec == 1073741824) {
            i11 = i10;
        } else {
            int newWidthSpec2 = View.MeasureSpec.getMode(i11);
            if (newWidthSpec2 == 1073741824) {
                i10 = i11;
            }
        }
        super.onMeasure(i10, i11);
    }
}
