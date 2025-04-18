package com.bytedance.sdk.component.adexpress.dynamic.animation.YFl;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class eT extends AlY {
    public eT(View view, com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl yFl) {
        super(view, yFl);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null && (viewGroup2 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN)) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
                if (viewGroup3 != null && (viewGroup3 instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN)) {
                    viewGroup3.setClipChildren(false);
                    viewGroup3.setClipToPadding(false);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.AlY
    public List<ObjectAnimator> YFl() {
        float f10;
        float eT = (float) this.Sg.eT();
        float YoT = (float) this.Sg.YoT();
        String rkt = this.Sg.rkt();
        float f11 = 1.0f;
        if (!"reverse".equals(rkt) && !"alternate-reverse".equals(rkt)) {
            f10 = YoT;
            YoT = 1.0f;
            f11 = eT;
            eT = 1.0f;
        } else {
            f10 = 1.0f;
        }
        this.tN.setTag(2097610710, this.Sg.Sg());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tN, "scaleX", eT, f11).setDuration((int) (this.Sg.nc() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.tN, "scaleY", YoT, f10).setDuration((int) (this.Sg.nc() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(YFl(duration));
        arrayList.add(YFl(duration2));
        return arrayList;
    }
}
