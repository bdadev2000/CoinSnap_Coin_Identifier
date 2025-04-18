package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class qsH extends RelativeLayout {
    public qsH(Context context) {
        super(context);
        YFl();
    }

    private void YFl() {
        setId(com.bytedance.sdk.openadsdk.utils.GA.zz);
        setBackgroundColor(-1);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, GS.tN(context, 44.0f)));
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.GA.Vmj;
        alY.setId(i10);
        alY.setClickable(true);
        alY.setFocusable(true);
        alY.setPadding(GS.tN(context, 12.0f), GS.tN(context, 14.0f), GS.tN(context, 12.0f), GS.tN(context, 14.0f));
        alY.setImageResource(qO.AlY(context, "tt_ad_xmark"));
        addView(alY, new RelativeLayout.LayoutParams(GS.tN(context, 40.0f), GS.tN(context, 44.0f)));
        com.bytedance.sdk.openadsdk.core.wN.AlY alY2 = new com.bytedance.sdk.openadsdk.core.wN.AlY(context);
        int i11 = com.bytedance.sdk.openadsdk.utils.GA.Bn;
        alY2.setId(i11);
        alY2.setPadding(GS.tN(context, 8.0f), GS.tN(context, 10.0f), GS.tN(context, 8.0f), GS.tN(context, 10.0f));
        alY2.setImageResource(qO.AlY(context, "tt_ad_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(GS.tN(context, 40.0f), GS.tN(context, 44.0f));
        layoutParams.addRule(11);
        addView(alY2, layoutParams);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh.setId(com.bytedance.sdk.openadsdk.utils.GA.in);
        qsh.setSingleLine(true);
        qsh.setEllipsize(TextUtils.TruncateAt.END);
        qsh.setGravity(17);
        qsh.setTextColor(Color.parseColor("#222222"));
        qsh.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(GS.tN(context, 191.0f), GS.tN(context, 24.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, i11);
        layoutParams2.addRule(1, i10);
        int tN = GS.tN(context, 10.0f);
        layoutParams2.leftMargin = tN;
        layoutParams2.rightMargin = tN;
        addView(qsh, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wN.vc vcVar = new com.bytedance.sdk.openadsdk.core.wN.vc(context, null, R.style.Widget.ProgressBar.Horizontal);
        vcVar.setId(com.bytedance.sdk.openadsdk.utils.GA.uGS);
        vcVar.setProgress(1);
        vcVar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_privacy_progress_style"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, GS.tN(context, 2.0f));
        layoutParams3.addRule(12);
        addView(vcVar, layoutParams3);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, GS.tN(context, 0.5f));
        layoutParams4.addRule(12);
        addView(view, layoutParams4);
    }
}
