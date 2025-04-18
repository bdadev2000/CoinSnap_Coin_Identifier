package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LazyGridMeasuredItem implements LazyGridItemInfo, LazyLayoutMeasuredItem {

    /* renamed from: a, reason: collision with root package name */
    public final int f4550a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4551b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4552c;
    public final int d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutDirection f4553f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4554g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4555h;

    /* renamed from: i, reason: collision with root package name */
    public final List f4556i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4557j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f4558k;

    /* renamed from: l, reason: collision with root package name */
    public final LazyLayoutItemAnimator f4559l;

    /* renamed from: m, reason: collision with root package name */
    public final long f4560m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4561n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4562o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4563p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4564q;

    /* renamed from: r, reason: collision with root package name */
    public int f4565r = Integer.MIN_VALUE;

    /* renamed from: s, reason: collision with root package name */
    public int f4566s;

    /* renamed from: t, reason: collision with root package name */
    public int f4567t;

    /* renamed from: u, reason: collision with root package name */
    public final long f4568u;

    /* renamed from: v, reason: collision with root package name */
    public long f4569v;
    public int w;
    public int x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4570y;

    public LazyGridMeasuredItem(int i2, Object obj, boolean z2, int i3, int i4, boolean z3, LayoutDirection layoutDirection, int i5, int i6, List list, long j2, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j3, int i7, int i8) {
        this.f4550a = i2;
        this.f4551b = obj;
        this.f4552c = z2;
        this.d = i3;
        this.e = z3;
        this.f4553f = layoutDirection;
        this.f4554g = i5;
        this.f4555h = i6;
        this.f4556i = list;
        this.f4557j = j2;
        this.f4558k = obj2;
        this.f4559l = lazyLayoutItemAnimator;
        this.f4560m = j3;
        this.f4561n = i7;
        this.f4562o = i8;
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Placeable placeable = (Placeable) list.get(i10);
            i9 = Math.max(i9, this.f4552c ? placeable.f15826b : placeable.f15825a);
        }
        this.f4563p = i9;
        int i11 = i9 + i4;
        this.f4564q = i11 >= 0 ? i11 : 0;
        this.f4568u = this.f4552c ? IntSizeKt.a(this.d, i9) : IntSizeKt.a(i9, this.d);
        this.f4569v = 0L;
        this.w = -1;
        this.x = -1;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public final long a() {
        return this.f4568u;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int b() {
        return this.f4556i.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public final long c() {
        return this.f4569v;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int d() {
        return this.f4562o;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final long e() {
        return this.f4560m;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public final int f() {
        return this.w;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final boolean g() {
        return this.f4552c;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getIndex() {
        return this.f4550a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object getKey() {
        return this.f4551b;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public final int h() {
        return this.x;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void i(int i2, int i3, int i4, int i5) {
        p(i2, i3, i4, i5, -1, -1);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int j() {
        return this.f4564q;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object k(int i2) {
        return ((Placeable) this.f4556i.get(i2)).m();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void l() {
        this.f4570y = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final long m(int i2) {
        return this.f4569v;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int n() {
        return this.f4561n;
    }

    public final int o(long j2) {
        return (int) (this.f4552c ? j2 & 4294967295L : j2 >> 32);
    }

    public final void p(int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean z2 = this.f4552c;
        this.f4565r = z2 ? i5 : i4;
        if (!z2) {
            i4 = i5;
        }
        if (z2) {
            if (this.f4553f == LayoutDirection.f17495b) {
                i3 = (i4 - i3) - this.d;
            }
        }
        this.f4569v = z2 ? IntOffsetKt.a(i3, i2) : IntOffsetKt.a(i2, i3);
        this.w = i6;
        this.x = i7;
        this.f4566s = -this.f4554g;
        this.f4567t = this.f4565r + this.f4555h;
    }
}
