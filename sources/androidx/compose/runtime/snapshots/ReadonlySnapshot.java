package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;

@StabilityInferred
/* loaded from: classes.dex */
public final class ReadonlySnapshot extends Snapshot {
    public final l e;

    /* renamed from: f, reason: collision with root package name */
    public int f14552f;

    public ReadonlySnapshot(int i2, SnapshotIdSet snapshotIdSet, l lVar) {
        super(i2, snapshotIdSet);
        this.e = lVar;
        this.f14552f = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void c() {
        if (this.f14555c) {
            return;
        }
        l();
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
        this.f14552f++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void l() {
        int i2 = this.f14552f - 1;
        this.f14552f = i2;
        if (i2 == 0) {
            a();
        }
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
        SnapshotKt.d(this);
        return new NestedReadonlySnapshot(this.f14554b, this.f14553a, SnapshotKt.l(lVar, this.e, true), this);
    }
}
