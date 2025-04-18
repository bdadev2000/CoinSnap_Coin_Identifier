package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import eb.j;

/* loaded from: classes.dex */
public class zB extends vc implements com.bytedance.sdk.component.adexpress.dynamic.wN {
    FrameLayout Sg;
    TextView YFl;
    boolean aIu;

    public zB(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh) {
        super(context, dynamicRootView, qsh);
        this.aIu = false;
        View view = new View(context);
        this.EH = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.YFl = new TextView(context);
        this.Sg = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.YFl.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.YFl.setBackground(gradientDrawable);
        this.YFl.setTextSize(10.0f);
        this.YFl.setGravity(17);
        this.YFl.setTextColor(-1);
        this.YFl.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            addView(this.Sg, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.YFl);
        addView(this.EH, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.AlY.Sg()) {
            addView(this.Sg, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.Sg;
        dynamicRootView.setVideoListener(this);
    }

    private void tN(View view) {
        if (view == this.YFl || view == ((vc) this).qO) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.YFl.f10382vc)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i10 = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 < viewGroup.getChildCount()) {
                tN(viewGroup.getChildAt(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Sco
    public boolean NjR() {
        super.NjR();
        double d10 = 0.0d;
        double d11 = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH qsh = this.GA; qsh != null; qsh = qsh.YoT()) {
            d11 = (d11 + qsh.vc()) - qsh.AlY();
            d10 = (d10 + qsh.DSW()) - qsh.wN();
        }
        try {
            float f10 = (float) d11;
            int YFl = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), f10);
            int YFl2 = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), f10 + this.wN);
            if (com.bytedance.sdk.component.adexpress.AlY.Sg.YFl(getContext())) {
                int dynamicWidth = ((Wwa) this.pDU.getChildAt(0)).getDynamicWidth();
                int i10 = dynamicWidth - YFl2;
                YFl2 = dynamicWidth - YFl;
                YFl = i10;
            }
            if (!"open_ad".equals(this.pDU.getRenderRequest().AlY())) {
                float f11 = (float) d10;
                ((Wwa) this.pDU.getChildAt(0)).YFl.YFl(YFl, (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), f11), YFl2, (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), f11 + this.f10388vc));
            } else {
                this.pDU.videoView = this.Sg;
            }
        } catch (Exception unused) {
        }
        this.pDU.updateRenderInfoForVideo(d11, d10, this.wN, this.f10388vc, this.YoT.EH());
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wN
    public void YFl() {
        this.YFl.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wN
    public void setTimeUpdate(int i10) {
        String str;
        String str2;
        if (this.GA.nc().wN().ep() && i10 > 0 && !this.aIu) {
            if (i10 >= 60) {
                str = "0" + (i10 / 60);
            } else {
                str = "00";
            }
            String k10 = j.k(str, ":");
            int i11 = i10 % 60;
            if (i11 > 9) {
                str2 = k10 + i11;
            } else {
                str2 = k10 + "0" + i11;
            }
            this.YFl.setText(str2);
            this.YFl.setVisibility(0);
            return;
        }
        this.aIu = true;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            tN(getChildAt(i12));
        }
        this.YFl.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN
    public boolean wN() {
        return true;
    }
}
