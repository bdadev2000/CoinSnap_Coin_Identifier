package com.bytedance.sdk.component.adexpress.dynamic.animation.zp;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class zp extends jU {
    public zp(View view, com.bytedance.sdk.component.adexpress.dynamic.KS.zp zpVar) {
        super(view, zpVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zp.jU
    public List<ObjectAnimator> zp() {
        float vwr = this.lMd.vwr() / 100.0f;
        float pvr = this.lMd.pvr() / 100.0f;
        if ("reverse".equals(this.lMd.KVG()) && this.lMd.rV() <= 0.0d) {
            pvr = vwr;
            vwr = pvr;
        }
        this.KS.setAlpha(vwr);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.KS, "alpha", vwr, pvr).setDuration((int) (this.lMd.dT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zp(duration));
        return arrayList;
    }
}
