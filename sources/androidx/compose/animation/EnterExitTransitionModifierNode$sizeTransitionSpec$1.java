package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class EnterExitTransitionModifierNode$sizeTransitionSpec$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnterExitTransitionModifierNode f1873a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$sizeTransitionSpec$1(EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        super(1);
        this.f1873a = enterExitTransitionModifierNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Transition.Segment segment = (Transition.Segment) obj;
        EnterExitState enterExitState = EnterExitState.f1806a;
        EnterExitState enterExitState2 = EnterExitState.f1807b;
        boolean d = segment.d(enterExitState, enterExitState2);
        Object obj2 = null;
        EnterExitTransitionModifierNode enterExitTransitionModifierNode = this.f1873a;
        if (d) {
            ChangeSize changeSize = enterExitTransitionModifierNode.f1855s.a().f1975c;
            if (changeSize != null) {
                obj2 = changeSize.f1775c;
            }
        } else if (segment.d(enterExitState2, EnterExitState.f1808c)) {
            ChangeSize changeSize2 = enterExitTransitionModifierNode.f1856t.a().f1975c;
            if (changeSize2 != null) {
                obj2 = changeSize2.f1775c;
            }
        } else {
            obj2 = EnterExitTransitionKt.d;
        }
        return obj2 == null ? EnterExitTransitionKt.d : obj2;
    }
}
