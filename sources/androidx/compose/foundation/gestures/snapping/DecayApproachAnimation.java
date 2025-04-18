package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import h0.g;
import i0.a;
import q0.l;

/* loaded from: classes4.dex */
final class DecayApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {

    /* renamed from: a, reason: collision with root package name */
    public final DecayAnimationSpec f3674a;

    public DecayApproachAnimation(DecayAnimationSpec decayAnimationSpec) {
        this.f3674a = decayAnimationSpec;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public final Object a(ScrollScope scrollScope, Float f2, Float f3, l lVar, g gVar) {
        Object a2 = SnapFlingBehaviorKt.a(scrollScope, f2.floatValue(), AnimationStateKt.a(0.0f, f3.floatValue(), 28), this.f3674a, lVar, gVar);
        return a2 == a.f30806a ? a2 : (AnimationResult) a2;
    }
}
