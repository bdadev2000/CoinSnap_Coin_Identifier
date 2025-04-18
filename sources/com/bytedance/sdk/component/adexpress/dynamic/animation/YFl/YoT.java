package com.bytedance.sdk.component.adexpress.dynamic.animation.YFl;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class YoT extends AlY {
    public YoT(View view, com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl yFl) {
        super(view, yFl);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.AlY
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> YFl() {
        int i10;
        int i11;
        this.tN.setTag(2097610711, Integer.valueOf(this.Sg.AlY()));
        View view = this.tN;
        if (view != null && com.bytedance.sdk.component.adexpress.AlY.Sg.YFl(view.getContext())) {
            i11 = 0;
            i10 = 1;
        } else {
            i10 = 0;
            i11 = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tN, "shineValue", i10, i11).setDuration((int) (this.Sg.nc() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(YFl(duration));
        return arrayList;
    }
}
