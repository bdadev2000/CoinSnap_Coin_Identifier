package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import r0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PersistentOrderedMapEntriesIterator<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, a {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentOrderedMapLinksIterator f14262a;

    public PersistentOrderedMapEntriesIterator(PersistentOrderedMap persistentOrderedMap) {
        this.f14262a = new PersistentOrderedMapLinksIterator(persistentOrderedMap.f14244a, persistentOrderedMap.f14246c);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14262a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        PersistentOrderedMapLinksIterator persistentOrderedMapLinksIterator = this.f14262a;
        return new MapEntry(persistentOrderedMapLinksIterator.f14265a, persistentOrderedMapLinksIterator.next().f14240a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
