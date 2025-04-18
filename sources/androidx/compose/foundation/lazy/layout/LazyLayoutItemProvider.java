package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;

@Stable
@ExperimentalFoundationApi
/* loaded from: classes4.dex */
public interface LazyLayoutItemProvider {
    default int b(Object obj) {
        return -1;
    }

    default Object c(int i2) {
        return new DefaultLazyKey(i2);
    }

    default Object d(int i2) {
        return null;
    }

    int getItemCount();

    void h(int i2, Object obj, Composer composer, int i3);
}
