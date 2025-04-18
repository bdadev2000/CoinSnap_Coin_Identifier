package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import r0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PersistentOrderedMapKeysIterator<K, V> implements Iterator<K>, a {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentOrderedMapLinksIterator f14264a;

    public PersistentOrderedMapKeysIterator(PersistentOrderedMap persistentOrderedMap) {
        this.f14264a = new PersistentOrderedMapLinksIterator(persistentOrderedMap.f14244a, persistentOrderedMap.f14246c);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14264a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        PersistentOrderedMapLinksIterator persistentOrderedMapLinksIterator = this.f14264a;
        Object obj = persistentOrderedMapLinksIterator.f14265a;
        persistentOrderedMapLinksIterator.next();
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
