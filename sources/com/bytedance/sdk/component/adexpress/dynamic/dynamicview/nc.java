package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class nc extends vc {
    public nc(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            ImageView imageView = new ImageView(context);
            this.EH = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.DSW = this.qsH;
        } else {
            this.EH = new TextView(context);
        }
        this.EH.setTag(3);
        addView(this.EH, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.EH);
        if (dynamicRootView.getRenderRequest() != null) {
            if (!dynamicRootView.getRenderRequest().qsH() || !dynamicRootView.getRenderRequest().UZM()) {
                this.EH.setVisibility(8);
                setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        super.NjR();
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            Drawable YFl = com.bytedance.sdk.component.adexpress.AlY.tN.YFl(getContext(), this.YoT);
            if (YFl != null) {
                ((ImageView) this.EH).setBackground(YFl);
            }
            ((ImageView) this.EH).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int AlY = com.bytedance.sdk.component.utils.qO.AlY(getContext(), "tt_reward_full_feedback");
            if (AlY > 0) {
                ((ImageView) this.EH).setImageResource(AlY);
            }
            return true;
        }
        ((TextView) this.EH).setText(getText());
        this.EH.setTextAlignment(this.YoT.qsH());
        ((TextView) this.EH).setTextColor(this.YoT.DSW());
        ((TextView) this.EH).setTextSize(this.YoT.wN());
        this.EH.setBackground(getBackgroundDrawable());
        if (!this.YoT.Ne()) {
            ((TextView) this.EH).setMaxLines(1);
            ((TextView) this.EH).setGravity(17);
            ((TextView) this.EH).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int VOe = this.YoT.VOe();
            if (VOe > 0) {
                ((TextView) this.EH).setLines(VOe);
                ((TextView) this.EH).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        this.EH.setPadding((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.tN()), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.Sg()), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.AlY()), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.YoT.YFl()));
        ((TextView) this.EH).setGravity(17);
        return true;
    }

    public String getText() {
        return com.bytedance.sdk.component.utils.qO.YFl(com.bytedance.sdk.component.adexpress.AlY.YFl(), "tt_reward_feedback");
    }
}
