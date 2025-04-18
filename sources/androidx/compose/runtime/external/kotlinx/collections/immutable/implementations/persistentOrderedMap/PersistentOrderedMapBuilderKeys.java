package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import e0.k;
import java.util.Iterator;
import java.util.Set;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PersistentOrderedMapBuilderKeys<K, V> extends k implements Set<K> {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentOrderedMapBuilder f14252a;

    public PersistentOrderedMapBuilderKeys(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f14252a = persistentOrderedMapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // e0.k
    public final int b() {
        return this.f14252a.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f14252a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14252a.d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentOrderedMapBuilderKeysIterator(this.f14252a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = this.f14252a;
        if (!persistentOrderedMapBuilder.d.containsKey(obj)) {
            return false;
        }
        persistentOrderedMapBuilder.remove(obj);
        return true;
    }
}
