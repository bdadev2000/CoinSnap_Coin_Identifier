package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class NjR extends RelativeLayout {
    public NjR(Context context) {
        super(context);
        YFl();
    }

    private void YFl() {
        Context context = getContext();
        int tN = GS.tN(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, GS.tN(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        alY.setId(520093720);
        alY.setClickable(true);
        alY.setFocusable(true);
        alY.setImageDrawable(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_leftbackicon_selector"));
        int tN2 = GS.tN(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(tN2, tN2);
        layoutParams.leftMargin = tN;
        layoutParams.addRule(15);
        addView(alY, layoutParams);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY2 = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        alY2.setId(520093716);
        alY2.setClickable(true);
        alY2.setFocusable(true);
        alY2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(tN2, tN2);
        layoutParams2.leftMargin = tN;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(alY2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wN.AlY alY3 = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.GA.kA;
        alY3.setId(i10);
        alY3.setImageDrawable(qO.tN(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(tN2, tN2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = tN;
        addView(alY3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh.setId(com.bytedance.sdk.openadsdk.utils.GA.SVa);
        qsh.setSingleLine(true);
        qsh.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        qsh.setGravity(17);
        qsh.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        qsh.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(GS.tN(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i10);
        int tN3 = GS.tN(context, 25.0f);
        layoutParams4.rightMargin = tN3;
        layoutParams4.leftMargin = tN3;
        addView(qsh, layoutParams4);
    }
}
