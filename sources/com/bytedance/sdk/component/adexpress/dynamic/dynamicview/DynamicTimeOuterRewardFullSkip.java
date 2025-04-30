package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class DynamicTimeOuterRewardFullSkip extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.KS {
    private boolean zp;

    public DynamicTimeOuterRewardFullSkip(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        if (dynamicRootView.getRenderRequest() != null) {
            this.zp = dynamicRootView.getRenderRequest().tG();
        }
        this.QR = this.ku;
        ImageView imageView = new ImageView(context);
        this.dQp = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.dQp, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        int jU;
        super.YW();
        ((ImageView) this.dQp).setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable gradientDrawable = (GradientDrawable) cz.KS(getContext(), "tt_ad_skip_btn_bg");
        gradientDrawable.setCornerRadius(this.ku / 2);
        gradientDrawable.setColor(this.vDp.irS());
        ((ImageView) this.dQp).setBackgroundDrawable(gradientDrawable);
        if (this.zp) {
            jU = cz.jU(getContext(), "tt_close_move_details_normal");
        } else {
            jU = cz.jU(getContext(), "tt_skip_btn_wrapper");
        }
        ((ImageView) this.dQp).setImageResource(jU);
        setVisibility(8);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.KS
    public void zp(CharSequence charSequence, boolean z8, int i9, boolean z9) {
        int i10 = 0;
        if (!z8 && !z9) {
            i10 = 8;
        }
        setVisibility(i10);
    }
}
