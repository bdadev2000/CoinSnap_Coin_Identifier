package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;

/* loaded from: classes.dex */
public class GA extends vc {
    public GA(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        TextView textView = new TextView(context);
        this.EH = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.EH, getWidgetLayoutParams());
    }

    private boolean YFl() {
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.YoT.Sg) || !this.YoT.Sg.contains("adx:")) && !com.bytedance.sdk.component.adexpress.dynamic.wN.eT.Sg()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        super.NjR();
        this.EH.setTextAlignment(this.YoT.qsH());
        ((TextView) this.EH).setTextColor(this.YoT.DSW());
        ((TextView) this.EH).setTextSize(this.YoT.wN());
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            ((TextView) this.EH).setIncludeFontPadding(false);
            ((TextView) this.EH).setTextSize(Math.min(((com.bytedance.sdk.component.adexpress.AlY.qsH.Sg(com.bytedance.sdk.component.adexpress.AlY.YFl(), this.qsH) - this.YoT.Sg()) - this.YoT.YFl()) - 0.5f, this.YoT.wN()));
            ((TextView) this.EH).setText(com.bytedance.sdk.component.utils.qO.YFl(getContext(), "tt_logo_en"));
            return true;
        }
        if (YFl()) {
            if (com.bytedance.sdk.component.adexpress.dynamic.wN.eT.Sg()) {
                ((TextView) this.EH).setText(com.bytedance.sdk.component.adexpress.dynamic.wN.eT.YFl());
                return true;
            }
            ((TextView) this.EH).setText(com.bytedance.sdk.component.adexpress.dynamic.wN.eT.YFl(this.YoT.Sg));
            return true;
        }
        ((TextView) this.EH).setText(com.bytedance.sdk.component.utils.qO.Sg(getContext(), "tt_logo_cn"));
        return true;
    }
}
