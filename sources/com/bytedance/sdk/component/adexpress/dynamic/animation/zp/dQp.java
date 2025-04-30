package com.bytedance.sdk.component.adexpress.dynamic.animation.zp;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class dQp extends jU {
    public dQp(View view, com.bytedance.sdk.component.adexpress.dynamic.KS.zp zpVar) {
        super(view, zpVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zp.jU
    public List<ObjectAnimator> zp() {
        float f9;
        float zp = com.bytedance.sdk.component.adexpress.jU.QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.lMd.HWF());
        float zp2 = com.bytedance.sdk.component.adexpress.jU.QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.lMd.QR());
        float f10 = 0.0f;
        if ("reverse".equals(this.lMd.KVG())) {
            f9 = zp2;
            zp2 = 0.0f;
            f10 = zp;
            zp = 0.0f;
        } else {
            f9 = 0.0f;
        }
        if (com.bytedance.sdk.component.adexpress.jU.lMd.zp(this.KS.getContext())) {
            zp = -zp;
            f10 = -f10;
        }
        this.KS.setTranslationX(zp);
        this.KS.setTranslationY(zp2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.KS, "translationX", zp, f10).setDuration((int) (this.lMd.dT() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.KS, "translationY", zp2, f9).setDuration((int) (this.lMd.dT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zp(duration));
        arrayList.add(zp(duration2));
        return arrayList;
    }
}
