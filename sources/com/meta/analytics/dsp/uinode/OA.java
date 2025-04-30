package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public abstract class OA {
    public static final int A00 = AbstractC1303Lo.A00();

    public static void A00(C1636Yn c1636Yn, ViewGroup viewGroup, String str) {
        new AsyncTaskC1513Tq(viewGroup, c1636Yn).A07(str);
        View view = new View(c1636Yn);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC1303Lo.A0R(view, c1636Yn);
        viewGroup.addView(view, 0);
    }
}
