package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Remeasurement;
import e0.u;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LazyStaggeredGridBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* renamed from: a, reason: collision with root package name */
    public final LazyStaggeredGridState f4908a;

    public LazyStaggeredGridBeyondBoundsState(LazyStaggeredGridState lazyStaggeredGridState) {
        this.f4908a = lazyStaggeredGridState;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final void a() {
        Remeasurement remeasurement = this.f4908a.f5052f;
        if (remeasurement != null) {
            remeasurement.d();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final boolean b() {
        return !this.f4908a.g().h().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int c() {
        return this.f4908a.f5049a.f5037c.g();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int d() {
        return ((LazyStaggeredGridItemInfo) u.L0(this.f4908a.g().h())).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getItemCount() {
        return this.f4908a.g().f();
    }
}
