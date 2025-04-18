package com.bytedance.sdk.component.adexpress.dynamic.animation.YFl;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DSW extends AlY {
    public DSW(View view, com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl yFl) {
        super(view, yFl);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.AlY
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> YFl() {
        this.tN.setTag(2097610709, Integer.valueOf(this.Sg.tN()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tN, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.Sg.nc() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(YFl(duration));
        return arrayList;
    }
}
