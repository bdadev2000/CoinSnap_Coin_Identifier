package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Fa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0523Fa extends C1119b6 {
    @Override // com.instagram.common.viewpoint.core.C3S
    public final int A03(View view) {
        return view.getImportantForAccessibility();
    }

    @Override // com.instagram.common.viewpoint.core.C3S
    public final int A05(View view) {
        return view.getMinimumHeight();
    }

    @Override // com.instagram.common.viewpoint.core.C3S
    public final int A06(View view) {
        return view.getMinimumWidth();
    }

    @Override // com.instagram.common.viewpoint.core.C3S
    public final void A0A(View view) {
        view.postInvalidateOnAnimation();
    }

    @Override // com.instagram.common.viewpoint.core.C3S
    public void A0C(View view, int i2) {
        if (i2 == 4) {
            i2 = 2;
        }
        view.setImportantForAccessibility(i2);
    }

    @Override // com.instagram.common.viewpoint.core.C3S
    public final void A0D(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @Override // com.instagram.common.viewpoint.core.C3S
    public final void A0G(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Override // com.instagram.common.viewpoint.core.C3S
    public final void A0H(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    @Override // com.instagram.common.viewpoint.core.C3S
    public final boolean A0I(View view) {
        return view.hasTransientState();
    }
}
