package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class LazyListScrollPosition {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f4388a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f4389b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4390c;
    public Object d;
    public final LazyLayoutNearestRangeState e;

    public LazyListScrollPosition(int i2, int i3) {
        this.f4388a = SnapshotIntStateKt.a(i2);
        this.f4389b = SnapshotIntStateKt.a(i3);
        this.e = new LazyLayoutNearestRangeState(i2, 30, 100);
    }

    public final void a(int i2, int i3) {
        if (i2 >= 0.0f) {
            this.f4388a.b(i2);
            this.e.a(i2);
            this.f4389b.b(i3);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i2 + ')').toString());
        }
    }
}
