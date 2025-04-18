package com.bytedance.sdk.openadsdk.GA;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class wN extends nc {
    private com.bytedance.sdk.openadsdk.core.wN.AlY DSW;
    private com.bytedance.sdk.openadsdk.core.wN.qsH qsH;

    public wN(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.GA.nc
    public void YFl(Context context) {
        int tN = GS.tN(context, 6.0f);
        setPadding(tN, tN, tN, tN);
        com.bytedance.sdk.openadsdk.core.wN.tN wN = wN(context);
        this.YFl = wN;
        wN.setId(com.bytedance.sdk.openadsdk.utils.GA.Af);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int tN2 = GS.tN(context, 26.0f);
        layoutParams.topMargin = tN2;
        this.YFl.setLayoutParams(layoutParams);
        addView(this.YFl);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        this.DSW = alY;
        alY.setId(com.bytedance.sdk.openadsdk.utils.GA.ZS);
        this.DSW.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = tN2;
        this.DSW.setLayoutParams(layoutParams2);
        addView(this.DSW);
        PAGLogoView qsH = qsH(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        int tN3 = GS.tN(context, 10.0f);
        layoutParams3.leftMargin = tN3;
        layoutParams3.topMargin = tN3;
        layoutParams3.bottomMargin = tN3;
        qsH.setLayoutParams(layoutParams3);
        addView(qsH);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        wNVar.setOrientation(0);
        wNVar.setGravity(17);
        addView(wNVar);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.qsH = qsh;
        qsh.setId(com.bytedance.sdk.openadsdk.utils.GA.PT);
        this.qsH.setEllipsize(TextUtils.TruncateAt.END);
        this.qsH.setMaxLines(1);
        this.qsH.setTextColor(-1);
        this.qsH.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.qsH.setLayoutParams(layoutParams4);
        wNVar.addView(this.qsH);
    }

    public com.bytedance.sdk.openadsdk.core.wN.qsH getTtBuDescTV() {
        return this.qsH;
    }

    public com.bytedance.sdk.openadsdk.core.wN.AlY getTtBuImg() {
        return this.DSW;
    }

    public wN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public wN(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
