package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class lG extends vc {
    private TextView Ne;
    private TextView Sg;
    private LinearLayout VOe;
    private TextView YFl;
    private TextView aIu;
    private TextView wXo;

    public lG(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        this.YFl = new TextView(this.eT);
        this.Sg = new TextView(this.eT);
        this.aIu = new TextView(this.eT);
        this.VOe = new LinearLayout(this.eT);
        this.wXo = new TextView(this.eT);
        this.Ne = new TextView(this.eT);
        this.YFl.setTag(9);
        this.Sg.setTag(10);
        this.aIu.setTag(12);
        this.VOe.addView(this.aIu);
        this.VOe.addView(this.Ne);
        this.VOe.addView(this.Sg);
        this.VOe.addView(this.wXo);
        this.VOe.addView(this.YFl);
        addView(this.VOe, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN
    public boolean AlY() {
        this.YFl.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.YFl.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.Sg.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.Sg.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        this.aIu.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
        this.aIu.setOnClickListener((View.OnClickListener) getDynamicClickListener());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        this.aIu.setText("Function");
        this.Sg.setText("Permission list");
        this.wXo.setText(" | ");
        this.Ne.setText(" | ");
        this.YFl.setText("Privacy policy");
        com.bytedance.sdk.component.adexpress.dynamic.AlY.DSW dsw = this.YoT;
        if (dsw != null) {
            this.aIu.setTextColor(dsw.DSW());
            this.aIu.setTextSize(this.YoT.wN());
            this.Sg.setTextColor(this.YoT.DSW());
            this.Sg.setTextSize(this.YoT.wN());
            this.wXo.setTextColor(this.YoT.DSW());
            this.Ne.setTextColor(this.YoT.DSW());
            this.YFl.setTextColor(this.YoT.DSW());
            this.YFl.setTextSize(this.YoT.wN());
            return false;
        }
        this.aIu.setTextColor(-1);
        this.aIu.setTextSize(12.0f);
        this.Sg.setTextColor(-1);
        this.Sg.setTextSize(12.0f);
        this.wXo.setTextColor(-1);
        this.Ne.setTextColor(-1);
        this.YFl.setTextColor(-1);
        this.YFl.setTextSize(12.0f);
        return false;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.DSW, this.qsH);
    }
}
