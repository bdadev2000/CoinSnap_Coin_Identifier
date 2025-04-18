package com.bytedance.sdk.component.adexpress.vc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class rkt extends FrameLayout {
    private AnimatorSet AlY;
    private ImageView Sg;
    private Context YFl;
    private VOe tN;

    /* renamed from: vc, reason: collision with root package name */
    private TextView f10427vc;
    private boolean wN;

    public rkt(Context context) {
        super(context);
        this.wN = true;
        this.YFl = context;
        this.AlY = new AnimatorSet();
        tN();
        AlY();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vc.rkt.1
            @Override // java.lang.Runnable
            public void run() {
                int YFl = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(rkt.this.YFl, 50.0f);
                int YFl2 = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(rkt.this.YFl, 50.0f);
                if (rkt.this.tN.getMeasuredHeight() > 0) {
                    YFl = rkt.this.tN.getMeasuredHeight();
                }
                if (rkt.this.tN.getMeasuredWidth() > 0) {
                    YFl2 = rkt.this.tN.getMeasuredWidth();
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rkt.this.Sg.getLayoutParams();
                layoutParams.topMargin = ((int) ((YFl / 2.0f) - com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(rkt.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(rkt.this.YFl, 40.0f));
                layoutParams.leftMargin = ((int) ((YFl2 / 2.0f) - com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(rkt.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(rkt.this.YFl, 20.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(rkt.this.getContext(), 5.0f) + ((-YFl) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(rkt.this.getContext(), 5.0f) + ((-YFl2) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                rkt.this.Sg.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.f10427vc.setVisibility(0);
        this.f10427vc.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.f10427vc.setTextColor(i10);
    }

    private void AlY() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Sg, "scaleX", 1.0f, 1.0f, 1.0f, 0.9f);
        ofFloat.setDuration(600L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.vc.rkt.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (rkt.this.wN) {
                    rkt.this.tN.YFl();
                }
                rkt.this.wN = !r2.wN;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rkt.this.Sg, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                rkt.this.Sg.setVisibility(0);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Sg, "scaleY", 1.0f, 1.0f, 1.0f, 0.9f);
        ofFloat2.setDuration(600L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.AlY.playTogether(ofFloat, ofFloat2);
    }

    private void tN() {
        this.tN = new VOe(this.YFl);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 50.0f), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 50.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 40.0f);
        int YFl = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 20.0f);
        layoutParams.leftMargin = YFl;
        layoutParams.setMarginStart(YFl);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.tN, layoutParams);
        this.Sg = new ImageView(this.YFl);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 78.0f), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 78.0f));
        this.Sg.setImageResource(com.bytedance.sdk.component.utils.qO.AlY(this.YFl, "tt_splash_hand"));
        addView(this.Sg, layoutParams2);
        TextView textView = new TextView(this.YFl);
        this.f10427vc = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 10.0f);
        addView(this.f10427vc, layoutParams3);
        this.f10427vc.setVisibility(8);
    }

    public void Sg() {
        AnimatorSet animatorSet = this.AlY;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        VOe vOe = this.tN;
        if (vOe != null) {
            vOe.Sg();
        }
        ImageView imageView = this.Sg;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void YFl() {
        this.AlY.start();
    }
}
