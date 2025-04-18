package com.bytedance.sdk.component.adexpress.dynamic.animation.YFl;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class GA extends AlY {
    public GA(View view, com.bytedance.sdk.component.adexpress.dynamic.AlY.YFl yFl) {
        super(view, yFl);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.YFl.AlY
    public List<ObjectAnimator> YFl() {
        View view = this.tN;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.eT)) {
            View view2 = (View) this.tN.getParent();
            this.tN = view2;
            ((ViewGroup) view2).setClipChildren(true);
            ((ViewGroup) this.tN.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.tN, "stretchValue", 0.0f, 1.0f).setDuration((int) (this.Sg.nc() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(YFl(duration));
        return arrayList;
    }
}
