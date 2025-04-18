package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import r0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderKeysIterator<K, V> implements Iterator<K>, a {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentOrderedMapBuilderLinksIterator f14253a;

    public PersistentOrderedMapBuilderKeysIterator(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f14253a = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder.f14248b, persistentOrderedMapBuilder);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14253a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        PersistentOrderedMapBuilderLinksIterator persistentOrderedMapBuilderLinksIterator = this.f14253a;
        persistentOrderedMapBuilderLinksIterator.next();
        return persistentOrderedMapBuilderLinksIterator.f14256c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f14253a.remove();
    }
}
