package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.bytedance.sdk.component.adexpress.dynamic.jU.Bj;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class DynamicLogoAd extends DynamicBaseWidgetImp {
    public DynamicLogoAd(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        TextView textView = new TextView(context);
        this.dQp = textView;
        textView.setTag(Integer.valueOf(getClickArea()));
        addView(this.dQp, getWidgetLayoutParams());
    }

    private boolean zp() {
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.vDp.lMd) || !this.vDp.lMd.contains("adx:")) && !Bj.lMd()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        super.YW();
        this.dQp.setTextAlignment(this.vDp.ku());
        ((TextView) this.dQp).setTextColor(this.vDp.QR());
        ((TextView) this.dQp).setTextSize(this.vDp.COT());
        if (com.bytedance.sdk.component.adexpress.jU.lMd()) {
            ((TextView) this.dQp).setIncludeFontPadding(false);
            ((TextView) this.dQp).setTextSize(Math.min(((QR.lMd(com.bytedance.sdk.component.adexpress.jU.zp(), this.ku) - this.vDp.lMd()) - this.vDp.zp()) - 0.5f, this.vDp.COT()));
            ((TextView) this.dQp).setText(cz.zp(getContext(), "tt_logo_en"));
            return true;
        }
        if (zp()) {
            if (Bj.lMd()) {
                ((TextView) this.dQp).setText(Bj.zp());
                return true;
            }
            ((TextView) this.dQp).setText(Bj.zp(this.vDp.lMd));
            return true;
        }
        ((TextView) this.dQp).setText(cz.lMd(getContext(), "tt_logo_cn"));
        return true;
    }
}
