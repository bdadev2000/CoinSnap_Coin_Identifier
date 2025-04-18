package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.e;
import r0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements Iterator<LinkedValue<V>>, a {

    /* renamed from: a, reason: collision with root package name */
    public Object f14254a;

    /* renamed from: b, reason: collision with root package name */
    public final PersistentOrderedMapBuilder f14255b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14256c = EndOfChain.f14279a;
    public boolean d;

    /* renamed from: f, reason: collision with root package name */
    public int f14257f;

    /* renamed from: g, reason: collision with root package name */
    public int f14258g;

    public PersistentOrderedMapBuilderLinksIterator(Object obj, PersistentOrderedMapBuilder persistentOrderedMapBuilder) {
        this.f14254a = obj;
        this.f14255b = persistentOrderedMapBuilder;
        this.f14257f = persistentOrderedMapBuilder.d.f14203f;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final LinkedValue next() {
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = this.f14255b;
        if (persistentOrderedMapBuilder.d.f14203f != this.f14257f) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.f14254a;
        this.f14256c = obj;
        this.d = true;
        this.f14258g++;
        V v2 = persistentOrderedMapBuilder.d.get(obj);
        if (v2 != null) {
            LinkedValue linkedValue = (LinkedValue) v2;
            this.f14254a = linkedValue.f14242c;
            return linkedValue;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.f14254a + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14258g < this.f14255b.d();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        Object obj = this.f14256c;
        PersistentOrderedMapBuilder persistentOrderedMapBuilder = this.f14255b;
        e.e(persistentOrderedMapBuilder);
        persistentOrderedMapBuilder.remove(obj);
        this.f14256c = null;
        this.d = false;
        this.f14257f = persistentOrderedMapBuilder.d.f14203f;
        this.f14258g--;
    }
}
