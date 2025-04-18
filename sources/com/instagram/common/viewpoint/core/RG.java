package com.instagram.common.viewpoint.core;

import android.animation.Animator;

/* loaded from: assets/audience_network.dex */
public class RG implements Animator.AnimatorListener {
    public final /* synthetic */ C0715Mw A00;

    public RG(C0715Mw c0715Mw) {
        this.A00 = c0715Mw;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A07(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = null;
        this.A00.A02 = RE.A02;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
