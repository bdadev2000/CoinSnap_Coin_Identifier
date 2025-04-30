package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.TwoSemicirclesView;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class PAGPAGLoadingFourLayout extends PAGLoadingBaseLayout {
    public PAGPAGLoadingFourLayout(Context context) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(0);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.jU = pAGTextView;
        pAGTextView.setId(520093749);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = WNy.lMd(context, 15.0f);
        this.jU.setLayoutParams(layoutParams2);
        this.jU.setTextColor(Color.parseColor("#FFFFFF"));
        this.jU.setTextSize(1, 30.0f);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = WNy.lMd(context, 15.0f);
        pAGTextView2.setLayoutParams(layoutParams3);
        pAGTextView2.setTextColor(Color.parseColor("#FFFFFF"));
        pAGTextView2.setTextSize(1, 30.0f);
        pAGTextView2.setText("%");
        linearLayout2.addView(this.jU);
        linearLayout2.addView(pAGTextView2);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.bottomMargin = WNy.lMd(context, 15.0f);
        pAGTextView3.setLayoutParams(layoutParams4);
        pAGTextView3.setAlpha(0.34f);
        pAGTextView3.setText("loading");
        pAGTextView3.setTextColor(Color.parseColor("#FFFFFF"));
        pAGTextView3.setTextSize(1, 19.0f);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(pAGTextView3);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        TwoSemicirclesView twoSemicirclesView = new TwoSemicirclesView(context, null);
        this.QR = twoSemicirclesView;
        twoSemicirclesView.setId(520093751);
        this.QR.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TwoSemicirclesView twoSemicirclesView2 = new TwoSemicirclesView(context, null);
        this.ku = twoSemicirclesView2;
        twoSemicirclesView2.setId(520093752);
        this.ku.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        pAGFrameLayout.addView(this.QR);
        pAGFrameLayout.addView(this.ku);
        zp(context);
        addView(linearLayout);
        addView(pAGFrameLayout);
        addView(this.COT);
    }
}
