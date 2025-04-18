package com.facebook.ads.redexgen.uinode;

import android.animation.Animator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0870Qr implements Animator.AnimatorListener {
    public final /* synthetic */ KA A00;

    public C0870Qr(KA ka2) {
        this.A00 = ka2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        this.A00.A01 = EnumC0861Qi.A05;
        view = this.A00.A05;
        AbstractC0737Lo.A0H(view);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
