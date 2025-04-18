package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import r0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public class PersistentOrderedMapLinksIterator<K, V> implements Iterator<LinkedValue<V>>, a {

    /* renamed from: a, reason: collision with root package name */
    public Object f14265a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f14266b;

    /* renamed from: c, reason: collision with root package name */
    public int f14267c;

    public PersistentOrderedMapLinksIterator(Object obj, PersistentHashMap persistentHashMap) {
        this.f14265a = obj;
        this.f14266b = persistentHashMap;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final LinkedValue next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f14266b.get(this.f14265a);
        if (obj != null) {
            LinkedValue linkedValue = (LinkedValue) obj;
            this.f14267c++;
            this.f14265a = linkedValue.f14242c;
            return linkedValue;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f14265a + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14267c < this.f14266b.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
