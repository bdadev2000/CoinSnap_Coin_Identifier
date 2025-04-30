package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;

/* loaded from: classes.dex */
public class DynamicLeisureWidget extends DynamicBaseWidgetImp {
    public DynamicLeisureWidget(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        this.QR = 0;
        this.ku = 0;
        return super.getWidgetLayoutParams();
    }
}
