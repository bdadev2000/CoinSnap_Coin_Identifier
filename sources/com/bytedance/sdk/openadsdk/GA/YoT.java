package com.bytedance.sdk.openadsdk.GA;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class YoT extends com.bytedance.sdk.openadsdk.core.wN.DSW {
    public YoT(Context context) {
        this(context, null);
    }

    private void YFl(Context context) {
        setId(com.bytedance.sdk.openadsdk.utils.GA.pm);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.wN.AlY alY = new com.bytedance.sdk.openadsdk.core.wN.AlY(getContext());
        alY.setId(com.bytedance.sdk.openadsdk.utils.GA.JwO);
        alY.setScaleType(ImageView.ScaleType.CENTER_CROP);
        alY.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        alY.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        alY.setBackgroundColor(Color.parseColor("#7f000000"));
        alY.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(alY);
        com.bytedance.sdk.openadsdk.core.wN.DSW dsw = new com.bytedance.sdk.openadsdk.core.wN.DSW(context);
        dsw.setId(com.bytedance.sdk.openadsdk.utils.GA.wqc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        dsw.setLayoutParams(layoutParams);
        addView(dsw);
        int tN = GS.tN(context, 44.0f);
        com.bytedance.sdk.openadsdk.core.widget.YFl yFl = new com.bytedance.sdk.openadsdk.core.widget.YFl(context);
        int i10 = com.bytedance.sdk.openadsdk.utils.GA.ZU;
        yFl.setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(tN, tN);
        layoutParams2.addRule(14);
        yFl.setLayoutParams(layoutParams2);
        yFl.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        dsw.addView(yFl);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh.setId(com.bytedance.sdk.openadsdk.utils.GA.BPI);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(tN, tN);
        layoutParams3.addRule(8, i10);
        layoutParams3.addRule(19, i10);
        layoutParams3.addRule(5, i10);
        layoutParams3.addRule(7, i10);
        layoutParams3.addRule(18, i10);
        layoutParams3.addRule(6, i10);
        layoutParams3.addRule(14);
        qsh.setLayoutParams(layoutParams3);
        qsh.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_circle_solid_mian"));
        qsh.setGravity(17);
        qsh.setTextColor(-1);
        qsh.setTextSize(2, 19.0f);
        qsh.setTypeface(Typeface.defaultFromStyle(1));
        qsh.setVisibility(8);
        dsw.addView(qsh);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh2 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        int i11 = com.bytedance.sdk.openadsdk.utils.GA.zG;
        qsh2.setId(i11);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, i10);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = GS.tN(context, 6.0f);
        qsh2.setLayoutParams(layoutParams4);
        qsh2.setEllipsize(TextUtils.TruncateAt.END);
        qsh2.setMaxLines(1);
        qsh2.setTextColor(-1);
        qsh2.setTextSize(2, 12.0f);
        dsw.addView(qsh2);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh3 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        qsh3.setId(com.bytedance.sdk.openadsdk.utils.GA.ko);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(GS.tN(context, 100.0f), GS.tN(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, i11);
        layoutParams5.topMargin = GS.tN(context, 20.0f);
        qsh3.setLayoutParams(layoutParams5);
        qsh3.setMinWidth(GS.tN(context, 72.0f));
        qsh3.setMaxLines(1);
        qsh3.setEllipsize(TextUtils.TruncateAt.END);
        qsh3.setTextColor(-1);
        qsh3.setTextSize(2, 14.0f);
        qsh3.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_ad_cover_btn_begin_bg"));
        qsh3.setGravity(17);
        int tN2 = GS.tN(context, 10.0f);
        int tN3 = GS.tN(context, 2.0f);
        qsh3.setPadding(tN2, tN3, tN2, tN3);
        qsh3.setVisibility(8);
        dsw.addView(qsh3);
    }

    public YoT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YoT(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        YFl(context);
    }
}
