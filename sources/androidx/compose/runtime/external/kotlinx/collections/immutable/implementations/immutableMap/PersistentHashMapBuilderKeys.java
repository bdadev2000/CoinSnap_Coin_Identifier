package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import e0.k;
import java.util.Iterator;
import java.util.Set;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PersistentHashMapBuilderKeys<K, V> extends k implements Set<K> {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentHashMapBuilder f14210a;

    public PersistentHashMapBuilderKeys(PersistentHashMapBuilder persistentHashMapBuilder) {
        this.f14210a = persistentHashMapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // e0.k
    public final int b() {
        return this.f14210a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f14210a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14210a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i2 = 0; i2 < 8; i2++) {
            trieNodeBaseIteratorArr[i2] = new TrieNodeBaseIterator();
        }
        return new PersistentHashMapBuilderBaseIterator(this.f14210a, trieNodeBaseIteratorArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        PersistentHashMapBuilder persistentHashMapBuilder = this.f14210a;
        if (!persistentHashMapBuilder.containsKey(obj)) {
            return false;
        }
        persistentHashMapBuilder.remove(obj);
        return true;
    }
}
