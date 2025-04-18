package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class TransparentObserverSnapshot extends Snapshot {
    public final Snapshot e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14647f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14648g;

    /* renamed from: h, reason: collision with root package name */
    public l f14649h;

    /* renamed from: i, reason: collision with root package name */
    public final long f14650i;

    public TransparentObserverSnapshot(Snapshot snapshot, l lVar, boolean z2) {
        super(0, SnapshotIdSet.f14561f);
        l f2;
        this.e = snapshot;
        this.f14647f = false;
        this.f14648g = z2;
        this.f14649h = SnapshotKt.l(lVar, (snapshot == null || (f2 = snapshot.f()) == null) ? ((GlobalSnapshot) SnapshotKt.f14576i.get()).e : f2, false);
        this.f14650i = ActualJvm_jvmKt.a();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void c() {
        Snapshot snapshot;
        this.f14555c = true;
        if (!this.f14648g || (snapshot = this.e) == null) {
            return;
        }
        snapshot.c();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final int d() {
        return u().d();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final SnapshotIdSet e() {
        return u().e();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final l f() {
        return this.f14649h;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final boolean g() {
        return u().g();
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
        u().m();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void n(StateObject stateObject) {
        u().n(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot t(l lVar) {
        l l2 = SnapshotKt.l(lVar, this.f14649h, true);
        return !this.f14647f ? SnapshotKt.h(u().t(null), l2, true) : u().t(l2);
    }

    public final Snapshot u() {
        Snapshot snapshot = this.e;
        return snapshot == null ? (Snapshot) SnapshotKt.f14576i.get() : snapshot;
    }
}
