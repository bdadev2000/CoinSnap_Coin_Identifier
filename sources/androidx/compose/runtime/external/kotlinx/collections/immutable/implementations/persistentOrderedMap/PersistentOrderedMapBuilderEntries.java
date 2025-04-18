package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PersistentOrderedMapBuilderEntries<K, V> extends AbstractMapBuilderEntries<Map.Entry<K, V>, K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentOrderedMapBuilder f14250a;

    public PersistentOrderedMapBuilderEntries(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f14250a = persistentOrderedMapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // e0.k
    public final int b() {
        return this.f14250a.d();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries
    public final boolean c(Map.Entry entry) {
        Object key = entry.getKey();
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = this.f14250a;
        Object obj = persistentOrderedMapBuilder.get(key);
        if (obj != null) {
            return a.g(obj, entry.getValue());
        }
        if (entry.getValue() == null) {
            if (persistentOrderedMapBuilder.d.containsKey(entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f14250a.clear();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.AbstractMapBuilderEntries
    public final boolean d(Map.Entry entry) {
        return this.f14250a.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentOrderedMapBuilderEntriesIterator(this.f14250a);
    }
}
