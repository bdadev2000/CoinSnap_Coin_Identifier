package com.bytedance.sdk.component.adexpress.dynamic.animation.zp;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Bj extends jU {
    public Bj(View view, com.bytedance.sdk.component.adexpress.dynamic.KS.zp zpVar) {
        super(view, zpVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null && (viewGroup2 instanceof DynamicBaseWidget)) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
                if (viewGroup3 != null && (viewGroup3 instanceof DynamicBaseWidget)) {
                    viewGroup3.setClipChildren(false);
                    viewGroup3.setClipToPadding(false);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zp.jU
    public List<ObjectAnimator> zp() {
        float f9;
        float Bj = (float) this.lMd.Bj();
        float vDp = (float) this.lMd.vDp();
        String KVG = this.lMd.KVG();
        float f10 = 1.0f;
        if (!"reverse".equals(KVG) && !"alternate-reverse".equals(KVG)) {
            f9 = vDp;
            vDp = 1.0f;
            f10 = Bj;
            Bj = 1.0f;
        } else {
            f9 = 1.0f;
        }
        this.KS.setTag(2097610710, this.lMd.lMd());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.KS, "scaleX", Bj, f10).setDuration((int) (this.lMd.dT() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.KS, "scaleY", vDp, f9).setDuration((int) (this.lMd.dT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zp(duration));
        arrayList.add(zp(duration2));
        return arrayList;
    }
}
