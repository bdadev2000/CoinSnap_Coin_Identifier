package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.l;
import java.util.Collection;
import java.util.Iterator;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PersistentHashSet<E> extends l implements PersistentSet<E> {

    /* renamed from: a, reason: collision with root package name */
    public final TrieNode f14223a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14224b;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public PersistentHashSet(int i2, TrieNode trieNode) {
        this.f14223a = trieNode;
        this.f14224b = i2;
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet add(Object obj) {
        int hashCode = obj != null ? obj.hashCode() : 0;
        TrieNode trieNode = this.f14223a;
        TrieNode a2 = trieNode.a(hashCode, 0, obj);
        return trieNode == a2 ? this : new PersistentHashSet(size() + 1, a2);
    }

    @Override // e0.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f14223a.c(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // e0.a, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        boolean z2 = collection instanceof PersistentHashSet;
        TrieNode trieNode = this.f14223a;
        return z2 ? trieNode.d(0, ((PersistentHashSet) collection).f14223a) : collection instanceof PersistentHashSetBuilder ? trieNode.d(0, ((PersistentHashSetBuilder) collection).f14227c) : super.containsAll(collection);
    }

    @Override // e0.a
    public final int getSize() {
        return this.f14224b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentHashSetIterator(this.f14223a);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet
    public final PersistentSet remove(Object obj) {
        int hashCode = obj != null ? obj.hashCode() : 0;
        TrieNode trieNode = this.f14223a;
        TrieNode q2 = trieNode.q(hashCode, 0, obj);
        return trieNode == q2 ? this : new PersistentHashSet(size() - 1, q2);
    }
}
