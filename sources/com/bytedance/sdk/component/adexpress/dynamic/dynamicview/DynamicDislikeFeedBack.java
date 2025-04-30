package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class DynamicDislikeFeedBack extends DynamicBaseWidgetImp {
    public DynamicDislikeFeedBack(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            ImageView imageView = new ImageView(context);
            this.dQp = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.QR = this.ku;
        } else {
            this.dQp = new TextView(context);
        }
        this.dQp.setTag(3);
        addView(this.dQp, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.dQp);
        if (dynamicRootView.getRenderRequest() != null && !dynamicRootView.getRenderRequest().ku()) {
            this.dQp.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        super.YW();
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            GradientDrawable gradientDrawable = (GradientDrawable) cz.KS(getContext(), "tt_ad_skip_btn_bg");
            gradientDrawable.setCornerRadius(this.ku / 2);
            gradientDrawable.setColor(this.vDp.irS());
            ((ImageView) this.dQp).setBackgroundDrawable(gradientDrawable);
            ((ImageView) this.dQp).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.dQp).setImageResource(cz.jU(getContext(), "tt_reward_full_feedback"));
            return true;
        }
        ((TextView) this.dQp).setText(getText());
        this.dQp.setTextAlignment(this.vDp.ku());
        ((TextView) this.dQp).setTextColor(this.vDp.QR());
        ((TextView) this.dQp).setTextSize(this.vDp.COT());
        this.dQp.setBackground(getBackgroundDrawable());
        if (!this.vDp.ot()) {
            ((TextView) this.dQp).setMaxLines(1);
            ((TextView) this.dQp).setGravity(17);
            ((TextView) this.dQp).setEllipsize(TextUtils.TruncateAt.END);
        } else {
            int yRU = this.vDp.yRU();
            if (yRU > 0) {
                ((TextView) this.dQp).setLines(yRU);
                ((TextView) this.dQp).setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        this.dQp.setPadding((int) QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.KS()), (int) QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.lMd()), (int) QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.jU()), (int) QR.zp(com.bytedance.sdk.component.adexpress.jU.zp(), this.vDp.zp()));
        ((TextView) this.dQp).setGravity(17);
        return true;
    }

    public String getText() {
        return cz.zp(com.bytedance.sdk.component.adexpress.jU.zp(), "tt_reward_feedback");
    }
}
