package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.jU.QR;
import com.bytedance.sdk.component.utils.cz;

/* loaded from: classes.dex */
public class HandLongPressView extends FrameLayout {
    private boolean COT;
    private TextView HWF;
    private CircleRippleView KS;
    private AnimatorSet jU;
    private ImageView lMd;
    private Context zp;

    public HandLongPressView(Context context) {
        super(context);
        this.COT = true;
        this.zp = context;
        this.jU = new AnimatorSet();
        KS();
        jU();
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.HandLongPressView.1
            @Override // java.lang.Runnable
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) HandLongPressView.this.lMd.getLayoutParams();
                layoutParams.topMargin = ((int) ((HandLongPressView.this.KS.getMeasuredHeight() / 2.0f) - QR.zp(HandLongPressView.this.getContext(), 5.0f))) + ((int) QR.zp(HandLongPressView.this.zp, 20.0f));
                layoutParams.leftMargin = ((int) ((HandLongPressView.this.KS.getMeasuredWidth() / 2.0f) - QR.zp(HandLongPressView.this.getContext(), 5.0f))) + ((int) QR.zp(HandLongPressView.this.zp, 20.0f));
                layoutParams.bottomMargin = (int) (QR.zp(HandLongPressView.this.getContext(), 5.0f) + ((-HandLongPressView.this.KS.getMeasuredHeight()) / 2.0f));
                layoutParams.rightMargin = (int) (QR.zp(HandLongPressView.this.getContext(), 5.0f) + ((-HandLongPressView.this.KS.getMeasuredWidth()) / 2.0f));
                layoutParams.setMarginStart(layoutParams.leftMargin);
                layoutParams.setMarginEnd(layoutParams.rightMargin);
                HandLongPressView.this.lMd.setLayoutParams(layoutParams);
            }
        });
    }

    public void setGuideText(String str) {
        this.HWF.setText(str);
    }

    public void setGuideTextColor(int i9) {
        this.HWF.setTextColor(i9);
    }

    private void KS() {
        this.KS = new CircleRippleView(this.zp);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) QR.zp(this.zp, 80.0f), (int) QR.zp(this.zp, 80.0f));
        layoutParams.gravity = 8388659;
        layoutParams.topMargin = (int) QR.zp(this.zp, 20.0f);
        int zp = (int) QR.zp(this.zp, 20.0f);
        layoutParams.leftMargin = zp;
        layoutParams.setMarginStart(zp);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        addView(this.KS, layoutParams);
        this.KS.zp();
        this.lMd = new ImageView(this.zp);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) QR.zp(this.zp, 80.0f), (int) QR.zp(this.zp, 80.0f));
        this.lMd.setImageResource(cz.jU(this.zp, "tt_splash_hand"));
        addView(this.lMd, layoutParams2);
        TextView textView = new TextView(this.zp);
        this.HWF = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) QR.zp(this.zp, 10.0f);
        addView(this.HWF, layoutParams3);
    }

    private void jU() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.lMd, "scaleX", 1.0f, 0.8f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.widget.HandLongPressView.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                if (HandLongPressView.this.COT) {
                    HandLongPressView.this.KS.zp();
                    HandLongPressView.this.KS.setAlpha(1.0f);
                } else {
                    HandLongPressView.this.KS.lMd();
                    HandLongPressView.this.KS.setAlpha(0.0f);
                }
                HandLongPressView.this.COT = !r2.COT;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(HandLongPressView.this.lMd, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(200L);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.start();
                HandLongPressView.this.lMd.setVisibility(0);
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.lMd, "scaleY", 1.0f, 0.8f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.jU.playTogether(ofFloat, ofFloat2);
    }

    public void lMd() {
        AnimatorSet animatorSet = this.jU;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        CircleRippleView circleRippleView = this.KS;
        if (circleRippleView != null) {
            circleRippleView.lMd();
        }
    }

    public void zp() {
        this.jU.start();
    }
}
