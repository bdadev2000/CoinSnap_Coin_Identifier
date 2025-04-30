package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class SlideRightView extends FrameLayout {
    private TextView COT;
    private AnimatorSet HWF;
    private ImageView KS;
    private AnimatorSet QR;
    private AnimatorSet YW;
    private ImageView jU;
    private AnimatorSet ku;
    private ImageView lMd;
    private Context zp;

    public SlideRightView(Context context) {
        super(context);
        this.HWF = new AnimatorSet();
        this.QR = new AnimatorSet();
        this.ku = new AnimatorSet();
        this.YW = new AnimatorSet();
        this.zp = context;
        KS();
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
    }

    public void setGuideText(String str) {
        this.COT.setText(str);
    }

    private void KS() {
        ImageView imageView = new ImageView(this.zp);
        this.jU = imageView;
        imageView.setBackgroundResource(cz.jU(this.zp, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) QR.zp(this.zp, 30.0f);
        addView(this.jU, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.zp);
        this.KS = imageView2;
        imageView2.setImageResource(cz.jU(this.zp, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) QR.zp(this.zp, 50.0f), (int) QR.zp(this.zp, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) QR.zp(this.zp, 30.0f);
        addView(this.KS, layoutParams2);
        ImageView imageView3 = new ImageView(this.zp);
        this.lMd = imageView3;
        imageView3.setImageResource(cz.jU(this.zp, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) QR.zp(this.zp, 80.0f), (int) QR.zp(this.zp, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) QR.zp(this.zp, 30.0f);
        addView(this.lMd, layoutParams3);
        TextView textView = new TextView(this.zp);
        this.COT = textView;
        textView.setTextColor(-1);
        this.COT.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.COT, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) SlideRightView.this.lMd.getLayoutParams();
                layoutParams5.topMargin = (int) ((SlideRightView.this.KS.getMeasuredHeight() / 2.0f) - QR.zp(SlideRightView.this.getContext(), 7.0f));
                int zp = (-SlideRightView.this.KS.getMeasuredWidth()) + ((int) QR.zp(SlideRightView.this.zp, 30.0f));
                layoutParams5.leftMargin = zp;
                layoutParams5.setMarginStart(zp);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                SlideRightView.this.lMd.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) SlideRightView.this.jU.getLayoutParams();
                layoutParams6.topMargin = (int) ((SlideRightView.this.KS.getMeasuredHeight() / 2.0f) - QR.zp(SlideRightView.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((SlideRightView.this.KS.getMeasuredWidth() / 2.0f) + ((int) QR.zp(SlideRightView.this.zp, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                SlideRightView.this.jU.setLayoutParams(layoutParams6);
            }
        });
    }

    private void jU() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.lMd, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.KS, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.KS, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.jU, "alpha", 0.0f, 1.0f);
        this.ku.setDuration(300L);
        this.ku.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.lMd, "translationX", 0.0f, QR.zp(getContext(), 90.0f));
        ofFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) QR.zp(getContext(), 90.0f));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SlideRightView.this.jU.getLayoutParams();
                layoutParams.width = num.intValue();
                SlideRightView.this.jU.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.KS, "translationX", 0.0f, QR.zp(getContext(), 90.0f));
        ofFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.YW.setDuration(1500L);
        this.YW.playTogether(ofFloat5, ofInt, ofFloat6);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.lMd, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.jU, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.KS, "alpha", 1.0f, 0.0f);
        this.QR.setDuration(50L);
        this.QR.playTogether(ofFloat7, ofFloat8, ofFloat9);
        this.HWF.playSequentially(this.ku, this.YW, this.QR);
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
            AnimatorSet animatorSet3 = this.YW;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.QR;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    public void zp() {
        jU();
        this.HWF.start();
        this.HWF.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideRightView.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.SlideRightView.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SlideRightView.this.HWF.start();
                    }
                }, 200L);
            }
        });
    }
}
