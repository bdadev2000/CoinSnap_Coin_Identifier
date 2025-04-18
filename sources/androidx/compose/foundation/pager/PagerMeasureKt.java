package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes3.dex */
public final class PagerMeasureKt {
    public static final MeasuredPage a(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j2, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j3, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i3) {
        return new MeasuredPage(i2, i3, lazyLayoutMeasureScope.k0(i2, j2), j3, pagerLazyLayoutItemProvider.c(i2), orientation, horizontal, vertical, layoutDirection, z2);
    }
}
