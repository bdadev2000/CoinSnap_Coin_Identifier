package com.meta.analytics.dsp.uinode;

import android.animation.Animator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1436Qr implements Animator.AnimatorListener {
    public final /* synthetic */ KA A00;

    public C1436Qr(KA ka) {
        this.A00 = ka;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        this.A00.A01 = EnumC1427Qi.A05;
        view = this.A00.A05;
        AbstractC1303Lo.A0H(view);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
