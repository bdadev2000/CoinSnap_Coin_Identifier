package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import Q7.n0;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.KS.HWF;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.widget.DynamicLottieView;

/* loaded from: classes.dex */
public class DynamicLottie extends DynamicBaseWidgetImp {
    ku lMd;
    String zp;

    public DynamicLottie(Context context, DynamicRootView dynamicRootView, ku kuVar, String str) {
        super(context, dynamicRootView, kuVar);
        this.zp = str;
        this.lMd = kuVar;
        DynamicLottieView lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private DynamicLottieView getLottieView() {
        String str;
        ku kuVar = this.tG;
        if (kuVar == null || kuVar.dT() == null || this.Bj == null || TextUtils.isEmpty(this.zp)) {
            return null;
        }
        HWF COT = this.tG.dT().COT();
        if (COT != null) {
            str = COT.Np();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String m = n0.m(new StringBuilder(), this.zp, "static/lotties/", str, ".json");
        DynamicLottieView dynamicLottieView = new DynamicLottieView(this.Bj);
        dynamicLottieView.setImageLottieTosPath(m);
        dynamicLottieView.HWF();
        return dynamicLottieView;
    }
}
