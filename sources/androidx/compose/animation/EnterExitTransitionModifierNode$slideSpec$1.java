package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class EnterExitTransitionModifierNode$slideSpec$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnterExitTransitionModifierNode f1874a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$slideSpec$1(EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        super(1);
        this.f1874a = enterExitTransitionModifierNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        FiniteAnimationSpec finiteAnimationSpec;
        FiniteAnimationSpec finiteAnimationSpec2;
        Transition.Segment segment = (Transition.Segment) obj;
        EnterExitState enterExitState = EnterExitState.f1806a;
        EnterExitState enterExitState2 = EnterExitState.f1807b;
        boolean d = segment.d(enterExitState, enterExitState2);
        EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.f1874a;
        if (d) {
            Slide slide = enterExitTransitionModifierNode.f1855s.a().f1974b;
            return (slide == null || (finiteAnimationSpec2 = slide.f1970b) == null) ? EnterExitTransitionKt.f1818c : finiteAnimationSpec2;
        }
        if (!segment.d(enterExitState2, EnterExitState.f1808c)) {
            return EnterExitTransitionKt.f1818c;
        }
        Slide slide2 = enterExitTransitionModifierNode.f1856t.a().f1974b;
        return (slide2 == null || (finiteAnimationSpec = slide2.f1970b) == null) ? EnterExitTransitionKt.f1818c : finiteAnimationSpec;
    }
}
