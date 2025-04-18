package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import e0.k;
import java.util.Collection;
import java.util.Iterator;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PersistentHashSetBuilder<E> extends k implements PersistentSet.Builder<E> {

    /* renamed from: a, reason: collision with root package name */
    public PersistentHashSet f14225a;

    /* renamed from: b, reason: collision with root package name */
    public MutabilityOwnership f14226b;

    /* renamed from: c, reason: collision with root package name */
    public TrieNode f14227c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f14228f;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int b2 = b();
        this.f14227c = this.f14227c.j(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return b2 != b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        PersistentHashSet persistentHashSet = null;
        PersistentHashSet persistentHashSet2 = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet2 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            if (persistentHashSetBuilder != null) {
                persistentHashSet = persistentHashSetBuilder.c();
            }
        } else {
            persistentHashSet = persistentHashSet2;
        }
        if (persistentHashSet == null) {
            return super.addAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter();
        int i2 = this.f14228f;
        TrieNode k2 = this.f14227c.k(persistentHashSet.f14223a, 0, deltaCounter, this);
        int size = (collection.size() + i2) - deltaCounter.f14278a;
        if (i2 != size) {
            this.f14227c = k2;
            d(size);
        }
        return i2 != this.f14228f;
    }

    @Override // e0.k
    public final int b() {
        return this.f14228f;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership, java.lang.Object] */
    public final PersistentHashSet c() {
        TrieNode trieNode = this.f14227c;
        PersistentHashSet persistentHashSet = this.f14225a;
        if (trieNode != persistentHashSet.f14223a) {
            this.f14226b = new Object();
            persistentHashSet = new PersistentHashSet(b(), trieNode);
        }
        this.f14225a = persistentHashSet;
        return persistentHashSet;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f14227c = TrieNode.d;
        d(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14227c.c(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return collection instanceof PersistentHashSet ? this.f14227c.d(0, ((PersistentHashSet) collection).f14223a) : collection instanceof PersistentHashSetBuilder ? this.f14227c.d(0, ((PersistentHashSetBuilder) collection).f14227c) : super.containsAll(collection);
    }

    public final void d(int i2) {
        this.f14228f = i2;
        this.d++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentHashSetMutableIterator(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b2 = b();
        this.f14227c = this.f14227c.l(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return b2 != b();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        PersistentHashSet persistentHashSet = null;
        PersistentHashSet persistentHashSet2 = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet2 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            if (persistentHashSetBuilder != null) {
                persistentHashSet = persistentHashSetBuilder.c();
            }
        } else {
            persistentHashSet = persistentHashSet2;
        }
        if (persistentHashSet == null) {
            return super.removeAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter();
        int i2 = this.f14228f;
        Object m2 = this.f14227c.m(persistentHashSet.f14223a, 0, deltaCounter, this);
        int i3 = i2 - deltaCounter.f14278a;
        if (i3 == 0) {
            clear();
        } else if (i3 != i2) {
            a.q(m2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f14227c = (TrieNode) m2;
            d(i3);
        }
        return i2 != this.f14228f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        PersistentHashSet persistentHashSet = null;
        PersistentHashSet persistentHashSet2 = collection instanceof PersistentHashSet ? (PersistentHashSet) collection : null;
        if (persistentHashSet2 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder = collection instanceof PersistentHashSetBuilder ? (PersistentHashSetBuilder) collection : null;
            if (persistentHashSetBuilder != null) {
                persistentHashSet = persistentHashSetBuilder.c();
            }
        } else {
            persistentHashSet = persistentHashSet2;
        }
        if (persistentHashSet == null) {
            return super.retainAll(collection);
        }
        DeltaCounter deltaCounter = new DeltaCounter();
        int i2 = this.f14228f;
        Object n2 = this.f14227c.n(persistentHashSet.f14223a, 0, deltaCounter, this);
        int i3 = deltaCounter.f14278a;
        if (i3 == 0) {
            clear();
        } else if (i3 != i2) {
            a.q(n2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f14227c = (TrieNode) n2;
            d(i3);
        }
        return i2 != this.f14228f;
    }
}
