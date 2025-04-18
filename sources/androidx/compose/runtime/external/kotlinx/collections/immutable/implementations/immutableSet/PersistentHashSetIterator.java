package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import r0.a;

@StabilityInferred
/* loaded from: classes.dex */
public class PersistentHashSetIterator<E> implements Iterator<E>, a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14229a;

    /* renamed from: b, reason: collision with root package name */
    public int f14230b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14231c;

    public PersistentHashSetIterator(TrieNode trieNode) {
        ArrayList w = f0.w(new TrieNodeIterator());
        this.f14229a = w;
        this.f14231c = true;
        TrieNodeIterator trieNodeIterator = (TrieNodeIterator) w.get(0);
        trieNodeIterator.f14238a = trieNode.f14236b;
        trieNodeIterator.f14239b = 0;
        this.f14230b = 0;
        b();
    }

    public final void b() {
        int i2 = this.f14230b;
        ArrayList arrayList = this.f14229a;
        if (((TrieNodeIterator) arrayList.get(i2)).a()) {
            return;
        }
        for (int i3 = this.f14230b; -1 < i3; i3--) {
            int c2 = c(i3);
            if (c2 == -1) {
                TrieNodeIterator trieNodeIterator = (TrieNodeIterator) arrayList.get(i3);
                if (trieNodeIterator.f14239b < trieNodeIterator.f14238a.length) {
                    TrieNodeIterator trieNodeIterator2 = (TrieNodeIterator) arrayList.get(i3);
                    int i4 = trieNodeIterator2.f14239b;
                    int length = trieNodeIterator2.f14238a.length;
                    trieNodeIterator2.f14239b = i4 + 1;
                    c2 = c(i3);
                }
            }
            if (c2 != -1) {
                this.f14230b = c2;
                return;
            }
            if (i3 > 0) {
                TrieNodeIterator trieNodeIterator3 = (TrieNodeIterator) arrayList.get(i3 - 1);
                int i5 = trieNodeIterator3.f14239b;
                int length2 = trieNodeIterator3.f14238a.length;
                trieNodeIterator3.f14239b = i5 + 1;
            }
            TrieNodeIterator trieNodeIterator4 = (TrieNodeIterator) arrayList.get(i3);
            trieNodeIterator4.f14238a = TrieNode.d.f14236b;
            trieNodeIterator4.f14239b = 0;
        }
        this.f14231c = false;
    }

    public final int c(int i2) {
        ArrayList arrayList = this.f14229a;
        if (((TrieNodeIterator) arrayList.get(i2)).a()) {
            return i2;
        }
        TrieNodeIterator trieNodeIterator = (TrieNodeIterator) arrayList.get(i2);
        int i3 = trieNodeIterator.f14239b;
        Object[] objArr = trieNodeIterator.f14238a;
        if (i3 >= objArr.length || !(objArr[i3] instanceof TrieNode)) {
            return -1;
        }
        TrieNodeIterator trieNodeIterator2 = (TrieNodeIterator) arrayList.get(i2);
        int i4 = trieNodeIterator2.f14239b;
        Object[] objArr2 = trieNodeIterator2.f14238a;
        if (i4 < objArr2.length) {
            boolean z2 = objArr2[i4] instanceof TrieNode;
        }
        Object obj = objArr2[i4];
        p0.a.q(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        TrieNode trieNode = (TrieNode) obj;
        int i5 = i2 + 1;
        if (i5 == arrayList.size()) {
            arrayList.add(new TrieNodeIterator());
        }
        TrieNodeIterator trieNodeIterator3 = (TrieNodeIterator) arrayList.get(i5);
        trieNodeIterator3.f14238a = trieNode.f14236b;
        trieNodeIterator3.f14239b = 0;
        return c(i5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14231c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f14231c) {
            throw new NoSuchElementException();
        }
        TrieNodeIterator trieNodeIterator = (TrieNodeIterator) this.f14229a.get(this.f14230b);
        trieNodeIterator.a();
        Object[] objArr = trieNodeIterator.f14238a;
        int i2 = trieNodeIterator.f14239b;
        trieNodeIterator.f14239b = i2 + 1;
        Object obj = objArr[i2];
        b();
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
