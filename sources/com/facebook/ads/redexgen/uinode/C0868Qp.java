package com.facebook.ads.redexgen.uinode;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.Qp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0868Qp implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ KC A02;

    public C0868Qp(KC kc2, int i10, int i11) {
        this.A02 = kc2;
        this.A01 = i10;
        this.A00 = i11;
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
        int i10;
        EnumC0861Qi enumC0861Qi;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        KC kc2 = this.A02;
        int i11 = this.A01;
        i10 = kc2.A04;
        if (i11 == i10) {
            enumC0861Qi = EnumC0861Qi.A03;
        } else {
            enumC0861Qi = EnumC0861Qi.A05;
        }
        kc2.A01 = enumC0861Qi;
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
