package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class LandingPageBrowserNewBottomBar extends LinearLayout {
    public LandingPageBrowserNewBottomBar(Context context) {
        super(context);
        zp();
    }

    private static ImageView zp(Context context, float f9, float f10, float f11, float f12) {
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setClickable(true);
        pAGImageView.setFocusable(true);
        pAGImageView.setPadding(WNy.lMd(context, f11), WNy.lMd(context, f12), WNy.lMd(context, f11), WNy.lMd(context, f12));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(WNy.lMd(context, 40.0f), WNy.lMd(context, 44.0f));
        if (f9 > 0.0f) {
            layoutParams.leftMargin = WNy.lMd(context, f9);
        }
        if (f10 > 0.0f) {
            layoutParams.rightMargin = WNy.lMd(context, f10);
        }
        pAGImageView.setLayoutParams(layoutParams);
        return pAGImageView;
    }

    private void zp() {
        Context context = getContext();
        setId(vDp.bX);
        setLayoutParams(new ViewGroup.LayoutParams(-1, WNy.lMd(context, 44.5f)));
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        addView(view, new LinearLayout.LayoutParams(-1, WNy.lMd(context, 0.5f)));
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setOrientation(0);
        addView(pAGLinearLayout, new LinearLayout.LayoutParams(-1, WNy.lMd(context, 44.0f)));
        ImageView zp = zp(context, 16.0f, 0.0f, 14.75f, 12.5f);
        zp.setId(vDp.CZ);
        zp.setImageResource(cz.jU(context, "tt_ad_arrow_backward_wrapper"));
        pAGLinearLayout.addView(zp);
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout.addView(view2, layoutParams);
        ImageView zp2 = zp(context, 8.0f, 0.0f, 14.75f, 12.5f);
        zp2.setId(vDp.vLi);
        zp2.setImageResource(cz.jU(context, "tt_ad_arrow_forward_wrapper"));
        pAGLinearLayout.addView(zp2);
        View view3 = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        pAGLinearLayout.addView(view3, layoutParams2);
        ImageView zp3 = zp(context, 8.0f, 0.0f, 10.0f, 12.0f);
        zp3.setId(vDp.bQm);
        zp3.setImageResource(cz.jU(context, "tt_ad_refresh"));
        pAGLinearLayout.addView(zp3);
        View view4 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        pAGLinearLayout.addView(view4, layoutParams3);
        ImageView zp4 = zp(context, 0.0f, 16.0f, 9.0f, 11.0f);
        zp4.setId(vDp.Eg);
        zp4.setImageResource(cz.jU(context, "tt_ad_link"));
        pAGLinearLayout.addView(zp4);
    }
}
