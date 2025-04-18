package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f28733b;

    public /* synthetic */ b(EndIconDelegate endIconDelegate, int i2) {
        this.f28732a = i2;
        this.f28733b = endIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i2 = this.f28732a;
        EndIconDelegate endIconDelegate = this.f28733b;
        switch (i2) {
            case 0:
                ((ClearTextEndIconDelegate) endIconDelegate).lambda$getScaleAnimator$4(valueAnimator);
                return;
            case 1:
                ((ClearTextEndIconDelegate) endIconDelegate).lambda$getAlphaAnimator$3(valueAnimator);
                return;
            default:
                ((DropdownMenuEndIconDelegate) endIconDelegate).lambda$getAlphaAnimator$6(valueAnimator);
                return;
        }
    }
}
