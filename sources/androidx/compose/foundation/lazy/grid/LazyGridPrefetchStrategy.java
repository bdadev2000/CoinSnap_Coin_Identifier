package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;

@ExperimentalFoundationApi
/* loaded from: classes2.dex */
public interface LazyGridPrefetchStrategy {
    void a(NestedPrefetchScope nestedPrefetchScope, int i2);

    void b(LazyGridLayoutInfo lazyGridLayoutInfo);

    void c(LazyGridState$prefetchScope$1 lazyGridState$prefetchScope$1, float f2, LazyGridLayoutInfo lazyGridLayoutInfo);
}
