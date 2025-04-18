package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import b1.d0;
import e0.u;
import java.util.List;
import java.util.Map;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {

    /* renamed from: a, reason: collision with root package name */
    public final LazyListMeasuredItem f4348a;

    /* renamed from: b, reason: collision with root package name */
    public int f4349b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4350c;
    public float d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4351f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f4352g;

    /* renamed from: h, reason: collision with root package name */
    public final Density f4353h;

    /* renamed from: i, reason: collision with root package name */
    public final long f4354i;

    /* renamed from: j, reason: collision with root package name */
    public final List f4355j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4356k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4357l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4358m;

    /* renamed from: n, reason: collision with root package name */
    public final Orientation f4359n;

    /* renamed from: o, reason: collision with root package name */
    public final int f4360o;

    /* renamed from: p, reason: collision with root package name */
    public final int f4361p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ MeasureResult f4362q;

    public LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i2, boolean z2, float f2, MeasureResult measureResult, float f3, boolean z3, d0 d0Var, Density density, long j2, List list, int i3, int i4, int i5, Orientation orientation, int i6, int i7) {
        this.f4348a = lazyListMeasuredItem;
        this.f4349b = i2;
        this.f4350c = z2;
        this.d = f2;
        this.e = f3;
        this.f4351f = z3;
        this.f4352g = d0Var;
        this.f4353h = density;
        this.f4354i = j2;
        this.f4355j = list;
        this.f4356k = i3;
        this.f4357l = i4;
        this.f4358m = i5;
        this.f4359n = orientation;
        this.f4360o = i6;
        this.f4361p = i7;
        this.f4362q = measureResult;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final long a() {
        MeasureResult measureResult = this.f4362q;
        return IntSizeKt.a(measureResult.getWidth(), measureResult.getHeight());
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int b() {
        return this.f4360o;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final Orientation c() {
        return this.f4359n;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int d() {
        return -this.f4356k;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int e() {
        return this.f4357l;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int f() {
        return this.f4358m;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int g() {
        return this.f4356k;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getHeight() {
        return this.f4362q.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final int getWidth() {
        return this.f4362q.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final List h() {
        return this.f4355j;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int i() {
        return this.f4361p;
    }

    public final boolean j(int i2, boolean z2) {
        LazyListMeasuredItem lazyListMeasuredItem;
        boolean z3;
        if (this.f4351f) {
            return false;
        }
        List list = this.f4355j;
        if (list.isEmpty() || (lazyListMeasuredItem = this.f4348a) == null) {
            return false;
        }
        int i3 = lazyListMeasuredItem.f4379s;
        int i4 = this.f4349b - i2;
        if (i4 < 0 || i4 >= i3) {
            return false;
        }
        LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) u.E0(list);
        LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) u.L0(list);
        if (lazyListMeasuredItem2.f4381u || lazyListMeasuredItem3.f4381u) {
            return false;
        }
        int i5 = this.f4357l;
        int i6 = this.f4356k;
        if (i2 < 0) {
            if (Math.min((lazyListMeasuredItem2.f4376p + lazyListMeasuredItem2.f4379s) - i6, (lazyListMeasuredItem3.f4376p + lazyListMeasuredItem3.f4379s) - i5) <= (-i2)) {
                return false;
            }
        } else if (Math.min(i6 - lazyListMeasuredItem2.f4376p, i5 - lazyListMeasuredItem3.f4376p) <= i2) {
            return false;
        }
        this.f4349b -= i2;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) list.get(i7);
            if (!lazyListMeasuredItem4.f4381u) {
                lazyListMeasuredItem4.f4376p += i2;
                int[] iArr = lazyListMeasuredItem4.f4383y;
                int length = iArr.length;
                int i8 = 0;
                while (true) {
                    z3 = lazyListMeasuredItem4.f4365c;
                    if (i8 >= length) {
                        break;
                    }
                    if ((z3 && i8 % 2 == 1) || (!z3 && i8 % 2 == 0)) {
                        iArr[i8] = iArr[i8] + i2;
                    }
                    i8++;
                }
                if (z2) {
                    int size2 = lazyListMeasuredItem4.f4364b.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        LazyLayoutItemAnimation a2 = lazyListMeasuredItem4.f4374n.a(i9, lazyListMeasuredItem4.f4372l);
                        if (a2 != null) {
                            long j2 = a2.f4718l;
                            a2.f4718l = IntOffsetKt.a(z3 ? (int) (j2 >> 32) : Integer.valueOf(((int) (j2 >> 32)) + i2).intValue(), z3 ? ((int) (j2 & 4294967295L)) + i2 : (int) (j2 & 4294967295L));
                        }
                    }
                }
            }
        }
        this.d = i2;
        if (!this.f4350c && i2 > 0) {
            this.f4350c = true;
        }
        return true;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final Map q() {
        return this.f4362q.q();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final void r() {
        this.f4362q.r();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public final l s() {
        return this.f4362q.s();
    }
}
