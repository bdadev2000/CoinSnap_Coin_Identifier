package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import a4.j;
import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class EH extends vc {
    com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH Sg;
    String YFl;

    public EH(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh, String str) {
        super(context, dynamicRootView, qsh);
        this.YFl = str;
        this.Sg = qsh;
        com.bytedance.sdk.component.adexpress.vc.nc lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.vc.nc getLottieView() {
        String str;
        com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh = this.GA;
        if (qsh == null || qsh.nc() == null || this.eT == null || TextUtils.isEmpty(this.YFl)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.AlY.vc wN = this.GA.nc().wN();
        if (wN != null) {
            str = wN.Vmj();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String k10 = j.k(new StringBuilder(), this.YFl, "static/lotties/", str, ".json");
        com.bytedance.sdk.component.adexpress.vc.nc ncVar = new com.bytedance.sdk.component.adexpress.vc.nc(this.eT);
        ncVar.setImageLottieTosPath(k10);
        ncVar.qsH();
        return ncVar;
    }
}
