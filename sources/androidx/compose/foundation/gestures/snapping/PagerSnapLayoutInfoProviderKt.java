package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.geometry.Offset;

/* loaded from: classes4.dex */
public final class PagerSnapLayoutInfoProviderKt {
    public static final float a(PagerState pagerState) {
        return pagerState.l().c() == Orientation.f3395b ? Offset.g(pagerState.p()) : Offset.h(pagerState.p());
    }

    public static final boolean b(PagerState pagerState) {
        boolean f2 = pagerState.l().f();
        return (a(pagerState) > 0.0f && f2) || (a(pagerState) <= 0.0f && !f2);
    }
}
