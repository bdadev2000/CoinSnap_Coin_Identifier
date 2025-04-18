package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;

@StabilityInferred
/* loaded from: classes3.dex */
public class SnapshotMutableIntStateImpl extends StateObjectImpl implements MutableIntState, SnapshotMutableState<Integer> {

    /* renamed from: b, reason: collision with root package name */
    public IntStateStateRecord f14025b;

    /* loaded from: classes3.dex */
    public static final class IntStateStateRecord extends StateRecord {

        /* renamed from: c, reason: collision with root package name */
        public int f14026c;

        public IntStateStateRecord(int i2) {
            this.f14026c = i2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            p0.a.q(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.f14026c = ((IntStateStateRecord) stateRecord).f14026c;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new IntStateStateRecord(this.f14026c);
        }
    }

    @Override // androidx.compose.runtime.MutableIntState
    public final void b(int i2) {
        Snapshot k2;
        IntStateStateRecord intStateStateRecord = (IntStateStateRecord) SnapshotKt.i(this.f14025b);
        if (intStateStateRecord.f14026c != i2) {
            IntStateStateRecord intStateStateRecord2 = this.f14025b;
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                ((IntStateStateRecord) SnapshotKt.o(intStateStateRecord2, this, k2, intStateStateRecord)).f14026c = i2;
            }
            SnapshotKt.n(k2, this);
        }
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public final SnapshotMutationPolicy f() {
        return StructuralEqualityPolicy.f14078a;
    }

    @Override // androidx.compose.runtime.MutableIntState, androidx.compose.runtime.IntState
    public final int g() {
        return ((IntStateStateRecord) SnapshotKt.t(this.f14025b, this)).f14026c;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void p(StateRecord stateRecord) {
        this.f14025b = (IntStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord q() {
        return this.f14025b;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord r(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        if (((IntStateStateRecord) stateRecord2).f14026c == ((IntStateStateRecord) stateRecord3).f14026c) {
            return stateRecord2;
        }
        return null;
    }

    public final String toString() {
        return "MutableIntState(value=" + ((IntStateStateRecord) SnapshotKt.i(this.f14025b)).f14026c + ")@" + hashCode();
    }
}
