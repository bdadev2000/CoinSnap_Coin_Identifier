package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class NestedReadonlySnapshot extends Snapshot {
    public final l e;

    /* renamed from: f, reason: collision with root package name */
    public final Snapshot f14551f;

    public NestedReadonlySnapshot(int i2, SnapshotIdSet snapshotIdSet, l lVar, Snapshot snapshot) {
        super(i2, snapshotIdSet);
        this.e = lVar;
        this.f14551f = snapshot;
        snapshot.k();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void c() {
        if (this.f14555c) {
            return;
        }
        int i2 = this.f14554b;
        Snapshot snapshot = this.f14551f;
        if (i2 != snapshot.d()) {
            a();
        }
        snapshot.l();
        super.c();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final l f() {
        return this.e;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final boolean g() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final l i() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void k() {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void l() {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void m() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void n(StateObject stateObject) {
        SnapshotThreadLocal snapshotThreadLocal = SnapshotKt.f14570a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot t(l lVar) {
        return new NestedReadonlySnapshot(this.f14554b, this.f14553a, SnapshotKt.l(lVar, this.e, true), this.f14551f);
    }
}
