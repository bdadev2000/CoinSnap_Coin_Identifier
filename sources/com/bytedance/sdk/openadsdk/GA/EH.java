package com.bytedance.sdk.openadsdk.GA;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class EH extends com.bytedance.sdk.openadsdk.core.wN.DSW {
    public EH(Context context) {
        this(context, null);
    }

    private void YFl(Context context) {
        setId(com.bytedance.sdk.openadsdk.utils.GA.iv);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.GA.f10818hf;
        qsh.setId(i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        qsh.setLayoutParams(layoutParams);
        qsh.setIncludeFontPadding(false);
        qsh.setText(qO.YFl(context, "tt_video_without_wifi_tips"));
        qsh.setTextColor(Color.parseColor("#cacaca"));
        qsh.setTextSize(2, 14.0f);
        addView(qsh);
        com.bytedance.sdk.openadsdk.core.wN.DSW dsw = new com.bytedance.sdk.openadsdk.core.wN.DSW(context);
        dsw.setId(com.bytedance.sdk.openadsdk.utils.GA.Xrd);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i10);
        layoutParams2.addRule(13);
        dsw.setLayoutParams(layoutParams2);
        addView(dsw);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        alY.setId(com.bytedance.sdk.openadsdk.utils.GA.kU);
        int tN = GS.tN(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(tN, tN);
        layoutParams3.addRule(15);
        alY.setLayoutParams(layoutParams3);
        alY.setImageDrawable(qO.tN(context, "tt_new_play_video"));
        alY.setScaleType(ImageView.ScaleType.FIT_XY);
        dsw.addView(alY);
    }

    public EH(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EH(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        YFl(context);
    }
}
