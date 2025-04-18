package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
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
@ExperimentalFoundationApi
/* loaded from: classes2.dex */
public final class LazyGridItemProviderImpl implements LazyGridItemProvider {

    /* renamed from: a, reason: collision with root package name */
    public final LazyGridState f4487a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyGridIntervalContent f4488b;

    /* renamed from: c, reason: collision with root package name */
    public final LazyLayoutKeyIndexMap f4489c;

    public LazyGridItemProviderImpl(LazyGridState lazyGridState, LazyGridIntervalContent lazyGridIntervalContent, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.f4487a = lazyGridState;
        this.f4488b = lazyGridIntervalContent;
        this.f4489c = nearestRangeKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public final LazyLayoutKeyIndexMap a() {
        return this.f4489c;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int b(Object obj) {
        return this.f4489c.b(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object c(int i2) {
        Object c2 = this.f4489c.c(i2);
        return c2 == null ? this.f4488b.i(i2) : c2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object d(int i2) {
        return this.f4488b.g(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyGridItemProviderImpl)) {
            return false;
        }
        return a.g(this.f4488b, ((LazyGridItemProviderImpl) obj).f4488b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getItemCount() {
        return this.f4488b.h().f4880b;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void h(int i2, Object obj, Composer composer, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(1493551140);
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
            LazyLayoutPinnableItemKt.a(obj, i2, this.f4487a.f4616o, ComposableLambdaKt.c(726189336, new LazyGridItemProviderImpl$Item$1(this, i2), g2), g2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LazyGridItemProviderImpl$Item$2(this, i2, obj, i3);
        }
    }

    public final int hashCode() {
        return this.f4488b.hashCode();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemProvider
    public final LazyGridSpanLayoutProvider i() {
        return this.f4488b.f4483a;
    }
}
