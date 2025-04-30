package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.jU.HWF;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class DynamicMutedView extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.lMd {
    public DynamicMutedView(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        ImageView imageView = new ImageView(context);
        this.dQp = imageView;
        imageView.setTag(5);
        addView(this.dQp, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public boolean COT() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        super.YW();
        if (HWF.lMd(this.rV.getRenderRequest().jU())) {
            ((ImageView) this.dQp).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.dQp).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.rV.lMd);
        GradientDrawable gradientDrawable = (GradientDrawable) cz.KS(getContext(), "tt_ad_skip_btn_bg");
        gradientDrawable.setCornerRadius(this.ku / 2);
        gradientDrawable.setColor(this.vDp.irS());
        ((ImageView) this.dQp).setBackgroundDrawable(gradientDrawable);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lMd
    public void setSoundMute(boolean z8) {
        int jU;
        if (HWF.lMd(this.rV.getRenderRequest().jU())) {
            if (z8) {
                jU = cz.jU(getContext(), "tt_reward_full_mute");
            } else {
                jU = cz.jU(getContext(), "tt_reward_full_unmute");
            }
        } else if (z8) {
            jU = cz.jU(getContext(), "tt_mute");
        } else {
            jU = cz.jU(getContext(), "tt_unmute");
        }
        ((ImageView) this.dQp).setImageResource(jU);
        if (((ImageView) this.dQp).getDrawable() != null) {
            ((ImageView) this.dQp).getDrawable().setAutoMirrored(true);
        }
    }
}
