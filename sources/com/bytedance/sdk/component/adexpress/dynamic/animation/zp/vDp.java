package com.bytedance.sdk.component.adexpress.dynamic.animation.zp;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class vDp extends jU {
    public vDp(View view, com.bytedance.sdk.component.adexpress.dynamic.KS.zp zpVar) {
        super(view, zpVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zp.jU
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> zp() {
        int i9;
        int i10;
        this.KS.setTag(2097610711, Integer.valueOf(this.lMd.jU()));
        View view = this.KS;
        if (view != null && com.bytedance.sdk.component.adexpress.jU.lMd.zp(view.getContext())) {
            i10 = 0;
            i9 = 1;
        } else {
            i9 = 0;
            i10 = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.KS, "shineValue", i9, i10).setDuration((int) (this.lMd.dT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zp(duration));
        return arrayList;
    }
}
