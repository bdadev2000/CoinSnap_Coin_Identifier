package com.bytedance.sdk.openadsdk.GA;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.lG;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class tN extends nc {
    public tN(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.GA.nc
    public com.bytedance.sdk.openadsdk.core.wN.qsH Sg(Context context) {
        com.bytedance.sdk.openadsdk.core.wN.qsH Sg = super.Sg(context);
        Sg.setTextColor(-1);
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
        layoutParams.weight = 337.0f;
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
        layoutParams3.weight = 263.0f;
        wNVar2.setLayoutParams(layoutParams3);
        wNVar2.setOrientation(1);
        wNVar2.setGravity(81);
        int tN2 = GS.tN(context, 16.0f);
        wNVar2.setPadding(tN2, tN2, tN2, tN2);
        wNVar.addView(wNVar2);
        lG DSW = DSW(context);
        this.tN = DSW;
        DSW.setId(com.bytedance.sdk.openadsdk.utils.GA.f10822ni);
        int tN3 = GS.tN(context, 45.0f);
        this.tN.setLayoutParams(new LinearLayout.LayoutParams(tN3, tN3));
        wNVar2.addView(this.tN);
        com.bytedance.sdk.openadsdk.core.wN.qsH Sg = Sg(context);
        this.AlY = Sg;
        Sg.setId(com.bytedance.sdk.openadsdk.utils.GA.IXB);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = GS.tN(context, 4.0f);
        this.AlY.setLayoutParams(layoutParams4);
        wNVar2.addView(this.AlY);
        com.bytedance.sdk.openadsdk.core.wN.qsH tN4 = tN(context);
        this.wN = tN4;
        tN4.setId(com.bytedance.sdk.openadsdk.utils.GA.f10827xg);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = tN;
        layoutParams5.bottomMargin = GS.tN(context, 25.0f);
        this.wN.setLayoutParams(layoutParams5);
        wNVar2.addView(this.wN);
        com.bytedance.sdk.openadsdk.core.wN.qsH AlY = AlY(context);
        this.f10518vc = AlY;
        AlY.setId(com.bytedance.sdk.openadsdk.utils.GA.Gmi);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, GS.tN(context, 32.0f));
        layoutParams6.topMargin = tN2;
        this.f10518vc.setLayoutParams(layoutParams6);
        wNVar2.addView(this.f10518vc);
    }

    public tN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public tN(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
