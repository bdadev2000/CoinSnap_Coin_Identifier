package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Remeasurement;
import e0.u;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PagerBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* renamed from: a, reason: collision with root package name */
    public final PagerState f5138a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5139b;

    public PagerBeyondBoundsState(PagerState pagerState, int i2) {
        this.f5138a = pagerState;
        this.f5139b = i2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final void a() {
        Remeasurement remeasurement = (Remeasurement) this.f5138a.f5283y.getValue();
        if (remeasurement != null) {
            remeasurement.d();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final boolean b() {
        return !this.f5138a.l().h().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int c() {
        return Math.max(0, this.f5138a.d - this.f5139b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int d() {
        return Math.min(r0.m() - 1, ((PageInfo) u.L0(this.f5138a.l().h())).getIndex() + this.f5139b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public final int getItemCount() {
        return this.f5138a.m();
    }
}
