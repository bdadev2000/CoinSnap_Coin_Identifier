package com.meta.analytics.dsp.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: com.facebook.ads.redexgen.X.Qo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1433Qo extends AnimatorListenerAdapter {
    public final /* synthetic */ KF A00;

    public C1433Qo(KF kf) {
        this.A00 = kf;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        boolean z8;
        View view;
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2;
        View view2;
        z8 = this.A00.A04;
        if (z8) {
            view2 = this.A00.A03;
            AbstractC1303Lo.A0L(view2);
        }
        view = this.A00.A03;
        view.setAlpha(1.0f);
        this.A00.A01 = EnumC1427Qi.A03;
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator2 = this.A00.A00;
            viewPropertyAnimator2.setListener(null);
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z8;
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2;
        View view;
        z8 = this.A00.A04;
        if (z8) {
            view = this.A00.A03;
            AbstractC1303Lo.A0H(view);
        }
        this.A00.A01 = EnumC1427Qi.A05;
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator2 = this.A00.A00;
            viewPropertyAnimator2.setListener(null);
            this.A00.A00 = null;
        }
    }
}
