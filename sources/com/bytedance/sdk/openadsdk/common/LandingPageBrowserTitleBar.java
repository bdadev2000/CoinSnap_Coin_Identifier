package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class LandingPageBrowserTitleBar extends RelativeLayout {
    public LandingPageBrowserTitleBar(Context context) {
        super(context);
        zp();
    }

    private void zp() {
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, WNy.lMd(context, 44.0f)));
        setBackgroundColor(Color.parseColor("#e0e0e0"));
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(520093720);
        pAGImageView.setClickable(true);
        pAGImageView.setFocusable(true);
        pAGImageView.setImageDrawable(com.bytedance.sdk.openadsdk.utils.ku.zp(context, "tt_leftbackicon_selector"));
        pAGImageView.setPadding(WNy.lMd(context, 12.0f), WNy.lMd(context, 5.0f), WNy.lMd(context, 10.0f), WNy.lMd(context, 5.0f));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        addView(pAGImageView, layoutParams);
        PAGImageView pAGImageView2 = new PAGImageView(context);
        pAGImageView2.setId(520093716);
        pAGImageView2.setClickable(true);
        pAGImageView2.setFocusable(true);
        pAGImageView2.setPadding(WNy.lMd(context, 12.0f), WNy.lMd(context, 5.0f), WNy.lMd(context, 10.0f), WNy.lMd(context, 5.0f));
        pAGImageView2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.ku.zp(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(pAGImageView2, layoutParams2);
        PAGTextView pAGTextView = new PAGTextView(context);
        int i9 = vDp.Rea;
        pAGTextView.setId(i9);
        pAGTextView.setPadding(WNy.lMd(context, 12.0f), WNy.lMd(context, 5.0f), WNy.lMd(context, 10.0f), WNy.lMd(context, 5.0f));
        pAGTextView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        pAGTextView.setText(cz.lMd(context, "tt_reward_feedback"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        addView(pAGTextView, layoutParams3);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        pAGTextView2.setId(vDp.Ml);
        pAGTextView2.setSingleLine(true);
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        pAGTextView2.setGravity(17);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(WNy.lMd(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i9);
        int lMd = WNy.lMd(context, 25.0f);
        layoutParams4.rightMargin = lMd;
        layoutParams4.leftMargin = lMd;
        addView(pAGTextView2, layoutParams4);
    }
}
