package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import r0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderValuesIterator<K, V> implements Iterator<V>, a {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentOrderedMapBuilderLinksIterator f14260a;

    public PersistentOrderedMapBuilderValuesIterator(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f14260a = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder.f14248b, persistentOrderedMapBuilder);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14260a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f14260a.next().f14240a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f14260a.remove();
    }
}
