package com.bytedance.sdk.openadsdk.GA;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.lG;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class vc extends nc {
    public vc(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.GA.nc
    public com.bytedance.sdk.openadsdk.core.wN.qsH AlY(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.qsH AlY = super.AlY(context);
        AlY.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_download_corner_bg"));
        AlY.setTextSize(2, 8.0f);
        return AlY;
    }

    @Override // com.bytedance.sdk.openadsdk.GA.nc
    public com.bytedance.sdk.openadsdk.core.wN.qsH Sg(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.qsH Sg = super.Sg(context);
        Sg.setGravity(16);
        Sg.setMaxWidth(GS.tN(context, 53.0f));
        Sg.setTextColor(-1);
        Sg.setTextSize(2, 10.0f);
        return Sg;
    }

    @Override // com.bytedance.sdk.openadsdk.GA.nc
    public void YFl(Context context) {
        int tN = GS.tN(context, 10.0f);
        int tN2 = GS.tN(context, 5.0f);
        int tN3 = GS.tN(context, 6.0f);
        int tN4 = GS.tN(context, 16.0f);
        com.bytedance.sdk.openadsdk.core.wN.DSW dsw = new com.bytedance.sdk.openadsdk.core.wN.DSW(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        dsw.setLayoutParams(layoutParams);
        addView(dsw);
        com.bytedance.sdk.openadsdk.core.wN.tN wN = wN(context);
        this.YFl = wN;
        wN.setId(com.bytedance.sdk.openadsdk.utils.GA.Af);
        this.YFl.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        dsw.addView(this.YFl);
        com.bytedance.sdk.openadsdk.core.wN.AlY vc2 = vc(context);
        this.Sg = vc2;
        vc2.setId(com.bytedance.sdk.openadsdk.utils.GA.yn);
        this.Sg.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        dsw.addView(this.Sg);
        com.bytedance.sdk.openadsdk.core.wN.DSW dsw2 = new com.bytedance.sdk.openadsdk.core.wN.DSW(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.GA.Gnp;
        dsw2.setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, GS.tN(context, 48.0f));
        layoutParams2.setMargins(tN2, tN2, tN2, tN2);
        layoutParams2.addRule(12);
        dsw2.setBackgroundColor(Color.parseColor("#26000000"));
        dsw2.setGravity(16);
        dsw2.setLayoutParams(layoutParams2);
        dsw.addView(dsw2);
        lG DSW = DSW(context);
        this.tN = DSW;
        int i11 = com.bytedance.sdk.openadsdk.utils.GA.f10822ni;
        DSW.setId(i11);
        int tN5 = GS.tN(context, 25.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(tN5, tN5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        this.tN.setLayoutParams(layoutParams3);
        dsw2.addView(this.tN);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(17, i11);
        layoutParams4.addRule(1, i11);
        wNVar.setLayoutParams(layoutParams4);
        wNVar.setGravity(16);
        wNVar.setOrientation(1);
        dsw2.addView(wNVar);
        com.bytedance.sdk.openadsdk.core.wN.qsH Sg = Sg(context);
        this.AlY = Sg;
        Sg.setId(com.bytedance.sdk.openadsdk.utils.GA.IXB);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = tN3;
        layoutParams5.setMarginStart(tN3);
        this.AlY.setLayoutParams(layoutParams5);
        wNVar.addView(this.AlY);
        com.bytedance.sdk.openadsdk.core.wN.qsH tN6 = tN(context);
        this.wN = tN6;
        tN6.setId(com.bytedance.sdk.openadsdk.utils.GA.f10827xg);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = tN3;
        layoutParams6.setMarginStart(tN3);
        this.wN.setLayoutParams(layoutParams6);
        wNVar.addView(this.wN);
        com.bytedance.sdk.openadsdk.core.wN.qsH AlY = AlY(context);
        this.f10518vc = AlY;
        AlY.setId(com.bytedance.sdk.openadsdk.utils.GA.Gmi);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(21);
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        this.f10518vc.setLayoutParams(layoutParams7);
        int tN7 = GS.tN(context, 4.0f);
        this.f10518vc.setPadding(tN7, tN7, tN7, tN7);
        dsw2.addView(this.f10518vc);
        View qsH = qsH(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(2, i10);
        layoutParams8.leftMargin = tN4;
        layoutParams8.bottomMargin = tN;
        qsH.setLayoutParams(layoutParams8);
        dsw.addView(qsH);
    }

    @Override // com.bytedance.sdk.openadsdk.GA.nc
    public com.bytedance.sdk.openadsdk.core.wN.qsH tN(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.qsH tN = super.tN(context);
        tN.setGravity(16);
        tN.setMaxWidth(GS.tN(context, 53.0f));
        tN.setTextColor(-1);
        tN.setTextSize(2, 8.0f);
        return tN;
    }

    public vc(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public vc(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
