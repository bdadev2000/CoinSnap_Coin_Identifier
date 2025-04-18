package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl f1678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifier f1679b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, AnimatedContentTransitionScopeImpl.SizeModifier sizeModifier) {
        super(1);
        this.f1678a = animatedContentTransitionScopeImpl;
        this.f1679b = sizeModifier;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        FiniteAnimationSpec c2;
        Transition.Segment segment = (Transition.Segment) obj;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = this.f1678a;
        State state = (State) animatedContentTransitionScopeImpl.d.c(segment.c());
        long j2 = state != null ? ((IntSize) state.getValue()).f17493a : 0L;
        State state2 = (State) animatedContentTransitionScopeImpl.d.c(segment.a());
        long j3 = state2 != null ? ((IntSize) state2.getValue()).f17493a : 0L;
        SizeTransform sizeTransform = (SizeTransform) this.f1679b.f1673b.getValue();
        return (sizeTransform == null || (c2 = sizeTransform.c(j2, j3)) == null) ? AnimationSpecKt.c(0.0f, 0.0f, null, 7) : c2;
    }
}
