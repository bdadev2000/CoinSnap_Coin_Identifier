package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public class VOe extends vc {
    public VOe(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        View view = new View(context);
        this.EH = view;
        addView(view, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        super.NjR();
        this.EH.setBackgroundColor(this.YoT.dXO());
        return true;
    }
}
