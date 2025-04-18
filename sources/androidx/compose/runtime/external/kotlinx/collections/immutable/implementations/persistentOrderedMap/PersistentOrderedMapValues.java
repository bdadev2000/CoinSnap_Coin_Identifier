package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.a;
import java.util.Iterator;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PersistentOrderedMapValues<K, V> extends a implements ImmutableCollection<V> {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentOrderedMap f14268a;

    public PersistentOrderedMapValues(PersistentOrderedMap persistentOrderedMap) {
        this.f14268a = persistentOrderedMap;
    }

    @Override // e0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f14268a.containsValue(obj);
    }

    @Override // e0.a
    public final int getSize() {
        return this.f14268a.e();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new PersistentOrderedMapValuesIterator(this.f14268a);
    }
}
