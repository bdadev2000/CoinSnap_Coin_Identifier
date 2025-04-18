package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import org.objectweb.asm.Opcodes;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LazyStaggeredGridItemProviderImpl implements LazyStaggeredGridItemProvider {

    /* renamed from: a, reason: collision with root package name */
    public final LazyStaggeredGridState f4939a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyStaggeredGridIntervalContent f4940b;

    /* renamed from: c, reason: collision with root package name */
    public final LazyLayoutKeyIndexMap f4941c;

    public LazyStaggeredGridItemProviderImpl(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridIntervalContent lazyStaggeredGridIntervalContent, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.f4939a = lazyStaggeredGridState;
        this.f4940b = lazyStaggeredGridIntervalContent;
        this.f4941c = nearestRangeKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
    public final LazyLayoutKeyIndexMap a() {
        return this.f4941c;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int b(Object obj) {
        return this.f4941c.b(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object c(int i2) {
        Object c2 = this.f4941c.c(i2);
        return c2 == null ? this.f4940b.i(i2) : c2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object d(int i2) {
        return this.f4940b.g(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyStaggeredGridItemProviderImpl)) {
            return false;
        }
        return a.g(this.f4940b, ((LazyStaggeredGridItemProviderImpl) obj).f4940b);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider
    public final LazyStaggeredGridSpanProvider f() {
        return this.f4940b.f4938b;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getItemCount() {
        return this.f4940b.h().f4880b;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void h(int i2, Object obj, Composer composer, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(89098518);
        if ((i3 & 6) == 0) {
            i4 = (g2.c(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= g2.w(obj) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= g2.I(this) ? 256 : 128;
        }
        if ((i4 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            LazyLayoutPinnableItemKt.a(obj, i2, this.f4939a.f5063q, ComposableLambdaKt.c(608834466, new LazyStaggeredGridItemProviderImpl$Item$1(this, i2), g2), g2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LazyStaggeredGridItemProviderImpl$Item$2(this, i2, obj, i3);
        }
    }

    public final int hashCode() {
        return this.f4940b.hashCode();
    }
}
