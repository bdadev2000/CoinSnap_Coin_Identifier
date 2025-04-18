package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class InfiniteTransitionKt$animateValue$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InfiniteTransition f2126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InfiniteTransition.TransitionAnimationState f2127b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransitionKt$animateValue$2$1(InfiniteTransition infiniteTransition, InfiniteTransition.TransitionAnimationState transitionAnimationState) {
        super(1);
        this.f2126a = infiniteTransition;
        this.f2127b = transitionAnimationState;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final InfiniteTransition infiniteTransition = this.f2126a;
        MutableVector mutableVector = infiniteTransition.f2098a;
        final InfiniteTransition.TransitionAnimationState transitionAnimationState = this.f2127b;
        mutableVector.b(transitionAnimationState);
        infiniteTransition.f2099b.setValue(Boolean.TRUE);
        return new DisposableEffectResult() { // from class: androidx.compose.animation.core.InfiniteTransitionKt$animateValue$2$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                InfiniteTransition.this.f2098a.n(transitionAnimationState);
            }
        };
    }
}
