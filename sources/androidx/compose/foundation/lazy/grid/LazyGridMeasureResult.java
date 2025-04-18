package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import b1.d0;
import java.util.List;
import java.util.Map;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {

    /* renamed from: a, reason: collision with root package name */
    public final LazyGridMeasuredLine f4536a;

    /* renamed from: b, reason: collision with root package name */
    public int f4537b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4538c;
    public float d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f4539f;

    /* renamed from: g, reason: collision with root package name */
    public final Density f4540g;

    /* renamed from: h, reason: collision with root package name */
    public final l f4541h;

    /* renamed from: i, reason: collision with root package name */
    public final List f4542i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4543j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4544k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4545l;

    /* renamed from: m, reason: collision with root package name */
    public final Orientation f4546m;

    /* renamed from: n, reason: collision with root package name */
    public final int f4547n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4548o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ MeasureResult f4549p;

    public LazyGridMeasureResult(LazyGridMeasuredLine lazyGridMeasuredLine, int i2, boolean z2, float f2, MeasureResult measureResult, boolean z3, d0 d0Var, Density density, int i3, l lVar, List list, int i4, int i5, int i6, Orientation orientation, int i7, int i8) {
        this.f4536a = lazyGridMeasuredLine;
        this.f4537b = i2;
        this.f4538c = z2;
        this.d = f2;
        this.e = z3;
        this.f4539f = d0Var;
        this.f4540g = density;
        this.f4541h = lVar;
        this.f4542i = list;
        this.f4543j = i4;
        this.f4544k = i5;
        this.f4545l = i6;
        this.f4546m = orientation;
        this.f4547n = i7;
        this.f4548o = i8;
        this.f4549p = measureResult;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final long a() {
        MeasureResult measureResult = this.f4549p;
        return IntSizeKt.a(measureResult.getWidth(), measureResult.getHeight());
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int b() {
        return this.f4547n;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final Orientation c() {
        return this.f4546m;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int d() {
        return -this.f4543j;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int e() {
        return this.f4544k;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int f() {
        return this.f4545l;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int g() {
        return this.f4543j;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getHeight() {
        return this.f4549p.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getWidth() {
        return this.f4549p.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final List h() {
        return this.f4542i;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int i() {
        return this.f4548o;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Map q() {
        return this.f4549p.q();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void r() {
        this.f4549p.r();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final l s() {
        return this.f4549p.s();
    }
}
