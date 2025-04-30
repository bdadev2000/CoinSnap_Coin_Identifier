package com.meta.analytics.dsp.uinode;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Sk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1481Sk extends AnimationAnimationListenerC1302Ln {
    public final /* synthetic */ C1480Sj A00;

    public C1481Sk(C1480Sj c1480Sj) {
        this.A00 = c1480Sj;
    }

    @Override // com.meta.analytics.dsp.uinode.AnimationAnimationListenerC1302Ln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC1303Lo.A0H(this.A00.A01);
        this.A00.A00.ABu();
    }
}
