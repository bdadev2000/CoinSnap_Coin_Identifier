package com.bytedance.sdk.component.adexpress.vc;

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

/* loaded from: classes.dex */
public class wXo extends FrameLayout {
    private ImageView AlY;
    private AnimatorSet DSW;
    private AnimatorSet NjR;
    private ImageView Sg;
    private Context YFl;
    private AnimatorSet qsH;
    private ImageView tN;

    /* renamed from: vc, reason: collision with root package name */
    private AnimatorSet f10429vc;
    private TextView wN;

    public wXo(Context context) {
        super(context);
        this.f10429vc = new AnimatorSet();
        this.DSW = new AnimatorSet();
        this.qsH = new AnimatorSet();
        this.NjR = new AnimatorSet();
        this.YFl = context;
        tN();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public void setGuideText(String str) {
        this.wN.setText(str);
    }

    private void AlY() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Sg, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.tN, "scaleX", 0.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.tN, "scaleY", 0.0f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.AlY, "alpha", 0.0f, 1.0f);
        this.qsH.setDuration(300L);
        this.qsH.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.Sg, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), 90.0f));
        ofFloat5.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), 90.0f));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.vc.wXo.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wXo.this.AlY.getLayoutParams();
                layoutParams.width = num.intValue();
                wXo.this.AlY.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.tN, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(getContext(), 90.0f));
        ofFloat6.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.3f, 1.0f));
        this.NjR.setDuration(1500L);
        this.NjR.playTogether(ofFloat5, ofInt, ofFloat6);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.Sg, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.AlY, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.tN, "alpha", 1.0f, 0.0f);
        this.DSW.setDuration(50L);
        this.DSW.playTogether(ofFloat7, ofFloat8, ofFloat9);
        this.f10429vc.playSequentially(this.qsH, this.NjR, this.DSW);
    }

    private void tN() {
        ImageView imageView = new ImageView(this.YFl);
        this.AlY = imageView;
        imageView.setBackgroundResource(com.bytedance.sdk.component.utils.qO.AlY(this.YFl, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 30.0f);
        addView(this.AlY, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.YFl);
        this.tN = imageView2;
        imageView2.setImageResource(com.bytedance.sdk.component.utils.qO.AlY(this.YFl, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 50.0f), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 50.0f));
        layoutParams2.gravity = 48;
        layoutParams2.leftMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 30.0f);
        addView(this.tN, layoutParams2);
        ImageView imageView3 = new ImageView(this.YFl);
        this.Sg = imageView3;
        imageView3.setImageResource(com.bytedance.sdk.component.utils.qO.AlY(this.YFl, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 80.0f), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 80.0f));
        layoutParams3.gravity = 48;
        layoutParams3.leftMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 30.0f);
        addView(this.Sg, layoutParams3);
        TextView textView = new TextView(this.YFl);
        this.wN = textView;
        textView.setTextColor(-1);
        this.wN.setSingleLine();
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.wN, layoutParams4);
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vc.wXo.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) wXo.this.Sg.getLayoutParams();
                layoutParams5.topMargin = (int) ((wXo.this.tN.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(wXo.this.getContext(), 7.0f));
                int YFl = (-wXo.this.tN.getMeasuredWidth()) + ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(wXo.this.YFl, 30.0f));
                layoutParams5.leftMargin = YFl;
                layoutParams5.setMarginStart(YFl);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                wXo.this.Sg.setLayoutParams(layoutParams5);
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) wXo.this.AlY.getLayoutParams();
                layoutParams6.topMargin = (int) ((wXo.this.tN.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(wXo.this.getContext(), 5.0f));
                layoutParams6.leftMargin = (int) ((wXo.this.tN.getMeasuredWidth() / 2.0f) + ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(wXo.this.YFl, 30.0f)));
                layoutParams5.setMarginStart(layoutParams5.leftMargin);
                layoutParams5.setMarginEnd(layoutParams5.rightMargin);
                wXo.this.AlY.setLayoutParams(layoutParams6);
            }
        });
    }

    public void Sg() {
        try {
            AnimatorSet animatorSet = this.f10429vc;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.qsH;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.NjR;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            AnimatorSet animatorSet4 = this.DSW;
            if (animatorSet4 != null) {
                animatorSet4.cancel();
            }
        } catch (Throwable unused) {
        }
    }

    public void YFl() {
        AlY();
        this.f10429vc.start();
        this.f10429vc.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.vc.wXo.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                wXo.this.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vc.wXo.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        wXo.this.f10429vc.start();
                    }
                }, 200L);
            }
        });
    }
}
