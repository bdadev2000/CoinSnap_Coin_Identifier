package com.bytedance.sdk.component.adexpress.dynamic.animation.YFl;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class pDU extends AlY {
    public pDU(View view, com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl yFl) {
        super(view, yFl);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.AlY
    public List<ObjectAnimator> YFl() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tN, "rotation", 0.0f, this.Sg.wN(), 0.0f, this.Sg.wN(), 0.0f).setDuration((int) (this.Sg.nc() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(YFl(duration));
        return arrayList;
    }
}
