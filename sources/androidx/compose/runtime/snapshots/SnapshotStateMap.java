package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import r0.e;

@Stable
/* loaded from: classes.dex */
public final class SnapshotStateMap<K, V> implements StateObject, Map<K, V>, e {

    /* renamed from: a, reason: collision with root package name */
    public StateMapStateRecord f14593a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f14594b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f14595c;
    public final Collection d;

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class StateMapStateRecord<K, V> extends StateRecord {

        /* renamed from: c, reason: collision with root package name */
        public PersistentMap f14596c;
        public int d;

        public StateMapStateRecord(PersistentMap persistentMap) {
            this.f14596c = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final void a(StateRecord stateRecord) {
            p0.a.q(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) stateRecord;
            synchronized (SnapshotStateMapKt.f14597a) {
                this.f14596c = stateMapStateRecord.f14596c;
                this.d = stateMapStateRecord.d;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public final StateRecord b() {
            return new StateMapStateRecord(this.f14596c);
        }
    }

    public SnapshotStateMap() {
        PersistentHashMap persistentHashMap = PersistentHashMap.f14194c;
        StateMapStateRecord stateMapStateRecord = new StateMapStateRecord(persistentHashMap);
        if (Snapshot.Companion.b()) {
            StateMapStateRecord stateMapStateRecord2 = new StateMapStateRecord(persistentHashMap);
            stateMapStateRecord2.f14634a = 1;
            stateMapStateRecord.f14635b = stateMapStateRecord2;
        }
        this.f14593a = stateMapStateRecord;
        this.f14594b = new SnapshotMapSet(this);
        this.f14595c = new SnapshotMapSet(this);
        this.d = new SnapshotMapSet(this);
    }

    public final StateMapStateRecord b() {
        StateMapStateRecord stateMapStateRecord = this.f14593a;
        p0.a.q(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord) SnapshotKt.t(stateMapStateRecord, this);
    }

    @Override // java.util.Map
    public final void clear() {
        Snapshot k2;
        StateMapStateRecord stateMapStateRecord = this.f14593a;
        p0.a.q(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.i(stateMapStateRecord);
        PersistentHashMap persistentHashMap = PersistentHashMap.f14194c;
        if (persistentHashMap != stateMapStateRecord2.f14596c) {
            StateMapStateRecord stateMapStateRecord3 = this.f14593a;
            p0.a.q(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.w(stateMapStateRecord3, this, k2);
                synchronized (SnapshotStateMapKt.f14597a) {
                    stateMapStateRecord4.f14596c = persistentHashMap;
                    stateMapStateRecord4.d++;
                }
            }
            SnapshotKt.n(k2, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return b().f14596c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return b().f14596c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f14594b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return b().f14596c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return b().f14596c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f14595c;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void p(StateRecord stateRecord) {
        this.f14593a = (StateMapStateRecord) stateRecord;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        PersistentMap persistentMap;
        int i2;
        V put;
        Snapshot k2;
        boolean z2;
        do {
            Object obj3 = SnapshotStateMapKt.f14597a;
            synchronized (obj3) {
                StateMapStateRecord stateMapStateRecord = this.f14593a;
                p0.a.q(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.i(stateMapStateRecord);
                persistentMap = stateMapStateRecord2.f14596c;
                i2 = stateMapStateRecord2.d;
            }
            p0.a.p(persistentMap);
            PersistentMap.Builder builder = persistentMap.builder();
            put = builder.put(obj, obj2);
            PersistentMap build = builder.build();
            if (p0.a.g(build, persistentMap)) {
                break;
            }
            StateMapStateRecord stateMapStateRecord3 = this.f14593a;
            p0.a.q(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.w(stateMapStateRecord3, this, k2);
                synchronized (obj3) {
                    int i3 = stateMapStateRecord4.d;
                    if (i3 == i2) {
                        stateMapStateRecord4.f14596c = build;
                        stateMapStateRecord4.d = i3 + 1;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            SnapshotKt.n(k2, this);
        } while (!z2);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        PersistentMap persistentMap;
        int i2;
        Snapshot k2;
        boolean z2;
        do {
            Object obj = SnapshotStateMapKt.f14597a;
            synchronized (obj) {
                StateMapStateRecord stateMapStateRecord = this.f14593a;
                p0.a.q(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.i(stateMapStateRecord);
                persistentMap = stateMapStateRecord2.f14596c;
                i2 = stateMapStateRecord2.d;
            }
            p0.a.p(persistentMap);
            PersistentMap.Builder builder = persistentMap.builder();
            builder.putAll(map);
            PersistentMap build = builder.build();
            if (p0.a.g(build, persistentMap)) {
                return;
            }
            StateMapStateRecord stateMapStateRecord3 = this.f14593a;
            p0.a.q(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.w(stateMapStateRecord3, this, k2);
                synchronized (obj) {
                    int i3 = stateMapStateRecord4.d;
                    if (i3 == i2) {
                        stateMapStateRecord4.f14596c = build;
                        stateMapStateRecord4.d = i3 + 1;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            SnapshotKt.n(k2, this);
        } while (!z2);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord q() {
        return this.f14593a;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        PersistentMap persistentMap;
        int i2;
        V remove;
        Snapshot k2;
        boolean z2;
        do {
            Object obj2 = SnapshotStateMapKt.f14597a;
            synchronized (obj2) {
                StateMapStateRecord stateMapStateRecord = this.f14593a;
                p0.a.q(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) SnapshotKt.i(stateMapStateRecord);
                persistentMap = stateMapStateRecord2.f14596c;
                i2 = stateMapStateRecord2.d;
            }
            p0.a.p(persistentMap);
            PersistentMap.Builder builder = persistentMap.builder();
            remove = builder.remove(obj);
            PersistentMap build = builder.build();
            if (p0.a.g(build, persistentMap)) {
                break;
            }
            StateMapStateRecord stateMapStateRecord3 = this.f14593a;
            p0.a.q(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                StateMapStateRecord stateMapStateRecord4 = (StateMapStateRecord) SnapshotKt.w(stateMapStateRecord3, this, k2);
                synchronized (obj2) {
                    int i3 = stateMapStateRecord4.d;
                    if (i3 == i2) {
                        stateMapStateRecord4.f14596c = build;
                        stateMapStateRecord4.d = i3 + 1;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
            SnapshotKt.n(k2, this);
        } while (!z2);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        return b().f14596c.size();
    }

    public final String toString() {
        StateMapStateRecord stateMapStateRecord = this.f14593a;
        p0.a.q(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((StateMapStateRecord) SnapshotKt.i(stateMapStateRecord)).f14596c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d;
    }
}
