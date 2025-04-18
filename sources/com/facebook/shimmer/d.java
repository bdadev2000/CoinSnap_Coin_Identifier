package com.facebook.shimmer;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import ka.h;
import ka.i;

/* loaded from: classes3.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11389b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.f11389b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.a;
        Object obj = this.f11389b;
        switch (i10) {
            case 0:
                ((e) obj).invalidateSelf();
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i iVar = ((BottomSheetBehavior) obj).f11581i;
                if (iVar != null) {
                    h hVar = iVar.f20557b;
                    if (hVar.f20545k != floatValue) {
                        hVar.f20545k = floatValue;
                        iVar.f20561g = true;
                        iVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((TextInputLayout) obj).f11844x0.l(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
