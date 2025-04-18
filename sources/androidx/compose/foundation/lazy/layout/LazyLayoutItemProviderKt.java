package androidx.compose.foundation.lazy.layout;

import p0.a;

/* loaded from: classes4.dex */
public final class LazyLayoutItemProviderKt {
    public static final int a(int i2, LazyLayoutItemProvider lazyLayoutItemProvider, Object obj) {
        int b2;
        return (obj == null || lazyLayoutItemProvider.getItemCount() == 0 || (i2 < lazyLayoutItemProvider.getItemCount() && a.g(obj, lazyLayoutItemProvider.c(i2))) || (b2 = lazyLayoutItemProvider.b(obj)) == -1) ? i2 : b2;
    }
}
