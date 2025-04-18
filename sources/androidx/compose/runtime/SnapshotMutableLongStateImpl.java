package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;

@StabilityInferred
/* loaded from: classes3.dex */
public class SnapshotMutableLongStateImpl extends StateObjectImpl implements MutableLongState, SnapshotMutableState<Long> {

    /* renamed from: b, reason: collision with root package name */
    public LongStateStateRecord f14027b;

    /* loaded from: classes3.dex */
    public static final class LongStateStateRecord extends StateRecord {

        /* renamed from: c, reason: collision with root package name */
        public long f14028c;

        public LongStateStateRecord(long j2) {
            this.f14028c = j2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            p0.a.q(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f14028c = ((LongStateStateRecord) stateRecord).f14028c;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new LongStateStateRecord(this.f14028c);
        }
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState
    public final long d() {
        return ((LongStateStateRecord) SnapshotKt.t(this.f14027b, this)).f14028c;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public final SnapshotMutationPolicy f() {
        return StructuralEqualityPolicy.f14078a;
    }

    @Override // androidx.compose.runtime.MutableLongState
    public final void o(long j2) {
        Snapshot k2;
        LongStateStateRecord longStateStateRecord = (LongStateStateRecord) SnapshotKt.i(this.f14027b);
        if (longStateStateRecord.f14028c != j2) {
            LongStateStateRecord longStateStateRecord2 = this.f14027b;
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                ((LongStateStateRecord) SnapshotKt.o(longStateStateRecord2, this, k2, longStateStateRecord)).f14028c = j2;
            }
            SnapshotKt.n(k2, this);
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void p(StateRecord stateRecord) {
        this.f14027b = (LongStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord q() {
        return this.f14027b;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord r(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        if (((LongStateStateRecord) stateRecord2).f14028c == ((LongStateStateRecord) stateRecord3).f14028c) {
            return stateRecord2;
        }
        return null;
    }

    public final String toString() {
        return "MutableLongState(value=" + ((LongStateStateRecord) SnapshotKt.i(this.f14027b)).f14028c + ")@" + hashCode();
    }
}
