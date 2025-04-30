package com.meta.analytics.dsp.uinode;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1434Qp implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ KC A02;

    public C1434Qp(KC kc, int i9, int i10) {
        this.A02 = kc;
        this.A01 = i9;
        this.A00 = i10;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A02.A07(this.A00, this.A01, false);
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i9;
        EnumC1427Qi enumC1427Qi;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        KC kc = this.A02;
        int i10 = this.A01;
        i9 = kc.A04;
        if (i10 == i9) {
            enumC1427Qi = EnumC1427Qi.A03;
        } else {
            enumC1427Qi = EnumC1427Qi.A05;
        }
        kc.A01 = enumC1427Qi;
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
