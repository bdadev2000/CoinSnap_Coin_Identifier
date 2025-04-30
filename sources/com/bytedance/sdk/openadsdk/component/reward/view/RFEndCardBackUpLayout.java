package com.bytedance.sdk.openadsdk.component.reward.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.cz;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import com.bytedance.sdk.openadsdk.utils.ku;
import com.bytedance.sdk.openadsdk.utils.vDp;

/* loaded from: classes.dex */
public class RFEndCardBackUpLayout extends PAGFrameLayout {
    private TTRatingBar2 COT;
    private TextView HWF;
    private TTRoundRectImageView KS;
    private TextView QR;
    private TextView jU;
    private PAGLogoView ku;
    private com.bytedance.sdk.openadsdk.component.reward.zp.zp lMd;
    private boolean zp;

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(vDp.iOI);
    }

    private void KS() {
        Context context = getContext();
        setBackgroundColor(-1);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setGravity(1);
        pAGLinearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(pAGLinearLayout, layoutParams);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.KS = tTRoundRectImageView;
        tTRoundRectImageView.setBackgroundColor(0);
        pAGLinearLayout.addView(this.KS, new LinearLayout.LayoutParams(WNy.lMd(context, 100.0f), WNy.lMd(context, 100.0f)));
        PAGTextView pAGTextView = new PAGTextView(context);
        this.jU = pAGTextView;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pAGTextView.setEllipsize(truncateAt);
        this.jU.setSingleLine(true);
        this.jU.setMaxWidth(WNy.lMd(context, 180.0f));
        this.jU.setTextColor(Color.parseColor("#ff333333"));
        this.jU.setTextSize(2, 20.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, WNy.lMd(context, 28.0f));
        layoutParams2.topMargin = WNy.lMd(context, 16.0f);
        pAGLinearLayout.addView(this.jU, layoutParams2);
        this.COT = new TTRatingBar2(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, WNy.lMd(context, 16.0f));
        layoutParams3.topMargin = WNy.lMd(context, 12.0f);
        pAGLinearLayout.addView(this.COT, layoutParams3);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.HWF = pAGTextView2;
        pAGTextView2.setEllipsize(truncateAt);
        this.HWF.setSingleLine(true);
        this.HWF.setTextColor(Color.parseColor("#ff93959a"));
        this.HWF.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, WNy.lMd(context, 20.0f));
        layoutParams4.topMargin = WNy.lMd(context, 8.0f);
        pAGLinearLayout.addView(this.HWF, layoutParams4);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        this.QR = pAGTextView3;
        pAGTextView3.setId(520093707);
        this.QR.setGravity(17);
        this.QR.setText(cz.lMd(context, "tt_video_download_apk"));
        this.QR.setTextColor(-1);
        this.QR.setTextSize(2, 16.0f);
        this.QR.setBackground(ku.zp(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, WNy.lMd(context, 46.0f));
        int lMd = WNy.lMd(context, 20.0f);
        layoutParams5.bottomMargin = lMd;
        layoutParams5.rightMargin = lMd;
        layoutParams5.topMargin = lMd;
        layoutParams5.leftMargin = lMd;
        pAGLinearLayout.addView(this.QR, layoutParams5);
        this.ku = new PAGLogoView(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, WNy.lMd(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.bottomMargin = WNy.lMd(context, 16.0f);
        layoutParams6.leftMargin = WNy.lMd(context, 20.0f);
        pAGLinearLayout.addView(this.ku, layoutParams6);
    }

    private void lMd() {
        Context context = getContext();
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(vDp.ku);
        pAGImageView.setVisibility(8);
        addView(pAGImageView, new FrameLayout.LayoutParams(-1, -1));
        View sSWebView = new SSWebView(context, true);
        sSWebView.setVisibility(8);
        sSWebView.setId(vDp.YW);
        addView(sSWebView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 == 0) {
            zp();
        }
    }

    public void zp(com.bytedance.sdk.openadsdk.component.reward.zp.zp zpVar) {
        this.lMd = zpVar;
        if (zpVar.zp.Fm()) {
            zp();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void zp() {
        if (this.zp) {
            return;
        }
        this.zp = true;
        woN won = this.lMd.zp;
        if (won.Fm()) {
            lMd();
            return;
        }
        KS();
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.lMd.COT COT = this.lMd.oKZ.COT();
        this.QR.setOnClickListener(COT);
        this.QR.setOnTouchListener(COT);
        String oB = won.oB();
        if (!TextUtils.isEmpty(oB)) {
            this.QR.setText(oB);
        }
        TTRoundRectImageView tTRoundRectImageView = this.KS;
        if (tTRoundRectImageView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) tTRoundRectImageView.getLayoutParams();
            layoutParams.setMargins(0, WNy.lMd(context, 50.0f), 0, 0);
            this.KS.setLayoutParams(layoutParams);
        }
        if (this.KS != null && won.BO() != null && !TextUtils.isEmpty(won.BO().zp())) {
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(won.BO(), this.KS, won);
        }
        TTRatingBar2 tTRatingBar2 = this.COT;
        if (tTRatingBar2 != null) {
            WNy.zp((TextView) null, tTRatingBar2, won);
        }
        if (this.jU != null) {
            if (won.Vjb() != null && !TextUtils.isEmpty(won.Vjb().lMd())) {
                this.jU.setText(won.Vjb().lMd());
            } else {
                this.jU.setText(won.rCC());
            }
        }
        TextView textView = this.HWF;
        if (textView != null) {
            WNy.zp(textView, won, getContext(), "tt_comment_num_backup");
        }
        this.ku.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.zp(RFEndCardBackUpLayout.this.lMd.oB, RFEndCardBackUpLayout.this.lMd.zp, RFEndCardBackUpLayout.this.lMd.QR);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
