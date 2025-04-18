package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import b1.d0;
import java.util.List;
import java.util.Map;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f5000a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5001b;

    /* renamed from: c, reason: collision with root package name */
    public float f5002c;
    public final MeasureResult d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5003f;

    /* renamed from: g, reason: collision with root package name */
    public final LazyStaggeredGridSlots f5004g;

    /* renamed from: h, reason: collision with root package name */
    public final LazyStaggeredGridSpanProvider f5005h;

    /* renamed from: i, reason: collision with root package name */
    public final Density f5006i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5007j;

    /* renamed from: k, reason: collision with root package name */
    public final List f5008k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5009l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5010m;

    /* renamed from: n, reason: collision with root package name */
    public final int f5011n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5012o;

    /* renamed from: p, reason: collision with root package name */
    public final int f5013p;

    /* renamed from: q, reason: collision with root package name */
    public final d0 f5014q;

    /* renamed from: r, reason: collision with root package name */
    public final Orientation f5015r;

    public LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f2, MeasureResult measureResult, boolean z2, boolean z3, boolean z4, LazyStaggeredGridSlots lazyStaggeredGridSlots, LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider, Density density, int i2, List list, long j2, int i3, int i4, int i5, int i6, int i7, d0 d0Var) {
        this.f5000a = iArr;
        this.f5001b = iArr2;
        this.f5002c = f2;
        this.d = measureResult;
        this.e = z2;
        this.f5003f = z4;
        this.f5004g = lazyStaggeredGridSlots;
        this.f5005h = lazyStaggeredGridSpanProvider;
        this.f5006i = density;
        this.f5007j = i2;
        this.f5008k = list;
        this.f5009l = j2;
        this.f5010m = i3;
        this.f5011n = i4;
        this.f5012o = i5;
        this.f5013p = i6;
        this.f5014q = d0Var;
        this.f5015r = z3 ? Orientation.f3394a : Orientation.f3395b;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final long a() {
        return this.f5009l;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final int b() {
        return this.f5013p;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final Orientation c() {
        return this.f5015r;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final int d() {
        return this.f5012o;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final int f() {
        return this.f5007j;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getHeight() {
        return this.d.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getWidth() {
        return this.d.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public final List h() {
        return this.f5008k;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Map q() {
        return this.d.q();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void r() {
        this.d.r();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final l s() {
        return this.d.s();
    }
}
