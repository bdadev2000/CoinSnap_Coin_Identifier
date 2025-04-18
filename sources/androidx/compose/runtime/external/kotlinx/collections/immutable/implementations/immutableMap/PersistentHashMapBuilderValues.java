package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import e0.h;
import java.util.Collection;
import java.util.Iterator;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PersistentHashMapBuilderValues<K, V> extends h implements Collection<V> {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentHashMapBuilder f14211a;

    public PersistentHashMapBuilderValues(PersistentHashMapBuilder persistentHashMapBuilder) {
        this.f14211a = persistentHashMapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // e0.h
    public final int b() {
        return this.f14211a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f14211a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14211a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i2 = 0; i2 < 8; i2++) {
            trieNodeBaseIteratorArr[i2] = new TrieNodeBaseIterator();
        }
        return new PersistentHashMapBuilderBaseIterator(this.f14211a, trieNodeBaseIteratorArr);
    }
}
