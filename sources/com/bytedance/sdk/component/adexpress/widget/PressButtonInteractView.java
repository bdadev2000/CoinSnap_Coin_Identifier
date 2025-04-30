package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class PressButtonInteractView extends FrameLayout {
    private boolean COT;
    private SplashDiffuseView KS;
    private AnimatorSet jU;
    private ImageView lMd;
    private Context zp;

    public PressButtonInteractView(Context context) {
        super(context);
        this.COT = true;
        this.zp = context;
        this.jU = new AnimatorSet();
        KS();
        jU();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressButtonInteractView.this.lMd.getLayoutParams();
                layoutParams.topMargin = (int) ((PressButtonInteractView.this.KS.getMeasuredHeight() / 2.0f) - QR.zp(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((PressButtonInteractView.this.KS.getMeasuredWidth() / 2.0f) - QR.zp(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) (QR.zp(PressButtonInteractView.this.getContext(), 5.0f) + ((-PressButtonInteractView.this.KS.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (QR.zp(PressButtonInteractView.this.getContext(), 5.0f) + ((-PressButtonInteractView.this.KS.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                PressButtonInteractView.this.lMd.setLayoutParams(layoutParams);
            }
        });
    }

    private void jU() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.lMd, "scaleX", 1.0f, 0.9f);
        ofFloat.setDuration(800L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.PressButtonInteractView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (PressButtonInteractView.this.COT) {
                    PressButtonInteractView.this.KS.zp();
                }
                PressButtonInteractView.this.COT = !r2.COT;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(PressButtonInteractView.this.lMd, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat2.start();
                PressButtonInteractView.this.lMd.setVisibility(0);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.lMd, "scaleY", 1.0f, 0.9f);
        ofFloat2.setDuration(800L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.jU.playTogether(ofFloat, ofFloat2);
    }

    private void KS() {
        this.KS = new SplashDiffuseView(this.zp);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) QR.zp(this.zp, 40.0f), (int) QR.zp(this.zp, 40.0f));
        layoutParams.gravity = 8388627;
        addView(this.KS, layoutParams);
        this.lMd = new ImageView(this.zp);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) QR.zp(this.zp, 62.0f), (int) QR.zp(this.zp, 62.0f));
        layoutParams2.gravity = 16;
        this.lMd.setImageResource(cz.jU(this.zp, "tt_splash_hand"));
        addView(this.lMd, layoutParams2);
    }

    public void lMd() {
        AnimatorSet animatorSet = this.jU;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        SplashDiffuseView splashDiffuseView = this.KS;
        if (splashDiffuseView != null) {
            splashDiffuseView.lMd();
        }
        ImageView imageView = this.lMd;
        if (imageView != null) {
            imageView.clearAnimation();
        }
    }

    public void zp() {
        this.jU.start();
    }
}
