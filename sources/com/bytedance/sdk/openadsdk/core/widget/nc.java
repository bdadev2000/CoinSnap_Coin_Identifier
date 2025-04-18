package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.utils.GS;

/* loaded from: classes.dex */
public class nc extends FrameLayout {
    private rkt AlY;
    private com.bytedance.sdk.openadsdk.core.wN.qsH DSW;
    private String NjR;
    private lG Sg;
    private boolean YFl;

    /* renamed from: nc, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.Sg.YFl f10767nc;
    private com.bytedance.sdk.openadsdk.core.model.Wwa qsH;
    private TextView tN;

    /* renamed from: vc, reason: collision with root package name */
    private PAGLogoView f10768vc;
    private TextView wN;

    public nc(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.GA.qjy);
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.Sg.YFl yFl) {
        this.f10767nc = yFl;
        TextView textView = this.wN;
        if (textView != null) {
            textView.setOnClickListener(yFl);
            this.wN.setOnTouchListener(this.f10767nc);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            YFl();
        }
    }

    private void Sg() {
        FrameLayout.LayoutParams layoutParams;
        Context context = getContext();
        boolean z10 = this.qsH.SVa() == 1;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.core.wN.wN wNVar = new com.bytedance.sdk.openadsdk.core.wN.wN(context);
        wNVar.setGravity(1);
        wNVar.setOrientation(1);
        if (z10) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(GS.tN(context, 327.0f), -2);
        }
        layoutParams.gravity = 17;
        int tN = GS.tN(context, 24.0f);
        layoutParams.rightMargin = tN;
        layoutParams.leftMargin = tN;
        addView(wNVar, layoutParams);
        lG lGVar = new lG(context);
        this.Sg = lGVar;
        lGVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(GS.tN(context, 80.0f), GS.tN(context, 80.0f));
        layoutParams2.bottomMargin = GS.tN(context, 12.0f);
        wNVar.addView(this.Sg, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.tN = qsh;
        qsh.setEllipsize(TextUtils.TruncateAt.END);
        this.tN.setGravity(17);
        this.tN.setMaxLines(2);
        this.tN.setMaxWidth(GS.tN(context, 180.0f));
        this.tN.setTextColor(-1);
        this.tN.setTextSize(2, 24.0f);
        wNVar.addView(this.tN, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh2 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.DSW = qsh2;
        qsh2.setEllipsize(TextUtils.TruncateAt.END);
        this.DSW.setGravity(17);
        this.DSW.setMaxLines(2);
        this.DSW.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.DSW.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = GS.tN(context, 8.0f);
        wNVar.addView(this.DSW, layoutParams3);
        this.AlY = new rkt(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, GS.tN(context, 16.0f));
        layoutParams4.topMargin = GS.tN(context, 12.0f);
        this.AlY.setVisibility(8);
        wNVar.addView(this.AlY, layoutParams4);
        com.bytedance.sdk.openadsdk.core.wN.qsH qsh3 = new com.bytedance.sdk.openadsdk.core.wN.qsH(context);
        this.wN = qsh3;
        qsh3.setId(520093707);
        this.wN.setGravity(17);
        this.wN.setText(com.bytedance.sdk.component.utils.qO.YFl(context, "tt_video_download_apk"));
        this.wN.setTextColor(-1);
        this.wN.setTextSize(2, 16.0f);
        this.wN.setBackground(com.bytedance.sdk.openadsdk.utils.qsH.YFl(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, GS.tN(context, 44.0f));
        layoutParams5.topMargin = GS.tN(context, 54.0f);
        wNVar.addView(this.wN, layoutParams5);
        this.f10768vc = new PAGLogoView(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, GS.tN(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = GS.tN(context, 18.0f);
        if (z10) {
            layoutParams6.bottomMargin = GS.tN(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = GS.tN(context, 24.0f);
        }
        addView(this.f10768vc, layoutParams6);
    }

    public void YFl(com.bytedance.sdk.openadsdk.core.model.Wwa wwa, String str, com.bytedance.sdk.openadsdk.core.Sg.YFl yFl) {
        this.qsH = wwa;
        this.NjR = str;
        this.f10767nc = yFl;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void YFl() {
        if (this.YFl) {
            return;
        }
        this.YFl = true;
        Sg();
        this.wN.setOnClickListener(this.f10767nc);
        this.wN.setOnTouchListener(this.f10767nc);
        String lL = this.qsH.lL();
        if (!TextUtils.isEmpty(lL)) {
            this.wN.setText(lL);
        }
        if (this.Sg != null && this.qsH.dGX() != null && !TextUtils.isEmpty(this.qsH.dGX().YFl())) {
            com.bytedance.sdk.openadsdk.lG.tN.YFl().YFl(this.qsH.dGX(), this.Sg, this.qsH);
        }
        rkt rktVar = this.AlY;
        if (rktVar != null) {
            GS.YFl((TextView) null, rktVar, this.qsH);
            if (this.qsH.in() != null) {
                this.AlY.setVisibility(0);
            }
        }
        if (this.tN != null) {
            if (this.qsH.in() != null && !TextUtils.isEmpty(this.qsH.in().Sg())) {
                this.tN.setText(this.qsH.in().Sg());
            } else if (!TextUtils.isEmpty(this.qsH.zG())) {
                this.tN.setText(this.qsH.zG());
            } else {
                this.tN.setVisibility(8);
            }
        }
        if (this.DSW != null) {
            String Hjb = this.qsH.Hjb();
            if (!TextUtils.isEmpty(Hjb)) {
                this.DSW.setText(Hjb);
            } else {
                this.DSW.setVisibility(8);
            }
        }
        this.f10768vc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.nc.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.YFl(nc.this.getContext(), nc.this.qsH, nc.this.NjR);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
