package B3;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i9) {
        this.f282a = i9;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f282a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                R3.g gVar = ((BottomSheetBehavior) this.b).f13951i;
                if (gVar != null) {
                    R3.f fVar = gVar.b;
                    if (fVar.f2651j != floatValue) {
                        fVar.f2651j = floatValue;
                        gVar.f2665g = true;
                        gVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((TextInputLayout) this.b).f14199x0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ((com.facebook.shimmer.d) this.b).invalidateSelf();
                return;
        }
    }
}
