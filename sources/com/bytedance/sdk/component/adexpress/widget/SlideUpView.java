package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.KS.zp;
import com.bytedance.sdk.component.adexpress.jU;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.utils.tG;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes.dex */
public class SlideUpView extends RelativeLayout {
    private int Bj;
    private TextView COT;
    private AnimatorSet HWF;
    private ImageView KS;
    private AnimatorSet QR;
    private AnimatorSet YW;
    private String dT;
    private TextView jU;
    private AnimatorSet ku;
    private ImageView lMd;
    private ImageView zp;

    public SlideUpView(Context context) {
        super(context);
        this.HWF = new AnimatorSet();
        this.QR = new AnimatorSet();
        this.ku = new AnimatorSet();
        this.YW = new AnimatorSet();
        this.Bj = 100;
        zp(context);
    }

    public void KS() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.zp, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.zp, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.zp, "translationY", 0.0f, QR.zp(getContext(), -this.Bj));
        ofFloat3.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) QR.zp(getContext(), this.Bj));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (SlideUpView.this.KS != null) {
                    Integer num = (Integer) valueAnimator.getAnimatedValue();
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) SlideUpView.this.KS.getLayoutParams();
                    layoutParams.height = num.intValue();
                    SlideUpView.this.KS.setLayoutParams(layoutParams);
                }
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.KS, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.KS, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.lMd, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.lMd, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.lMd, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.lMd, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.lMd, "translationY", 0.0f, QR.zp(getContext(), -this.Bj));
        ofFloat10.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.QR.setDuration(50L);
        this.YW.setDuration(1500L);
        this.ku.setDuration(50L);
        this.QR.playTogether(ofFloat2, ofFloat7, ofFloat5);
        this.ku.playTogether(ofFloat, ofFloat6, ofFloat8, ofFloat9, ofFloat4);
        this.YW.playTogether(ofFloat3, ofInt, ofFloat10);
        this.HWF.playSequentially(this.ku, this.YW, this.QR);
    }

    public AnimatorSet getSlideUpAnimatorSet() {
        return this.HWF;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lMd();
    }

    public void setGuideText(String str) {
        TextView textView = this.jU;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setSlideText(String str) {
        if (this.COT != null) {
            if (TextUtils.isEmpty(str)) {
                this.COT.setText("");
            } else {
                this.COT.setText(str);
            }
        }
    }

    public void lMd() {
        try {
            AnimatorSet animatorSet = this.HWF;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.ku;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.QR;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.YW;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Exception e4) {
            tG.lMd(e4.getMessage());
        }
    }

    public void zp(Context context) {
        if (context == null) {
            context = jU.zp();
        }
        if (CampaignEx.CLICKMODE_ON.equals(this.dT)) {
            addView(zp.QR(context));
            this.Bj = (int) (this.Bj * 1.25d);
        } else {
            addView(zp.HWF(context));
        }
        this.zp = (ImageView) findViewById(2097610734);
        this.lMd = (ImageView) findViewById(2097610735);
        this.jU = (TextView) findViewById(2097610730);
        this.KS = (ImageView) findViewById(2097610733);
        this.COT = (TextView) findViewById(2097610731);
    }

    public SlideUpView(Context context, String str) {
        super(context);
        this.HWF = new AnimatorSet();
        this.QR = new AnimatorSet();
        this.ku = new AnimatorSet();
        this.YW = new AnimatorSet();
        this.Bj = 100;
        setClipChildren(false);
        this.dT = str;
        zp(context);
    }

    public void zp() {
        KS();
        this.HWF.start();
        this.HWF.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideUpView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideUpView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SlideUpView.this.HWF.start();
                    }
                }, 200L);
            }
        });
    }
}
