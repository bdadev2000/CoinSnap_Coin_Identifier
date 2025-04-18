package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.Py, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0795Py extends AnimatorListenerAdapter {
    public final /* synthetic */ A6 A00;
    public final /* synthetic */ boolean A01;

    public C0795Py(A6 a6, boolean z2) {
        this.A00 = a6;
        this.A01 = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PD pd;
        C0925Uy c0925Uy;
        C0925Uy c0925Uy2;
        super.onAnimationEnd(animator);
        pd = this.A00.A0H;
        pd.setTranslationY(0.0f);
        this.A00.A0T();
        if (!this.A01) {
            c0925Uy = this.A00.A0G;
            if (c0925Uy != null) {
                c0925Uy2 = this.A00.A0G;
                c0925Uy2.destroy();
            }
        }
    }
}
