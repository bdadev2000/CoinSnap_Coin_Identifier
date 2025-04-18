package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;

@StabilityInferred
/* loaded from: classes2.dex */
public class SnapshotMutableDoubleStateImpl extends StateObjectImpl implements MutableDoubleState, SnapshotMutableState<Double> {

    /* renamed from: b, reason: collision with root package name */
    public DoubleStateStateRecord f14021b;

    /* loaded from: classes2.dex */
    public static final class DoubleStateStateRecord extends StateRecord {

        /* renamed from: c, reason: collision with root package name */
        public double f14022c;

        public DoubleStateStateRecord(double d) {
            this.f14022c = d;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            p0.a.q(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.f14022c = ((DoubleStateStateRecord) stateRecord).f14022c;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new DoubleStateStateRecord(this.f14022c);
        }
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState
    public final double e() {
        return ((DoubleStateStateRecord) SnapshotKt.t(this.f14021b, this)).f14022c;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public final SnapshotMutationPolicy f() {
        return StructuralEqualityPolicy.f14078a;
    }

    @Override // androidx.compose.runtime.MutableDoubleState
    public final void m(double d) {
        Snapshot k2;
        DoubleStateStateRecord doubleStateStateRecord = (DoubleStateStateRecord) SnapshotKt.i(this.f14021b);
        if (doubleStateStateRecord.f14022c == d) {
            return;
        }
        DoubleStateStateRecord doubleStateStateRecord2 = this.f14021b;
        synchronized (SnapshotKt.f14571b) {
            k2 = SnapshotKt.k();
            ((DoubleStateStateRecord) SnapshotKt.o(doubleStateStateRecord2, this, k2, doubleStateStateRecord)).f14022c = d;
        }
        SnapshotKt.n(k2, this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void p(StateRecord stateRecord) {
        this.f14021b = (DoubleStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord q() {
        return this.f14021b;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord r(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        if (((DoubleStateStateRecord) stateRecord2).f14022c == ((DoubleStateStateRecord) stateRecord3).f14022c) {
            return stateRecord2;
        }
        return null;
    }

    public final String toString() {
        return "MutableDoubleState(value=" + ((DoubleStateStateRecord) SnapshotKt.i(this.f14021b)).f14022c + ")@" + hashCode();
    }
}
