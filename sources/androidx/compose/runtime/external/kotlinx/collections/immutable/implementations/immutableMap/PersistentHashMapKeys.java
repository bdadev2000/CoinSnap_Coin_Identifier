package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.l;
import java.util.Iterator;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PersistentHashMapKeys<K, V> extends l implements ImmutableSet<K> {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentHashMap f14213a;

    public PersistentHashMapKeys(PersistentHashMap persistentHashMap) {
        this.f14213a = persistentHashMap;
    }

    @Override // e0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f14213a.containsKey(obj);
    }

    @Override // e0.a
    public final int getSize() {
        return this.f14213a.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        TrieNode trieNode = this.f14213a.f14195a;
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i2 = 0; i2 < 8; i2++) {
            trieNodeBaseIteratorArr[i2] = new TrieNodeBaseIterator();
        }
        return new PersistentHashMapBaseIterator(trieNode, trieNodeBaseIteratorArr);
    }
}
