package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class NjR extends vc {
    public NjR(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            this.EH = new ImageView(context);
        } else {
            this.EH = new com.bytedance.sdk.component.adexpress.vc.NjR(context);
        }
        this.EH.setTag(3);
        addView(this.EH, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.EH);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        super.NjR();
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            Drawable YFl = com.bytedance.sdk.component.adexpress.AlY.tN.YFl(getContext(), this.YoT);
            if (YFl != null) {
                this.EH.setBackground(YFl);
            }
            int AlY = com.bytedance.sdk.component.utils.qO.AlY(getContext(), "tt_close_btn");
            if (AlY > 0) {
                ((ImageView) this.EH).setImageResource(AlY);
            }
            ((ImageView) this.EH).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int YFl2 = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.lG());
        View view = this.EH;
        if (view instanceof com.bytedance.sdk.component.adexpress.vc.NjR) {
            ((com.bytedance.sdk.component.adexpress.vc.NjR) view).setRadius((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, this.YoT.EH()));
            ((com.bytedance.sdk.component.adexpress.vc.NjR) this.EH).setStrokeWidth(YFl2);
            ((com.bytedance.sdk.component.adexpress.vc.NjR) this.EH).setStrokeColor(this.YoT.rkt());
            ((com.bytedance.sdk.component.adexpress.vc.NjR) this.EH).setBgColor(this.YoT.dXO());
            ((com.bytedance.sdk.component.adexpress.vc.NjR) this.EH).setDislikeColor(this.YoT.DSW());
            ((com.bytedance.sdk.component.adexpress.vc.NjR) this.EH).setDislikeWidth((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.eT, 1.0f));
        }
        return true;
    }
}
