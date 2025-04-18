package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

@StabilityInferred
/* loaded from: classes2.dex */
public abstract class LazyStaggeredGridMeasureProvider implements LazyLayoutMeasuredItemProvider<LazyStaggeredGridMeasuredItem> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4997a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyStaggeredGridItemProvider f4998b;

    /* renamed from: c, reason: collision with root package name */
    public final LazyLayoutMeasureScope f4999c;
    public final LazyStaggeredGridSlots d;

    public LazyStaggeredGridMeasureProvider(boolean z2, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridSlots lazyStaggeredGridSlots) {
        this.f4997a = z2;
        this.f4998b = lazyStaggeredGridItemProvider;
        this.f4999c = lazyLayoutMeasureScope;
        this.d = lazyStaggeredGridSlots;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemProvider
    public final LazyLayoutMeasuredItem a(int i2, int i3, long j2, int i4) {
        LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider = this.f4998b;
        return b(i2, i3, i4, lazyStaggeredGridItemProvider.c(i2), lazyStaggeredGridItemProvider.d(i2), this.f4999c.k0(i2, j2), j2);
    }

    public abstract LazyStaggeredGridMeasuredItem b(int i2, int i3, int i4, Object obj, Object obj2, List list, long j2);

    public final LazyStaggeredGridMeasuredItem c(int i2, long j2) {
        int i3;
        LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider = this.f4998b;
        Object c2 = lazyStaggeredGridItemProvider.c(i2);
        Object d = lazyStaggeredGridItemProvider.d(i2);
        LazyStaggeredGridSlots lazyStaggeredGridSlots = this.d;
        int[] iArr = lazyStaggeredGridSlots.f5046b;
        int length = iArr.length;
        int i4 = (int) (j2 >> 32);
        int i5 = length - 1;
        if (i4 <= i5) {
            i5 = i4;
        }
        int i6 = ((int) (j2 & 4294967295L)) - i4;
        int i7 = length - i5;
        if (i6 > i7) {
            i6 = i7;
        }
        if (i6 == 1) {
            i3 = iArr[i5];
        } else {
            int[] iArr2 = lazyStaggeredGridSlots.f5045a;
            int i8 = (i5 + i6) - 1;
            i3 = (iArr2[i8] + iArr[i8]) - iArr2[i5];
        }
        long e = this.f4997a ? Constraints.Companion.e(i3) : Constraints.Companion.d(i3);
        return b(i2, i5, i6, c2, d, this.f4999c.k0(i2, e), e);
    }
}
