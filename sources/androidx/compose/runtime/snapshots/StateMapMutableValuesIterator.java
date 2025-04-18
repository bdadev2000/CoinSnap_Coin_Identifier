package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class StateMapMutableValuesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<V>, r0.a {
    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = this.f14632f;
        if (entry == null) {
            throw new IllegalStateException();
        }
        b();
        return entry.getValue();
    }
}
