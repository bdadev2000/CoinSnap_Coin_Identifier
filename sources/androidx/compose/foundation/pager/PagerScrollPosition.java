package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PagerScrollPosition {

    /* renamed from: a, reason: collision with root package name */
    public final PagerState f5258a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f5259b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableFloatState f5260c;
    public boolean d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public final LazyLayoutNearestRangeState f5261f;

    public PagerScrollPosition(int i2, float f2, PagerState pagerState) {
        this.f5258a = pagerState;
        this.f5259b = SnapshotIntStateKt.a(i2);
        this.f5260c = PrimitiveSnapshotStateKt.a(f2);
        this.f5261f = new LazyLayoutNearestRangeState(i2, 30, 100);
    }
}
