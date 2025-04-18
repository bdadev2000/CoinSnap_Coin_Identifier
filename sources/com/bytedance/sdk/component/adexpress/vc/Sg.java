package com.bytedance.sdk.component.adexpress.vc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class Sg extends FrameLayout {
    private View AlY;
    private ImageView DSW;
    private int NjR;
    private ObjectAnimator Sg;
    private AnimatorSet YFl;

    /* renamed from: nc, reason: collision with root package name */
    private Context f10411nc;
    private int qsH;
    private boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    private View f10412vc;
    private View wN;

    public Sg(Context context, int i10, int i11) {
        super(context);
        this.tN = false;
        this.YFl = new AnimatorSet();
        this.qsH = i10;
        this.NjR = i11;
        this.f10411nc = context;
        tN();
        AlY();
    }

    private void AlY() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.AlY, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.AlY, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.wN, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.wN, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f10412vc, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f10412vc, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.DSW, "rotation", 0.0f, -20.0f, 0.0f);
        this.Sg = ofFloat7;
        ofFloat7.setDuration(1000L);
        this.YFl.setDuration(1500L);
        this.YFl.setInterpolator(new AccelerateDecelerateInterpolator());
        this.YFl.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).with(ofFloat6);
        this.YFl.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.vc.Sg.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Sg.this.tN = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (Sg.this.tN) {
                    return;
                }
                Sg.this.Sg.start();
                Sg.this.YFl.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    private void tN() {
        View view = new View(this.f10411nc);
        this.AlY = view;
        view.setBackground(YFl("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (this.qsH * 0.45d), (int) (this.NjR * 0.45d));
        layoutParams.gravity = 17;
        this.AlY.setLayoutParams(layoutParams);
        addView(this.AlY);
        View view2 = new View(this.f10411nc);
        this.wN = view2;
        view2.setBackground(YFl("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.qsH * 0.25d), (int) (this.NjR * 0.25d));
        layoutParams2.gravity = 17;
        this.wN.setLayoutParams(layoutParams2);
        addView(this.wN);
        View view3 = new View(this.f10411nc);
        this.f10412vc = view3;
        view3.setBackground(YFl("#807BBEFF", "#FF7BBEFF"));
        int i10 = this.qsH;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (i10 * 0.25d), (int) (i10 * 0.25d));
        layoutParams3.gravity = 17;
        this.f10412vc.setLayoutParams(layoutParams3);
        addView(this.f10412vc);
        ImageView imageView = new ImageView(this.f10411nc);
        this.DSW = imageView;
        imageView.setImageResource(com.bytedance.sdk.component.utils.qO.AlY(getContext(), "tt_blue_hand"));
        this.DSW.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (this.qsH * 0.62d), (int) (this.NjR * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.DSW.setLayoutParams(layoutParams4);
        addView(this.DSW);
    }

    public void Sg() {
        this.tN = true;
        ObjectAnimator objectAnimator = this.Sg;
        if (objectAnimator == null || this.YFl == null) {
            return;
        }
        objectAnimator.cancel();
        this.YFl.cancel();
    }

    private GradientDrawable YFl(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void YFl() {
        this.tN = false;
        ObjectAnimator objectAnimator = this.Sg;
        if (objectAnimator == null || this.YFl == null) {
            return;
        }
        objectAnimator.start();
        this.YFl.start();
    }
}
