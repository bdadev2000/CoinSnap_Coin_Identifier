package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.g;
import java.util.Collection;
import java.util.Set;

@StabilityInferred
/* loaded from: classes.dex */
public class PersistentHashMap<K, V> extends g implements PersistentMap<K, V> {

    /* renamed from: c, reason: collision with root package name */
    public static final PersistentHashMap f14194c = new PersistentHashMap(TrieNode.e, 0);

    /* renamed from: a, reason: collision with root package name */
    public final TrieNode f14195a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14196b;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public PersistentHashMap(TrieNode trieNode, int i2) {
        this.f14195a = trieNode;
        this.f14196b = i2;
    }

    @Override // e0.g
    public final Set c() {
        return new PersistentHashMapEntries(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f14195a.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // e0.g
    public final Set d() {
        return new PersistentHashMapKeys(this);
    }

    @Override // e0.g
    public final int e() {
        return this.f14196b;
    }

    @Override // e0.g
    public final Collection f() {
        return new PersistentHashMapValues(this);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public PersistentHashMapBuilder builder() {
        return new PersistentHashMapBuilder(this);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f14195a.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final PersistentHashMap i(Object obj, Links links) {
        TrieNode.ModificationResult u2 = this.f14195a.u(obj != null ? obj.hashCode() : 0, obj, links, 0);
        return u2 == null ? this : new PersistentHashMap(u2.f14218a, size() + u2.f14219b);
    }
}
