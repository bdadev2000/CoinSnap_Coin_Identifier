package com.meta.analytics.dsp.uinode;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Sj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1480Sj extends KT {
    public final /* synthetic */ InterfaceC1398Pf A00;
    public final /* synthetic */ C1399Pg A01;

    public C1480Sj(C1399Pg c1399Pg, InterfaceC1398Pf interfaceC1398Pf) {
        this.A01 = c1399Pg;
        this.A00 = interfaceC1398Pf;
    }

    @Override // com.meta.analytics.dsp.uinode.KT
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C1481Sk(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
