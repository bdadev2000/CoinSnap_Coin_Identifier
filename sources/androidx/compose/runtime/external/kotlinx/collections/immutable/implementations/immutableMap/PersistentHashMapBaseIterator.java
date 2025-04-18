package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.NoSuchElementException;
import r0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, a {

    /* renamed from: a, reason: collision with root package name */
    public final TrieNodeBaseIterator[] f14197a;

    /* renamed from: b, reason: collision with root package name */
    public int f14198b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14199c = true;

    public PersistentHashMapBaseIterator(TrieNode trieNode, TrieNodeBaseIterator[] trieNodeBaseIteratorArr) {
        this.f14197a = trieNodeBaseIteratorArr;
        trieNodeBaseIteratorArr[0].b(Integer.bitCount(trieNode.f14215a) * 2, 0, trieNode.d);
        this.f14198b = 0;
        b();
    }

    public final void b() {
        int i2 = this.f14198b;
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = this.f14197a;
        TrieNodeBaseIterator trieNodeBaseIterator = trieNodeBaseIteratorArr[i2];
        if (trieNodeBaseIterator.f14222c < trieNodeBaseIterator.f14221b) {
            return;
        }
        while (-1 < i2) {
            int c2 = c(i2);
            if (c2 == -1) {
                TrieNodeBaseIterator trieNodeBaseIterator2 = trieNodeBaseIteratorArr[i2];
                int i3 = trieNodeBaseIterator2.f14222c;
                Object[] objArr = trieNodeBaseIterator2.f14220a;
                if (i3 < objArr.length) {
                    int length = objArr.length;
                    trieNodeBaseIterator2.f14222c = i3 + 1;
                    c2 = c(i2);
                }
            }
            if (c2 != -1) {
                this.f14198b = c2;
                return;
            }
            if (i2 > 0) {
                TrieNodeBaseIterator trieNodeBaseIterator3 = trieNodeBaseIteratorArr[i2 - 1];
                int i4 = trieNodeBaseIterator3.f14222c;
                int length2 = trieNodeBaseIterator3.f14220a.length;
                trieNodeBaseIterator3.f14222c = i4 + 1;
            }
            trieNodeBaseIteratorArr[i2].b(0, 0, TrieNode.e.d);
            i2--;
        }
        this.f14199c = false;
    }

    public final int c(int i2) {
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = this.f14197a;
        TrieNodeBaseIterator trieNodeBaseIterator = trieNodeBaseIteratorArr[i2];
        int i3 = trieNodeBaseIterator.f14222c;
        if (i3 < trieNodeBaseIterator.f14221b) {
            return i2;
        }
        Object[] objArr = trieNodeBaseIterator.f14220a;
        if (i3 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i3];
        p0.a.q(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        TrieNode trieNode = (TrieNode) obj;
        if (i2 == 6) {
            TrieNodeBaseIterator trieNodeBaseIterator2 = trieNodeBaseIteratorArr[i2 + 1];
            Object[] objArr2 = trieNode.d;
            trieNodeBaseIterator2.b(objArr2.length, 0, objArr2);
        } else {
            trieNodeBaseIteratorArr[i2 + 1].b(Integer.bitCount(trieNode.f14215a) * 2, 0, trieNode.d);
        }
        return c(i2 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14199c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T next = this.f14197a[this.f14198b].next();
        b();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
