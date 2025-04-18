package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {

    /* renamed from: o, reason: collision with root package name */
    public final MutableSnapshot f14641o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f14642p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f14643q;

    /* renamed from: r, reason: collision with root package name */
    public l f14644r;

    /* renamed from: s, reason: collision with root package name */
    public l f14645s;

    /* renamed from: t, reason: collision with root package name */
    public final long f14646t;

    public TransparentObserverMutableSnapshot(MutableSnapshot mutableSnapshot, l lVar, l lVar2, boolean z2, boolean z3) {
        super(0, SnapshotIdSet.f14561f, SnapshotKt.l(lVar, (mutableSnapshot == null || (r1 = mutableSnapshot.f()) == null) ? ((GlobalSnapshot) SnapshotKt.f14576i.get()).e : r1, z2), SnapshotKt.b(lVar2, (mutableSnapshot == null || (r1 = mutableSnapshot.i()) == null) ? ((GlobalSnapshot) SnapshotKt.f14576i.get()).f14541f : r1));
        l i2;
        l f2;
        this.f14641o = mutableSnapshot;
        this.f14642p = z2;
        this.f14643q = z3;
        this.f14644r = this.e;
        this.f14645s = this.f14541f;
        this.f14646t = ActualJvm_jvmKt.a();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final void A(MutableScatterSet mutableScatterSet) {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final MutableSnapshot B(l lVar, l lVar2) {
        l l2 = SnapshotKt.l(lVar, this.f14644r, true);
        l b2 = SnapshotKt.b(lVar2, this.f14645s);
        return !this.f14642p ? new TransparentObserverMutableSnapshot(C().B(null, b2), l2, b2, false, true) : C().B(l2, b2);
    }

    public final MutableSnapshot C() {
        MutableSnapshot mutableSnapshot = this.f14641o;
        return mutableSnapshot == null ? (MutableSnapshot) SnapshotKt.f14576i.get() : mutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void c() {
        MutableSnapshot mutableSnapshot;
        this.f14555c = true;
        if (!this.f14643q || (mutableSnapshot = this.f14641o) == null) {
            return;
        }
        mutableSnapshot.c();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final int d() {
        return C().d();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final SnapshotIdSet e() {
        return C().e();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final l f() {
        return this.f14644r;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final boolean g() {
        return C().g();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final int h() {
        return C().h();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final l i() {
        return this.f14645s;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void k() {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void l() {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void m() {
        C().m();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void n(StateObject stateObject) {
        C().n(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void q(int i2) {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void r(SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final void s(int i2) {
        C().s(i2);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public final Snapshot t(l lVar) {
        l l2 = SnapshotKt.l(lVar, this.f14644r, true);
        return !this.f14642p ? SnapshotKt.h(C().t(null), l2, true) : C().t(l2);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final SnapshotApplyResult v() {
        return C().v();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public final MutableScatterSet w() {
        return C().w();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    /* renamed from: x */
    public final l f() {
        return this.f14644r;
    }
}
