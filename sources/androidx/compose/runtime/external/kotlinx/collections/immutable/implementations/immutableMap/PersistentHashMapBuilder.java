package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.j;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public class PersistentHashMapBuilder<K, V> extends j implements PersistentMap.Builder<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public PersistentHashMap f14200a;

    /* renamed from: b, reason: collision with root package name */
    public MutabilityOwnership f14201b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public TrieNode f14202c;
    public Object d;

    /* renamed from: f, reason: collision with root package name */
    public int f14203f;

    /* renamed from: g, reason: collision with root package name */
    public int f14204g;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership, java.lang.Object] */
    public PersistentHashMapBuilder(PersistentHashMap persistentHashMap) {
        this.f14200a = persistentHashMap;
        this.f14202c = persistentHashMap.f14195a;
        this.f14204g = persistentHashMap.size();
    }

    @Override // e0.j
    public final Set b() {
        return new PersistentHashMapBuilderEntries(this);
    }

    @Override // e0.j
    public final Set c() {
        return new PersistentHashMapBuilderKeys(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f14202c = TrieNode.e;
        g(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f14202c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // e0.j
    public final int d() {
        return this.f14204g;
    }

    @Override // e0.j
    public final Collection e() {
        return new PersistentHashMapBuilderValues(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership, java.lang.Object] */
    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public PersistentHashMap build() {
        TrieNode trieNode = this.f14202c;
        PersistentHashMap persistentHashMap = this.f14200a;
        if (trieNode != persistentHashMap.f14195a) {
            this.f14201b = new Object();
            persistentHashMap = new PersistentHashMap(this.f14202c, size());
        }
        this.f14200a = persistentHashMap;
        return persistentHashMap;
    }

    public final void g(int i2) {
        this.f14204g = i2;
        this.f14203f++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f14202c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.d = null;
        this.f14202c = this.f14202c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        PersistentHashMap persistentHashMap = null;
        PersistentHashMap persistentHashMap2 = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMap2 == null) {
            PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
            if (persistentHashMapBuilder != null) {
                persistentHashMap = persistentHashMapBuilder.build();
            }
        } else {
            persistentHashMap = persistentHashMap2;
        }
        if (persistentHashMap == null) {
            super.putAll(map);
            return;
        }
        DeltaCounter deltaCounter = new DeltaCounter();
        int size = size();
        TrieNode trieNode = this.f14202c;
        TrieNode trieNode2 = persistentHashMap.f14195a;
        a.q(trieNode2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f14202c = trieNode.m(trieNode2, 0, deltaCounter, this);
        int size2 = (persistentHashMap.size() + size) - deltaCounter.f14278a;
        if (size != size2) {
            g(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.d = null;
        TrieNode n2 = this.f14202c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n2 == null) {
            n2 = TrieNode.e;
        }
        this.f14202c = n2;
        return this.d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        TrieNode o2 = this.f14202c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o2 == null) {
            o2 = TrieNode.e;
        }
        this.f14202c = o2;
        return size != size();
    }
}
