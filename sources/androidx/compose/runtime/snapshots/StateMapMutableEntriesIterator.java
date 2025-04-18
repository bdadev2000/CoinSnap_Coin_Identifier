package androidx.compose.runtime.snapshots;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class StateMapMutableEntriesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<Map.Entry<K, V>>, r0.a {
    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (this.d != null) {
            return new StateMapMutableEntriesIterator$next$1(this);
        }
        throw new IllegalStateException();
    }
}
