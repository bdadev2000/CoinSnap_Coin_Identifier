package com.bytedance.sdk.component.adexpress.dynamic.animation.YFl;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class qsH extends AlY {
    public qsH(View view, com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl yFl) {
        super(view, yFl);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.AlY
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> YFl() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tN, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.Sg.nc() * 1000.0d));
        ((ViewGroup) this.tN.getParent()).setClipChildren(false);
        ((ViewGroup) this.tN.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.tN.getParent().getParent().getParent()).setClipChildren(false);
        this.tN.setTag(2097610712, this.Sg.qsH());
        ArrayList arrayList = new ArrayList();
        arrayList.add(YFl(duration));
        return arrayList;
    }
}
