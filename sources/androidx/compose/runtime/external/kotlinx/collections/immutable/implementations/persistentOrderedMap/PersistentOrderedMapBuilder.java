package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.j;
import java.util.Collection;
import java.util.Set;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PersistentOrderedMapBuilder<K, V> extends j implements PersistentMap.Builder<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public PersistentOrderedMap f14247a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14248b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14249c;
    public final PersistentHashMapBuilder d;

    public PersistentOrderedMapBuilder(PersistentOrderedMap persistentOrderedMap) {
        this.f14247a = persistentOrderedMap;
        this.f14248b = persistentOrderedMap.f14244a;
        this.f14249c = persistentOrderedMap.f14245b;
        this.d = persistentOrderedMap.f14246c.builder();
    }

    @Override // e0.j
    public final Set b() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    public final PersistentMap build() {
        PersistentHashMap build = this.d.build();
        PersistentOrderedMap persistentOrderedMap = this.f14247a;
        if (build == persistentOrderedMap.f14246c) {
            Object obj = persistentOrderedMap.f14244a;
            Object obj2 = persistentOrderedMap.f14245b;
        } else {
            persistentOrderedMap = new PersistentOrderedMap(this.f14248b, this.f14249c, build);
        }
        this.f14247a = persistentOrderedMap;
        return persistentOrderedMap;
    }

    @Override // e0.j
    public final Set c() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.d.clear();
        EndOfChain endOfChain = EndOfChain.f14279a;
        this.f14248b = endOfChain;
        this.f14249c = endOfChain;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // e0.j
    public final int d() {
        return this.d.size();
    }

    @Override // e0.j
    public final Collection e() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        LinkedValue linkedValue = (LinkedValue) this.d.get(obj);
        if (linkedValue != null) {
            return linkedValue.f14240a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        PersistentHashMapBuilder persistentHashMapBuilder = this.d;
        LinkedValue linkedValue = (LinkedValue) persistentHashMapBuilder.get(obj);
        if (linkedValue != null) {
            Object obj3 = linkedValue.f14240a;
            if (obj3 == obj2) {
                return obj2;
            }
            persistentHashMapBuilder.put(obj, new LinkedValue(obj2, linkedValue.f14241b, linkedValue.f14242c));
            return obj3;
        }
        boolean isEmpty = isEmpty();
        EndOfChain endOfChain = EndOfChain.f14279a;
        if (isEmpty) {
            this.f14248b = obj;
            this.f14249c = obj;
            persistentHashMapBuilder.put(obj, new LinkedValue(obj2, endOfChain, endOfChain));
            return null;
        }
        Object obj4 = this.f14249c;
        Object obj5 = persistentHashMapBuilder.get(obj4);
        a.p(obj5);
        LinkedValue linkedValue2 = (LinkedValue) obj5;
        persistentHashMapBuilder.put(obj4, new LinkedValue(linkedValue2.f14240a, linkedValue2.f14241b, obj));
        persistentHashMapBuilder.put(obj, new LinkedValue(obj2, obj4, endOfChain));
        this.f14249c = obj;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        PersistentHashMapBuilder persistentHashMapBuilder = this.d;
        LinkedValue linkedValue = (LinkedValue) persistentHashMapBuilder.remove(obj);
        if (linkedValue == null) {
            return null;
        }
        Object obj2 = EndOfChain.f14279a;
        Object obj3 = linkedValue.f14242c;
        Object obj4 = linkedValue.f14241b;
        if (obj4 != obj2) {
            Object obj5 = persistentHashMapBuilder.get(obj4);
            a.p(obj5);
            LinkedValue linkedValue2 = (LinkedValue) obj5;
            persistentHashMapBuilder.put(obj4, new LinkedValue(linkedValue2.f14240a, linkedValue2.f14241b, obj3));
        } else {
            this.f14248b = obj3;
        }
        if (obj3 != obj2) {
            Object obj6 = persistentHashMapBuilder.get(obj3);
            a.p(obj6);
            LinkedValue linkedValue3 = (LinkedValue) obj6;
            persistentHashMapBuilder.put(obj3, new LinkedValue(linkedValue3.f14240a, obj4, linkedValue3.f14242c));
        } else {
            this.f14249c = obj4;
        }
        return linkedValue.f14240a;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        LinkedValue linkedValue = (LinkedValue) this.d.get(obj);
        if (linkedValue == null || !a.g(linkedValue.f14240a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
