package com.bytedance.sdk.component.adexpress.dynamic.animation.zp;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ku extends jU {
    public ku(View view, com.bytedance.sdk.component.adexpress.dynamic.KS.zp zpVar) {
        super(view, zpVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zp.jU
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> zp() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.KS, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.lMd.dT() * 1000.0d));
        ((ViewGroup) this.KS.getParent()).setClipChildren(false);
        ((ViewGroup) this.KS.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.KS.getParent().getParent().getParent()).setClipChildren(false);
        this.KS.setTag(2097610712, this.lMd.ku());
        ArrayList arrayList = new ArrayList();
        arrayList.add(zp(duration));
        return arrayList;
    }
}
