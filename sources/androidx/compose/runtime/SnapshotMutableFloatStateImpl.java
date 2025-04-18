package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;

@StabilityInferred
/* loaded from: classes.dex */
public class SnapshotMutableFloatStateImpl extends StateObjectImpl implements MutableFloatState, SnapshotMutableState<Float> {

    /* renamed from: b, reason: collision with root package name */
    public FloatStateStateRecord f14023b;

    /* loaded from: classes.dex */
    public static final class FloatStateStateRecord extends StateRecord {

        /* renamed from: c, reason: collision with root package name */
        public float f14024c;

        public FloatStateStateRecord(float f2) {
            this.f14024c = f2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            p0.a.q(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.f14024c = ((FloatStateStateRecord) stateRecord).f14024c;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new FloatStateStateRecord(this.f14024c);
        }
    }

    @Override // androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.FloatState
    public final float c() {
        return ((FloatStateStateRecord) SnapshotKt.t(this.f14023b, this)).f14024c;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public final SnapshotMutationPolicy f() {
        return StructuralEqualityPolicy.f14078a;
    }

    @Override // androidx.compose.runtime.MutableFloatState
    public final void n(float f2) {
        Snapshot k2;
        FloatStateStateRecord floatStateStateRecord = (FloatStateStateRecord) SnapshotKt.i(this.f14023b);
        if (floatStateStateRecord.f14024c == f2) {
            return;
        }
        FloatStateStateRecord floatStateStateRecord2 = this.f14023b;
        synchronized (SnapshotKt.f14571b) {
            k2 = SnapshotKt.k();
            ((FloatStateStateRecord) SnapshotKt.o(floatStateStateRecord2, this, k2, floatStateStateRecord)).f14024c = f2;
        }
        SnapshotKt.n(k2, this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void p(StateRecord stateRecord) {
        this.f14023b = (FloatStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord q() {
        return this.f14023b;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord r(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        if (((FloatStateStateRecord) stateRecord2).f14024c == ((FloatStateStateRecord) stateRecord3).f14024c) {
            return stateRecord2;
        }
        return null;
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((FloatStateStateRecord) SnapshotKt.i(this.f14023b)).f14024c + ")@" + hashCode();
    }
}
