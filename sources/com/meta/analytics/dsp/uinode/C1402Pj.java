package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Pj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1402Pj {
    public final int[] A00(View view, int i9, int i10) {
        C09034p c09034p = (C09034p) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i9, view.getPaddingLeft() + view.getPaddingRight(), c09034p.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i10, childWidthSpec + view.getPaddingBottom(), c09034p.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c09034p.leftMargin + c09034p.rightMargin, childWidthSpec3 + c09034p.bottomMargin + c09034p.topMargin};
    }
}
