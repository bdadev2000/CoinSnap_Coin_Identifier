package com.bytedance.sdk.component.adexpress.dynamic.animation.zp;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class KVG extends jU {
    public KVG(View view, com.bytedance.sdk.component.adexpress.dynamic.KS.zp zpVar) {
        super(view, zpVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zp.jU
    public List<ObjectAnimator> zp() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.KS, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.jU.QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), 20.0f), 0.0f, -com.bytedance.sdk.component.adexpress.jU.QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), 20.0f), 0.0f).setDuration((int) (this.lMd.dT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zp(duration));
        return arrayList;
    }
}
