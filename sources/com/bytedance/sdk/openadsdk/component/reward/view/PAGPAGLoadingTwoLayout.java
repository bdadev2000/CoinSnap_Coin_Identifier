package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class PAGPAGLoadingTwoLayout extends PAGLoadingBaseLayout {
    public PAGPAGLoadingTwoLayout(Context context) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        int lMd = WNy.lMd(context, 80.0f);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.zp = tTRoundRectImageView;
        tTRoundRectImageView.setId(520093745);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(lMd, lMd);
        layoutParams2.topMargin = WNy.lMd(context, 15.0f);
        layoutParams2.bottomMargin = WNy.lMd(context, 40.0f);
        this.zp.setLayoutParams(layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(0);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        pAGTextView.setTextColor(Color.parseColor("#FFFFFF"));
        pAGTextView.setTextSize(1, 30.0f);
        pAGTextView.setText("Loading ");
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.jU = pAGTextView2;
        pAGTextView2.setId(520093749);
        this.jU.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.jU.setTextColor(Color.parseColor("#FFFFFF"));
        this.jU.setTextSize(1, 30.0f);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        pAGTextView3.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        pAGTextView3.setTextColor(Color.parseColor("#FFFFFF"));
        pAGTextView3.setTextSize(1, 30.0f);
        pAGTextView3.setText("%");
        linearLayout2.addView(pAGTextView);
        linearLayout2.addView(this.jU);
        linearLayout2.addView(pAGTextView3);
        linearLayout.addView(this.zp);
        linearLayout.addView(linearLayout2);
        zp(context);
        addView(this.COT);
        addView(linearLayout);
    }
}
