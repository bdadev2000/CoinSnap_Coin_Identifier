package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SnapshotMapEntrySet<K, V> extends SnapshotMapSet<K, V, Map.Entry<K, V>> {
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
        if (!e.s(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return p0.a.g(this.f14586a.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
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
        if (e.s(obj)) {
            return this.f14586a.remove(((Map.Entry) obj).getKey()) != null;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                if (this.f14586a.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                    z2 = true;
                }
            }
            return z2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        PersistentMap persistentMap;
        int i2;
        boolean z2;
        Snapshot k2;
        Collection<Map.Entry> collection2 = collection;
        int g2 = q.g(e0.q.M(collection2, 10));
        if (g2 < 16) {
            g2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g2);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
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
                Map.Entry entry2 = (Map.Entry) ((StateMapMutableEntriesIterator) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !p0.a.g(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    builder.remove(entry2.getKey());
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
