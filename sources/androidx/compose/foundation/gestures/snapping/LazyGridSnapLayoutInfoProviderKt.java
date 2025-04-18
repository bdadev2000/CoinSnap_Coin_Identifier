package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;

/* loaded from: classes4.dex */
public final class LazyGridSnapLayoutInfoProviderKt {
    public static final int a(LazyGridItemInfo lazyGridItemInfo, Orientation orientation) {
        return (int) (orientation == Orientation.f3394a ? lazyGridItemInfo.c() & 4294967295L : lazyGridItemInfo.c() >> 32);
    }
}
