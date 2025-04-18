package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;

@ExperimentalFoundationApi
/* loaded from: classes4.dex */
public interface LazyListPrefetchStrategy {
    void a(NestedPrefetchScope nestedPrefetchScope, int i2);

    void b(LazyListState$prefetchScope$1 lazyListState$prefetchScope$1, float f2, LazyListLayoutInfo lazyListLayoutInfo);

    void c(LazyListLayoutInfo lazyListLayoutInfo);
}
