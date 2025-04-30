package com.bytedance.sdk.component.adexpress.dynamic.animation.zp;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class QR extends jU {
    public QR(View view, com.bytedance.sdk.component.adexpress.dynamic.KS.zp zpVar) {
        super(view, zpVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zp.jU
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> zp() {
        this.KS.setTag(2097610709, Integer.valueOf(this.lMd.KS()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.KS, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.lMd.dT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zp(duration));
        return arrayList;
    }
}
