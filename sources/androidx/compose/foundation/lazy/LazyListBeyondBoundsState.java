package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Remeasurement;
import e0.u;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LazyListBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* renamed from: a, reason: collision with root package name */
    public final LazyListState f4284a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4285b;

    public LazyListBeyondBoundsState(LazyListState lazyListState, int i2) {
        this.f4284a = lazyListState;
        this.f4285b = i2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final void a() {
        Remeasurement remeasurement = this.f4284a.f4399k;
        if (remeasurement != null) {
            remeasurement.d();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final boolean b() {
        return !this.f4284a.i().h().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int c() {
        return Math.max(0, this.f4284a.g() - this.f4285b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int d() {
        return Math.min(getItemCount() - 1, ((LazyListItemInfo) u.L0(this.f4284a.i().h())).getIndex() + this.f4285b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getItemCount() {
        return this.f4284a.i().f();
    }
}
