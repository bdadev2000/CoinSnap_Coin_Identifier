package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LazyGridScrollPosition {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f4585a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f4586b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4587c;
    public Object d;
    public final LazyLayoutNearestRangeState e;

    public LazyGridScrollPosition(int i2, int i3) {
        this.f4585a = SnapshotIntStateKt.a(i2);
        this.f4586b = SnapshotIntStateKt.a(i3);
        this.e = new LazyLayoutNearestRangeState(i2, 90, 200);
    }

    public final void a(int i2, int i3) {
        if (i2 >= 0.0f) {
            this.f4585a.b(i2);
            this.e.a(i2);
            this.f4586b.b(i3);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i2 + ')').toString());
        }
    }
}
