package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.l;
import java.util.Iterator;
import java.util.Map;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PersistentHashMapEntries<K, V> extends l implements ImmutableSet<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentHashMap f14212a;

    public PersistentHashMapEntries(PersistentHashMap persistentHashMap) {
        this.f14212a = persistentHashMap;
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
        PersistentHashMap persistentHashMap = this.f14212a;
        Object obj2 = persistentHashMap.get(key);
        return obj2 != null ? a.g(obj2, entry.getValue()) : entry.getValue() == null && persistentHashMap.containsKey(entry.getKey());
    }

    @Override // e0.a
    public final int getSize() {
        return this.f14212a.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        TrieNode trieNode = this.f14212a.f14195a;
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i2 = 0; i2 < 8; i2++) {
            trieNodeBaseIteratorArr[i2] = new TrieNodeBaseIterator();
        }
        return new PersistentHashMapBaseIterator(trieNode, trieNodeBaseIteratorArr);
    }
}
