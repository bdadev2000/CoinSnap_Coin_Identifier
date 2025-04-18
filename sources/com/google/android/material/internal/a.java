package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.internal.MultiViewUpdateListener;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements MultiViewUpdateListener.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28693a;

    public /* synthetic */ a(int i2) {
        this.f28693a = i2;
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.Listener
    public final void onAnimationUpdate(ValueAnimator valueAnimator, View view) {
        switch (this.f28693a) {
            case 0:
                MultiViewUpdateListener.setTranslationX(valueAnimator, view);
                return;
            case 1:
                MultiViewUpdateListener.setScale(valueAnimator, view);
                return;
            case 2:
                MultiViewUpdateListener.setScale(valueAnimator, view);
                return;
            case 3:
                MultiViewUpdateListener.setTranslationX(valueAnimator, view);
                return;
            case 4:
                MultiViewUpdateListener.setTranslationY(valueAnimator, view);
                return;
            case 5:
                MultiViewUpdateListener.setAlpha(valueAnimator, view);
                return;
            case 6:
                MultiViewUpdateListener.setTranslationY(valueAnimator, view);
                return;
            default:
                MultiViewUpdateListener.setAlpha(valueAnimator, view);
                return;
        }
    }
}
