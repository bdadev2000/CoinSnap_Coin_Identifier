package com.bytedance.sdk.component.adexpress.dynamic.animation.zp;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class tG extends jU {
    public tG(View view, com.bytedance.sdk.component.adexpress.dynamic.KS.zp zpVar) {
        super(view, zpVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zp.jU
    public List<ObjectAnimator> zp() {
        View view = this.KS;
        if ((view instanceof ImageView) && (view.getParent() instanceof DynamicImageView)) {
            View view2 = (View) this.KS.getParent();
            this.KS = view2;
            ((ViewGroup) view2).setClipChildren(true);
            ((ViewGroup) this.KS.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.KS, "stretchValue", 0.0f, 1.0f).setDuration((int) (this.lMd.dT() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(zp(duration));
        return arrayList;
    }
}
