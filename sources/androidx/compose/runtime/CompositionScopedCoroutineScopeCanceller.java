package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.d0;
import g1.f;

@StabilityInferred
/* loaded from: classes3.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f13774a;

    public CompositionScopedCoroutineScopeCanceller(f fVar) {
        this.f13774a = fVar;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        p0.a.m(this.f13774a, new LeftCompositionCancellationException());
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        p0.a.m(this.f13774a, new LeftCompositionCancellationException());
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }
}
