package androidx.compose.animation;

import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class AnimatedContentKt$AnimatedContent$6$1$4$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExitTransition f1648a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1$4$1(ExitTransition exitTransition) {
        super(2);
        this.f1648a = exitTransition;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        EnterExitState enterExitState = (EnterExitState) obj;
        EnterExitState enterExitState2 = (EnterExitState) obj2;
        EnterExitState enterExitState3 = EnterExitState.f1808c;
        return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !this.f1648a.a().e);
    }
}
