package com.bytedance.sdk.component.adexpress.dynamic.animation.YFl;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class vc extends AlY {
    public vc(View view, com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl yFl) {
        super(view, yFl);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.AlY
    public List<ObjectAnimator> YFl() {
        float f10 = this.tN.getLayoutParams().width;
        this.tN.setTranslationX(f10);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tN, "translationX", f10, 0.0f).setDuration((int) (this.Sg.nc() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.tN, "alpha", 0.0f, 1.0f).setDuration((int) (this.Sg.nc() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(YFl(duration));
        arrayList.add(YFl(duration2));
        return arrayList;
    }
}
