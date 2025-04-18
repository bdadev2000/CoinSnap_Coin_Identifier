package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import org.objectweb.asm.Opcodes;
import p0.a;

@StabilityInferred
@ExperimentalFoundationApi
/* loaded from: classes3.dex */
public final class PagerLazyLayoutItemProvider implements LazyLayoutItemProvider {

    /* renamed from: a, reason: collision with root package name */
    public final PagerState f5197a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyLayoutIntervalContent f5198b;

    /* renamed from: c, reason: collision with root package name */
    public final LazyLayoutKeyIndexMap f5199c;

    public PagerLazyLayoutItemProvider(PagerState pagerState, LazyLayoutIntervalContent lazyLayoutIntervalContent, NearestRangeKeyIndexMap nearestRangeKeyIndexMap) {
        this.f5197a = pagerState;
        this.f5198b = lazyLayoutIntervalContent;
        this.f5199c = nearestRangeKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int b(Object obj) {
        return this.f5199c.b(obj);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final Object c(int i2) {
        Object c2 = this.f5199c.c(i2);
        return c2 == null ? this.f5198b.i(i2) : c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagerLazyLayoutItemProvider)) {
            return false;
        }
        return a.g(this.f5198b, ((PagerLazyLayoutItemProvider) obj).f5198b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final int getItemCount() {
        return this.f5198b.h().f4880b;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public final void h(int i2, Object obj, Composer composer, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-1201380429);
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
            LazyLayoutPinnableItemKt.a(obj, i2, this.f5197a.B, ComposableLambdaKt.c(1142237095, new PagerLazyLayoutItemProvider$Item$1(this, i2), g2), g2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new PagerLazyLayoutItemProvider$Item$2(this, i2, obj, i3);
        }
    }

    public final int hashCode() {
        return this.f5198b.hashCode();
    }
}
