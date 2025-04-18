package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import r0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public class PersistentOrderedSetIterator<E> implements Iterator<E>, a {

    /* renamed from: a, reason: collision with root package name */
    public Object f14275a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f14276b;

    /* renamed from: c, reason: collision with root package name */
    public int f14277c;

    public PersistentOrderedSetIterator(Object obj, PersistentHashMap persistentHashMap) {
        this.f14275a = obj;
        this.f14276b = persistentHashMap;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14277c < this.f14276b.size();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f14275a;
        this.f14277c++;
        Object obj2 = this.f14276b.get(obj);
        if (obj2 != null) {
            this.f14275a = ((Links) obj2).f14271b;
            return obj;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
