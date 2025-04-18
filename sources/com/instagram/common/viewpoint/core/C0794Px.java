package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.Px, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0794Px implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ A6 A00;

    public C0794Px(A6 a6) {
        this.A00 = a6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        T7 t7;
        T7 t72;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        t7 = this.A00.A0Z;
        t7.getLayoutParams().height = num.intValue();
        t72 = this.A00.A0Z;
        t72.requestLayout();
    }
}
