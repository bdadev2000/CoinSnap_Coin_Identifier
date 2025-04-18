package com.instagram.common.viewpoint.core;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Ti, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0883Ti extends M2 {
    public final /* synthetic */ C0882Th A00;

    public C0883Ti(C0882Th c0882Th) {
        this.A00 = c0882Th;
    }

    @Override // com.instagram.common.viewpoint.core.M2, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        M3.A0H(this.A00.A01);
        this.A00.A00.ACL();
    }
}
