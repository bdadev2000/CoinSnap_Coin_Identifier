package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Ob, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0746Ob {
    public static final int A00 = M3.A00();

    public static void A00(C1045Zs c1045Zs, ViewGroup viewGroup, String str) {
        new AsyncTaskC0914Un(viewGroup, c1045Zs).A07(str);
        View view = new View(c1045Zs);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        M3.A0R(view, c1045Zs);
        viewGroup.addView(view, 0);
    }
}
