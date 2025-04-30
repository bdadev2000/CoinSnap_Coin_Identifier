package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class F5 extends C1674a1 {
    @Override // com.meta.analytics.dsp.uinode.C3S
    public final int A03(View view) {
        return view.getImportantForAccessibility();
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final int A05(View view) {
        return view.getMinimumHeight();
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final int A06(View view) {
        return view.getMinimumWidth();
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final void A0A(View view) {
        view.postInvalidateOnAnimation();
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public void A0C(View view, int i9) {
        if (i9 == 4) {
            i9 = 2;
        }
        view.setImportantForAccessibility(i9);
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final void A0D(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final void A0G(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final void A0H(View view, Runnable runnable, long j7) {
        view.postOnAnimationDelayed(runnable, j7);
    }

    @Override // com.meta.analytics.dsp.uinode.C3S
    public final boolean A0I(View view) {
        return view.hasTransientState();
    }
}
