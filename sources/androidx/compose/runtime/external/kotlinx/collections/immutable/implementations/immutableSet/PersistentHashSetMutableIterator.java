package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.StabilityInferred;
import e0.q;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.e;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> implements Iterator<E> {
    public final PersistentHashSetBuilder d;

    /* renamed from: f, reason: collision with root package name */
    public Object f14232f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14233g;

    /* renamed from: h, reason: collision with root package name */
    public int f14234h;

    public PersistentHashSetMutableIterator(PersistentHashSetBuilder persistentHashSetBuilder) {
        super(persistentHashSetBuilder.f14227c);
        this.d = persistentHashSetBuilder;
        this.f14234h = persistentHashSetBuilder.d;
    }

    public final void d(int i2, TrieNode trieNode, Object obj, int i3) {
        int i4 = trieNode.f14235a;
        ArrayList arrayList = this.f14229a;
        if (i4 == 0) {
            int d02 = q.d0(trieNode.f14236b, obj);
            TrieNodeIterator trieNodeIterator = (TrieNodeIterator) arrayList.get(i3);
            trieNodeIterator.f14238a = trieNode.f14236b;
            trieNodeIterator.f14239b = d02;
            this.f14230b = i3;
            return;
        }
        int g2 = trieNode.g(1 << TrieNodeKt.c(i2, i3 * 5));
        TrieNodeIterator trieNodeIterator2 = (TrieNodeIterator) arrayList.get(i3);
        Object[] objArr = trieNode.f14236b;
        trieNodeIterator2.f14238a = objArr;
        trieNodeIterator2.f14239b = g2;
        Object obj2 = objArr[g2];
        if (obj2 instanceof TrieNode) {
            d(i2, (TrieNode) obj2, obj, i3 + 1);
        } else {
            this.f14230b = i3;
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public final Object next() {
        if (this.d.d != this.f14234h) {
            throw new ConcurrentModificationException();
        }
        Object next = super.next();
        this.f14232f = next;
        this.f14233g = true;
        return next;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public final void remove() {
        if (!this.f14233g) {
            throw new IllegalStateException();
        }
        boolean z2 = this.f14231c;
        PersistentHashSetBuilder persistentHashSetBuilder = this.d;
        if (z2) {
            TrieNodeIterator trieNodeIterator = (TrieNodeIterator) this.f14229a.get(this.f14230b);
            trieNodeIterator.a();
            Object obj = trieNodeIterator.f14238a[trieNodeIterator.f14239b];
            Object obj2 = this.f14232f;
            e.c(persistentHashSetBuilder);
            persistentHashSetBuilder.remove(obj2);
            d(obj != null ? obj.hashCode() : 0, persistentHashSetBuilder.f14227c, obj, 0);
        } else {
            Object obj3 = this.f14232f;
            e.c(persistentHashSetBuilder);
            persistentHashSetBuilder.remove(obj3);
        }
        this.f14232f = null;
        this.f14233g = false;
        this.f14234h = persistentHashSetBuilder.d;
    }
}
