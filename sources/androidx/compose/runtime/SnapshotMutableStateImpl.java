package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;

@StabilityInferred
/* loaded from: classes2.dex */
public class SnapshotMutableStateImpl<T> extends StateObjectImpl implements SnapshotMutableState<T> {

    /* renamed from: b, reason: collision with root package name */
    public final SnapshotMutationPolicy f14029b;

    /* renamed from: c, reason: collision with root package name */
    public StateStateRecord f14030c;

    /* loaded from: classes2.dex */
    public static final class StateStateRecord<T> extends StateRecord {

        /* renamed from: c, reason: collision with root package name */
        public Object f14031c;

        public StateStateRecord(Object obj) {
            this.f14031c = obj;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            p0.a.q(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f14031c = ((StateStateRecord) stateRecord).f14031c;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new StateStateRecord(this.f14031c);
        }
    }

    public SnapshotMutableStateImpl(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        this.f14029b = snapshotMutationPolicy;
        StateStateRecord stateStateRecord = new StateStateRecord(obj);
        if (Snapshot.Companion.b()) {
            StateStateRecord stateStateRecord2 = new StateStateRecord(obj);
            stateStateRecord2.f14634a = 1;
            stateStateRecord.f14635b = stateStateRecord2;
        }
        this.f14030c = stateStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public final SnapshotMutationPolicy f() {
        return this.f14029b;
    }

    @Override // androidx.compose.runtime.State
    public final Object getValue() {
        return ((StateStateRecord) SnapshotKt.t(this.f14030c, this)).f14031c;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void p(StateRecord stateRecord) {
        this.f14030c = (StateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord q() {
        return this.f14030c;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord r(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        if (this.f14029b.a(((StateStateRecord) stateRecord2).f14031c, ((StateStateRecord) stateRecord3).f14031c)) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.MutableState
    public final void setValue(Object obj) {
        Snapshot k2;
        StateStateRecord stateStateRecord = (StateStateRecord) SnapshotKt.i(this.f14030c);
        if (this.f14029b.a(stateStateRecord.f14031c, obj)) {
            return;
        }
        StateStateRecord stateStateRecord2 = this.f14030c;
        synchronized (SnapshotKt.f14571b) {
            k2 = SnapshotKt.k();
            ((StateStateRecord) SnapshotKt.o(stateStateRecord2, this, k2, stateStateRecord)).f14031c = obj;
        }
        SnapshotKt.n(k2, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((StateStateRecord) SnapshotKt.i(this.f14030c)).f14031c + ")@" + hashCode();
    }
}
