package com.meta.analytics.dsp.uinode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.Of, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1372Of extends AnimatorListenerAdapter {
    public final /* synthetic */ TT A00;
    public final /* synthetic */ boolean A01;

    public C1372Of(TT tt, boolean z8) {
        this.A00 = tt;
        this.A01 = z8;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1381Oo c1381Oo;
        KP kp;
        KP kp2;
        U1 u12;
        U1 u13;
        super.onAnimationEnd(animator);
        c1381Oo = this.A00.A0M;
        c1381Oo.setTranslationY(0.0f);
        this.A00.A0U();
        if (!this.A01) {
            u12 = this.A00.A0J;
            if (u12 != null) {
                u13 = this.A00.A0J;
                u13.destroy();
            }
        }
        kp = this.A00.A0g;
        if (kp == null) {
            return;
        }
        kp2 = this.A00.A0g;
        kp2.setVisibility(this.A01 ? 8 : 0);
    }
}
