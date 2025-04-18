package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import p0.a;
import q0.p;

/* loaded from: classes2.dex */
final class GridSlotCache implements LazyGridSlotsProvider {

    /* renamed from: a, reason: collision with root package name */
    public final p f4448a;

    /* renamed from: b, reason: collision with root package name */
    public long f4449b = ConstraintsKt.b(0, 0, 15);

    /* renamed from: c, reason: collision with root package name */
    public float f4450c;
    public LazyGridSlots d;

    public GridSlotCache(p pVar) {
        this.f4448a = pVar;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider
    public final LazyGridSlots a(long j2, Density density) {
        if (this.d != null && Constraints.c(this.f4449b, j2) && this.f4450c == density.getDensity()) {
            LazyGridSlots lazyGridSlots = this.d;
            a.p(lazyGridSlots);
            return lazyGridSlots;
        }
        this.f4449b = j2;
        this.f4450c = density.getDensity();
        LazyGridSlots lazyGridSlots2 = (LazyGridSlots) this.f4448a.invoke(density, new Constraints(j2));
        this.d = lazyGridSlots2;
        return lazyGridSlots2;
    }
}
