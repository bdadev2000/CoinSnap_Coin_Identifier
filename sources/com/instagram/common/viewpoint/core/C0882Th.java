package com.instagram.common.viewpoint.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Th, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0882Th extends KY {
    public final /* synthetic */ Q6 A00;
    public final /* synthetic */ Q7 A01;

    public C0882Th(Q7 q7, Q6 q6) {
        this.A01 = q7;
        this.A00 = q6;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C0883Ti(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
