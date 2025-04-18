package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class pDU extends vc {
    public pDU(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        ImageView imageView = new ImageView(context);
        this.EH = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            this.qsH = Math.max(dynamicRootView.getLogoUnionHeight(), this.qsH);
        }
        addView(this.EH, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        super.NjR();
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            ((ImageView) this.EH).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        ((ImageView) this.EH).setImageResource(com.bytedance.sdk.component.utils.qO.AlY(getContext(), "tt_ad_logo"));
        ((ImageView) this.EH).setColorFilter(this.YoT.DSW(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
