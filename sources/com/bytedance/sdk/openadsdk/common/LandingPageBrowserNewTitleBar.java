package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class LandingPageBrowserNewTitleBar extends RelativeLayout {
    public LandingPageBrowserNewTitleBar(Context context) {
        super(context);
        zp();
    }

    private void zp() {
        setId(vDp.fVt);
        setBackgroundColor(-1);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, WNy.lMd(context, 44.0f)));
        PAGImageView pAGImageView = new PAGImageView(context);
        int i9 = vDp.Np;
        pAGImageView.setId(i9);
        pAGImageView.setClickable(true);
        pAGImageView.setFocusable(true);
        pAGImageView.setPadding(WNy.lMd(context, 12.0f), WNy.lMd(context, 14.0f), WNy.lMd(context, 12.0f), WNy.lMd(context, 14.0f));
        pAGImageView.setImageResource(cz.jU(context, "tt_ad_xmark"));
        addView(pAGImageView, new RelativeLayout.LayoutParams(WNy.lMd(context, 40.0f), WNy.lMd(context, 44.0f)));
        PAGImageView pAGImageView2 = new PAGImageView(context);
        int i10 = vDp.zpV;
        pAGImageView2.setId(i10);
        pAGImageView2.setPadding(WNy.lMd(context, 8.0f), WNy.lMd(context, 10.0f), WNy.lMd(context, 8.0f), WNy.lMd(context, 10.0f));
        pAGImageView2.setImageResource(cz.jU(context, "tt_ad_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(WNy.lMd(context, 40.0f), WNy.lMd(context, 44.0f));
        layoutParams.addRule(11);
        addView(pAGImageView2, layoutParams);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setId(vDp.YcG);
        pAGTextView.setSingleLine(true);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(Color.parseColor("#222222"));
        pAGTextView.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(WNy.lMd(context, 191.0f), WNy.lMd(context, 24.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, i10);
        layoutParams2.addRule(1, i9);
        int lMd = WNy.lMd(context, 10.0f);
        layoutParams2.leftMargin = lMd;
        layoutParams2.rightMargin = lMd;
        addView(pAGTextView, layoutParams2);
        PAGProgressBar pAGProgressBar = new PAGProgressBar(context, null, R.style.Widget.ProgressBar.Horizontal);
        pAGProgressBar.setId(vDp.REM);
        pAGProgressBar.setProgress(1);
        pAGProgressBar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.ku.zp(context, "tt_privacy_progress_style"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, WNy.lMd(context, 2.0f));
        layoutParams3.addRule(12);
        addView(pAGProgressBar, layoutParams3);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, WNy.lMd(context, 0.5f));
        layoutParams4.addRule(12);
        addView(view, layoutParams4);
    }
}
