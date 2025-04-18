package androidx.room;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.InvalidationTracker;
import java.util.Set;

/* loaded from: classes3.dex */
public final class RoomTrackingLiveData$observer$1 extends InvalidationTracker.Observer {
    @Override // androidx.room.InvalidationTracker.Observer
    public final void a(Set set) {
        p0.a.s(set, "tables");
        ArchTaskExecutor.a();
        throw null;
    }
}
