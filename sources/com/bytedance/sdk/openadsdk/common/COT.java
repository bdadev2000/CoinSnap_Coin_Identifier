package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.KVG;
import com.bytedance.sdk.openadsdk.core.model.rV;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.WNy;
import java.util.Locale;

/* loaded from: classes.dex */
public class COT extends HWF {
    private TextView Bj;
    private TextView YW;
    private PAGProgressBar dT;
    private TextView ku;
    private int tG;
    private FrameLayout vDp;
    AnimatorSet zp;

    public COT(Context context, String str, String[] strArr, rV rVVar, KVG kvg) {
        super(context, str, strArr, rVVar, kvg);
        this.tG = 0;
    }

    private View HWF() {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this.HWF);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGLinearLayout.setGravity(17);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        int lMd = WNy.lMd(this.HWF, 68.0f);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(this.HWF);
        pAGLinearLayout.addView(tTRoundRectImageView, new LinearLayout.LayoutParams(lMd, lMd));
        PAGTextView pAGTextView = new PAGTextView(this.HWF);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(WNy.lMd(this.HWF, 170.0f), -2);
        layoutParams2.topMargin = WNy.lMd(this.HWF, 8.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pAGTextView.setEllipsize(truncateAt);
        pAGTextView.setGravity(17);
        pAGTextView.setMaxWidth(WNy.lMd(this.HWF, 150.0f));
        pAGTextView.setMaxLines(2);
        pAGTextView.setTextColor(Color.parseColor("#222222"));
        pAGTextView.setTextSize(18.0f);
        pAGLinearLayout.addView(pAGTextView, layoutParams2);
        this.vDp = new PAGFrameLayout(this.HWF);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.width = WNy.lMd(this.HWF, 244.0f);
        layoutParams3.height = WNy.lMd(this.HWF, 24.0f);
        layoutParams3.topMargin = WNy.lMd(this.HWF, 16.0f);
        pAGLinearLayout.addView(this.vDp, layoutParams3);
        this.ku = new PAGTextView(this.HWF);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -1);
        this.ku.setEllipsize(truncateAt);
        this.ku.setVisibility(4);
        layoutParams4.gravity = 17;
        Drawable zp = com.bytedance.sdk.openadsdk.utils.ku.zp(this.HWF, "tt_landingpage_loading_text_rect");
        this.ku.setBackground(zp);
        this.ku.setGravity(17);
        this.ku.setMaxLines(1);
        int lMd2 = WNy.lMd(this.HWF, 12.0f);
        int lMd3 = WNy.lMd(this.HWF, 4.0f);
        this.ku.setPadding(lMd2, lMd3, lMd2, lMd3);
        int parseColor = Color.parseColor("#1A73E8");
        this.ku.setTextColor(parseColor);
        this.ku.setTextSize(12.0f);
        this.vDp.addView(this.ku, layoutParams4);
        this.YW = new PAGTextView(this.HWF);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -1);
        this.YW.setEllipsize(truncateAt);
        layoutParams5.gravity = 17;
        this.YW.setBackground(zp);
        this.YW.setGravity(17);
        this.YW.setMaxLines(1);
        this.YW.setPadding(lMd2, lMd3, lMd2, lMd3);
        this.YW.setTextColor(parseColor);
        this.YW.setTextSize(12.0f);
        this.vDp.addView(this.YW, layoutParams5);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(this.HWF);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        int lMd4 = WNy.lMd(this.HWF, 21.0f);
        int lMd5 = WNy.lMd(this.HWF, 43.0f);
        layoutParams6.topMargin = lMd4;
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setPadding(lMd5, 0, 0, 0);
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams6);
        this.dT = new PAGProgressBar(this.HWF, null, R.style.Widget.ProgressBar.Horizontal);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(WNy.lMd(this.HWF, 160.0f), lMd2);
        layoutParams7.gravity = 16;
        this.dT.setMax(100);
        this.dT.setProgress(1);
        this.dT.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.ku.zp(this.HWF, "tt_full_reward_loading_progress_style"));
        pAGLinearLayout2.addView(this.dT, layoutParams7);
        this.Bj = new PAGTextView(this.HWF);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(WNy.lMd(this.HWF, 35.0f), -2);
        this.Bj.setMaxLines(1);
        layoutParams8.leftMargin = WNy.lMd(this.HWF, 8.0f);
        this.Bj.setTextColor(Color.parseColor("#161823"));
        this.Bj.setTextSize(14.0f);
        pAGLinearLayout2.addView(this.Bj, layoutParams8);
        if (!TextUtils.isEmpty(this.KS)) {
            pAGTextView.setText(this.KS);
        } else {
            pAGTextView.setVisibility(8);
        }
        rV rVVar = this.lMd;
        if (rVVar != null && !TextUtils.isEmpty(rVVar.zp())) {
            com.bytedance.sdk.openadsdk.Bj.KS.zp().zp(this.lMd, tTRoundRectImageView, (woN) null);
        } else {
            tTRoundRectImageView.setVisibility(8);
        }
        return pAGLinearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void QR() {
        String[] strArr = this.jU;
        if (strArr == null) {
            return;
        }
        int i9 = 0;
        if (this.tG >= strArr.length) {
            this.tG = 0;
        }
        TextView textView = this.ku;
        if (textView != null) {
            if (textView.getVisibility() != 0) {
                this.ku.setVisibility(0);
            }
            this.ku.setText(this.jU[this.tG]);
            this.ku.setY(0.0f);
        }
        TextView textView2 = this.YW;
        if (textView2 != null) {
            int i10 = this.tG + 1;
            String[] strArr2 = this.jU;
            if (i10 < strArr2.length) {
                i9 = i10;
            }
            textView2.setText(strArr2[i9]);
            this.YW.setVisibility(4);
        }
        this.tG++;
    }

    @Override // com.bytedance.sdk.openadsdk.common.HWF
    public void KS() {
        AnimatorSet animatorSet = this.zp;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.common.HWF
    public void jU() {
        super.jU();
    }

    @Override // com.bytedance.sdk.openadsdk.common.HWF
    public void lMd() {
        lMd(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lMd(int i9) {
        FrameLayout frameLayout = this.vDp;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            return;
        }
        this.vDp.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.COT.1
            @Override // java.lang.Runnable
            public void run() {
                COT cot = COT.this;
                if (cot.zp == null) {
                    cot.zp = new AnimatorSet();
                    COT cot2 = COT.this;
                    AnimatorSet.Builder play = cot2.zp.play(cot2.zp(cot2.ku));
                    COT cot3 = COT.this;
                    play.with(cot3.lMd(cot3.YW));
                    COT.this.zp.setDuration(500L);
                }
                COT.this.zp.start();
            }
        }, i9);
    }

    @Override // com.bytedance.sdk.openadsdk.common.HWF
    public void zp() {
        if (this.HWF == null) {
            return;
        }
        this.COT = HWF();
        String[] strArr = this.jU;
        if (strArr != null && strArr.length > 0) {
            TextView textView = this.YW;
            if (textView != null) {
                textView.setText(strArr[0]);
                return;
            }
            return;
        }
        FrameLayout frameLayout = this.vDp;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator lMd(final TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "translationY", WNy.lMd(this.HWF, 10.0f) + this.vDp.getHeight(), 0.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.common.COT.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                COT cot = COT.this;
                String[] strArr = cot.jU;
                if (strArr != null && strArr.length >= 2 && cot.vDp != null) {
                    COT.this.lMd(2000);
                    COT.this.QR();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                TextView textView2 = textView;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            }
        });
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator zp(TextView textView) {
        return ObjectAnimator.ofFloat(textView, "translationY", 0.0f, -this.vDp.getHeight());
    }

    @Override // com.bytedance.sdk.openadsdk.common.HWF
    public void zp(int i9) {
        PAGProgressBar pAGProgressBar = this.dT;
        if (pAGProgressBar != null) {
            pAGProgressBar.setProgress(i9);
        }
        TextView textView = this.Bj;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf(i9)));
        }
    }
}
