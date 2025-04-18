package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import com.google.android.material.internal.FadeThroughDrawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28703b;

    public /* synthetic */ d(Object obj, int i2) {
        this.f28702a = i2;
        this.f28703b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i2 = this.f28702a;
        Object obj = this.f28703b;
        switch (i2) {
            case 0:
                SearchBarAnimationHelper.a(valueAnimator, (View) obj);
                return;
            case 1:
                SearchViewAnimationHelper.lambda$addFadeThroughDrawableAnimatorIfNeeded$4((FadeThroughDrawable) obj, valueAnimator);
                return;
            default:
                SearchViewAnimationHelper.lambda$addDrawerArrowDrawableAnimatorIfNeeded$3((DrawerArrowDrawable) obj, valueAnimator);
                return;
        }
    }
}
