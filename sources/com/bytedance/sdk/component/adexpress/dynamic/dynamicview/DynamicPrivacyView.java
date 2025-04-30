package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.KS.QR;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;

/* loaded from: classes.dex */
public class DynamicPrivacyView extends DynamicBaseWidgetImp {
    private TextView FP;
    private TextView cz;
    private TextView lMd;
    private TextView ot;
    private LinearLayout yRU;
    private TextView zp;

    public DynamicPrivacyView(Context context, DynamicRootView dynamicRootView, ku kuVar) {
        super(context, dynamicRootView, kuVar);
        this.zp = new TextView(this.Bj);
        this.lMd = new TextView(this.Bj);
        this.cz = new TextView(this.Bj);
        this.yRU = new LinearLayout(this.Bj);
        this.FP = new TextView(this.Bj);
        this.ot = new TextView(this.Bj);
        this.zp.setTag(9);
        this.lMd.setTag(10);
        this.cz.setTag(12);
        this.yRU.addView(this.cz);
        this.yRU.addView(this.ot);
        this.yRU.addView(this.lMd);
        this.yRU.addView(this.FP);
        this.yRU.addView(this.zp);
        addView(this.yRU, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jU
    public boolean YW() {
        this.cz.setText("Function");
        this.lMd.setText("Permission list");
        this.FP.setText(" | ");
        this.ot.setText(" | ");
        this.zp.setText("Privacy policy");
        QR qr = this.vDp;
        if (qr != null) {
            this.cz.setTextColor(qr.QR());
            this.cz.setTextSize(this.vDp.COT());
            this.lMd.setTextColor(this.vDp.QR());
            this.lMd.setTextSize(this.vDp.COT());
            this.FP.setTextColor(this.vDp.QR());
            this.ot.setTextColor(this.vDp.QR());
            this.zp.setTextColor(this.vDp.QR());
            this.zp.setTextSize(this.vDp.COT());
            return false;
        }
        this.cz.setTextColor(-1);
        this.cz.setTextSize(12.0f);
        this.lMd.setTextColor(-1);
        this.lMd.setTextSize(12.0f);
        this.FP.setTextColor(-1);
        this.ot.setTextColor(-1);
        this.zp.setTextColor(-1);
        this.zp.setTextSize(12.0f);
        return false;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.QR, this.ku);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public boolean jU() {
        this.zp.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.zp.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.lMd.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.lMd.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.cz.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.cz.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }
}
