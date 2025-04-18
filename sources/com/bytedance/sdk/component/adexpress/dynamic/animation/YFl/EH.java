package com.bytedance.sdk.component.adexpress.dynamic.animation.YFl;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class EH extends AlY {
    public EH(View view, com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl yFl) {
        super(view, yFl);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.AlY
    public List<ObjectAnimator> YFl() {
        float f10;
        float YFl = com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.Sg.vc());
        float YFl2 = com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.Sg.DSW());
        float f11 = 0.0f;
        if ("reverse".equals(this.Sg.rkt())) {
            f10 = YFl2;
            YFl2 = 0.0f;
            f11 = YFl;
            YFl = 0.0f;
        } else {
            f10 = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.AlY.Sg.YFl(this.tN.getContext())) {
            YFl = -YFl;
            f11 = -f11;
        }
        this.tN.setTranslationX(YFl);
        this.tN.setTranslationY(YFl2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tN, "translationX", YFl, f11).setDuration((int) (this.Sg.nc() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.tN, "translationY", YFl2, f10).setDuration((int) (this.Sg.nc() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(YFl(duration));
        arrayList.add(YFl(duration2));
        return arrayList;
    }
}
