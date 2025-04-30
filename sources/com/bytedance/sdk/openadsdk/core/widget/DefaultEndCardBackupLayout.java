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
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class DefaultEndCardBackupLayout extends FrameLayout {
    private TextView COT;
    private TextView HWF;
    private TextView KS;
    private PAGLogoView QR;
    private String YW;
    private com.bytedance.sdk.openadsdk.core.lMd.zp dT;
    private TTRatingBar2 jU;
    private woN ku;
    private TTRoundRectImageView lMd;
    private boolean zp;

    public DefaultEndCardBackupLayout(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setId(vDp.iOI);
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 == 0) {
            zp();
        }
    }

    private void lMd() {
        Context context = getContext();
        setBackgroundColor(-1);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setGravity(1);
        pAGLinearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(pAGLinearLayout, layoutParams);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.lMd = tTRoundRectImageView;
        tTRoundRectImageView.setBackgroundColor(0);
        pAGLinearLayout.addView(this.lMd, new LinearLayout.LayoutParams(WNy.lMd(context, 100.0f), WNy.lMd(context, 100.0f)));
        PAGTextView pAGTextView = new PAGTextView(context);
        this.KS = pAGTextView;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pAGTextView.setEllipsize(truncateAt);
        this.KS.setSingleLine(true);
        this.KS.setMaxWidth(WNy.lMd(context, 180.0f));
        this.KS.setTextColor(Color.parseColor("#ff333333"));
        this.KS.setTextSize(2, 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, WNy.lMd(context, 28.0f));
        layoutParams2.topMargin = WNy.lMd(context, 16.0f);
        pAGLinearLayout.addView(this.KS, layoutParams2);
        this.jU = new TTRatingBar2(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, WNy.lMd(context, 16.0f));
        layoutParams3.topMargin = WNy.lMd(context, 12.0f);
        pAGLinearLayout.addView(this.jU, layoutParams3);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.COT = pAGTextView2;
        pAGTextView2.setEllipsize(truncateAt);
        this.COT.setSingleLine(true);
        this.COT.setTextColor(Color.parseColor("#ff93959a"));
        this.COT.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, WNy.lMd(context, 20.0f));
        layoutParams4.topMargin = WNy.lMd(context, 8.0f);
        pAGLinearLayout.addView(this.COT, layoutParams4);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        this.HWF = pAGTextView3;
        pAGTextView3.setId(520093707);
        this.HWF.setGravity(17);
        this.HWF.setText(cz.lMd(context, "tt_video_download_apk"));
        this.HWF.setTextColor(-1);
        this.HWF.setTextSize(2, 16.0f);
        this.HWF.setBackground(ku.zp(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, WNy.lMd(context, 46.0f));
        int lMd = WNy.lMd(context, 20.0f);
        layoutParams5.bottomMargin = lMd;
        layoutParams5.rightMargin = lMd;
        layoutParams5.topMargin = lMd;
        layoutParams5.leftMargin = lMd;
        pAGLinearLayout.addView(this.HWF, layoutParams5);
        this.QR = new PAGLogoView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, WNy.lMd(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.bottomMargin = WNy.lMd(context, 16.0f);
        layoutParams6.leftMargin = WNy.lMd(context, 20.0f);
        pAGLinearLayout.addView(this.QR, layoutParams6);
    }

    public void zp(woN won, String str, com.bytedance.sdk.openadsdk.core.lMd.zp zpVar) {
        this.ku = won;
        this.YW = str;
        this.dT = zpVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void zp() {
        if (this.zp) {
            return;
        }
        this.zp = true;
        lMd();
        Context context = getContext();
        this.HWF.setOnClickListener(this.dT);
        this.HWF.setOnTouchListener(this.dT);
        String oB = this.ku.oB();
        if (!TextUtils.isEmpty(oB)) {
            this.HWF.setText(oB);
        }
        TTRoundRectImageView tTRoundRectImageView = this.lMd;
        if (tTRoundRectImageView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tTRoundRectImageView.getLayoutParams();
            layoutParams.setMargins(0, WNy.lMd(context, 50.0f), 0, 0);
            this.lMd.setLayoutParams(layoutParams);
        }
        if (this.lMd != null && this.ku.BO() != null && !TextUtils.isEmpty(this.ku.BO().zp())) {
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.ku.BO(), this.lMd, this.ku);
        }
        TTRatingBar2 tTRatingBar2 = this.jU;
        if (tTRatingBar2 != null) {
            WNy.zp((TextView) null, tTRatingBar2, this.ku);
        }
        if (this.KS != null) {
            if (this.ku.Vjb() != null && !TextUtils.isEmpty(this.ku.Vjb().lMd())) {
                this.KS.setText(this.ku.Vjb().lMd());
            } else {
                this.KS.setText(this.ku.rCC());
            }
        }
        TextView textView = this.COT;
        if (textView != null) {
            WNy.zp(textView, this.ku, getContext(), "tt_comment_num_backup");
        }
        this.QR.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.DefaultEndCardBackupLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.zp(DefaultEndCardBackupLayout.this.getContext(), DefaultEndCardBackupLayout.this.ku, DefaultEndCardBackupLayout.this.YW);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
