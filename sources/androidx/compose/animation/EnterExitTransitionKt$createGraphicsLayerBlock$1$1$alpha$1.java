package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnterTransition f1821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExitTransition f1822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1(EnterTransition enterTransition, ExitTransition exitTransition) {
        super(1);
        this.f1821a = enterTransition;
        this.f1822b = exitTransition;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        FiniteAnimationSpec finiteAnimationSpec;
        FiniteAnimationSpec finiteAnimationSpec2;
        Transition.Segment segment = (Transition.Segment) obj;
        EnterExitState enterExitState = EnterExitState.f1806a;
        EnterExitState enterExitState2 = EnterExitState.f1807b;
        if (segment.d(enterExitState, enterExitState2)) {
            Fade fade = this.f1821a.a().f1973a;
            return (fade == null || (finiteAnimationSpec2 = fade.f1881b) == null) ? EnterExitTransitionKt.f1817b : finiteAnimationSpec2;
        }
        if (!segment.d(enterExitState2, EnterExitState.f1808c)) {
            return EnterExitTransitionKt.f1817b;
        }
        Fade fade2 = this.f1822b.a().f1973a;
        return (fade2 == null || (finiteAnimationSpec = fade2.f1881b) == null) ? EnterExitTransitionKt.f1817b : finiteAnimationSpec;
    }
}
