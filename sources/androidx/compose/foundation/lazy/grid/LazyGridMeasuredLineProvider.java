package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class LazyGridMeasuredLineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4580a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyGridSlots f4581b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4582c;
    public final int d;
    public final LazyGridMeasuredItemProvider e;

    /* renamed from: f, reason: collision with root package name */
    public final LazyGridSpanLayoutProvider f4583f;

    public LazyGridMeasuredLineProvider(boolean z2, LazyGridSlots lazyGridSlots, int i2, int i3, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        this.f4580a = z2;
        this.f4581b = lazyGridSlots;
        this.f4582c = i2;
        this.d = i3;
        this.e = lazyGridMeasuredItemProvider;
        this.f4583f = lazyGridSpanLayoutProvider;
    }

    public final long a(int i2, int i3) {
        int i4;
        LazyGridSlots lazyGridSlots = this.f4581b;
        if (i3 == 1) {
            i4 = lazyGridSlots.f4588a[i2];
        } else {
            int i5 = (i3 + i2) - 1;
            int[] iArr = lazyGridSlots.f4589b;
            i4 = (iArr[i5] + lazyGridSlots.f4588a[i5]) - iArr[i2];
        }
        if (i4 < 0) {
            i4 = 0;
        }
        return this.f4580a ? Constraints.Companion.e(i4) : Constraints.Companion.d(i4);
    }

    public abstract LazyGridMeasuredLine b(int i2, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List list, int i3);

    public final LazyGridMeasuredLine c(int i2) {
        LazyGridSpanLayoutProvider.LineConfiguration b2 = this.f4583f.b(i2);
        List list = b2.f4601b;
        int size = list.size();
        int i3 = b2.f4600a;
        int i4 = (size == 0 || i3 + size == this.f4582c) ? 0 : this.d;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = new LazyGridMeasuredItem[size];
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            int i7 = (int) ((GridItemSpan) list.get(i6)).f4447a;
            LazyGridMeasuredItem c2 = this.e.c(i3 + i6, i5, i7, a(i5, i7), i4);
            i5 += i7;
            lazyGridMeasuredItemArr[i6] = c2;
        }
        return b(i2, lazyGridMeasuredItemArr, list, i4);
    }
}
