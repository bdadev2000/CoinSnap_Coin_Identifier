package com.bytedance.sdk.component.adexpress.dynamic.animation.zp;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class HWF extends jU {
    public HWF(View view, com.bytedance.sdk.component.adexpress.dynamic.KS.zp zpVar) {
        super(view, zpVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zp.jU
    public List<ObjectAnimator> zp() {
        float f9 = this.KS.getLayoutParams().width;
        this.KS.setTranslationX(f9);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.KS, "translationX", f9, 0.0f).setDuration((int) (this.lMd.dT() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.KS, "alpha", 0.0f, 1.0f).setDuration((int) (this.lMd.dT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zp(duration));
        arrayList.add(zp(duration2));
        return arrayList;
    }
}
