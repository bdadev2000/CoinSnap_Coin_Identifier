package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class LazyGridMeasuredItemProvider implements LazyLayoutMeasuredItemProvider<LazyGridMeasuredItem> {

    /* renamed from: a, reason: collision with root package name */
    public final LazyGridItemProvider f4571a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyLayoutMeasureScope f4572b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4573c;

    public LazyGridMeasuredItemProvider(LazyGridItemProvider lazyGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2) {
        this.f4571a = lazyGridItemProvider;
        this.f4572b = lazyLayoutMeasureScope;
        this.f4573c = i2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    public final LazyLayoutMeasuredItem a(int i2, int i3, long j2, int i4) {
        return c(i2, i3, i4, j2, this.f4573c);
    }

    public abstract LazyGridMeasuredItem b(int i2, Object obj, Object obj2, int i3, int i4, List list, long j2, int i5, int i6);

    public final LazyGridMeasuredItem c(int i2, int i3, int i4, long j2, int i5) {
        int j3;
        LazyGridItemProvider lazyGridItemProvider = this.f4571a;
        Object c2 = lazyGridItemProvider.c(i2);
        Object d = lazyGridItemProvider.d(i2);
        List k02 = this.f4572b.k0(i2, j2);
        if (Constraints.g(j2)) {
            j3 = Constraints.k(j2);
        } else {
            if (!Constraints.f(j2)) {
                throw new IllegalArgumentException("does not have fixed height".toString());
            }
            j3 = Constraints.j(j2);
        }
        return b(i2, c2, d, j3, i5, k02, j2, i3, i4);
    }
}
