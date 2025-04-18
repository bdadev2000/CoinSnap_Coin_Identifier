package com.instagram.common.viewpoint.core;

import android.R;

/* loaded from: assets/audience_network.dex */
public class VS extends KY {
    public final /* synthetic */ AnimationAnimationListenerC0696Md A00;

    public VS(AnimationAnimationListenerC0696Md animationAnimationListenerC0696Md) {
        this.A00 = animationAnimationListenerC0696Md;
    }

    @Override // com.instagram.common.viewpoint.core.KY
    public final void A06() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(17432576, R.anim.fade_out);
    }
}
