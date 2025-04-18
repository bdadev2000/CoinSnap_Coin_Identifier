package androidx.compose.foundation.lazy;

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
/* loaded from: classes4.dex */
public final class LazyListItemProviderImpl implements LazyListItemProvider {

    /* renamed from: a, reason: collision with root package name */
    public final LazyListState f4293a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyListIntervalContent f4294b;

    /* renamed from: c, reason: collision with root package name */
    public final LazyItemScopeImpl f4295c;
    public final LazyLayoutKeyIndexMap d;

    public LazyListItemProviderImpl(LazyListState lazyListState, LazyListIntervalContent lazyListIntervalContent, LazyItemScopeImpl lazyItemScopeImpl, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.f4293a = lazyListState;
        this.f4294b = lazyListIntervalContent;
        this.f4295c = lazyItemScopeImpl;
        this.d = nearestRangeKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public final LazyLayoutKeyIndexMap a() {
        return this.d;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int b(Object obj) {
        return this.d.b(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object c(int i2) {
        Object c2 = this.d.c(i2);
        return c2 == null ? this.f4294b.i(i2) : c2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object d(int i2) {
        return this.f4294b.g(i2);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public final LazyItemScopeImpl e() {
        return this.f4295c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyListItemProviderImpl)) {
            return false;
        }
        return a.g(this.f4294b, ((LazyListItemProviderImpl) obj).f4294b);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public final void g() {
        this.f4294b.getClass();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getItemCount() {
        return this.f4294b.h().f4880b;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void h(int i2, Object obj, Composer composer, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-462424778);
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
            LazyLayoutPinnableItemKt.a(obj, i2, this.f4293a.f4406r, ComposableLambdaKt.c(-824725566, new LazyListItemProviderImpl$Item$1(this, i2), g2), g2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LazyListItemProviderImpl$Item$2(this, i2, obj, i3);
        }
    }

    public final int hashCode() {
        return this.f4294b.hashCode();
    }
}
