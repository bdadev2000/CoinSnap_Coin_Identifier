package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import b1.f0;
import java.util.List;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo, LazyLayoutMeasuredItem {

    /* renamed from: a, reason: collision with root package name */
    public final int f5018a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5019b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5020c;
    public final boolean d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5021f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5022g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5023h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f5024i;

    /* renamed from: j, reason: collision with root package name */
    public final LazyLayoutItemAnimator f5025j;

    /* renamed from: k, reason: collision with root package name */
    public final long f5026k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5027l = true;

    /* renamed from: m, reason: collision with root package name */
    public final int f5028m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5029n;

    /* renamed from: o, reason: collision with root package name */
    public int f5030o;

    /* renamed from: p, reason: collision with root package name */
    public int f5031p;

    /* renamed from: q, reason: collision with root package name */
    public int f5032q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5033r;

    /* renamed from: s, reason: collision with root package name */
    public long f5034s;

    public LazyStaggeredGridMeasuredItem(int i2, Object obj, List list, boolean z2, int i3, int i4, int i5, int i6, int i7, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2) {
        Integer valueOf;
        this.f5018a = i2;
        this.f5019b = obj;
        this.f5020c = list;
        this.d = z2;
        this.e = i4;
        this.f5021f = i5;
        this.f5022g = i6;
        this.f5023h = i7;
        this.f5024i = obj2;
        this.f5025j = lazyLayoutItemAnimator;
        this.f5026k = j2;
        int i8 = 1;
        Integer num = null;
        if (list.isEmpty()) {
            valueOf = null;
        } else {
            Placeable placeable = (Placeable) list.get(0);
            valueOf = Integer.valueOf(z2 ? placeable.f15826b : placeable.f15825a);
            int p2 = f0.p(list);
            if (1 <= p2) {
                int i9 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) list.get(i9);
                    Integer valueOf2 = Integer.valueOf(this.d ? placeable2.f15826b : placeable2.f15825a);
                    valueOf = valueOf2.compareTo(valueOf) > 0 ? valueOf2 : valueOf;
                    if (i9 == p2) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        this.f5028m = intValue;
        int i10 = intValue + i3;
        this.f5029n = i10 < 0 ? 0 : i10;
        List list2 = this.f5020c;
        if (!list2.isEmpty()) {
            Placeable placeable3 = (Placeable) list2.get(0);
            Integer valueOf3 = Integer.valueOf(this.d ? placeable3.f15825a : placeable3.f15826b);
            int p3 = f0.p(list2);
            if (1 <= p3) {
                while (true) {
                    Placeable placeable4 = (Placeable) list2.get(i8);
                    Integer valueOf4 = Integer.valueOf(this.d ? placeable4.f15825a : placeable4.f15826b);
                    valueOf3 = valueOf4.compareTo(valueOf3) > 0 ? valueOf4 : valueOf3;
                    if (i8 == p3) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            num = valueOf3;
        }
        if (num != null) {
            num.intValue();
        }
        this.f5030o = -1;
        this.f5034s = 0L;
    }

    public final int a(long j2) {
        return (int) (this.d ? j2 & 4294967295L : j2 >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int b() {
        return this.f5020c.size();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public final long c() {
        return this.f5034s;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int d() {
        return this.f5021f;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final long e() {
        return this.f5026k;
    }

    public final int f() {
        return (int) (!this.d ? this.f5034s >> 32 : this.f5034s & 4294967295L);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final boolean g() {
        return this.d;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getIndex() {
        return this.f5018a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object getKey() {
        return this.f5019b;
    }

    public final void h(int i2, int i3, int i4) {
        this.f5030o = i4;
        this.f5031p = -this.f5022g;
        this.f5032q = i4 + this.f5023h;
        this.f5034s = this.d ? IntOffsetKt.a(i3, i2) : IntOffsetKt.a(i2, i3);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void i(int i2, int i3, int i4, int i5) {
        if (this.d) {
            i4 = i5;
        }
        h(i2, i3, i4);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int j() {
        return this.f5029n;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object k(int i2) {
        return ((Placeable) this.f5020c.get(i2)).m();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void l() {
        this.f5033r = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final long m(int i2) {
        return this.f5034s;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int n() {
        return this.e;
    }

    public final void o(int i2) {
        this.f5030o = i2;
        this.f5032q = i2 + this.f5023h;
    }

    public final String toString() {
        return super.toString();
    }
}
