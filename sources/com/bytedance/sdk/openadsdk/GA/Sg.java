package com.bytedance.sdk.openadsdk.GA;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.lG;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class Sg extends nc {
    public Sg(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.GA.nc
    public com.bytedance.sdk.openadsdk.core.wN.qsH Sg(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.qsH Sg = super.Sg(context);
        Sg.setTextColor(-1);
        Sg.setTextSize(2, 13.0f);
        Sg.setText("Pangle");
        return Sg;
    }

    @Override // com.bytedance.sdk.openadsdk.GA.nc
    public void YFl(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        wNVar.setOrientation(1);
        addView(wNVar);
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 2.0f;
        tNVar.setLayoutParams(layoutParams);
        wNVar.addView(tNVar);
        com.bytedance.sdk.openadsdk.core.wN.tN wN = wN(context);
        this.YFl = wN;
        wN.setId(com.bytedance.sdk.openadsdk.utils.GA.Af);
        this.YFl.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tNVar.addView(this.YFl);
        com.bytedance.sdk.openadsdk.core.wN.AlY vc2 = vc(context);
        this.Sg = vc2;
        vc2.setId(com.bytedance.sdk.openadsdk.utils.GA.yn);
        this.Sg.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tNVar.addView(this.Sg);
        PAGLogoView qsH = qsH(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        int tN = GS.tN(context, 10.0f);
        layoutParams2.leftMargin = tN;
        layoutParams2.topMargin = tN;
        layoutParams2.bottomMargin = tN;
        qsH.setLayoutParams(layoutParams2);
        tNVar.addView(qsH);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar2 = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        wNVar2.setLayoutParams(layoutParams3);
        wNVar2.setOrientation(1);
        wNVar2.setGravity(81);
        int tN2 = GS.tN(context, 16.0f);
        wNVar2.setPadding(tN2, tN2, tN2, tN2);
        wNVar.addView(wNVar2);
        com.bytedance.sdk.openadsdk.core.wN.DSW dsw = new com.bytedance.sdk.openadsdk.core.wN.DSW(context);
        dsw.setId(com.bytedance.sdk.openadsdk.utils.GA.ECi);
        dsw.setLayoutParams(new LinearLayout.LayoutParams(-2, GS.tN(context, 40.0f)));
        dsw.setGravity(17);
        wNVar2.addView(dsw);
        lG DSW = DSW(context);
        this.tN = DSW;
        DSW.setId(com.bytedance.sdk.openadsdk.utils.GA.f10822ni);
        int tN3 = GS.tN(context, 35.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(tN3, tN3);
        layoutParams4.addRule(20);
        layoutParams4.addRule(9);
        layoutParams4.addRule(15);
        this.tN.setLayoutParams(layoutParams4);
        dsw.addView(this.tN);
        com.bytedance.sdk.openadsdk.core.wN.qsH Sg = Sg(context);
        this.AlY = Sg;
        Sg.setId(com.bytedance.sdk.openadsdk.utils.GA.IXB);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, tN * 2);
        int tN4 = GS.tN(context, 6.0f);
        layoutParams5.leftMargin = tN4;
        layoutParams5.setMarginStart(tN4);
        layoutParams5.addRule(1, this.tN.getId());
        layoutParams5.addRule(17, this.tN.getId());
        this.AlY.setLayoutParams(layoutParams5);
        dsw.addView(this.AlY);
        com.bytedance.sdk.openadsdk.core.wN.qsH tN5 = tN(context);
        this.wN = tN5;
        tN5.setId(com.bytedance.sdk.openadsdk.utils.GA.f10827xg);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, GS.tN(context, 20.0f));
        layoutParams6.addRule(3, this.AlY.getId());
        layoutParams6.addRule(8, this.tN.getId());
        layoutParams6.addRule(17, this.tN.getId());
        layoutParams6.addRule(1, this.tN.getId());
        layoutParams6.leftMargin = tN4;
        layoutParams6.setMarginStart(tN4);
        this.wN.setLayoutParams(layoutParams6);
        dsw.addView(this.wN);
        com.bytedance.sdk.openadsdk.core.wN.qsH AlY = AlY(context);
        this.f10518vc = AlY;
        AlY.setId(com.bytedance.sdk.openadsdk.utils.GA.Gmi);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, GS.tN(context, 22.0f));
        layoutParams7.topMargin = tN2;
        this.f10518vc.setLayoutParams(layoutParams7);
        wNVar2.addView(this.f10518vc);
    }

    @Override // com.bytedance.sdk.openadsdk.GA.nc
    public com.bytedance.sdk.openadsdk.core.wN.qsH tN(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.qsH tN = super.tN(context);
        tN.setTextColor(-1);
        return tN;
    }

    public Sg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Sg(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
