package com.facebook.ads.redexgen.uinode;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Sj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0914Sj extends KT {
    public final /* synthetic */ InterfaceC0832Pf A00;
    public final /* synthetic */ C0833Pg A01;

    public C0914Sj(C0833Pg c0833Pg, InterfaceC0832Pf interfaceC0832Pf) {
        this.A01 = c0833Pg;
        this.A00 = interfaceC0832Pf;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C0915Sk(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
