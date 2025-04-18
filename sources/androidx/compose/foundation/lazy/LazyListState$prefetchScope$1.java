package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.runtime.snapshots.Snapshot;
import q0.l;

/* loaded from: classes4.dex */
public final class LazyListState$prefetchScope$1 implements LazyListPrefetchScope {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LazyListState f4413a;

    public LazyListState$prefetchScope$1(LazyListState lazyListState) {
        this.f4413a = lazyListState;
    }

    public final LazyLayoutPrefetchState.PrefetchHandle a(int i2) {
        LazyListState lazyListState = this.f4413a;
        Snapshot a2 = Snapshot.Companion.a();
        l f2 = a2 != null ? a2.f() : null;
        Snapshot c2 = Snapshot.Companion.c(a2);
        try {
            long j2 = ((LazyListMeasureResult) lazyListState.f4394f.getValue()).f4354i;
            Snapshot.Companion.f(a2, c2, f2);
            return lazyListState.f4404p.a(i2, j2);
        } catch (Throwable th) {
            Snapshot.Companion.f(a2, c2, f2);
            throw th;
        }
    }
}
