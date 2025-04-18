package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public abstract class OA {
    public static final int A00 = AbstractC0737Lo.A00();

    public static void A00(C1070Yn c1070Yn, ViewGroup viewGroup, String str) {
        new AsyncTaskC0947Tq(viewGroup, c1070Yn).A07(str);
        View view = new View(c1070Yn);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC0737Lo.A0R(view, c1070Yn);
        viewGroup.addView(view, 0);
    }
}
