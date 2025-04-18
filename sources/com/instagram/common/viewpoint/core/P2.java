package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: assets/audience_network.dex */
public class P2 extends AnimatorListenerAdapter {
    public final /* synthetic */ UQ A00;
    public final /* synthetic */ boolean A01;

    public P2(UQ uq, boolean z2) {
        this.A00 = uq;
        this.A01 = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PD pd;
        N5 n5;
        N5 n52;
        C0925Uy c0925Uy;
        C0925Uy c0925Uy2;
        super.onAnimationEnd(animator);
        pd = this.A00.A0M;
        pd.setTranslationY(0.0f);
        this.A00.A0U();
        if (!this.A01) {
            c0925Uy = this.A00.A0J;
            if (c0925Uy != null) {
                c0925Uy2 = this.A00.A0J;
                c0925Uy2.destroy();
            }
        }
        n5 = this.A00.A0g;
        if (n5 == null) {
            return;
        }
        n52 = this.A00.A0g;
        n52.setVisibility(this.A01 ? 8 : 0);
    }
}
