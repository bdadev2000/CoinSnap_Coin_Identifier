package com.bytedance.sdk.openadsdk.GA;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class pDU extends com.bytedance.sdk.openadsdk.core.wN.DSW {
    public pDU(Context context) {
        this(context, null);
    }

    private void YFl(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int tN = GS.tN(context, 60.0f);
        com.bytedance.sdk.openadsdk.core.wN.tN tNVar = new com.bytedance.sdk.openadsdk.core.wN.tN(context);
        tNVar.setId(com.bytedance.sdk.openadsdk.utils.GA.f10825qf);
        tNVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        tNVar.setBackgroundColor(0);
        addView(tNVar);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        alY.setId(com.bytedance.sdk.openadsdk.utils.GA.HVP);
        alY.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        alY.setScaleType(ImageView.ScaleType.CENTER_CROP);
        tNVar.addView(alY);
        com.bytedance.sdk.openadsdk.core.wN.vc vcVar = new com.bytedance.sdk.openadsdk.core.wN.vc(context);
        vcVar.setId(com.bytedance.sdk.openadsdk.utils.GA.ep);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tN, tN);
        layoutParams.gravity = 17;
        vcVar.setLayoutParams(layoutParams);
        vcVar.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_video_loading_progress_bar"));
        tNVar.addView(vcVar);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY2 = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        alY2.setId(com.bytedance.sdk.openadsdk.utils.GA.Lx);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        alY2.setLayoutParams(layoutParams2);
        alY2.setScaleType(ImageView.ScaleType.CENTER);
        alY2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_play_movebar_textpage"));
        alY2.setVisibility(8);
        addView(alY2);
        View yoT = new YoT(context);
        yoT.setId(com.bytedance.sdk.openadsdk.utils.GA.pm);
        yoT.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(yoT);
    }

    public pDU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public pDU(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        YFl(context);
    }
}
