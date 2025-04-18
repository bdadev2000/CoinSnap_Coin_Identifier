package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TrieNodeMutableEntriesIterator<K, V> extends TrieNodeBaseIterator<K, V, Map.Entry<K, V>> {
    public final PersistentHashMapBuilderEntriesIterator d;

    public TrieNodeMutableEntriesIterator(PersistentHashMapBuilderEntriesIterator persistentHashMapBuilderEntriesIterator) {
        this.d = persistentHashMapBuilderEntriesIterator;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f14222c;
        this.f14222c = i2 + 2;
        Object[] objArr = this.f14220a;
        return new MutableMapEntry(this.d, objArr[i2], objArr[i2 + 1]);
    }
}
