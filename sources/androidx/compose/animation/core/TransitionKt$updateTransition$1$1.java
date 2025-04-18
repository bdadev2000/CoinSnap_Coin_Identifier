package androidx.compose.animation.core;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class TransitionKt$updateTransition$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f2333a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$updateTransition$1$1(Transition transition) {
        super(1);
        this.f2333a = transition;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final Transition transition = this.f2333a;
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                Transition transition2 = Transition.this;
                transition2.i();
                transition2.f2267a.e();
            }
        };
    }
}
