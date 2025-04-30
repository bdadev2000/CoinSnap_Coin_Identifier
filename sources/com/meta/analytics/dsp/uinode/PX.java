package com.meta.analytics.dsp.uinode;

import android.animation.ValueAnimator;

/* loaded from: assets/audience_network.dex */
public class PX implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C1494Sx A00;

    public PX(C1494Sx c1494Sx) {
        this.A00 = c1494Sx;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SA sa;
        SA sa2;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        sa = this.A00.A0Z;
        sa.getLayoutParams().height = num.intValue();
        sa2 = this.A00.A0Z;
        sa2.requestLayout();
    }
}
