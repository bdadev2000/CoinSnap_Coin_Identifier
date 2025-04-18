package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import p0.a;
import q0.p;

/* loaded from: classes4.dex */
final class LazyStaggeredGridSlotCache implements LazyGridStaggeredGridSlotsProvider {

    /* renamed from: a, reason: collision with root package name */
    public final p f5042a;

    /* renamed from: b, reason: collision with root package name */
    public long f5043b = ConstraintsKt.b(0, 0, 15);

    /* renamed from: c, reason: collision with root package name */
    public float f5044c;
    public LazyStaggeredGridSlots d;

    public LazyStaggeredGridSlotCache(p pVar) {
        this.f5042a = pVar;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider
    public final LazyStaggeredGridSlots a(long j2, Density density) {
        if (this.d != null && Constraints.c(this.f5043b, j2) && this.f5044c == density.getDensity()) {
            LazyStaggeredGridSlots lazyStaggeredGridSlots = this.d;
            a.p(lazyStaggeredGridSlots);
            return lazyStaggeredGridSlots;
        }
        this.f5043b = j2;
        this.f5044c = density.getDensity();
        LazyStaggeredGridSlots lazyStaggeredGridSlots2 = (LazyStaggeredGridSlots) this.f5042a.invoke(density, new Constraints(j2));
        this.d = lazyStaggeredGridSlots2;
        return lazyStaggeredGridSlots2;
    }
}
