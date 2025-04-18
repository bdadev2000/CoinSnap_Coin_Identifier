package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.runtime.Stable;
import e0.u;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
/* loaded from: classes3.dex */
public final class DefaultLazyListPrefetchStrategy implements LazyListPrefetchStrategy {

    /* renamed from: a, reason: collision with root package name */
    public final int f4238a;

    /* renamed from: b, reason: collision with root package name */
    public int f4239b = -1;

    /* renamed from: c, reason: collision with root package name */
    public LazyLayoutPrefetchState.PrefetchHandle f4240c;
    public boolean d;

    public DefaultLazyListPrefetchStrategy(int i2) {
        this.f4238a = i2;
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void a(NestedPrefetchScope nestedPrefetchScope, int i2) {
        for (int i3 = 0; i3 < this.f4238a; i3++) {
            nestedPrefetchScope.a(i2 + i3);
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void b(LazyListState$prefetchScope$1 lazyListState$prefetchScope$1, float f2, LazyListLayoutInfo lazyListLayoutInfo) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (!lazyListLayoutInfo.h().isEmpty()) {
            boolean z2 = f2 < 0.0f;
            int index = z2 ? ((LazyListItemInfo) u.L0(lazyListLayoutInfo.h())).getIndex() + 1 : ((LazyListItemInfo) u.E0(lazyListLayoutInfo.h())).getIndex() - 1;
            if (index < 0 || index >= lazyListLayoutInfo.f()) {
                return;
            }
            if (index != this.f4239b) {
                if (this.d != z2 && (prefetchHandle3 = this.f4240c) != null) {
                    prefetchHandle3.cancel();
                }
                this.d = z2;
                this.f4239b = index;
                this.f4240c = lazyListState$prefetchScope$1.a(index);
            }
            if (!z2) {
                if (lazyListLayoutInfo.g() - ((LazyListItemInfo) u.E0(lazyListLayoutInfo.h())).a() >= f2 || (prefetchHandle = this.f4240c) == null) {
                    return;
                }
                prefetchHandle.b();
                return;
            }
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) u.L0(lazyListLayoutInfo.h());
            if (((lazyListItemInfo.getSize() + lazyListItemInfo.a()) + lazyListLayoutInfo.i()) - lazyListLayoutInfo.e() >= (-f2) || (prefetchHandle2 = this.f4240c) == null) {
                return;
            }
            prefetchHandle2.b();
        }
    }

    @Override // androidx.compose.foundation.lazy.LazyListPrefetchStrategy
    public final void c(LazyListLayoutInfo lazyListLayoutInfo) {
        if (this.f4239b == -1 || !(!lazyListLayoutInfo.h().isEmpty())) {
            return;
        }
        if (this.f4239b != (this.d ? ((LazyListItemInfo) u.L0(lazyListLayoutInfo.h())).getIndex() + 1 : ((LazyListItemInfo) u.E0(lazyListLayoutInfo.h())).getIndex() - 1)) {
            this.f4239b = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.f4240c;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.f4240c = null;
        }
    }
}
