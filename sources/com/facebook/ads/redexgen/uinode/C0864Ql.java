package com.facebook.ads.redexgen.uinode;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ql, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0864Ql implements Animator.AnimatorListener {
    public final /* synthetic */ KI A00;

    public C0864Ql(KI ki2) {
        this.A00 = ki2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A00.A08(false);
        valueAnimator = this.A00.A01;
        if (valueAnimator != null) {
            valueAnimator2 = this.A00.A01;
            valueAnimator2.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A00.A02 = EnumC0861Qi.A05;
        view = this.A00.A05;
        AbstractC0737Lo.A0H(view);
        valueAnimator = this.A00.A01;
        if (valueAnimator != null) {
            valueAnimator2 = this.A00.A01;
            valueAnimator2.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
