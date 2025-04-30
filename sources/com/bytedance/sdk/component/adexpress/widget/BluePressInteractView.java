package com.bytedance.sdk.component.adexpress.widget;

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
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class BluePressInteractView extends FrameLayout {
    private View COT;
    private View HWF;
    private boolean KS;
    private ImageView QR;
    private int YW;
    private Context dT;
    private View jU;
    private int ku;
    private ObjectAnimator lMd;
    private AnimatorSet zp;

    public BluePressInteractView(Context context, int i9, int i10) {
        super(context);
        this.KS = false;
        this.zp = new AnimatorSet();
        this.ku = i9;
        this.YW = i10;
        this.dT = context;
        KS();
        jU();
    }

    private void jU() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.jU, "scaleX", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.jU, "scaleY", 1.0f, 2.0f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.COT, "scaleX", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.COT, "scaleY", 1.0f, 2.5f, 1.0f);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.HWF, "scaleX", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.HWF, "scaleY", 1.0f, 1.5f, 1.0f);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.QR, "rotation", 0.0f, -20.0f, 0.0f);
        this.lMd = ofFloat7;
        ofFloat7.setDuration(1000L);
        this.zp.setDuration(1500L);
        this.zp.setInterpolator(new AccelerateDecelerateInterpolator());
        this.zp.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5).with(ofFloat6);
        this.zp.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.BluePressInteractView.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                BluePressInteractView.this.KS = true;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (BluePressInteractView.this.KS) {
                    return;
                }
                BluePressInteractView.this.lMd.start();
                BluePressInteractView.this.zp.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    private void KS() {
        View view = new View(this.dT);
        this.jU = view;
        view.setBackground(zp("#1A7BBEFF", "#337BBEFF"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (this.ku * 0.45d), (int) (this.YW * 0.45d));
        layoutParams.gravity = 17;
        this.jU.setLayoutParams(layoutParams);
        addView(this.jU);
        View view2 = new View(this.dT);
        this.COT = view2;
        view2.setBackground(zp("#337BBEFF", "#807BBEFF"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) (this.ku * 0.25d), (int) (this.YW * 0.25d));
        layoutParams2.gravity = 17;
        this.COT.setLayoutParams(layoutParams2);
        addView(this.COT);
        View view3 = new View(this.dT);
        this.HWF = view3;
        view3.setBackground(zp("#807BBEFF", "#FF7BBEFF"));
        int i9 = this.ku;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (i9 * 0.25d), (int) (i9 * 0.25d));
        layoutParams3.gravity = 17;
        this.HWF.setLayoutParams(layoutParams3);
        addView(this.HWF);
        ImageView imageView = new ImageView(this.dT);
        this.QR = imageView;
        imageView.setImageResource(cz.jU(getContext(), "tt_blue_hand"));
        this.QR.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) (this.ku * 0.62d), (int) (this.YW * 0.53d));
        layoutParams4.gravity = 17;
        layoutParams4.topMargin = (layoutParams4.width / 2) - 5;
        layoutParams4.leftMargin = (layoutParams4.height / 2) - 5;
        this.QR.setLayoutParams(layoutParams4);
        addView(this.QR);
    }

    public void lMd() {
        this.KS = true;
        ObjectAnimator objectAnimator = this.lMd;
        if (objectAnimator == null || this.zp == null) {
            return;
        }
        objectAnimator.cancel();
        this.zp.cancel();
    }

    private GradientDrawable zp(String str, String str2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setStroke(1, Color.parseColor(str2));
        return gradientDrawable;
    }

    public void zp() {
        this.KS = false;
        ObjectAnimator objectAnimator = this.lMd;
        if (objectAnimator == null || this.zp == null) {
            return;
        }
        objectAnimator.start();
        this.zp.start();
    }
}
