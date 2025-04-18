package com.bytedance.adsdk.ugeno.yoga;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.qsH;

/* loaded from: classes.dex */
public class YFl extends ViewGroup {
    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof YFl) {
            throw null;
        }
        YoT YFl = GA.YFl();
        qsH.YFl(new qsH.YFl(layoutParams), YFl, view);
        YFl.YFl(view);
        YFl.YFl((NjR) new qsH.Sg());
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qsH.YFl;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new qsH.YFl(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new qsH.YFl(layoutParams);
    }

    public YoT getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
