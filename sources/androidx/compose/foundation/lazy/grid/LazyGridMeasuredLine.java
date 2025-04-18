package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LazyGridMeasuredLine {

    /* renamed from: a, reason: collision with root package name */
    public final int f4574a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyGridMeasuredItem[] f4575b;

    /* renamed from: c, reason: collision with root package name */
    public final LazyGridSlots f4576c;
    public final List d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4577f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4578g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4579h;

    public LazyGridMeasuredLine(int i2, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, LazyGridSlots lazyGridSlots, List list, boolean z2, int i3) {
        this.f4574a = i2;
        this.f4575b = lazyGridMeasuredItemArr;
        this.f4576c = lazyGridSlots;
        this.d = list;
        this.e = z2;
        this.f4577f = i3;
        int i4 = 0;
        for (LazyGridMeasuredItem lazyGridMeasuredItem : lazyGridMeasuredItemArr) {
            i4 = Math.max(i4, lazyGridMeasuredItem.f4563p);
        }
        this.f4578g = i4;
        int i5 = i4 + this.f4577f;
        this.f4579h = i5 >= 0 ? i5 : 0;
    }

    public final LazyGridMeasuredItem[] a(int i2, int i3, int i4) {
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.f4575b;
        int length = lazyGridMeasuredItemArr.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i5];
            int i8 = i6 + 1;
            int i9 = (int) ((GridItemSpan) this.d.get(i6)).f4447a;
            int i10 = this.f4576c.f4589b[i7];
            int i11 = this.f4574a;
            boolean z2 = this.e;
            lazyGridMeasuredItem.p(i2, i10, i3, i4, z2 ? i11 : i7, z2 ? i7 : i11);
            i7 += i9;
            i5++;
            i6 = i8;
        }
        return lazyGridMeasuredItemArr;
    }
}
