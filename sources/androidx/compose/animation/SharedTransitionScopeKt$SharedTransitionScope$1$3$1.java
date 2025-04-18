package androidx.compose.animation;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class SharedTransitionScopeKt$SharedTransitionScope$1$3$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedTransitionScopeImpl f1940a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionScope$1$3$1(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        super(1);
        this.f1940a = sharedTransitionScopeImpl;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        final SharedTransitionScopeImpl sharedTransitionScopeImpl = this.f1940a;
        return new DisposableEffectResult() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$3$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                SharedTransitionScopeKt.b().c(SharedTransitionScopeImpl.this);
            }
        };
    }
}
