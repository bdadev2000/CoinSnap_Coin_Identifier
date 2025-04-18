package com.facebook.ads.redexgen.uinode;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Sk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0915Sk extends AnimationAnimationListenerC0736Ln {
    public final /* synthetic */ C0914Sj A00;

    public C0915Sk(C0914Sj c0914Sj) {
        this.A00 = c0914Sj;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnimationAnimationListenerC0736Ln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC0737Lo.A0H(this.A00.A01);
        this.A00.A00.ABu();
    }
}
