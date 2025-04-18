package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LazyListMeasuredItem implements LazyListItemInfo, LazyLayoutMeasuredItem {

    /* renamed from: a, reason: collision with root package name */
    public final int f4363a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4364b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4365c;
    public final Alignment.Horizontal d;
    public final Alignment.Vertical e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutDirection f4366f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4367g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4368h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4369i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4370j;

    /* renamed from: k, reason: collision with root package name */
    public final long f4371k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4372l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f4373m;

    /* renamed from: n, reason: collision with root package name */
    public final LazyLayoutItemAnimator f4374n;

    /* renamed from: o, reason: collision with root package name */
    public final long f4375o;

    /* renamed from: p, reason: collision with root package name */
    public int f4376p;

    /* renamed from: q, reason: collision with root package name */
    public final int f4377q;

    /* renamed from: s, reason: collision with root package name */
    public final int f4379s;

    /* renamed from: t, reason: collision with root package name */
    public final int f4380t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4381u;
    public int w;
    public int x;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f4383y;

    /* renamed from: r, reason: collision with root package name */
    public final int f4378r = 1;

    /* renamed from: v, reason: collision with root package name */
    public int f4382v = Integer.MIN_VALUE;

    public LazyListMeasuredItem(int i2, List list, boolean z2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z3, int i3, int i4, int i5, long j2, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j3) {
        this.f4363a = i2;
        this.f4364b = list;
        this.f4365c = z2;
        this.d = horizontal;
        this.e = vertical;
        this.f4366f = layoutDirection;
        this.f4367g = z3;
        this.f4368h = i3;
        this.f4369i = i4;
        this.f4370j = i5;
        this.f4371k = j2;
        this.f4372l = obj;
        this.f4373m = obj2;
        this.f4374n = lazyLayoutItemAnimator;
        this.f4375o = j3;
        int size = list.size();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Placeable placeable = (Placeable) list.get(i8);
            boolean z4 = this.f4365c;
            i6 += z4 ? placeable.f15826b : placeable.f15825a;
            i7 = Math.max(i7, !z4 ? placeable.f15826b : placeable.f15825a);
        }
        this.f4377q = i6;
        int i9 = i6 + this.f4370j;
        this.f4379s = i9 >= 0 ? i9 : 0;
        this.f4380t = i7;
        this.f4383y = new int[this.f4364b.size() * 2];
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public final int a() {
        return this.f4376p;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int b() {
        return this.f4364b.size();
    }

    public final int c(long j2) {
        return (int) (this.f4365c ? j2 & 4294967295L : j2 >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int d() {
        return this.f4378r;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final long e() {
        return this.f4375o;
    }

    public final void f(Placeable.PlacementScope placementScope, boolean z2) {
        GraphicsLayer graphicsLayer;
        if (this.f4382v == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        List list = this.f4364b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeable = (Placeable) list.get(i2);
            int i3 = this.w;
            boolean z3 = this.f4365c;
            int i4 = i3 - (z3 ? placeable.f15826b : placeable.f15825a);
            int i5 = this.x;
            long m2 = m(i2);
            LazyLayoutItemAnimation a2 = this.f4374n.a(i2, this.f4372l);
            if (a2 != null) {
                if (z2) {
                    a2.f4724r = m2;
                } else {
                    if (!IntOffset.b(a2.f4724r, LazyLayoutItemAnimation.f4707s)) {
                        m2 = a2.f4724r;
                    }
                    long d = IntOffset.d(m2, ((IntOffset) a2.f4723q.getValue()).f17489a);
                    if ((c(m2) <= i4 && c(d) <= i4) || (c(m2) >= i5 && c(d) >= i5)) {
                        a2.b();
                    }
                    m2 = d;
                }
                graphicsLayer = a2.f4720n;
            } else {
                graphicsLayer = null;
            }
            if (this.f4367g) {
                m2 = IntOffsetKt.a(z3 ? (int) (m2 >> 32) : (this.f4382v - ((int) (m2 >> 32))) - (z3 ? placeable.f15826b : placeable.f15825a), z3 ? (this.f4382v - ((int) (m2 & 4294967295L))) - (z3 ? placeable.f15826b : placeable.f15825a) : (int) (m2 & 4294967295L));
            }
            long d2 = IntOffset.d(m2, this.f4371k);
            if (!z2 && a2 != null) {
                a2.f4719m = d2;
            }
            if (z3) {
                if (graphicsLayer != null) {
                    placementScope.getClass();
                    Placeable.PlacementScope.a(placementScope, placeable);
                    placeable.j0(IntOffset.d(d2, placeable.f15828f), 0.0f, graphicsLayer);
                } else {
                    Placeable.PlacementScope.n(placementScope, placeable, d2);
                }
            } else if (graphicsLayer != null) {
                Placeable.PlacementScope.l(placementScope, placeable, d2, graphicsLayer);
            } else {
                Placeable.PlacementScope.k(placementScope, placeable, d2);
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final boolean g() {
        return this.f4365c;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int getIndex() {
        return this.f4363a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object getKey() {
        return this.f4372l;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public final int getSize() {
        return this.f4377q;
    }

    public final void h(int i2, int i3, int i4) {
        int i5;
        this.f4376p = i2;
        boolean z2 = this.f4365c;
        this.f4382v = z2 ? i4 : i3;
        List list = this.f4364b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            Placeable placeable = (Placeable) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.f4383y;
            if (z2) {
                Alignment.Horizontal horizontal = this.d;
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true".toString());
                }
                iArr[i7] = horizontal.a(placeable.f15825a, i3, this.f4366f);
                iArr[i7 + 1] = i2;
                i5 = placeable.f15826b;
            } else {
                iArr[i7] = i2;
                int i8 = i7 + 1;
                Alignment.Vertical vertical = this.e;
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false".toString());
                }
                iArr[i8] = vertical.a(placeable.f15826b, i4);
                i5 = placeable.f15825a;
            }
            i2 += i5;
        }
        this.w = -this.f4368h;
        this.x = this.f4382v + this.f4369i;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void i(int i2, int i3, int i4, int i5) {
        h(i2, i4, i5);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int j() {
        return this.f4379s;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final Object k(int i2) {
        return ((Placeable) this.f4364b.get(i2)).m();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final void l() {
        this.f4381u = true;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final long m(int i2) {
        int i3 = i2 * 2;
        int[] iArr = this.f4383y;
        return IntOffsetKt.a(iArr[i3], iArr[i3 + 1]);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public final int n() {
        return 0;
    }
}
