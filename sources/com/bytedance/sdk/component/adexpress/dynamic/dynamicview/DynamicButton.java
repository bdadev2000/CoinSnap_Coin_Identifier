package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.AnimationButton;

/* loaded from: classes.dex */
public class DynamicButton extends DynamicBaseWidgetImp {
    public DynamicButton(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        AnimationButton animationButton = new AnimationButton(context);
        this.dQp = animationButton;
        animationButton.setTag(Integer.valueOf(getClickArea()));
        addView(this.dQp, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        super.YW();
        if (TextUtils.equals("download-progress-button", this.tG.dT().lMd()) && TextUtils.isEmpty(this.vDp.dT())) {
            this.dQp.setVisibility(4);
            return true;
        }
        this.dQp.setTextAlignment(this.vDp.ku());
        ((TextView) this.dQp).setText(this.vDp.dT());
        ((TextView) this.dQp).setTextColor(this.vDp.QR());
        ((TextView) this.dQp).setTextSize(this.vDp.COT());
        ((TextView) this.dQp).setGravity(17);
        ((TextView) this.dQp).setIncludeFontPadding(false);
        if ("fillButton".equals(this.tG.dT().lMd())) {
            this.dQp.setPadding(0, 0, 0, 0);
        } else {
            this.dQp.setPadding(this.vDp.KS(), this.vDp.lMd(), this.vDp.jU(), this.vDp.zp());
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (com.bytedance.sdk.component.adexpress.jU.lMd() && "fillButton".equals(this.tG.dT().lMd())) {
            ((TextView) this.dQp).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.dQp).setMaxLines(1);
            FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
            widgetLayoutParams.width -= this.vDp.vwr() * 2;
            widgetLayoutParams.height -= this.vDp.vwr() * 2;
            widgetLayoutParams.topMargin = this.vDp.vwr() + widgetLayoutParams.topMargin;
            int vwr = this.vDp.vwr() + widgetLayoutParams.leftMargin;
            widgetLayoutParams.leftMargin = vwr;
            widgetLayoutParams.setMarginStart(vwr);
            widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
            return widgetLayoutParams;
        }
        return super.getWidgetLayoutParams();
    }
}
