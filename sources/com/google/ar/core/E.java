package com.google.ar.core;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class E implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14258a;
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14259c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InstallActivity f14260d;

    public E(InstallActivity installActivity, int i9, int i10, int i11) {
        this.f14258a = i9;
        this.b = i10;
        this.f14259c = i11;
        this.f14260d = installActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        int i9 = this.b;
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        float f9 = i9 * animatedFraction2;
        float f10 = i9 * animatedFraction2;
        InstallActivity installActivity = this.f14260d;
        installActivity.getWindow().setLayout((int) ((this.f14258a * animatedFraction) + f9), (int) ((this.f14259c * animatedFraction) + f10));
        installActivity.getWindow().getDecorView().refreshDrawableState();
    }
}
