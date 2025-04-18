package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import h0.g;
import i0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TargetApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {

    /* renamed from: a, reason: collision with root package name */
    public final AnimationSpec f3719a;

    public TargetApproachAnimation(AnimationSpec animationSpec) {
        this.f3719a = animationSpec;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public final Object a(ScrollScope scrollScope, Float f2, Float f3, l lVar, g gVar) {
        float floatValue = f2.floatValue();
        float floatValue2 = f3.floatValue();
        Object b2 = SnapFlingBehaviorKt.b(scrollScope, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, AnimationStateKt.a(0.0f, floatValue2, 28), this.f3719a, lVar, gVar);
        return b2 == a.f30806a ? b2 : (AnimationResult) b2;
    }
}
