package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.l;
import java.util.Iterator;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PersistentOrderedSet<E> extends l implements PersistentSet<E> {
    public static final PersistentOrderedSet d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f14272a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14273b;

    /* renamed from: c, reason: collision with root package name */
    public final PersistentHashMap f14274c;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    static {
        EndOfChain endOfChain = EndOfChain.f14279a;
        d = new PersistentOrderedSet(endOfChain, endOfChain, PersistentHashMap.f14194c);
    }

    public PersistentOrderedSet(Object obj, Object obj2, PersistentHashMap persistentHashMap) {
        this.f14272a = obj;
        this.f14273b = obj2;
        this.f14274c = persistentHashMap;
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet add(Object obj) {
        PersistentHashMap persistentHashMap = this.f14274c;
        if (persistentHashMap.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new PersistentOrderedSet(obj, obj, persistentHashMap.i(obj, new Links()));
        }
        Object obj2 = this.f14273b;
        Object obj3 = persistentHashMap.get(obj2);
        a.p(obj3);
        return new PersistentOrderedSet(this.f14272a, obj, persistentHashMap.i(obj2, new Links(((Links) obj3).f14270a, obj)).i(obj, new Links(obj2)));
    }

    @Override // e0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f14274c.containsKey(obj);
    }

    @Override // e0.a
    public final int getSize() {
        return this.f14274c.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentOrderedSetIterator(this.f14272a, this.f14274c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet remove(Object obj) {
        PersistentHashMap persistentHashMap = this.f14274c;
        Links links = (Links) persistentHashMap.get(obj);
        if (links == null) {
            return this;
        }
        int hashCode = obj != null ? obj.hashCode() : 0;
        TrieNode trieNode = persistentHashMap.f14195a;
        TrieNode v2 = trieNode.v(hashCode, 0, obj);
        if (trieNode != v2) {
            persistentHashMap = v2 == null ? PersistentHashMap.f14194c : new PersistentHashMap(v2, persistentHashMap.size() - 1);
        }
        EndOfChain endOfChain = EndOfChain.f14279a;
        Object obj2 = links.f14270a;
        boolean z2 = obj2 != endOfChain;
        Object obj3 = links.f14271b;
        if (z2) {
            V v3 = persistentHashMap.get(obj2);
            a.p(v3);
            persistentHashMap = persistentHashMap.i(obj2, new Links(((Links) v3).f14270a, obj3));
        }
        if (obj3 != endOfChain) {
            V v4 = persistentHashMap.get(obj3);
            a.p(v4);
            persistentHashMap = persistentHashMap.i(obj3, new Links(obj2, ((Links) v4).f14271b));
        }
        Object obj4 = obj2 != endOfChain ? this.f14272a : obj3;
        if (obj3 != endOfChain) {
            obj2 = this.f14273b;
        }
        return new PersistentOrderedSet(obj4, obj2, persistentHashMap);
    }
}
