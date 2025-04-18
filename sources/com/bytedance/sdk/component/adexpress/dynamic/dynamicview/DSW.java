package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class DSW extends vc {
    public DSW(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.YFl yFl = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.YFl(context);
        this.EH = yFl;
        yFl.setTag(Integer.valueOf(getClickArea()));
        addView(this.EH, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        super.NjR();
        if (TextUtils.equals("download-progress-button", this.GA.nc().Sg()) && TextUtils.isEmpty(this.YoT.nc())) {
            this.EH.setVisibility(4);
            return true;
        }
        this.EH.setTextAlignment(this.YoT.qsH());
        ((TextView) this.EH).setText(this.YoT.nc());
        ((TextView) this.EH).setTextColor(this.YoT.DSW());
        ((TextView) this.EH).setTextSize(this.YoT.wN());
        ((TextView) this.EH).setGravity(17);
        ((TextView) this.EH).setIncludeFontPadding(false);
        if ("fillButton".equals(this.GA.nc().Sg())) {
            this.EH.setPadding(0, 0, 0, 0);
        } else {
            this.EH.setPadding(this.YoT.tN(), this.YoT.Sg(), this.YoT.AlY(), this.YoT.YFl());
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        if (com.bytedance.sdk.component.adexpress.AlY.Sg() && "fillButton".equals(this.GA.nc().Sg())) {
            ((TextView) this.EH).setEllipsize(TextUtils.TruncateAt.END);
            ((TextView) this.EH).setMaxLines(1);
            FrameLayout.LayoutParams widgetLayoutParams = super.getWidgetLayoutParams();
            widgetLayoutParams.width -= this.YoT.Wwa() * 2;
            widgetLayoutParams.height -= this.YoT.Wwa() * 2;
            widgetLayoutParams.topMargin = this.YoT.Wwa() + widgetLayoutParams.topMargin;
            int Wwa = this.YoT.Wwa() + widgetLayoutParams.leftMargin;
            widgetLayoutParams.leftMargin = Wwa;
            widgetLayoutParams.setMarginStart(Wwa);
            widgetLayoutParams.setMarginEnd(widgetLayoutParams.rightMargin);
            return widgetLayoutParams;
        }
        return super.getWidgetLayoutParams();
    }
}
