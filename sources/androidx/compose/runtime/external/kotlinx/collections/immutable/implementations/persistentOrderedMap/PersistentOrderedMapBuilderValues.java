package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import e0.h;
import java.util.Collection;
import java.util.Iterator;

@StabilityInferred
/* loaded from: classes4.dex */
public final class PersistentOrderedMapBuilderValues<K, V> extends h implements Collection<V> {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentOrderedMapBuilder f14259a;

    public PersistentOrderedMapBuilderValues(PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f14259a = persistentOrderedMapBuilder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // e0.h
    public final int b() {
        return this.f14259a.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f14259a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14259a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new PersistentOrderedMapBuilderValuesIterator(this.f14259a);
    }
}
