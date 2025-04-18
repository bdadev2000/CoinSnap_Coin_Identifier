package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Pj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0836Pj {
    public final int[] A00(View view, int i10, int i11) {
        C03374p c03374p = (C03374p) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i10, view.getPaddingLeft() + view.getPaddingRight(), c03374p.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i11, childWidthSpec + view.getPaddingBottom(), c03374p.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c03374p.leftMargin + c03374p.rightMargin, childWidthSpec3 + c03374p.bottomMargin + c03374p.topMargin};
    }
}
