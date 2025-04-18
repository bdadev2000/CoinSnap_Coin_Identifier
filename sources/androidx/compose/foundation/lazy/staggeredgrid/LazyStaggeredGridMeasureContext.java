package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsContext;
import b1.d0;
import java.util.List;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LazyStaggeredGridMeasureContext {

    /* renamed from: a, reason: collision with root package name */
    public final LazyStaggeredGridState f4970a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4971b;

    /* renamed from: c, reason: collision with root package name */
    public final LazyStaggeredGridItemProvider f4972c;
    public final LazyStaggeredGridSlots d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4973f;

    /* renamed from: g, reason: collision with root package name */
    public final LazyLayoutMeasureScope f4974g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4975h;

    /* renamed from: i, reason: collision with root package name */
    public final long f4976i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4977j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4978k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4979l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4980m;

    /* renamed from: n, reason: collision with root package name */
    public final d0 f4981n;

    /* renamed from: o, reason: collision with root package name */
    public final GraphicsContext f4982o;

    /* renamed from: p, reason: collision with root package name */
    public final LazyStaggeredGridMeasureContext$measuredItemProvider$1 f4983p;

    /* renamed from: q, reason: collision with root package name */
    public final LazyStaggeredGridLaneInfo f4984q;

    /* renamed from: r, reason: collision with root package name */
    public final int f4985r;

    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1] */
    public LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState, List list, final LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, final LazyStaggeredGridSlots lazyStaggeredGridSlots, long j2, final boolean z2, final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j3, int i3, int i4, boolean z3, int i5, d0 d0Var, GraphicsContext graphicsContext) {
        this.f4970a = lazyStaggeredGridState;
        this.f4971b = list;
        this.f4972c = lazyStaggeredGridItemProvider;
        this.d = lazyStaggeredGridSlots;
        this.e = j2;
        this.f4973f = z2;
        this.f4974g = lazyLayoutMeasureScope;
        this.f4975h = i2;
        this.f4976i = j3;
        this.f4977j = i3;
        this.f4978k = i4;
        this.f4979l = z3;
        this.f4980m = i5;
        this.f4981n = d0Var;
        this.f4982o = graphicsContext;
        this.f4983p = new LazyStaggeredGridMeasureProvider(z2, lazyStaggeredGridItemProvider, lazyLayoutMeasureScope, lazyStaggeredGridSlots) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
            public final LazyStaggeredGridMeasuredItem b(int i6, int i7, int i8, Object obj, Object obj2, List list2, long j4) {
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = LazyStaggeredGridMeasureContext.this;
                return new LazyStaggeredGridMeasuredItem(i6, obj, list2, lazyStaggeredGridMeasureContext.f4973f, lazyStaggeredGridMeasureContext.f4980m, i7, i8, lazyStaggeredGridMeasureContext.f4977j, lazyStaggeredGridMeasureContext.f4978k, obj2, lazyStaggeredGridMeasureContext.f4970a.f5064r, j4);
            }
        };
        this.f4984q = lazyStaggeredGridState.f5051c;
        this.f4985r = lazyStaggeredGridSlots.f5046b.length;
    }

    public static long a(LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i2, int i3) {
        lazyStaggeredGridItemProvider.f().a(i2);
        return (i3 << 32) | ((i3 + 1) & 4294967295L);
    }
}
