package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Remeasurement;
import e0.u;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LazyGridBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* renamed from: a, reason: collision with root package name */
    public final LazyGridState f4451a;

    public LazyGridBeyondBoundsState(LazyGridState lazyGridState) {
        this.f4451a = lazyGridState;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final void a() {
        Remeasurement remeasurement = this.f4451a.f4609h;
        if (remeasurement != null) {
            remeasurement.d();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final boolean b() {
        return !this.f4451a.i().h().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int c() {
        return this.f4451a.g();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int d() {
        return ((LazyGridItemInfo) u.L0(this.f4451a.i().h())).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getItemCount() {
        return this.f4451a.i().f();
    }
}
