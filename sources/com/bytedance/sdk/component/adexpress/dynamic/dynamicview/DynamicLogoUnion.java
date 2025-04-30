package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class DynamicLogoUnion extends DynamicBaseWidgetImp {
    public DynamicLogoUnion(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        ImageView imageView = new ImageView(context);
        this.dQp = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            this.ku = Math.max(dynamicRootView.getLogoUnionHeight(), this.ku);
        }
        addView(this.dQp, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        super.YW();
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            ((ImageView) this.dQp).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.dQp).setImageResource(cz.jU(getContext(), "tt_ad_logo_reward_full"));
        } else {
            ((ImageView) this.dQp).setImageResource(cz.jU(getContext(), "tt_ad_logo"));
        }
        ((ImageView) this.dQp).setColorFilter(this.vDp.QR(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
