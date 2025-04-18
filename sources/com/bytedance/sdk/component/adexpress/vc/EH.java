package com.bytedance.sdk.component.adexpress.vc;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class EH extends FrameLayout {
    private AnimatorSet AlY;
    private ImageView Sg;
    private Context YFl;
    private VOe tN;
    private boolean wN;

    public EH(Context context) {
        super(context);
        this.wN = true;
        this.YFl = context;
        this.AlY = new AnimatorSet();
        tN();
        AlY();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vc.EH.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) EH.this.Sg.getLayoutParams();
                layoutParams.topMargin = (int) ((EH.this.tN.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(EH.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((EH.this.tN.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(EH.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(EH.this.getContext(), 5.0f) + ((-EH.this.tN.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(EH.this.getContext(), 5.0f) + ((-EH.this.tN.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                EH.this.Sg.setLayoutParams(layoutParams);
            }
        });
    }

    private void AlY() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Sg, "scaleX", 1.0f, 0.9f);
        ofFloat.setDuration(800L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.vc.EH.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (EH.this.wN) {
                    EH.this.tN.YFl();
                }
                EH.this.wN = !r2.wN;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(EH.this.Sg, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat2.start();
                EH.this.Sg.setVisibility(0);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Sg, "scaleY", 1.0f, 0.9f);
        ofFloat2.setDuration(800L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.AlY.playTogether(ofFloat, ofFloat2);
    }

    private void tN() {
        this.tN = new VOe(this.YFl);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 40.0f), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.tN, layoutParams);
        this.Sg = new ImageView(this.YFl);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 62.0f), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 62.0f));
        layoutParams2.gravity = 16;
        this.Sg.setImageResource(com.bytedance.sdk.component.utils.qO.AlY(this.YFl, "tt_splash_hand"));
        addView(this.Sg, layoutParams2);
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
