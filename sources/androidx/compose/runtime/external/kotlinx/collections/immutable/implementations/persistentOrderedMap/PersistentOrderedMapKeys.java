package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.l;
import java.util.Iterator;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PersistentOrderedMapKeys<K, V> extends l implements ImmutableSet<K> {

    /* renamed from: a, reason: collision with root package name */
    public final PersistentOrderedMap f14263a;

    public PersistentOrderedMapKeys(PersistentOrderedMap persistentOrderedMap) {
        this.f14263a = persistentOrderedMap;
    }

    @Override // e0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f14263a.f14246c.containsKey(obj);
    }

    @Override // e0.a
    public final int getSize() {
        return this.f14263a.e();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentOrderedMapKeysIterator(this.f14263a);
    }
}
