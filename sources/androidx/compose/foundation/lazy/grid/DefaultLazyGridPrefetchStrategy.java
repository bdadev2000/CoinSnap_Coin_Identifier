package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import e0.u;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
/* loaded from: classes2.dex */
public final class DefaultLazyGridPrefetchStrategy implements LazyGridPrefetchStrategy {

    /* renamed from: a, reason: collision with root package name */
    public final int f4443a;

    /* renamed from: b, reason: collision with root package name */
    public int f4444b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final MutableVector f4445c = new MutableVector(new LazyLayoutPrefetchState.PrefetchHandle[16]);
    public boolean d;

    public DefaultLazyGridPrefetchStrategy(int i2) {
        this.f4443a = i2;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public final void a(NestedPrefetchScope nestedPrefetchScope, int i2) {
        for (int i3 = 0; i3 < this.f4443a; i3++) {
            nestedPrefetchScope.a(i2 + i3);
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public final void b(LazyGridLayoutInfo lazyGridLayoutInfo) {
        int f2;
        if (this.f4444b == -1 || !(!lazyGridLayoutInfo.h().isEmpty())) {
            return;
        }
        boolean z2 = this.d;
        Orientation orientation = Orientation.f3394a;
        if (z2) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) u.L0(lazyGridLayoutInfo.h());
            f2 = (lazyGridLayoutInfo.c() == orientation ? lazyGridItemInfo.f() : lazyGridItemInfo.h()) + 1;
        } else {
            LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) u.E0(lazyGridLayoutInfo.h());
            f2 = (lazyGridLayoutInfo.c() == orientation ? lazyGridItemInfo2.f() : lazyGridItemInfo2.h()) - 1;
        }
        if (this.f4444b != f2) {
            this.f4444b = -1;
            MutableVector mutableVector = this.f4445c;
            int i2 = mutableVector.f14144c;
            if (i2 > 0) {
                Object[] objArr = mutableVector.f14142a;
                int i3 = 0;
                do {
                    ((LazyLayoutPrefetchState.PrefetchHandle) objArr[i3]).cancel();
                    i3++;
                } while (i3 < i2);
            }
            mutableVector.g();
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy
    public final void c(LazyGridState$prefetchScope$1 lazyGridState$prefetchScope$1, float f2, LazyGridLayoutInfo lazyGridLayoutInfo) {
        int f3;
        int index;
        int i2;
        int i3;
        int i4;
        if (!lazyGridLayoutInfo.h().isEmpty()) {
            int i5 = 0;
            boolean z2 = f2 < 0.0f;
            Orientation orientation = Orientation.f3394a;
            if (z2) {
                LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) u.L0(lazyGridLayoutInfo.h());
                f3 = (lazyGridLayoutInfo.c() == orientation ? lazyGridItemInfo.f() : lazyGridItemInfo.h()) + 1;
                index = ((LazyGridItemInfo) u.L0(lazyGridLayoutInfo.h())).getIndex() + 1;
            } else {
                LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) u.E0(lazyGridLayoutInfo.h());
                f3 = (lazyGridLayoutInfo.c() == orientation ? lazyGridItemInfo2.f() : lazyGridItemInfo2.h()) - 1;
                index = ((LazyGridItemInfo) u.E0(lazyGridLayoutInfo.h())).getIndex() - 1;
            }
            if (index < 0 || index >= lazyGridLayoutInfo.f()) {
                return;
            }
            int i6 = this.f4444b;
            MutableVector mutableVector = this.f4445c;
            if (f3 != i6) {
                if (this.d != z2 && (i4 = mutableVector.f14144c) > 0) {
                    Object[] objArr = mutableVector.f14142a;
                    int i7 = 0;
                    do {
                        ((LazyLayoutPrefetchState.PrefetchHandle) objArr[i7]).cancel();
                        i7++;
                    } while (i7 < i4);
                }
                this.d = z2;
                this.f4444b = f3;
                mutableVector.g();
                mutableVector.d(mutableVector.f14144c, lazyGridState$prefetchScope$1.a(f3));
            }
            if (!z2) {
                if (lazyGridLayoutInfo.g() - LazyGridSnapLayoutInfoProviderKt.a((LazyGridItemInfo) u.E0(lazyGridLayoutInfo.h()), lazyGridLayoutInfo.c()) >= f2 || (i2 = mutableVector.f14144c) <= 0) {
                    return;
                }
                Object[] objArr2 = mutableVector.f14142a;
                do {
                    ((LazyLayoutPrefetchState.PrefetchHandle) objArr2[i5]).b();
                    i5++;
                } while (i5 < i2);
                return;
            }
            LazyGridItemInfo lazyGridItemInfo3 = (LazyGridItemInfo) u.L0(lazyGridLayoutInfo.h());
            if (((LazyGridSnapLayoutInfoProviderKt.a(lazyGridItemInfo3, lazyGridLayoutInfo.c()) + ((int) (lazyGridLayoutInfo.c() == orientation ? lazyGridItemInfo3.a() & 4294967295L : lazyGridItemInfo3.a() >> 32))) + lazyGridLayoutInfo.i()) - lazyGridLayoutInfo.e() >= (-f2) || (i3 = mutableVector.f14144c) <= 0) {
                return;
            }
            Object[] objArr3 = mutableVector.f14142a;
            do {
                ((LazyLayoutPrefetchState.PrefetchHandle) objArr3[i5]).b();
                i5++;
            } while (i5 < i3);
        }
    }
}
