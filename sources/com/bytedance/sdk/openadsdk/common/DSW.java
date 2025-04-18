package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class DSW extends LinearLayout {
    public DSW(Context context) {
        super(context);
        YFl();
    }

    private static ImageView YFl(Context context, float f10, float f11, float f12, float f13) {
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        alY.setClickable(true);
        alY.setFocusable(true);
        alY.setPadding(GS.tN(context, f12), GS.tN(context, f13), GS.tN(context, f12), GS.tN(context, f13));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(GS.tN(context, 40.0f), GS.tN(context, 44.0f));
        if (f10 > 0.0f) {
            layoutParams.leftMargin = GS.tN(context, f10);
        }
        if (f11 > 0.0f) {
            layoutParams.rightMargin = GS.tN(context, f11);
        }
        alY.setLayoutParams(layoutParams);
        return alY;
    }

    private void YFl() {
        Context context = getContext();
        setId(com.bytedance.sdk.openadsdk.utils.GA.ZLB);
        setLayoutParams(new ViewGroup.LayoutParams(-1, GS.tN(context, 44.5f)));
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        addView(view, new LinearLayout.LayoutParams(-1, GS.tN(context, 0.5f)));
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar.setOrientation(0);
        addView(wNVar, new LinearLayout.LayoutParams(-1, GS.tN(context, 44.0f)));
        ImageView YFl = YFl(context, 16.0f, 0.0f, 14.75f, 12.5f);
        YFl.setId(com.bytedance.sdk.openadsdk.utils.GA.UT);
        YFl.setImageResource(qO.AlY(context, "tt_ad_arrow_backward"));
        wNVar.addView(YFl);
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        wNVar.addView(view2, layoutParams);
        ImageView YFl2 = YFl(context, 8.0f, 0.0f, 14.75f, 12.5f);
        YFl2.setId(com.bytedance.sdk.openadsdk.utils.GA.DjU);
        YFl2.setImageResource(qO.AlY(context, "tt_ad_arrow_forward"));
        wNVar.addView(YFl2);
        View view3 = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        wNVar.addView(view3, layoutParams2);
        ImageView YFl3 = YFl(context, 8.0f, 0.0f, 10.0f, 12.0f);
        YFl3.setId(com.bytedance.sdk.openadsdk.utils.GA.YP);
        YFl3.setImageResource(qO.AlY(context, "tt_ad_refresh"));
        wNVar.addView(YFl3);
        View view4 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        wNVar.addView(view4, layoutParams3);
        ImageView YFl4 = YFl(context, 0.0f, 16.0f, 9.0f, 11.0f);
        YFl4.setId(com.bytedance.sdk.openadsdk.utils.GA.rE);
        YFl4.setImageResource(qO.AlY(context, "tt_ad_link"));
        wNVar.addView(YFl4);
    }
}
