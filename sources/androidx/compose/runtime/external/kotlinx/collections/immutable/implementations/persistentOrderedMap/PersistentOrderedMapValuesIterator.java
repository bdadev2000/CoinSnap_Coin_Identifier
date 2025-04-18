package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import r0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PersistentOrderedMapValuesIterator<K, V> implements Iterator<V>, a {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentOrderedMapLinksIterator f14269a;

    public PersistentOrderedMapValuesIterator(PersistentOrderedMap persistentOrderedMap) {
        this.f14269a = new PersistentOrderedMapLinksIterator(persistentOrderedMap.f14244a, persistentOrderedMap.f14246c);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14269a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f14269a.next().f14240a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
