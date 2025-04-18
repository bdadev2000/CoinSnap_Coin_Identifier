package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.l;
import java.util.Iterator;
import java.util.Map;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PersistentOrderedMapEntries<K, V> extends l implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentOrderedMap f14261a;

    public PersistentOrderedMapEntries(PersistentOrderedMap persistentOrderedMap) {
        this.f14261a = persistentOrderedMap;
    }

    @Override // e0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object key = entry.getKey();
        PersistentOrderedMap persistentOrderedMap = this.f14261a;
        Object obj2 = persistentOrderedMap.get(key);
        if (obj2 != null) {
            return a.g(obj2, entry.getValue());
        }
        if (entry.getValue() == null) {
            return persistentOrderedMap.f14246c.containsKey(entry.getKey());
        }
        return false;
    }

    @Override // e0.a
    public final int getSize() {
        return this.f14261a.e();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentOrderedMapEntriesIterator(this.f14261a);
    }
}
