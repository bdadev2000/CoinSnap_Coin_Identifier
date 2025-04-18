package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;

@StabilityInferred
/* loaded from: classes4.dex */
public final class UndoManager<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f6883a;

    /* renamed from: b, reason: collision with root package name */
    public final SnapshotStateList f6884b;

    /* renamed from: c, reason: collision with root package name */
    public final SnapshotStateList f6885c;

    /* loaded from: classes4.dex */
    public static final class Companion {
    }

    public UndoManager(List list, List list2, int i2) {
        this.f6883a = i2;
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(list);
        this.f6884b = snapshotStateList;
        SnapshotStateList snapshotStateList2 = new SnapshotStateList();
        snapshotStateList2.addAll(list2);
        this.f6885c = snapshotStateList2;
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive integer".toString());
        }
        if (this.f6885c.size() + this.f6884b.size() <= i2) {
            return;
        }
        throw new IllegalArgumentException(("Initial list of undo and redo operations have a size=(" + (this.f6885c.size() + this.f6884b.size()) + ") greater than the given capacity=(" + i2 + ").").toString());
    }
}
