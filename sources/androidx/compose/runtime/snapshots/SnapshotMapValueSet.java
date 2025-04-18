package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import e0.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SnapshotMapValueSet<K, V> extends SnapshotMapSet<K, V, V> {
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        SnapshotStateMapKt.a();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14586a.containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f14586a.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, androidx.compose.runtime.snapshots.StateMapMutableIterator] */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        SnapshotStateMap snapshotStateMap = this.f14586a;
        return new StateMapMutableIterator(snapshotStateMap, ((ImmutableSet) snapshotStateMap.b().f14596c.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        SnapshotStateMap snapshotStateMap = this.f14586a;
        Iterator it = ((SnapshotMapEntrySet) snapshotStateMap.f14594b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (p0.a.g(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return false;
        }
        snapshotStateMap.remove(entry.getKey());
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        PersistentMap persistentMap;
        int i2;
        boolean z2;
        Snapshot k2;
        Set e12 = u.e1(collection);
        SnapshotStateMap snapshotStateMap = this.f14586a;
        boolean z3 = false;
        do {
            synchronized (SnapshotStateMapKt.f14597a) {
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = snapshotStateMap.f14593a;
                p0.a.q(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.i(stateMapStateRecord);
                persistentMap = stateMapStateRecord2.f14596c;
                i2 = stateMapStateRecord2.d;
            }
            p0.a.p(persistentMap);
            PersistentMap.Builder builder = persistentMap.builder();
            Object it = ((SnapshotMapEntrySet) snapshotStateMap.f14594b).iterator();
            while (true) {
                z2 = true;
                if (!((StateMapMutableIterator) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((StateMapMutableEntriesIterator) it).next();
                if (e12.contains(entry.getValue())) {
                    builder.remove(entry.getKey());
                    z3 = true;
                }
            }
            PersistentMap build = builder.build();
            if (p0.a.g(build, persistentMap)) {
                break;
            }
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = snapshotStateMap.f14593a;
            p0.a.q(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord4 = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.w(stateMapStateRecord3, snapshotStateMap, k2);
                synchronized (SnapshotStateMapKt.f14597a) {
                    int i3 = stateMapStateRecord4.d;
                    if (i3 == i2) {
                        stateMapStateRecord4.f14596c = build;
                        stateMapStateRecord4.d = i3 + 1;
                    } else {
                        z2 = false;
                    }
                }
            }
            SnapshotKt.n(k2, snapshotStateMap);
        } while (!z2);
        return z3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        PersistentMap persistentMap;
        int i2;
        boolean z2;
        Snapshot k2;
        Set e12 = u.e1(collection);
        SnapshotStateMap snapshotStateMap = this.f14586a;
        boolean z3 = false;
        do {
            synchronized (SnapshotStateMapKt.f14597a) {
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = snapshotStateMap.f14593a;
                p0.a.q(stateMapStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.i(stateMapStateRecord);
                persistentMap = stateMapStateRecord2.f14596c;
                i2 = stateMapStateRecord2.d;
            }
            p0.a.p(persistentMap);
            PersistentMap.Builder builder = persistentMap.builder();
            Object it = ((SnapshotMapEntrySet) snapshotStateMap.f14594b).iterator();
            while (true) {
                z2 = true;
                if (!((StateMapMutableIterator) it).hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) ((StateMapMutableEntriesIterator) it).next();
                if (!e12.contains(entry.getValue())) {
                    builder.remove(entry.getKey());
                    z3 = true;
                }
            }
            PersistentMap build = builder.build();
            if (p0.a.g(build, persistentMap)) {
                break;
            }
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = snapshotStateMap.f14593a;
            p0.a.q(stateMapStateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (SnapshotKt.f14571b) {
                k2 = SnapshotKt.k();
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord4 = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.w(stateMapStateRecord3, snapshotStateMap, k2);
                synchronized (SnapshotStateMapKt.f14597a) {
                    int i3 = stateMapStateRecord4.d;
                    if (i3 == i2) {
                        stateMapStateRecord4.f14596c = build;
                        stateMapStateRecord4.d = i3 + 1;
                    } else {
                        z2 = false;
                    }
                }
            }
            SnapshotKt.n(k2, snapshotStateMap);
        } while (!z2);
        return z3;
    }
}
