package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class rkt extends vc implements com.bytedance.sdk.component.adexpress.dynamic.Sg {
    public rkt(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        ImageView imageView = new ImageView(context);
        this.EH = imageView;
        imageView.setTag(5);
        addView(this.EH, getWidgetLayoutParams());
        dynamicRootView.setMuteListener(this);
        if (dynamicRootView.getRenderRequest() != null && !dynamicRootView.getRenderRequest().UZM()) {
            this.EH.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        super.NjR();
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            ((ImageView) this.EH).setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            ((ImageView) this.EH).setScaleType(ImageView.ScaleType.CENTER);
        }
        setSoundMute(this.pDU.mIsMute);
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            Drawable YFl = com.bytedance.sdk.component.adexpress.AlY.tN.YFl(getContext(), this.YoT);
            if (YFl != null) {
                ((ImageView) this.EH).setBackground(YFl);
            }
        } else {
            ((ImageView) this.EH).setBackgroundDrawable(com.bytedance.sdk.component.adexpress.AlY.NjR.YFl(0, Integer.valueOf(this.YoT.dXO()), new int[]{this.qsH / 2}, null, null, null));
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Sg
    public void setSoundMute(boolean z10) {
        int AlY;
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            if (z10) {
                AlY = com.bytedance.sdk.component.utils.qO.AlY(getContext(), "tt_reward_full_mute");
            } else {
                AlY = com.bytedance.sdk.component.utils.qO.AlY(getContext(), "tt_reward_full_unmute");
            }
        } else if (z10) {
            AlY = com.bytedance.sdk.component.utils.qO.AlY(getContext(), "tt_mute");
        } else {
            AlY = com.bytedance.sdk.component.utils.qO.AlY(getContext(), "tt_unmute");
        }
        ((ImageView) this.EH).setImageResource(AlY);
        if (((ImageView) this.EH).getDrawable() != null) {
            ((ImageView) this.EH).getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN
    public boolean wN() {
        return true;
    }
}
