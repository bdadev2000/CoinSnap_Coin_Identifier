package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;

@StabilityInferred
/* loaded from: classes2.dex */
public final class TrieNodeEntriesIterator<K, V> extends TrieNodeBaseIterator<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f14222c;
        this.f14222c = i2 + 2;
        Object[] objArr = this.f14220a;
        return new MapEntry(objArr[i2], objArr[i2 + 1]);
    }
}
