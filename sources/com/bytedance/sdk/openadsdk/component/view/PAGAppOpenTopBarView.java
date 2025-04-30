package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.graphics.Color;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.WNy;

/* loaded from: classes.dex */
public class PAGAppOpenTopBarView extends PAGRelativeLayout {
    private final PAGTextView lMd;
    private final PAGTextView zp;

    public PAGAppOpenTopBarView(@NonNull Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int lMd = WNy.lMd(context, 12.0f);
        int lMd2 = WNy.lMd(context, 16.0f);
        int lMd3 = WNy.lMd(context, 20.0f);
        int lMd4 = WNy.lMd(context, 24.0f);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.zp = pAGTextView;
        pAGTextView.setId(520093713);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, lMd4);
        layoutParams.topMargin = lMd3;
        layoutParams.leftMargin = lMd2;
        layoutParams.setMarginStart(lMd2);
        pAGTextView.setLayoutParams(layoutParams);
        pAGTextView.setBackground(cz.KS(context, "tt_app_open_top_bg"));
        pAGTextView.setGravity(17);
        pAGTextView.setPadding(lMd, 0, lMd, 0);
        pAGTextView.setText(cz.zp(context, "tt_reward_feedback"));
        pAGTextView.setTextColor(Color.parseColor("#ffffff"));
        pAGTextView.setTextSize(1, 14.0f);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.lMd = pAGTextView2;
        pAGTextView2.setId(520093714);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, lMd4);
        layoutParams2.topMargin = lMd3;
        layoutParams2.rightMargin = lMd2;
        layoutParams2.setMarginEnd(lMd2);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        pAGTextView2.setLayoutParams(layoutParams2);
        pAGTextView2.setBackground(cz.KS(context, "tt_app_open_top_bg"));
        pAGTextView2.setGravity(17);
        pAGTextView2.setPadding(lMd, 0, lMd, 0);
        pAGTextView2.setText(cz.lMd(context, "tt_txt_skip"));
        pAGTextView2.setTextColor(Color.parseColor("#ffffff"));
        pAGTextView2.setTextSize(1, 14.0f);
        addView(pAGTextView);
        addView(pAGTextView2);
    }

    public PAGTextView getTopDislike() {
        return this.zp;
    }

    public PAGTextView getTopSkip() {
        return this.lMd;
    }
}
