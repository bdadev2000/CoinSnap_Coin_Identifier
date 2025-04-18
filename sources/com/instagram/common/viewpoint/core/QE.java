package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public final class QE {
    public final int[] A00(View view, int i2, int i3) {
        C02814p c02814p = (C02814p) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i2, view.getPaddingLeft() + view.getPaddingRight(), c02814p.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i3, childWidthSpec + view.getPaddingBottom(), c02814p.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c02814p.leftMargin + c02814p.rightMargin, childWidthSpec3 + c02814p.bottomMargin + c02814p.topMargin};
    }
}
