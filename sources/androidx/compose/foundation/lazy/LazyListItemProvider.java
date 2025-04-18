package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;

@ExperimentalFoundationApi
/* loaded from: classes4.dex */
public interface LazyListItemProvider extends LazyLayoutItemProvider {
    LazyLayoutKeyIndexMap a();

    LazyItemScopeImpl e();

    void g();
}
