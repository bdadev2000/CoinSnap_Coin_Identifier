package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class TransitionKt$createDeferredAnimation$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f2325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Transition.DeferredAnimation f2326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransitionKt$createDeferredAnimation$1$1(Transition transition, Transition.DeferredAnimation deferredAnimation) {
        super(1);
        this.f2325a = transition;
        this.f2326b = deferredAnimation;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final Transition transition = this.f2325a;
        final Transition.DeferredAnimation deferredAnimation = this.f2326b;
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.TransitionKt$createDeferredAnimation$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                Transition.TransitionAnimationState transitionAnimationState;
                Transition transition2 = Transition.this;
                transition2.getClass();
                Transition.DeferredAnimation.DeferredAnimationData deferredAnimationData = (Transition.DeferredAnimation.DeferredAnimationData) deferredAnimation.f2279b.getValue();
                if (deferredAnimationData == null || (transitionAnimationState = deferredAnimationData.f2281a) == null) {
                    return;
                }
                transition2.f2273i.remove(transitionAnimationState);
            }
        };
    }
}
