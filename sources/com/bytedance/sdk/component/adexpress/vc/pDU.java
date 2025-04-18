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
public class pDU extends FrameLayout {
    private AnimatorSet AlY;
    private ImageView Sg;
    private Context YFl;
    private AlY tN;

    /* renamed from: vc, reason: collision with root package name */
    private TextView f10423vc;
    private boolean wN;

    public pDU(Context context) {
        super(context);
        this.wN = true;
        this.YFl = context;
        this.AlY = new AnimatorSet();
        tN();
        AlY();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.vc.pDU.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pDU.this.Sg.getLayoutParams();
                layoutParams.topMargin = ((int) ((pDU.this.tN.getMeasuredHeight() / 2.0f) - com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(pDU.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(pDU.this.YFl, 20.0f));
                layoutParams.leftMargin = ((int) ((pDU.this.tN.getMeasuredWidth() / 2.0f) - com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(pDU.this.getContext(), 5.0f))) + ((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(pDU.this.YFl, 20.0f));
                layoutParams.bottomMargin = (int) (com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(pDU.this.getContext(), 5.0f) + ((-pDU.this.tN.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(pDU.this.getContext(), 5.0f) + ((-pDU.this.tN.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                pDU.this.Sg.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.f10423vc.setText(str);
    }

    public void setGuideTextColor(int i10) {
        this.f10423vc.setTextColor(i10);
    }

    private void AlY() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.Sg, "scaleX", 1.0f, 0.8f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.vc.pDU.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (pDU.this.wN) {
                    pDU.this.tN.YFl();
                    pDU.this.tN.setAlpha(1.0f);
                } else {
                    pDU.this.tN.Sg();
                    pDU.this.tN.setAlpha(0.0f);
                }
                pDU.this.wN = !r2.wN;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pDU.this.Sg, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                pDU.this.Sg.setVisibility(0);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.Sg, "scaleY", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.AlY.playTogether(ofFloat, ofFloat2);
    }

    private void tN() {
        this.tN = new AlY(this.YFl);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 80.0f), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 20.0f);
        int YFl = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 20.0f);
        layoutParams.leftMargin = YFl;
        layoutParams.setMarginStart(YFl);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.tN, layoutParams);
        this.tN.YFl();
        this.Sg = new ImageView(this.YFl);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 80.0f), (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 80.0f));
        this.Sg.setImageResource(com.bytedance.sdk.component.utils.qO.AlY(this.YFl, "tt_splash_hand"));
        addView(this.Sg, layoutParams2);
        TextView textView = new TextView(this.YFl);
        this.f10423vc = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) com.bytedance.sdk.component.adexpress.AlY.qsH.YFl(this.YFl, 10.0f);
        addView(this.f10423vc, layoutParams3);
    }

    public void Sg() {
        AnimatorSet animatorSet = this.AlY;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AlY alY = this.tN;
        if (alY != null) {
            alY.Sg();
        }
    }

    public void YFl() {
        this.AlY.start();
    }
}
