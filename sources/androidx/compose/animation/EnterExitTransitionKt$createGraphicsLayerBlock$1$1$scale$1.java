package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnterTransition f1828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExitTransition f1829b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.f1828a = enterTransition;
        this.f1829b = exitTransition;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        FiniteAnimationSpec finiteAnimationSpec;
        FiniteAnimationSpec finiteAnimationSpec2;
        Transition.Segment segment = (Transition.Segment) obj;
        EnterExitState enterExitState = EnterExitState.f1806a;
        EnterExitState enterExitState2 = EnterExitState.f1807b;
        if (segment.d(enterExitState, enterExitState2)) {
            Scale scale = this.f1828a.a().d;
            return (scale == null || (finiteAnimationSpec2 = scale.f1899c) == null) ? EnterExitTransitionKt.f1817b : finiteAnimationSpec2;
        }
        if (!segment.d(enterExitState2, EnterExitState.f1808c)) {
            return EnterExitTransitionKt.f1817b;
        }
        Scale scale2 = this.f1829b.a().d;
        return (scale2 == null || (finiteAnimationSpec = scale2.f1899c) == null) ? EnterExitTransitionKt.f1817b : finiteAnimationSpec;
    }
}
