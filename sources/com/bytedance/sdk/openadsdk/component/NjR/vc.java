package com.bytedance.sdk.openadsdk.component.NjR;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.lG;
import com.bytedance.sdk.openadsdk.core.widget.rkt;
import com.bytedance.sdk.openadsdk.utils.GA;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class vc extends tN {
    private final com.bytedance.sdk.openadsdk.core.wN.wN GA;
    private final rkt pDU;

    public vc(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")}));
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        this.GA = wNVar;
        wNVar.setId(520093758);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = GS.tN(context, 24.0f);
        layoutParams.topMargin = GS.tN(context, 56.0f);
        wNVar.setLayoutParams(layoutParams);
        wNVar.setClickable(false);
        wNVar.setGravity(16);
        wNVar.setOrientation(0);
        lG lGVar = new lG(context);
        this.f10574vc = lGVar;
        lGVar.setId(520093759);
        this.f10574vc.setLayoutParams(new LinearLayout.LayoutParams(GS.tN(context, 24.0f), GS.tN(context, 24.0f)));
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.DSW = qsh;
        qsh.setId(520093761);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = GS.tN(context, 8.0f);
        this.DSW.setLayoutParams(layoutParams2);
        this.DSW.setEllipsize(TextUtils.TruncateAt.END);
        this.DSW.setMaxLines(2);
        this.DSW.setTextColor(Color.parseColor("#161823"));
        this.DSW.setTextSize(12.0f);
        com.bytedance.sdk.openadsdk.core.wN.DSW dsw = new com.bytedance.sdk.openadsdk.core.wN.DSW(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(GS.tN(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = GS.tN(context, 24.0f);
        layoutParams3.rightMargin = GS.tN(context, 24.0f);
        dsw.setLayoutParams(layoutParams3);
        lG lGVar2 = new lG(context);
        this.NjR = lGVar2;
        int i10 = GA.Zu;
        lGVar2.setId(i10);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(GS.tN(context, 80.0f), GS.tN(context, 80.0f));
        layoutParams4.addRule(14);
        this.NjR.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh2 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.f10573nc = qsh2;
        int i11 = GA.f10815bg;
        qsh2.setId(i11);
        this.f10573nc.setTextSize(24.0f);
        this.f10573nc.setTextColor(Color.parseColor("#161823"));
        this.f10573nc.setGravity(17);
        this.f10573nc.setMaxLines(1);
        this.f10573nc.setEllipsize(TextUtils.TruncateAt.END);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, i10);
        layoutParams5.topMargin = GS.tN(context, 12.0f);
        layoutParams5.addRule(14);
        this.f10573nc.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh3 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.eT = qsh3;
        int i12 = GA.MJU;
        qsh3.setId(i12);
        this.eT.setTextSize(16.0f);
        this.eT.setTextColor(Color.parseColor("#80161823"));
        this.eT.setGravity(17);
        this.eT.setMaxLines(2);
        this.eT.setEllipsize(TextUtils.TruncateAt.END);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, i11);
        layoutParams6.topMargin = GS.tN(context, 4.0f);
        layoutParams6.addRule(14);
        this.eT.setLayoutParams(layoutParams6);
        rkt rktVar = new rkt(context);
        this.pDU = rktVar;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(14);
        layoutParams7.topMargin = GS.tN(context, 12.0f);
        rktVar.setLayoutParams(layoutParams7);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh4 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.wN = qsh4;
        qsh4.setId(520093717);
        this.wN.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_reward_full_video_backup_btn_bg"));
        this.wN.setEllipsize(TextUtils.TruncateAt.END);
        this.wN.setLines(1);
        this.wN.setGravity(17);
        this.wN.setTextColor(-1);
        this.wN.setTextSize(16.0f);
        this.wN.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, GS.tN(context, 44.0f));
        layoutParams8.addRule(3, i12);
        layoutParams8.topMargin = GS.tN(context, 54.0f);
        layoutParams8.addRule(14);
        this.wN.setLayoutParams(layoutParams8);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.AlY = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, GS.tN(context, 14.0f));
        layoutParams9.leftMargin = GS.tN(context, 16.0f);
        layoutParams9.bottomMargin = GS.tN(context, 24.0f);
        layoutParams9.addRule(12);
        this.AlY.setLayoutParams(layoutParams9);
        addView(this.qsH);
        wNVar.addView(this.f10574vc);
        wNVar.addView(this.DSW);
        addView(wNVar);
        dsw.addView(this.NjR);
        dsw.addView(this.f10573nc);
        dsw.addView(this.eT);
        dsw.addView(rktVar);
        dsw.addView(this.wN);
        addView(dsw);
        addView(this.AlY);
    }

    @Override // com.bytedance.sdk.openadsdk.component.NjR.tN
    public com.bytedance.sdk.openadsdk.core.wN.AlY getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.NjR.tN
    public com.bytedance.sdk.openadsdk.core.wN.qsH getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.NjR.tN
    public rkt getScoreBar() {
        return this.pDU;
    }

    @Override // com.bytedance.sdk.openadsdk.component.NjR.tN
    public View getUserInfo() {
        return this.GA;
    }
}
