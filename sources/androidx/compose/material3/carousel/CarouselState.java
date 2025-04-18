package androidx.compose.material3.carousel;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import d0.b0;
import h0.g;
import q0.a;
import q0.p;

@StabilityInferred
@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public final class CarouselState implements ScrollableState {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f12716a;

    /* renamed from: b, reason: collision with root package name */
    public final PagerState f12717b;

    @ExperimentalMaterial3Api
    /* loaded from: classes.dex */
    public static final class Companion {
    }

    static {
        ListSaverKt.a(CarouselState$Companion$Saver$2.f12719a, CarouselState$Companion$Saver$1.f12718a);
    }

    public CarouselState(int i2, float f2, a aVar) {
        ParcelableSnapshotMutableState f3;
        f3 = SnapshotStateKt.f(aVar, StructuralEqualityPolicy.f14078a);
        this.f12716a = f3;
        this.f12717b = PagerStateKt.a(i2, f2, (a) f3.getValue());
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return this.f12717b.f5270j.a();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object b(MutatePriority mutatePriority, p pVar, g gVar) {
        PagerState pagerState = this.f12717b;
        pagerState.getClass();
        Object s2 = PagerState.s(pagerState, mutatePriority, pVar, gVar);
        return s2 == i0.a.f30806a ? s2 : b0.f30125a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float e(float f2) {
        return this.f12717b.f5270j.e(f2);
    }
}
