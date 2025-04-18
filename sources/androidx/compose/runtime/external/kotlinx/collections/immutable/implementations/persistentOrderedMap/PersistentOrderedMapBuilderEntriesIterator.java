package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import r0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PersistentOrderedMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, a {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentOrderedMapBuilderLinksIterator f14251a;

    public PersistentOrderedMapBuilderEntriesIterator(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f14251a = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder.f14248b, persistentOrderedMapBuilder);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14251a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        PersistentOrderedMapBuilderLinksIterator persistentOrderedMapBuilderLinksIterator = this.f14251a;
        return new MutableMapEntry(persistentOrderedMapBuilderLinksIterator.f14255b.d, persistentOrderedMapBuilderLinksIterator.f14256c, persistentOrderedMapBuilderLinksIterator.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f14251a.remove();
    }
}
