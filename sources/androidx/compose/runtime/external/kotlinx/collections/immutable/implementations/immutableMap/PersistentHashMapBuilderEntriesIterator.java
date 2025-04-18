package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import r0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PersistentHashMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, a {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentHashMapBuilderBaseIterator f14209a;

    public PersistentHashMapBuilderEntriesIterator(PersistentHashMapBuilder persistentHashMapBuilder) {
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i2 = 0; i2 < 8; i2++) {
            trieNodeBaseIteratorArr[i2] = new TrieNodeMutableEntriesIterator(this);
        }
        this.f14209a = new PersistentHashMapBuilderBaseIterator(persistentHashMapBuilder, trieNodeBaseIteratorArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14209a.f14199c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (Map.Entry) this.f14209a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f14209a.remove();
    }
}
