package com.facebook.ads.redexgen.uinode;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Qm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0865Qm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ KI A01;

    public C0865Qm(KI ki2, View view) {
        this.A01 = ki2;
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
        layoutParams.height = intValue;
        this.A00.setLayoutParams(layoutParams);
    }
}
